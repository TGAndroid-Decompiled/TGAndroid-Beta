package y5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f47074a;
    public DialogInterface.OnCancelListener f47075b;
    public AlertDialog f47076c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f47075b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f47074a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f47076c == null) {
                Activity activity = getActivity();
                b6.m.h(activity);
                this.f47076c = new AlertDialog.Builder(activity).create();
            }
            return this.f47076c;
        }
        return dialog;
    }
}
