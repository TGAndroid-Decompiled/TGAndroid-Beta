package vf;

import android.content.DialogInterface;
import android.view.View;
public final class m implements DialogInterface.OnDismissListener {
    public final int f49127a;
    public final View f49128b;

    public m(int i10, View view) {
        this.f49127a = i10;
        this.f49128b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f49127a) {
            case 0:
                q.d = null;
                View view = this.f49128b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                m1.h = null;
                View view2 = this.f49128b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
