package sf;

import android.content.DialogInterface;
import android.view.View;
public final class n implements DialogInterface.OnDismissListener {
    public final int f47891a;
    public final View f47892b;

    public n(int i10, View view) {
        this.f47891a = i10;
        this.f47892b = view;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47891a) {
            case 0:
                r.d = null;
                View view = this.f47892b;
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            default:
                n1.h = null;
                View view2 = this.f47892b;
                if (view2 != null) {
                    view2.requestFocus();
                    return;
                }
                return;
        }
    }
}
