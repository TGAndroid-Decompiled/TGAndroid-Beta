package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cu0;
import yh.v6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41665a = 1;
    public final int f41666b;
    public final NotificationCenter.NotificationCenterDelegate f41667c;

    public s(int i10, v6 v6Var) {
        this.f41666b = i10;
        this.f41667c = v6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41665a) {
            case 0:
                p0 p0Var = (p0) this.f41667c;
                PhotoViewer photoViewer = ((cu0) p0Var).f32924o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                p0Var.B0(this.f41666b);
                return;
            default:
                NotificationCenter.getInstance(this.f41666b).removeObserver((v6) this.f41667c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(p0 p0Var, int i10) {
        this.f41667c = p0Var;
        this.f41666b = i10;
    }
}
