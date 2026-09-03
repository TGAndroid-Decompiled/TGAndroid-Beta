package y5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f47168a;
    public DialogInterface.OnCancelListener f47169b;
    public AlertDialog f47170c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f47169b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f47168a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f47170c == null) {
                Activity activity = getActivity();
                b6.m.h(activity);
                this.f47170c = new AlertDialog.Builder(activity).create();
            }
            return this.f47170c;
        }
        return dialog;
    }
}
