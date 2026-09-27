package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.View;
import ci.b6;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.no;
import org.telegram.ui.ra1;
import qg.v2;
public final class u0 implements Runnable {
    public final int f39168a;
    public final Object f39169b;

    public u0(Object obj, int i10) {
        this.f39168a = i10;
        this.f39169b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f39168a) {
            case 0:
                nf.f.s(((v0) this.f39169b).f39180b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                g1 g1Var = (g1) this.f39169b;
                Utilities.searchQueue.postRunnable(new en0(g1Var, new ArrayList(g1Var.h.f39029f), g1Var.h.f39031r, 22));
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) this.f39169b);
                return;
            case 3:
                ((org.telegram.ui.Cells.o1) this.f39169b).invalidateSelf();
                return;
            case 4:
                z1 z1Var = (z1) this.f39169b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long j10 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j3 = databasePath.length();
                } else {
                    j3 = 0;
                }
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j3 += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j3 += z1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += z1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = z1.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new no(z1Var, j3, j10, 1));
                return;
            case 5:
                ((boolean[]) this.f39169b)[0] = true;
                return;
            case 6:
                ((p4.e) this.f39169b).k();
                return;
            case 7:
                ((p4.g) this.f39169b).f40849n = -1;
                return;
            case 8:
                ((bl0) this.f39169b).b();
                return;
            case 9:
                o0.c cVar = ((pg.r0) this.f39169b).f41210b.f41219a;
                if (cVar != null) {
                    cVar.v();
                    return;
                }
                return;
            case 10:
                pg.s0 s0Var = ((pg.r0) this.f39169b).f41210b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f41222f.getCurrentColor();
                s0Var.l(s0Var.f41220b, false, false);
                a5.a d = s0Var.d(s0Var.f41220b, currentColor, new RectF(s0Var.h));
                s0Var.b();
                pg.i1 i1Var = s0Var.d;
                RectF rectF = new RectF();
                s0Var.h = rectF;
                i1Var.a(rectF);
                s0Var.p(s0Var.e(i1Var, currentColor, new RectF(s0Var.h)), false);
                s0Var.p(d, false);
                s0Var.e(i1Var, currentColor, null);
                s0Var.d = null;
                s0Var.J = 0.0f;
                s0Var.L = null;
                return;
            case 11:
                ((pg.d1) ((pg.c1) this.f39169b).f41084b).f41096y.f41121a.a();
                return;
            case 12:
                pg.v1 v1Var = ((pg.w1) this.f39169b).f41299a;
                if (v1Var != null) {
                    v1Var.g();
                    return;
                }
                return;
            case 13:
                ph.c cVar2 = (ph.c) this.f39169b;
                ph.b bVar = cVar2.f41331c;
                if (bVar == ph.b.f41327b) {
                    cVar2.a(ph.b.f41326a, true);
                    return;
                } else if (bVar == ph.b.f41328c) {
                    cVar2.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 14:
                pi.d dVar = (pi.d) this.f39169b;
                AndroidUtilities.runOnUIThread(new pi.c(dVar.f41360a, dVar.f41361b, 1), 500L);
                return;
            case 15:
                b6 b6Var = (b6) this.f39169b;
                b6Var.f41661x0 = true;
                b6Var.s();
                return;
            case 16:
                ((View) this.f39169b).performClick();
                return;
            case 17:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.l2) this.f39169b).f41778f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((v2) this.f39169b).f41994q0);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((qh.c) this.f39169b).f42067a);
                return;
            case 20:
                qh.c cVar3 = (qh.c) ((c6) this.f39169b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar3.f42071n;
                if (u1Var != null && u1Var.getDelegate() != null) {
                    cVar3.f42071n.getDelegate().D1(cVar3.f42071n, false);
                    return;
                }
                return;
            case 21:
                ((qh.q) this.f39169b).f42120c.Y2.N(true);
                return;
            case 22:
                ((qh.p) this.f39169b).a();
                return;
            case 23:
                r2.f fVar = (r2.f) this.f39169b;
                synchronized (fVar.f42272a) {
                    try {
                        if (!fVar.f42281m) {
                            long j11 = fVar.f42280l - 1;
                            fVar.f42280l = j11;
                            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                            if (i10 <= 0) {
                                if (i10 < 0) {
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
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f39169b;
                ((s5.h) ((t5.c) tVar.e)).f(new r5.d(tVar, 3));
                return;
            case 25:
                ((cf.c) this.f39169b).z();
                return;
            case 26:
                rg.j0 j0Var = ((rg.c0) this.f39169b).f42595c;
                j0Var.f22964n.presentFragment(ra1.b0(j0Var.s1(), true));
                return;
            case 27:
                nj0 nj0Var = ((rg.p0) this.f39169b).f42759y;
                nj0Var.getAnimatedDrawable().N(0, true, false);
                nj0Var.d();
                return;
            case 28:
                ((rg.v0) this.f39169b).f42830b.y();
                return;
            default:
                rg.o1 o1Var = (rg.o1) this.f39169b;
                int size = 1073741823 - (1073741823 % o1Var.X2.size());
                s4.c0 c0Var = o1Var.Y2;
                o1Var.f42744l3 = size;
                c0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.x1(null, false);
                return;
        }
    }
}
