package org.telegram.ui.web;

import a8.xa;
import android.graphics.RectF;
import android.os.Bundle;
import fi.l7;
import hi.b5;
import java.io.File;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.y91;
import tg.c2;
import tg.m2;
public final class z0 implements Runnable {
    public final int f53419a;
    public final Object f53420b;

    public z0(Object obj, int i7) {
        this.f53419a = i7;
        this.f53420b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f53419a) {
            case 0:
                HttpGetFileTask.a((HttpGetFileTask) this.f53420b);
                return;
            case 1:
                ((m6) this.f53420b).invalidateSelf();
                return;
            case 2:
                n1 n1Var = (n1) this.f53420b;
                File databasePath = org.telegram.messenger.t0.f26915b.getDatabasePath("webview.db");
                long j10 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j3 = databasePath.length();
                } else {
                    j3 = 0;
                }
                File databasePath2 = org.telegram.messenger.t0.f26915b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j3 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j3 += n1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += n1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = n1.e0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.g0.g3(new ai.f0(n1Var, j3, j10, 3));
                return;
            case 3:
                q2.d dVar = (q2.d) this.f53420b;
                if (!dVar.f55741c) {
                    q2.g gVar = dVar.f55740b;
                    if (gVar != null) {
                        gVar.c(dVar.f55739a);
                    }
                    dVar.d.f55752y.remove(dVar);
                    dVar.f55741c = true;
                    return;
                }
                return;
            case 4:
                ((q2.b) this.f53420b).c(null);
                return;
            case 5:
                y91 y91Var = (y91) this.f53420b;
                if (y91Var.getParentLayout() != null) {
                    y91Var.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", y91Var.f54109a);
                    bn bnVar = new bn(bundle);
                    bnVar.Ga = true;
                    y91Var.presentFragment(bnVar);
                    return;
                }
                return;
            case 6:
                ((of) this.f53420b).v0();
                return;
            case 7:
                sz szVar = (sz) this.f53420b;
                rh.b bVar = (rh.b) szVar.f39868c;
                if (bVar == rh.b.f56594b) {
                    szVar.a(rh.b.f56593a, true);
                    return;
                } else if (bVar == rh.b.f56595c) {
                    szVar.a(rh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 8:
                ((s4.e) this.f53420b).k();
                return;
            case 9:
                ((s4.g) this.f53420b).f56960n = -1;
                return;
            case 10:
                ((l5) this.f53420b).i();
                return;
            case 11:
                hn hnVar = ((sg.g0) this.f53420b).f57199b.f57221a;
                if (hnVar != null) {
                    hnVar.l();
                    return;
                }
                return;
            case 12:
                sg.i0 i0Var = ((sg.g0) this.f53420b).f57199b;
                if (i0Var.d == null) {
                    i0Var.L = null;
                    return;
                }
                int currentColor = i0Var.f57225f.getCurrentColor();
                i0Var.l(i0Var.f57222b, false, false);
                xa d = i0Var.d(i0Var.f57222b, currentColor, new RectF(i0Var.h));
                i0Var.b();
                sg.x0 x0Var = i0Var.d;
                RectF rectF = new RectF();
                i0Var.h = rectF;
                x0Var.a(rectF);
                i0Var.p(i0Var.e(x0Var, currentColor, new RectF(i0Var.h)), false);
                i0Var.p(d, false);
                i0Var.e(x0Var, currentColor, null);
                i0Var.d = null;
                i0Var.J = 0.0f;
                i0Var.L = null;
                return;
            case 13:
                ((sg.s0) ((s4.s0) this.f53420b).f57031b).E.f57356a.j();
                return;
            case 14:
                sg.j1 j1Var = ((sg.k1) this.f53420b).f57271a;
                if (j1Var != null) {
                    j1Var.u();
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.I3(((sh.c) this.f53420b).f57422a);
                return;
            case 16:
                sh.c cVar = (sh.c) ((bi.u) this.f53420b).f4101f2;
                org.telegram.ui.Cells.q1 q1Var = cVar.f57427n;
                if (q1Var != null && q1Var.getDelegate() != null) {
                    cVar.f57427n.getDelegate().F1(cVar.f57427n, false);
                    return;
                }
                return;
            case 17:
                ((sh.o) this.f53420b).f57474c.f34607g3.O(true);
                return;
            case 18:
                ((sh.n) this.f53420b).a();
                return;
            case 19:
                b5 b5Var = (b5) this.f53420b;
                b5Var.f58146y0 = true;
                b5Var.s();
                return;
            case 20:
                ri.d0(j10.f24773t0).d(2, null, ((c2) this.f53420b).f57757f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 21:
                org.telegram.messenger.g0.I3(((m2) this.f53420b).f58027r0);
                return;
            case 22:
                u2.f fVar = (u2.f) this.f53420b;
                synchronized (fVar.f58314a) {
                    try {
                        if (!fVar.f58324m) {
                            long j11 = fVar.f58323l - 1;
                            fVar.f58323l = j11;
                            int i7 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                            if (i7 <= 0) {
                                if (i7 < 0) {
                                    fVar.c(new IllegalStateException());
                                    return;
                                } else {
                                    fVar.a();
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 23:
                ab.c0 c0Var = (ab.c0) this.f53420b;
                ((v5.g) ((w5.c) c0Var.f910e)).f(new tg.z1(c0Var, 6));
                return;
            case 24:
                ug.l0 l0Var = ((ug.e0) this.f53420b).f58646c;
                l0Var.f39538s1.presentFragment(c51.g0(l0Var.o1(), true));
                return;
            case 25:
                ph0 ph0Var = ((ug.s0) this.f53420b).G;
                ph0Var.getAnimatedDrawable().N(0, true, false);
                ph0Var.d();
                return;
            case 26:
                ((ug.z0) ((l7) this.f53420b).f12227c).J0();
                return;
            case 27:
                ug.n1 n1Var2 = (ug.n1) this.f53420b;
                int size = 1073741823 - (1073741823 % n1Var2.f58784f3.size());
                v4.c0 c0Var2 = n1Var2.f58785g3;
                n1Var2.f58797t3 = size;
                c0Var2.h1(size, (n1Var2.getMeasuredHeight() - n1Var2.getChildAt(0).getMeasuredHeight()) >> 1);
                n1Var2.z1(null, false);
                return;
            case 28:
                ((ug.p1) this.f53420b).invalidate();
                return;
            default:
                ((ug.x1) this.f53420b).a();
                return;
        }
    }
}
