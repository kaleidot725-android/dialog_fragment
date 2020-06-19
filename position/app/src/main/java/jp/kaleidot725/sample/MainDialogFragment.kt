package jp.kaleidot725.sample

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MainDialogFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireActivity())
                .setTitle(R.string.dialog_title)
                .setPositiveButton(R.string.dialog_positive) { _, _ -> }
                .setNegativeButton(R.string.dialog_negative) { _, _ -> }
                .create()
    }
}
