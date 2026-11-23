package org.telegram.ui.web;

import a8.xa;
import android.graphics.RectF;
import android.os.Bundle;
import fi.l7;
import hi.a5;
import java.io.File;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
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
    public final int f53417a;
    public final Object f53418b;

    public z0(Object obj, int i7) {
        this.f53417a = i7;
        this.f53418b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f53417a) {
            case 0:
                HttpGetFileTask.a((HttpGetFileTask) this.f53418b);
                return;
            case 1:
                ((m6) this.f53418b).invalidateSelf();
                return;
            case 2:
                n1 n1Var = (n1) this.f53418b;
                File databasePath = org.telegram.messenger.t0.f26931b.getDatabasePath("webview.db");
                long j10 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j3 = databasePath.length();
                } else {
                    j3 = 0;
                }
                File databasePath2 = org.telegram.messenger.t0.f26931b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j3 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j3 += n1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += n1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = n1.e0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.g0.g3(new ai.g0(n1Var, j3, j10, 3));
                return;
            case 3:
                q2.d dVar = (q2.d) this.f53418b;
                if (!dVar.f55786c) {
                    q2.g gVar = dVar.f55785b;
                    if (gVar != null) {
                        gVar.c(dVar.f55784a);
                    }
                    dVar.d.f55797y.remove(dVar);
                    dVar.f55786c = true;
                    return;
                }
                return;
            case 4:
                ((q2.b) this.f53418b).c(null);
                return;
            case 5:
                y91 y91Var = (y91) this.f53418b;
                if (y91Var.getParentLayout() != null) {
                    y91Var.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", y91Var.f54099a);
                    bn bnVar = new bn(bundle);
                    bnVar.Ga = true;
                    y91Var.presentFragment(bnVar);
                    return;
                }
                return;
            case 6:
                ((qf) this.f53418b).v0();
                return;
            case 7:
                uz uzVar = (uz) this.f53418b;
                rh.b bVar = (rh.b) uzVar.f40611c;
                if (bVar == rh.b.f56639b) {
                    uzVar.a(rh.b.f56638a, true);
                    return;
                } else if (bVar == rh.b.f56640c) {
                    uzVar.a(rh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 8:
                ((s4.e) this.f53418b).k();
                return;
            case 9:
                ((s4.g) this.f53418b).f57005n = -1;
                return;
            case 10:
                ((k5) this.f53418b).i();
                return;
            case 11:
                jn jnVar = ((sg.g0) this.f53418b).f57244b.f57266a;
                if (jnVar != null) {
                    jnVar.l();
                    return;
                }
                return;
            case 12:
                sg.i0 i0Var = ((sg.g0) this.f53418b).f57244b;
                if (i0Var.d == null) {
                    i0Var.L = null;
                    return;
                }
                int currentColor = i0Var.f57270f.getCurrentColor();
                i0Var.l(i0Var.f57267b, false, false);
                xa d = i0Var.d(i0Var.f57267b, currentColor, new RectF(i0Var.h));
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
                ((sg.s0) ((s4.s0) this.f53418b).f57076b).E.f57401a.j();
                return;
            case 14:
                sg.j1 j1Var = ((sg.k1) this.f53418b).f57316a;
                if (j1Var != null) {
                    j1Var.u();
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.I3(((sh.b) this.f53418b).f57465a);
                return;
            case 16:
                sh.b bVar2 = (sh.b) ((bi.u) this.f53418b).f4135f2;
                org.telegram.ui.Cells.r1 r1Var = bVar2.f57470n;
                if (r1Var != null && r1Var.getDelegate() != null) {
                    bVar2.f57470n.getDelegate().F1(bVar2.f57470n, false);
                    return;
                }
                return;
            case 17:
                ((sh.n) this.f53418b).f57517c.f35790g3.O(true);
                return;
            case 18:
                ((sh.m) this.f53418b).a();
                return;
            case 19:
                a5 a5Var = (a5) this.f53418b;
                a5Var.f58207y0 = true;
                a5Var.s();
                return;
            case 20:
                si.d0(k10.f24968t0).d(2, null, ((d2) this.f53418b).f57820f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 21:
                org.telegram.messenger.g0.I3(((n2) this.f53418b).f58087r0);
                return;
            case 22:
                u2.f fVar = (u2.f) this.f53418b;
                synchronized (fVar.f58360a) {
                    try {
                        if (!fVar.f58370m) {
                            long j11 = fVar.f58369l - 1;
                            fVar.f58369l = j11;
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
                ab.c0 c0Var = (ab.c0) this.f53418b;
                ((v5.g) ((w5.c) c0Var.f910e)).f(new tg.o1(c0Var, 7));
                return;
            case 24:
                ug.k0 k0Var = ((ug.d0) this.f53418b).f58684c;
                k0Var.f39536s1.presentFragment(c51.g0(k0Var.o1(), true));
                return;
            case 25:
                rh0 rh0Var = ((ug.r0) this.f53418b).G;
                rh0Var.getAnimatedDrawable().N(0, true, false);
                rh0Var.d();
                return;
            case 26:
                ((ug.y0) ((l7) this.f53418b).f12270c).J0();
                return;
            case 27:
                ug.m1 m1Var = (ug.m1) this.f53418b;
                int size = 1073741823 - (1073741823 % m1Var.f58822f3.size());
                v4.c0 c0Var2 = m1Var.f58823g3;
                m1Var.f58835t3 = size;
                c0Var2.h1(size, (m1Var.getMeasuredHeight() - m1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                m1Var.z1(null, false);
                return;
            case 28:
                ((ug.o1) this.f53418b).invalidate();
                return;
            default:
                ((ug.w1) this.f53418b).a();
                return;
        }
    }
}
