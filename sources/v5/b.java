package v5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class b extends DialogFragment {

    public Dialog f48787a;

    public DialogInterface.OnCancelListener f48788b;

    public AlertDialog f48789c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f48788b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f48787a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f48789c == null) {
            Activity activity = getActivity();
            y5.l.h(activity);
            this.f48789c = new AlertDialog.Builder(activity).create();
        }
        return this.f48789c;
    }
}
