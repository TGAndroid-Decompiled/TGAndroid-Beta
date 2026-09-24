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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.mo;
import org.telegram.ui.sa1;
import qg.v2;
public final class q0 implements Runnable {
    public final int f39169a;
    public final Object f39170b;

    public q0(Object obj, int i10) {
        this.f39169a = i10;
        this.f39170b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f39169a) {
            case 0:
                ((cu) this.f39170b).requestFocus();
                return;
            case 1:
                nf.f.s(((u0) this.f39170b).f39198b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 2:
                g1 g1Var = (g1) this.f39170b;
                Utilities.searchQueue.postRunnable(new cn0(g1Var, new ArrayList(g1Var.h.e), g1Var.h.f39070n, 22));
                return;
            case 3:
                HttpGetFileTask.a((HttpGetFileTask) this.f39170b);
                return;
            case 4:
                ((org.telegram.ui.Cells.o1) this.f39170b).invalidateSelf();
                return;
            case 5:
                z1 z1Var = (z1) this.f39170b;
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
                AndroidUtilities.runOnUIThread(new mo(z1Var, j3, j10, 1));
                return;
            case 6:
                ((boolean[]) this.f39170b)[0] = true;
                return;
            case 7:
                ((p4.e) this.f39170b).k();
                return;
            case 8:
                ((p4.g) this.f39170b).f40837n = -1;
                return;
            case 9:
                ((zk0) this.f39170b).b();
                return;
            case 10:
                n2.e eVar = ((pg.r0) this.f39170b).f41198b.f41207a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            case 11:
                pg.s0 s0Var = ((pg.r0) this.f39170b).f41198b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f41210f.getCurrentColor();
                s0Var.l(s0Var.f41208b, false, false);
                a5.a d = s0Var.d(s0Var.f41208b, currentColor, new RectF(s0Var.h));
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
            case 12:
                ((pg.d1) ((pg.c1) this.f39170b).f41072b).f41084y.f41109a.a();
                return;
            case 13:
                pg.v1 v1Var = ((pg.w1) this.f39170b).f41287a;
                if (v1Var != null) {
                    v1Var.e();
                    return;
                }
                return;
            case 14:
                ph.c cVar = (ph.c) this.f39170b;
                ph.b bVar = cVar.f41319c;
                if (bVar == ph.b.f41315b) {
                    cVar.a(ph.b.f41314a, true);
                    return;
                } else if (bVar == ph.b.f41316c) {
                    cVar.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 15:
                b6 b6Var = (b6) this.f39170b;
                b6Var.f41622x0 = true;
                b6Var.s();
                return;
            case 16:
                ((View) this.f39170b).performClick();
                return;
            case 17:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.l2) this.f39170b).f41725f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((v2) this.f39170b).f41949q0);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((qh.c) this.f39170b).f42023a);
                return;
            case 20:
                qh.c cVar2 = (qh.c) ((c6) this.f39170b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar2.f42027n;
                if (u1Var != null && u1Var.getDelegate() != null) {
                    cVar2.f42027n.getDelegate().D1(cVar2.f42027n, false);
                    return;
                }
                return;
            case 21:
                ((qh.q) this.f39170b).f42076c.Y2.N(true);
                return;
            case 22:
                ((qh.p) this.f39170b).a();
                return;
            case 23:
                r2.f fVar = (r2.f) this.f39170b;
                synchronized (fVar.f42213a) {
                    try {
                        if (!fVar.f42222m) {
                            long j11 = fVar.f42221l - 1;
                            fVar.f42221l = j11;
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
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f39170b;
                ((s5.h) ((t5.c) tVar.e)).f(new r5.d(tVar, 2));
                return;
            case 25:
                ((cf.c) this.f39170b).z();
                return;
            case 26:
                rg.j0 j0Var = ((rg.c0) this.f39170b).f42536c;
                j0Var.f22949n.presentFragment(sa1.d0(j0Var.s1(), true));
                return;
            case 27:
                lj0 lj0Var = ((rg.p0) this.f39170b).f42700y;
                lj0Var.getAnimatedDrawable().N(0, true, false);
                lj0Var.d();
                return;
            case 28:
                ((rg.v0) this.f39170b).f42771b.y();
                return;
            default:
                rg.o1 o1Var = (rg.o1) this.f39170b;
                int size = 1073741823 - (1073741823 % o1Var.X2.size());
                s4.c0 c0Var = o1Var.Y2;
                o1Var.f42685l3 = size;
                c0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.w1(null, false);
                return;
        }
    }
}
