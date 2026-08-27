package qf;

import android.content.DialogInterface;
import android.view.View;

public final class o implements DialogInterface.OnDismissListener {

    public final int f46398a;

    public final View f46399b;

    public o(int i10, View view) {
        this.f46398a = i10;
        this.f46399b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46398a) {
            case 0:
                s.d = null;
                View view = this.f46399b;
                if (view != null) {
                    view.requestFocus();
                }
                break;
            default:
                n1.h = null;
                View view2 = this.f46399b;
                if (view2 != null) {
                    view2.requestFocus();
                }
                break;
        }
    }
}
