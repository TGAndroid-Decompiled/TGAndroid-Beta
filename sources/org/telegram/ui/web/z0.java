package org.telegram.ui.web;

import a8.xa;
import android.graphics.RectF;
import android.os.Bundle;
import fi.l7;
import java.io.File;
import org.telegram.messenger.i10;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.b51;
import org.telegram.ui.bn;
import org.telegram.ui.vp0;
import org.telegram.ui.w91;
import tg.g2;
import tg.q2;
public final class z0 implements Runnable {
    public final int f53654a;
    public final Object f53655b;

    public z0(Object obj, int i7) {
        this.f53654a = i7;
        this.f53655b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f53654a) {
            case 0:
                HttpGetFileTask.a((HttpGetFileTask) this.f53655b);
                return;
            case 1:
                ((n6) this.f53655b).invalidateSelf();
                return;
            case 2:
                n1 n1Var = (n1) this.f53655b;
                File databasePath = org.telegram.messenger.t0.f27013b.getDatabasePath("webview.db");
                long j10 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j3 = databasePath.length();
                } else {
                    j3 = 0;
                }
                File databasePath2 = org.telegram.messenger.t0.f27013b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j3 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j3 += n1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += n1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = n1.e0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.g0.g3(new ai.c0(n1Var, j3, j10, 3));
                return;
            case 3:
                q2.d dVar = (q2.d) this.f53655b;
                if (!dVar.f55864c) {
                    q2.g gVar = dVar.f55863b;
                    if (gVar != null) {
                        gVar.c(dVar.f55862a);
                    }
                    dVar.d.f55875y.remove(dVar);
                    dVar.f55864c = true;
                    return;
                }
                return;
            case 4:
                ((q2.b) this.f53655b).c(null);
                return;
            case 5:
                w91 w91Var = (w91) this.f53655b;
                if (w91Var.getParentLayout() != null) {
                    w91Var.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", w91Var.f53216a);
                    bn bnVar = new bn(bundle);
                    bnVar.Ga = true;
                    w91Var.presentFragment(bnVar);
                    return;
                }
                return;
            case 6:
                ((aa) this.f53655b).H2();
                return;
            case 7:
                rz rzVar = (rz) this.f53655b;
                rh.b bVar = (rh.b) rzVar.f39439c;
                if (bVar == rh.b.f56717b) {
                    rzVar.a(rh.b.f56716a, true);
                    return;
                } else if (bVar == rh.b.f56718c) {
                    rzVar.a(rh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 8:
                ((s4.e) this.f53655b).k();
                return;
            case 9:
                ((s4.g) this.f53655b).f57086n = -1;
                return;
            case 10:
                ((l5) this.f53655b).i();
                return;
            case 11:
                nd0 nd0Var = ((sg.g0) this.f53655b).f57334b.f57339a;
                if (nd0Var != null) {
                    nd0Var.p();
                    return;
                }
                return;
            case 12:
                sg.h0 h0Var = ((sg.g0) this.f53655b).f57334b;
                if (h0Var.d == null) {
                    h0Var.L = null;
                    return;
                }
                int currentColor = h0Var.f57343f.getCurrentColor();
                h0Var.l(h0Var.f57340b, false, false);
                xa d = h0Var.d(h0Var.f57340b, currentColor, new RectF(h0Var.h));
                h0Var.b();
                sg.w0 w0Var = h0Var.d;
                RectF rectF = new RectF();
                h0Var.h = rectF;
                w0Var.a(rectF);
                h0Var.p(h0Var.e(w0Var, currentColor, new RectF(h0Var.h)), false);
                h0Var.p(d, false);
                h0Var.e(w0Var, currentColor, null);
                h0Var.d = null;
                h0Var.J = 0.0f;
                h0Var.L = null;
                return;
            case 13:
                ((sg.r0) ((o5) this.f53655b).f44792b).E.f57469a.h();
                return;
            case 14:
                sg.i1 i1Var = ((sg.j1) this.f53655b).f57386a;
                if (i1Var != null) {
                    i1Var.v();
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.I3(((sh.b) this.f53655b).f57541a);
                return;
            case 16:
                sh.b bVar2 = (sh.b) ((bi.u) this.f53655b).f4085f2;
                org.telegram.ui.Cells.r1 r1Var = bVar2.f57546n;
                if (r1Var != null && r1Var.getDelegate() != null) {
                    bVar2.f57546n.getDelegate().F1(bVar2.f57546n, false);
                    return;
                }
                return;
            case 17:
                ((sh.n) this.f53655b).f57593c.f35323g3.O(true);
                return;
            case 18:
                ((sh.m) this.f53655b).a();
                return;
            case 19:
                tg.b0 b0Var = ((vp0) this.f53655b).K1;
                if (b0Var != null) {
                    b0Var.O0();
                    return;
                }
                return;
            case 20:
                hi.l5 l5Var = (hi.l5) this.f53655b;
                l5Var.f58319z0 = true;
                l5Var.s();
                return;
            case 21:
                ri.d0(i10.f24637t0).d(2, null, ((g2) this.f53655b).f57923f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 22:
                org.telegram.messenger.g0.I3(((q2) this.f53655b).f58178s0);
                return;
            case 23:
                u2.f fVar = (u2.f) this.f53655b;
                synchronized (fVar.f58440a) {
                    try {
                        if (!fVar.f58450m) {
                            long j11 = fVar.f58449l - 1;
                            fVar.f58449l = j11;
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
            case 24:
                ab.c0 c0Var = (ab.c0) this.f53655b;
                ((v5.g) ((w5.c) c0Var.f910e)).f(new tg.s(c0Var, 9));
                return;
            case 25:
                ug.k0 k0Var = ((ug.d0) this.f53655b).f58764c;
                k0Var.f39250s1.presentFragment(b51.g0(k0Var.o1(), true));
                return;
            case 26:
                qh0 qh0Var = ((ug.r0) this.f53655b).G;
                qh0Var.getAnimatedDrawable().N(0, true, false);
                qh0Var.d();
                return;
            case 27:
                ((ug.y0) ((l7) this.f53655b).f12232c).J0();
                return;
            case 28:
                ug.m1 m1Var = (ug.m1) this.f53655b;
                int size = 1073741823 - (1073741823 % m1Var.f58902f3.size());
                v4.c0 c0Var2 = m1Var.f58903g3;
                m1Var.f58915t3 = size;
                c0Var2.h1(size, (m1Var.getMeasuredHeight() - m1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                m1Var.z1(null, false);
                return;
            default:
                ((ug.o1) this.f53655b).invalidate();
                return;
        }
    }
}
