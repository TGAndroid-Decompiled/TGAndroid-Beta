package vh;

import android.net.Uri;
import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
public final class j0 implements r20 {
    public final int f51316a;
    public final n0 f51317b;

    public j0(n0 n0Var, int i10) {
        this.f51316a = i10;
        this.f51317b = n0Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f51316a;
        n0 n0Var = this.f51317b;
        switch (i10) {
            case 0:
                Float f7 = (Float) obj;
                m0 m0Var = n0Var.f51508n;
                if (m0Var != null) {
                    m0Var.setProgress(f7.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (n0Var.f51506c && n0Var.f51509r != null) {
                    n0Var.f51508n.b(2131624054, 3500, dd.M0("VideoSavedHint"));
                    n0Var.f51506c = false;
                    n0Var.d();
                    n0Var.f51511w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                n0Var.f51506c = false;
                n0Var.d();
                m0 m0Var2 = n0Var.f51508n;
                if (m0Var2 != null) {
                    m0Var2.a();
                    n0Var.f51508n = null;
                }
                m0 m0Var3 = new m0(n0Var.getContext());
                n0Var.f51508n = m0Var3;
                m0Var3.b(2131624054, 2500, dd.M0("PhotoSavedHint"));
                n0Var.f51505b.addView(n0Var.f51508n);
                n0Var.f51511w = uri2;
                return;
        }
    }
}
