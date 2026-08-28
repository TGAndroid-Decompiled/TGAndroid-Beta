package u5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;
public class i extends p {
    public Dialog f48118w0;
    public DialogInterface.OnCancelListener f48119x0;
    public AlertDialog f48120y0;

    @Override
    public final Dialog O() {
        Dialog dialog = this.f48118w0;
        if (dialog == null) {
            this.f1008n0 = false;
            if (this.f48120y0 == null) {
                Context n10 = n();
                x5.l.h(n10);
                this.f48120y0 = new AlertDialog.Builder(n10).create();
            }
            return this.f48120y0;
        }
        return dialog;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f48119x0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
