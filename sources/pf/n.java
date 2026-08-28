package pf;

import android.content.DialogInterface;
import android.view.View;
public final class n implements DialogInterface.OnDismissListener {
    public final int f45718a;
    public final View f45719b;

    public n(int i9, View view) {
        this.f45718a = i9;
        this.f45719b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45718a) {
            case 0:
                r.d = null;
                View view = this.f45719b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                n1.h = null;
                View view2 = this.f45719b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
