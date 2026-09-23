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
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.no;
import org.telegram.ui.ra1;
import qg.n2;
import qg.x2;
public final class t0 implements Runnable {
    public final int f38833a;
    public final Object f38834b;

    public t0(Object obj, int i10) {
        this.f38833a = i10;
        this.f38834b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f38833a) {
            case 0:
                nf.f.s(((u0) this.f38834b).f38844b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                f1 f1Var = (f1) this.f38834b;
                Utilities.searchQueue.postRunnable(new fr0(f1Var, new ArrayList(f1Var.h.e), f1Var.h.f38702n));
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) this.f38834b);
                return;
            case 3:
                ((org.telegram.ui.Cells.n1) this.f38834b).invalidateSelf();
                return;
            case 4:
                y1 y1Var = (y1) this.f38834b;
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
                    j3 += y1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += y1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = y1.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new no(y1Var, j3, j10, 1));
                return;
            case 5:
                ((boolean[]) this.f38834b)[0] = true;
                return;
            case 6:
                ((p4.e) this.f38834b).k();
                return;
            case 7:
                ((p4.g) this.f38834b).f40535n = -1;
                return;
            case 8:
                ((pk0) this.f38834b).b();
                return;
            case 9:
                k2.u uVar = ((pg.q0) this.f38834b).f40888b.f40905a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            case 10:
                pg.r0 r0Var = ((pg.q0) this.f38834b).f40888b;
                if (r0Var.d == null) {
                    r0Var.L = null;
                    return;
                }
                int currentColor = r0Var.f40908f.getCurrentColor();
                r0Var.l(r0Var.f40906b, false, false);
                a5.a d = r0Var.d(r0Var.f40906b, currentColor, new RectF(r0Var.h));
                r0Var.b();
                pg.g1 g1Var = r0Var.d;
                RectF rectF = new RectF();
                r0Var.h = rectF;
                g1Var.a(rectF);
                r0Var.p(r0Var.e(g1Var, currentColor, new RectF(r0Var.h)), false);
                r0Var.p(d, false);
                r0Var.e(g1Var, currentColor, null);
                r0Var.d = null;
                r0Var.J = 0.0f;
                r0Var.L = null;
                return;
            case 11:
                ((pg.b1) ((l7) this.f38834b).f20379b).f40772y.f40799a.a();
                return;
            case 12:
                pg.t1 t1Var = ((pg.u1) this.f38834b).f40966a;
                if (t1Var != null) {
                    t1Var.e();
                    return;
                }
                return;
            case 13:
                ph.c cVar = (ph.c) this.f38834b;
                ph.b bVar = cVar.f41011c;
                if (bVar == ph.b.f41007b) {
                    cVar.a(ph.b.f41006a, true);
                    return;
                } else if (bVar == ph.b.f41008c) {
                    cVar.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 14:
                b6 b6Var = (b6) this.f38834b;
                b6Var.f41329x0 = true;
                b6Var.s();
                return;
            case 15:
                ((View) this.f38834b).performClick();
                return;
            case 16:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((n2) this.f38834b).f41435f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 17:
                AndroidUtilities.showKeyboard(((x2) this.f38834b).f41658q0);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((qh.c) this.f38834b).f41704a);
                return;
            case 19:
                qh.c cVar2 = (qh.c) ((c6) this.f38834b).d;
                org.telegram.ui.Cells.t1 t1Var2 = cVar2.f41708n;
                if (t1Var2 != null && t1Var2.getDelegate() != null) {
                    cVar2.f41708n.getDelegate().D1(cVar2.f41708n, false);
                    return;
                }
                return;
            case 20:
                ((qh.q) this.f38834b).f41757c.Y2.N(true);
                return;
            case 21:
                ((qh.p) this.f38834b).a();
                return;
            case 22:
                r2.f fVar = (r2.f) this.f38834b;
                synchronized (fVar.f41894a) {
                    try {
                        if (!fVar.f41903m) {
                            long j11 = fVar.f41902l - 1;
                            fVar.f41902l = j11;
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
            case 23:
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f38834b;
                ((s5.g) ((t5.c) tVar.e)).f(new r5.d(tVar, 2));
                return;
            case 24:
                ((cf.c) this.f38834b).y();
                return;
            case 25:
                rg.j0 j0Var = ((rg.c0) this.f38834b).f42217c;
                j0Var.f22661n.presentFragment(ra1.d0(j0Var.s1(), true));
                return;
            case 26:
                bj0 bj0Var = ((rg.p0) this.f38834b).f42381y;
                bj0Var.getAnimatedDrawable().N(0, true, false);
                bj0Var.d();
                return;
            case 27:
                ((rg.v0) this.f38834b).f42472b.y();
                return;
            case 28:
                rg.o1 o1Var = (rg.o1) this.f38834b;
                int size = 1073741823 - (1073741823 % o1Var.X2.size());
                s4.c0 c0Var = o1Var.Y2;
                o1Var.f42366l3 = size;
                c0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.w1(null, false);
                return;
            default:
                ((rg.q1) this.f38834b).invalidate();
                return;
        }
    }
}
