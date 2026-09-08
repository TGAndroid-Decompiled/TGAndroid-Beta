package z2;

import android.view.View;
import android.widget.FrameLayout;
import fi.f;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import ji.c2;
import ji.g6;
import ji.h1;
import ji.i3;
import ji.j4;
import ji.s3;
import ji.t3;
import ji.u3;
import k4.d;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vi;
import t7.u;
import y2.h;
import y2.j;
import y2.m;
public final class b implements h, t3 {
    public final Object f50707a;

    public b(Object obj) {
        this.f50707a = obj;
    }

    @Override
    public boolean a(float f7) {
        boolean z10;
        c2 c2Var = (c2) this.f50707a;
        FrameLayout frameLayout = c2Var.f13860v0;
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            if (f7 >= iArr[1]) {
                z10 = true;
                c2.Z(c2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        c2.Z(c2Var, z10, true);
        return z10;
    }

    @Override
    public void b(s3 s3Var, View view) {
        c2 c2Var = (c2) this.f50707a;
        n70 H = n70.H(c2Var, view);
        H.Q = true;
        c2Var.f13864x0 = j4.c(H, c2Var, c2Var.getParentActivity(), c2Var.getResourceProvider(), s3Var, false);
    }

    @Override
    public void d(u3 u3Var, View view) {
        c2 c2Var = (c2) this.f50707a;
        n70 H = n70.H(c2Var, view);
        H.Q = true;
        c2Var.getParentActivity();
        c2Var.getResourceProvider();
        c2Var.f13864x0 = j4.b(H, c2Var, u3Var, false);
    }

    @Override
    public void e(int i10) {
        ((c2) this.f50707a).o0(74, i10);
    }

    @Override
    public void f() {
        int i10;
        c2 c2Var = (c2) this.f50707a;
        i3 i3Var = c2Var.P.f14285n3;
        if (i3Var != null && i3Var.y() && c2Var.P.B4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        c2Var.x0(i10, true);
        c2Var.y0();
        c2Var.w0();
    }

    @Override
    public d g(j jVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.f50707a).f15221a.x(iOException);
        return m.f49545e;
    }

    @Override
    public void i(j jVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.f50707a;
        synchronized (c.f50709b) {
            z10 = c.f50710c;
        }
        if (!z10) {
            dVar.f15221a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public void l() {
        c2 c2Var = (c2) this.f50707a;
        c2Var.I0 = c2Var.K0;
        c2.Z(c2Var, false, false);
        c2Var.x0(2, true);
    }

    @Override
    public void onContentChanged() {
        c2 c2Var = (c2) this.f50707a;
        if (c2Var.f13866y0 != null) {
            boolean l32 = c2Var.P.l3();
            c2Var.L0 = l32;
            c2Var.f13866y0.h(l32);
            c2Var.f13866y0.invalidate();
        }
        c2Var.C0();
        Runnable runnable = c2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void p(ji.a aVar) {
        c2 c2Var = (c2) this.f50707a;
        if (aVar != null && (aVar.f13758b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(c2Var)) {
            vi viVar = new vi(c2Var.getParentActivity(), c2Var, false, false, false, c2Var.getResourceProvider());
            viVar.Z1 = new u(11);
            viVar.P = true;
            viVar.f31364x1.setVisibility(8);
            viVar.f31351t2 = new androidx.car.app.utils.a(c2Var, aVar, viVar, 11);
            viVar.r1();
            viVar.show();
        }
    }

    @Override
    public void r() {
        c2 c2Var = (c2) this.f50707a;
        int i10 = 0;
        c2.Z(c2Var, false, true);
        int i11 = c2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        c2Var.x0(i10, true);
    }

    @Override
    public n70 t(View view) {
        return n70.H((c2) this.f50707a, view);
    }

    @Override
    public void u() {
        c2 c2Var = (c2) this.f50707a;
        c2Var.z0();
        c2Var.C0();
    }

    @Override
    public void x(g6 g6Var, String str) {
        c2 c2Var = (c2) this.f50707a;
        if (c2Var.f13867z0 == null) {
            c2Var.f13867z0 = new p3(new f(this, 24), c2Var.getResourceProvider());
        }
        c2Var.f13867z0.d(g6Var, str);
    }

    @Override
    public void n() {
    }

    @Override
    public void o(int i10) {
    }

    @Override
    public void v(h1 h1Var, boolean z10) {
    }

    @Override
    public void h(j jVar, long j3, long j10, int i10) {
    }

    @Override
    public void w(j jVar, long j3, long j10, boolean z10) {
    }
}
