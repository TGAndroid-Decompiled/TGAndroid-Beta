package org.telegram.ui.web;

import a8.xa;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import fi.l7;
import hi.b5;
import java.io.File;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.y91;
import tg.d2;
import tg.n2;
public final class i1 implements Runnable {
    public final int f53130a;
    public final Object f53131b;

    public i1(Object obj, int i7) {
        this.f53130a = i7;
        this.f53131b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f53130a) {
            case 0:
                ((m6) this.f53131b).invalidateSelf();
                return;
            case 1:
                n1 n1Var = (n1) this.f53131b;
                File databasePath = org.telegram.messenger.t0.f26895b.getDatabasePath("webview.db");
                long j10 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j3 = databasePath.length();
                } else {
                    j3 = 0;
                }
                File databasePath2 = org.telegram.messenger.t0.f26895b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j3 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.f26895b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j3 += n1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.f26895b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += n1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.f26895b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = n1.e0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.g0.g3(new ai.b0(n1Var, j3, j10, 3));
                return;
            case 2:
                q2.d dVar = (q2.d) this.f53131b;
                if (!dVar.f55751c) {
                    q2.g gVar = dVar.f55750b;
                    if (gVar != null) {
                        gVar.c(dVar.f55749a);
                    }
                    dVar.d.f55762y.remove(dVar);
                    dVar.f55751c = true;
                    return;
                }
                return;
            case 3:
                ((q2.b) this.f53131b).c(null);
                return;
            case 4:
                y91 y91Var = (y91) this.f53131b;
                if (y91Var.getParentLayout() != null) {
                    y91Var.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", y91Var.f54075a);
                    bn bnVar = new bn(bundle);
                    bnVar.Ga = true;
                    y91Var.presentFragment(bnVar);
                    return;
                }
                return;
            case 5:
                ((pf) this.f53131b).v0();
                return;
            case 6:
                uz uzVar = (uz) this.f53131b;
                rh.b bVar = (rh.b) uzVar.f40562c;
                if (bVar == rh.b.f56604b) {
                    uzVar.a(rh.b.f56603a, true);
                    return;
                } else if (bVar == rh.b.f56605c) {
                    uzVar.a(rh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 7:
                ((s4.e) this.f53131b).k();
                return;
            case 8:
                ((s4.g) this.f53131b).f56970n = -1;
                return;
            case 9:
                ((k5) this.f53131b).i();
                return;
            case 10:
                jn jnVar = ((sg.g0) this.f53131b).f57209b.f57231a;
                if (jnVar != null) {
                    jnVar.l();
                    return;
                }
                return;
            case 11:
                sg.i0 i0Var = ((sg.g0) this.f53131b).f57209b;
                if (i0Var.d == null) {
                    i0Var.L = null;
                    return;
                }
                int currentColor = i0Var.f57235f.getCurrentColor();
                i0Var.l(i0Var.f57232b, false, false);
                xa d = i0Var.d(i0Var.f57232b, currentColor, new RectF(i0Var.h));
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
            case 12:
                ((sg.s0) ((s4.s0) this.f53131b).f57041b).E.f57366a.j();
                return;
            case 13:
                sg.j1 j1Var = ((sg.k1) this.f53131b).f57281a;
                if (j1Var != null) {
                    j1Var.u();
                    return;
                }
                return;
            case 14:
                org.telegram.messenger.g0.I3(((sh.b) this.f53131b).f57430a);
                return;
            case 15:
                sh.b bVar2 = (sh.b) ((bi.u) this.f53131b).f4085f2;
                org.telegram.ui.Cells.r1 r1Var = bVar2.f57435n;
                if (r1Var != null && r1Var.getDelegate() != null) {
                    bVar2.f57435n.getDelegate().F1(bVar2.f57435n, false);
                    return;
                }
                return;
            case 16:
                ((sh.n) this.f53131b).f57482c.f35742g3.O(true);
                return;
            case 17:
                ((sh.m) this.f53131b).a();
                return;
            case 18:
                b5 b5Var = (b5) this.f53131b;
                b5Var.f58172y0 = true;
                b5Var.s();
                return;
            case 19:
                si.d0(k10.f24932t0).d(2, null, ((d2) this.f53131b).f57785f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 20:
                org.telegram.messenger.g0.I3(((n2) this.f53131b).f58052r0);
                return;
            case 21:
                u2.f fVar = (u2.f) this.f53131b;
                synchronized (fVar.f58325a) {
                    try {
                        if (!fVar.f58335m) {
                            long j11 = fVar.f58334l - 1;
                            fVar.f58334l = j11;
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
            case 22:
                ab.c0 c0Var = (ab.c0) this.f53131b;
                ((v5.g) ((w5.c) c0Var.f910e)).f(new tg.o1(c0Var, 7));
                return;
            case 23:
                ug.k0 k0Var = ((ug.d0) this.f53131b).f58649c;
                k0Var.f39491s1.presentFragment(c51.g0(k0Var.o1(), true));
                return;
            case 24:
                rh0 rh0Var = ((ug.r0) this.f53131b).G;
                rh0Var.getAnimatedDrawable().N(0, true, false);
                rh0Var.d();
                return;
            case 25:
                ((ug.y0) ((l7) this.f53131b).f12219c).J0();
                return;
            case 26:
                ug.m1 m1Var = (ug.m1) this.f53131b;
                int size = 1073741823 - (1073741823 % m1Var.f58787f3.size());
                v4.b0 b0Var = m1Var.f58788g3;
                m1Var.f58800t3 = size;
                b0Var.h1(size, (m1Var.getMeasuredHeight() - m1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                m1Var.z1(null, false);
                return;
            case 27:
                ((ug.o1) this.f53131b).invalidate();
                return;
            case 28:
                ((ug.w1) this.f53131b).a();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f53131b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
        }
    }
}
