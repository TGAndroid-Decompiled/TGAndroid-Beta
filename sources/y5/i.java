package y5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;
public class i extends p {
    public Dialog f50778x0;
    public DialogInterface.OnCancelListener f50779y0;
    public AlertDialog f50780z0;

    @Override
    public final Dialog O() {
        Dialog dialog = this.f50778x0;
        if (dialog == null) {
            this.f987o0 = false;
            if (this.f50780z0 == null) {
                Context n10 = n();
                b6.m.h(n10);
                this.f50780z0 = new AlertDialog.Builder(n10).create();
            }
            return this.f50780z0;
        }
        return dialog;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f50779y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
