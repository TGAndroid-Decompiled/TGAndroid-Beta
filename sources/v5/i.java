package v5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;

public class i extends p {

    public Dialog f48803w0;

    public DialogInterface.OnCancelListener f48804x0;

    public AlertDialog f48805y0;

    @Override
    public final Dialog O() {
        Dialog dialog = this.f48803w0;
        if (dialog != null) {
            return dialog;
        }
        this.f1505n0 = false;
        if (this.f48805y0 == null) {
            Context contextN = n();
            y5.l.h(contextN);
            this.f48805y0 = new AlertDialog.Builder(contextN).create();
        }
        return this.f48805y0;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f48804x0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
