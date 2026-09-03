package uf;

import android.content.DialogInterface;
import android.view.View;
public final class m implements DialogInterface.OnDismissListener {
    public final int f45443a;
    public final View f45444b;

    public m(int i10, View view) {
        this.f45443a = i10;
        this.f45444b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45443a) {
            case 0:
                q.d = null;
                View view = this.f45444b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                m1.h = null;
                View view2 = this.f45444b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
