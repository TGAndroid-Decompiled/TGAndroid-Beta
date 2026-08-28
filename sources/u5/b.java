package u5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f48102a;
    public DialogInterface.OnCancelListener f48103b;
    public AlertDialog f48104c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f48103b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f48102a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f48104c == null) {
                Activity activity = getActivity();
                x5.l.h(activity);
                this.f48104c = new AlertDialog.Builder(activity).create();
            }
            return this.f48104c;
        }
        return dialog;
    }
}
