package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.View;
import ci.b6;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.db1;
import org.telegram.ui.to;
import qg.w2;
public final class t0 implements Runnable {
    public final int f43406a;
    public final Object f43407b;

    public t0(Object obj, int i10) {
        this.f43406a = i10;
        this.f43407b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f43406a) {
            case 0:
                of.f.s(((u0) this.f43407b).f43418b.f43463e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                f1 f1Var = (f1) this.f43407b;
                Utilities.searchQueue.postRunnable(new mh0(f1Var, new ArrayList(f1Var.h.f43249e), f1Var.h.f43251n, 23));
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) this.f43407b);
                return;
            case 3:
                ((org.telegram.ui.Cells.o1) this.f43407b).invalidateSelf();
                return;
            case 4:
                y1 y1Var = (y1) this.f43407b;
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
                AndroidUtilities.runOnUIThread(new to(y1Var, j3, j10, 1));
                return;
            case 5:
                ((boolean[]) this.f43407b)[0] = true;
                return;
            case 6:
                ((p4.e) this.f43407b).k();
                return;
            case 7:
                ((p4.g) this.f43407b).f45252n = -1;
                return;
            case 8:
                ((zl0) this.f43407b).b();
                return;
            case 9:
                k2.g0 g0Var = ((pg.q0) this.f43407b).f45614b.f45633a;
                if (g0Var != null) {
                    g0Var.e();
                    return;
                }
                return;
            case 10:
                pg.r0 r0Var = ((pg.q0) this.f43407b).f45614b;
                if (r0Var.d == null) {
                    r0Var.L = null;
                    return;
                }
                int currentColor = r0Var.f45637f.getCurrentColor();
                r0Var.l(r0Var.f45634b, false, false);
                a5.a d = r0Var.d(r0Var.f45634b, currentColor, new RectF(r0Var.h));
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
                ((pg.b1) ((p4.t0) this.f43407b).f45324b).f45491y.f45520a.a();
                return;
            case 12:
                pg.t1 t1Var = ((pg.u1) this.f43407b).f45700a;
                if (t1Var != null) {
                    t1Var.e();
                    return;
                }
                return;
            case 13:
                ph.c cVar = (ph.c) this.f43407b;
                ph.b bVar = cVar.f45751c;
                if (bVar == ph.b.f45746b) {
                    cVar.a(ph.b.f45745a, true);
                    return;
                } else if (bVar == ph.b.f45747c) {
                    cVar.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 14:
                b6 b6Var = (b6) this.f43407b;
                b6Var.f46181x0 = true;
                b6Var.s();
                return;
            case 15:
                ((View) this.f43407b).performClick();
                return;
            case 16:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.m2) this.f43407b).f46347f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 17:
                AndroidUtilities.showKeyboard(((w2) this.f43407b).f46554q0);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((qh.c) this.f43407b).f46608a);
                return;
            case 19:
                qh.c cVar2 = (qh.c) ((c6) this.f43407b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar2.f46613n;
                if (u1Var != null && u1Var.getDelegate() != null) {
                    cVar2.f46613n.getDelegate().K1(cVar2.f46613n, false);
                    return;
                }
                return;
            case 20:
                ((qh.q) this.f43407b).f46665c.W2.N(true);
                return;
            case 21:
                ((qh.p) this.f43407b).a();
                return;
            case 22:
                v60 v60Var = (v60) ((n4.l) this.f43407b).f16326a;
                v60Var.f31428p0 = true;
                FileLog.d("RoundVideo camera flip first frame: elapsedMs=" + v60.k(v60Var));
                v60Var.t(true);
                v60.l(v60Var);
                return;
            case 23:
                r2.f fVar = (r2.f) this.f43407b;
                synchronized (fVar.f47096a) {
                    try {
                        if (!fVar.f47106m) {
                            long j11 = fVar.f47105l - 1;
                            fVar.f47105l = j11;
                            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                            if (i10 <= 0) {
                                if (i10 < 0) {
                                    fVar.b(new IllegalStateException());
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
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f43407b;
                ((s5.g) ((t5.c) sVar.f7969e)).f(new r5.d(sVar, 2));
                return;
            case 25:
                rg.j0 j0Var = ((rg.c0) this.f43407b).f47435c;
                j0Var.f25289n.presentFragment(db1.d0(j0Var.t1(), true));
                return;
            case 26:
                ik0 ik0Var = ((rg.q0) this.f43407b).f47627y;
                ik0Var.getAnimatedDrawable().N(0, true, false);
                ik0Var.d();
                return;
            case 27:
                ((rg.w0) this.f43407b).f47724b.A();
                return;
            case 28:
                rg.p1 p1Var = (rg.p1) this.f43407b;
                int size = 1073741823 - (1073741823 % p1Var.V2.size());
                s4.d0 d0Var = p1Var.W2;
                p1Var.j3 = size;
                d0Var.h1(size, (p1Var.getMeasuredHeight() - p1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                p1Var.x1(null, false);
                return;
            default:
                ((rg.r1) this.f43407b).invalidate();
                return;
        }
    }
}
