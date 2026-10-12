package rg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hu0;
import zh.m6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f44534a = 1;
    public final int f44535b;
    public final NotificationCenter.NotificationCenterDelegate f44536c;

    public s(int i10, m6 m6Var) {
        this.f44535b = i10;
        this.f44536c = m6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44534a) {
            case 0:
                o0 o0Var = (o0) this.f44536c;
                PhotoViewer photoViewer = ((hu0) o0Var).f36960o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                o0Var.C0(this.f44535b);
                return;
            default:
                NotificationCenter.getInstance(this.f44535b).removeObserver((m6) this.f44536c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(o0 o0Var, int i10) {
        this.f44536c = o0Var;
        this.f44535b = i10;
    }
}
