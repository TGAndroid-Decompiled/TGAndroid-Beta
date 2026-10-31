package vh;

import android.net.Uri;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
public final class j0 implements q20 {
    public final int f51301a;
    public final n0 f51302b;

    public j0(n0 n0Var, int i10) {
        this.f51301a = i10;
        this.f51302b = n0Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f51301a;
        n0 n0Var = this.f51302b;
        switch (i10) {
            case 0:
                Float f7 = (Float) obj;
                m0 m0Var = n0Var.f51493n;
                if (m0Var != null) {
                    m0Var.setProgress(f7.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (n0Var.f51491c && n0Var.f51494r != null) {
                    n0Var.f51493n.b(2131624054, 3500, cd.M0("VideoSavedHint"));
                    n0Var.f51491c = false;
                    n0Var.d();
                    n0Var.f51496w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                n0Var.f51491c = false;
                n0Var.d();
                m0 m0Var2 = n0Var.f51493n;
                if (m0Var2 != null) {
                    m0Var2.a();
                    n0Var.f51493n = null;
                }
                m0 m0Var3 = new m0(n0Var.getContext());
                n0Var.f51493n = m0Var3;
                m0Var3.b(2131624054, 2500, cd.M0("PhotoSavedHint"));
                n0Var.f51490b.addView(n0Var.f51493n);
                n0Var.f51496w = uri2;
                return;
        }
    }
}
