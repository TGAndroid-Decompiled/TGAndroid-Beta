package vf;

import android.content.DialogInterface;
import android.view.View;
public final class m implements DialogInterface.OnDismissListener {
    public final int f49128a;
    public final View f49129b;

    public m(int i10, View view) {
        this.f49128a = i10;
        this.f49129b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f49128a) {
            case 0:
                q.d = null;
                View view = this.f49129b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                m1.h = null;
                View view2 = this.f49129b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
