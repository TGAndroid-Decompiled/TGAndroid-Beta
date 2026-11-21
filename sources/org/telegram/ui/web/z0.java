package org.telegram.ui.web;

import a8.xa;
import android.graphics.RectF;
import android.os.Bundle;
import fi.l7;
import hi.a5;
import java.io.File;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.y91;
import tg.d2;
import tg.n2;
public final class z0 implements Runnable {
    public final int f53413a;
    public final Object f53414b;

    public z0(Object obj, int i7) {
        this.f53413a = i7;
        this.f53414b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f53413a) {
            case 0:
                HttpGetFileTask.a((HttpGetFileTask) this.f53414b);
                return;
            case 1:
                ((m6) this.f53414b).invalidateSelf();
                return;
            case 2:
                n1 n1Var = (n1) this.f53414b;
                File databasePath = org.telegram.messenger.t0.f26941b.getDatabasePath("webview.db");
                long j10 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j3 = databasePath.length();
                } else {
                    j3 = 0;
                }
                File databasePath2 = org.telegram.messenger.t0.f26941b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j3 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.f26941b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j3 += n1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.f26941b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += n1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.f26941b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = n1.e0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.g0.g3(new ai.g0(n1Var, j3, j10, 3));
                return;
            case 3:
                q2.d dVar = (q2.d) this.f53414b;
                if (!dVar.f55782c) {
                    q2.g gVar = dVar.f55781b;
                    if (gVar != null) {
                        gVar.c(dVar.f55780a);
                    }
                    dVar.d.f55793y.remove(dVar);
                    dVar.f55782c = true;
                    return;
                }
                return;
            case 4:
                ((q2.b) this.f53414b).c(null);
                return;
            case 5:
                y91 y91Var = (y91) this.f53414b;
                if (y91Var.getParentLayout() != null) {
                    y91Var.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", y91Var.f54095a);
                    bn bnVar = new bn(bundle);
                    bnVar.Ga = true;
                    y91Var.presentFragment(bnVar);
                    return;
                }
                return;
            case 6:
                ((qf) this.f53414b).v0();
                return;
            case 7:
                uz uzVar = (uz) this.f53414b;
                rh.b bVar = (rh.b) uzVar.f40618c;
                if (bVar == rh.b.f56635b) {
                    uzVar.a(rh.b.f56634a, true);
                    return;
                } else if (bVar == rh.b.f56636c) {
                    uzVar.a(rh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 8:
                ((s4.e) this.f53414b).k();
                return;
            case 9:
                ((s4.g) this.f53414b).f57001n = -1;
                return;
            case 10:
                ((k5) this.f53414b).i();
                return;
            case 11:
                jn jnVar = ((sg.g0) this.f53414b).f57240b.f57262a;
                if (jnVar != null) {
                    jnVar.l();
                    return;
                }
                return;
            case 12:
                sg.i0 i0Var = ((sg.g0) this.f53414b).f57240b;
                if (i0Var.d == null) {
                    i0Var.L = null;
                    return;
                }
                int currentColor = i0Var.f57266f.getCurrentColor();
                i0Var.l(i0Var.f57263b, false, false);
                xa d = i0Var.d(i0Var.f57263b, currentColor, new RectF(i0Var.h));
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
                ((sg.s0) ((s4.s0) this.f53414b).f57072b).E.f57397a.j();
                return;
            case 14:
                sg.j1 j1Var = ((sg.k1) this.f53414b).f57312a;
                if (j1Var != null) {
                    j1Var.u();
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.I3(((sh.b) this.f53414b).f57461a);
                return;
            case 16:
                sh.b bVar2 = (sh.b) ((bi.u) this.f53414b).f4130f2;
                org.telegram.ui.Cells.r1 r1Var = bVar2.f57466n;
                if (r1Var != null && r1Var.getDelegate() != null) {
                    bVar2.f57466n.getDelegate().F1(bVar2.f57466n, false);
                    return;
                }
                return;
            case 17:
                ((sh.n) this.f53414b).f57513c.f35796g3.O(true);
                return;
            case 18:
                ((sh.m) this.f53414b).a();
                return;
            case 19:
                a5 a5Var = (a5) this.f53414b;
                a5Var.f58203y0 = true;
                a5Var.s();
                return;
            case 20:
                ri.d0(j10.f24798t0).d(2, null, ((d2) this.f53414b).f57816f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 21:
                org.telegram.messenger.g0.I3(((n2) this.f53414b).f58083r0);
                return;
            case 22:
                u2.f fVar = (u2.f) this.f53414b;
                synchronized (fVar.f58356a) {
                    try {
                        if (!fVar.f58366m) {
                            long j11 = fVar.f58365l - 1;
                            fVar.f58365l = j11;
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
                ab.c0 c0Var = (ab.c0) this.f53414b;
                ((v5.g) ((w5.c) c0Var.f910e)).f(new tg.o1(c0Var, 7));
                return;
            case 24:
                ug.k0 k0Var = ((ug.d0) this.f53414b).f58680c;
                k0Var.f39543s1.presentFragment(c51.g0(k0Var.o1(), true));
                return;
            case 25:
                rh0 rh0Var = ((ug.r0) this.f53414b).G;
                rh0Var.getAnimatedDrawable().N(0, true, false);
                rh0Var.d();
                return;
            case 26:
                ((ug.y0) ((l7) this.f53414b).f12267c).J0();
                return;
            case 27:
                ug.m1 m1Var = (ug.m1) this.f53414b;
                int size = 1073741823 - (1073741823 % m1Var.f58818f3.size());
                v4.c0 c0Var2 = m1Var.f58819g3;
                m1Var.f58831t3 = size;
                c0Var2.h1(size, (m1Var.getMeasuredHeight() - m1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                m1Var.z1(null, false);
                return;
            case 28:
                ((ug.o1) this.f53414b).invalidate();
                return;
            default:
                ((ug.w1) this.f53414b).a();
                return;
        }
    }
}
