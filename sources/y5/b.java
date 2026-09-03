package y5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f50797a;
    public DialogInterface.OnCancelListener f50798b;
    public AlertDialog f50799c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f50798b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f50797a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f50799c == null) {
                Activity activity = getActivity();
                b6.m.h(activity);
                this.f50799c = new AlertDialog.Builder(activity).create();
            }
            return this.f50799c;
        }
        return dialog;
    }
}
