package w5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
public class i extends androidx.fragment.app.p {
    public Dialog f49777w0;
    public DialogInterface.OnCancelListener f49778x0;
    public AlertDialog f49779y0;

    @Override
    public final Dialog O() {
        Dialog dialog = this.f49777w0;
        if (dialog == null) {
            this.f1504n0 = false;
            if (this.f49779y0 == null) {
                Context n10 = n();
                z5.l.h(n10);
                this.f49779y0 = new AlertDialog.Builder(n10).create();
            }
            return this.f49779y0;
        }
        return dialog;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f49778x0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
