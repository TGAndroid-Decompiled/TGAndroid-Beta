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
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.oo;
import org.telegram.ui.va1;
import qg.v2;
public final class u0 implements Runnable {
    public final int f42357a;
    public final Object f42358b;

    public u0(Object obj, int i10) {
        this.f42357a = i10;
        this.f42358b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f42357a) {
            case 0:
                nf.f.s(((v0) this.f42358b).f42371b.f42412e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                g1 g1Var = (g1) this.f42358b;
                Utilities.searchQueue.postRunnable(new in0(g1Var, new ArrayList(g1Var.h.f42206f), g1Var.h.f42208r, 22));
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) this.f42358b);
                return;
            case 3:
                ((org.telegram.ui.Cells.o1) this.f42358b).invalidateSelf();
                return;
            case 4:
                a2 a2Var = (a2) this.f42358b;
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
                    j3 += a2.Y(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += a2.Y(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = a2.Y(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new oo(a2Var, j3, j10, 1));
                return;
            case 5:
                ((boolean[]) this.f42358b)[0] = true;
                return;
            case 6:
                ((p4.e) this.f42358b).k();
                return;
            case 7:
                ((p4.g) this.f42358b).f44187n = -1;
                return;
            case 8:
                ((bl0) this.f42358b).b();
                return;
            case 9:
                l2.g gVar = ((pg.r0) this.f42358b).f44579b.f44590a;
                if (gVar != null) {
                    gVar.m();
                    return;
                }
                return;
            case 10:
                pg.s0 s0Var = ((pg.r0) this.f42358b).f44579b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f44594f.getCurrentColor();
                s0Var.l(s0Var.f44591b, false, false);
                a5.a d = s0Var.d(s0Var.f44591b, currentColor, new RectF(s0Var.h));
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
                ((pg.d1) ((pg.c1) this.f42358b).f44445b).f44458y.f44484a.a();
                return;
            case 12:
                pg.v1 v1Var = ((pg.w1) this.f42358b).f44678a;
                if (v1Var != null) {
                    v1Var.j();
                    return;
                }
                return;
            case 13:
                ph.c cVar = (ph.c) this.f42358b;
                ph.b bVar = cVar.f44714c;
                if (bVar == ph.b.f44709b) {
                    cVar.a(ph.b.f44708a, true);
                    return;
                } else if (bVar == ph.b.f44710c) {
                    cVar.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 14:
                b6 b6Var = (b6) this.f42358b;
                b6Var.f45020x0 = true;
                b6Var.s();
                return;
            case 15:
                ((View) this.f42358b).performClick();
                return;
            case 16:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.l2) this.f42358b).f45146f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 17:
                AndroidUtilities.showKeyboard(((v2) this.f42358b).f45373q0);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((qh.c) this.f42358b).f45452a);
                return;
            case 19:
                qh.c cVar2 = (qh.c) ((c6) this.f42358b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar2.f45457n;
                if (u1Var != null && u1Var.getDelegate() != null) {
                    cVar2.f45457n.getDelegate().D1(cVar2.f45457n, false);
                    return;
                }
                return;
            case 20:
                ((qh.q) this.f42358b).f45509c.f25250f3.N(true);
                return;
            case 21:
                ((qh.p) this.f42358b).a();
                return;
            case 22:
                qi.d dVar = (qi.d) this.f42358b;
                AndroidUtilities.runOnUIThread(new qi.c(dVar.f45528a, dVar.f45529b, 1), 500L);
                return;
            case 23:
                r2.f fVar = (r2.f) this.f42358b;
                synchronized (fVar.f45715a) {
                    try {
                        if (!fVar.f45725m) {
                            long j11 = fVar.f45724l - 1;
                            fVar.f45724l = j11;
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
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f42358b;
                ((s5.g) ((t5.c) sVar.f7924e)).f(new r2.s(sVar, 4));
                return;
            case 25:
                ((cf.c) this.f42358b).x();
                return;
            case 26:
                rg.k0 k0Var = ((rg.d0) this.f42358b).f46099c;
                k0Var.f25309n.presentFragment(va1.b0(k0Var.s1(), true));
                return;
            case 27:
                nj0 nj0Var = ((rg.q0) this.f42358b).f46263y;
                nj0Var.getAnimatedDrawable().N(0, true, false);
                nj0Var.d();
                return;
            case 28:
                ((rg.w0) this.f42358b).f46339b.y();
                return;
            default:
                rg.q1 q1Var = (rg.q1) this.f42358b;
                int size = 1073741823 - (1073741823 % q1Var.f46264e3.size());
                s4.c0 c0Var = q1Var.f46265f3;
                q1Var.f46277s3 = size;
                c0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.y1(null, false);
                return;
        }
    }
}
