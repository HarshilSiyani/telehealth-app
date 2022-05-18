package com.example.telehealth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.telehealth.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
//    private static boolean headsetMic;
//
//    private static BroadcastReceiver mReceiver = new BroadcastReceiver() {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            final String action = intent.getAction();
//            if (Intent.ACTION_HEADSET_PLUG.equals(action)) {
//                final int headphones = intent.getIntExtra("state", -1);
//                final int mic = intent.getIntExtra("microphone", -1);
//                // we need to check both of them, because if headset with
//                // mic was disconnected mic is 1 but headphones is 0, and
//                // actually no external mic is connected
//                headsetMic = headphones > 0 && mic > 0;
//            }
//        }
//    };
//
//    public static boolean isExternalMicConnected() {
//        return headsetMic;
//    }
}