package y5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f50761a;
    public DialogInterface.OnCancelListener f50762b;
    public AlertDialog f50763c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f50762b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f50761a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f50763c == null) {
                Activity activity = getActivity();
                b6.m.h(activity);
                this.f50763c = new AlertDialog.Builder(activity).create();
            }
            return this.f50763c;
        }
        return dialog;
    }
}
