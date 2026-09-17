package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.View;
import ci.c6;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.ab1;
import org.telegram.ui.ro;
import qg.x2;
public final class u0 implements Runnable {
    public final int f38937a;
    public final Object f38938b;

    public u0(Object obj, int i10) {
        this.f38937a = i10;
        this.f38938b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f38937a) {
            case 0:
                nf.f.s(((v0) this.f38938b).f38948b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                g1 g1Var = (g1) this.f38938b;
                Utilities.searchQueue.postRunnable(new gr0(g1Var, new ArrayList(g1Var.h.f38810f), g1Var.h.f38812r));
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) this.f38938b);
                return;
            case 3:
                ((org.telegram.ui.Cells.n1) this.f38938b).invalidateSelf();
                return;
            case 4:
                z1 z1Var = (z1) this.f38938b;
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
                AndroidUtilities.runOnUIThread(new ro(z1Var, j3, j10, 1));
                return;
            case 5:
                ((boolean[]) this.f38938b)[0] = true;
                return;
            case 6:
                ((p4.e) this.f38938b).k();
                return;
            case 7:
                ((p4.g) this.f38938b).f40606n = -1;
                return;
            case 8:
                ((pk0) this.f38938b).b();
                return;
            case 9:
                k2.u uVar = ((pg.p0) this.f38938b).f40955b.f40970a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            case 10:
                pg.q0 q0Var = ((pg.p0) this.f38938b).f40955b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f40973f.getCurrentColor();
                q0Var.l(q0Var.f40971b, false, false);
                a5.a d = q0Var.d(q0Var.f40971b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                pg.f1 f1Var = q0Var.d;
                RectF rectF = new RectF();
                q0Var.h = rectF;
                f1Var.a(rectF);
                q0Var.p(q0Var.e(f1Var, currentColor, new RectF(q0Var.h)), false);
                q0Var.p(d, false);
                q0Var.e(f1Var, currentColor, null);
                q0Var.d = null;
                q0Var.J = 0.0f;
                q0Var.L = null;
                return;
            case 11:
                ((pg.a1) ((l7) this.f38938b).f20408b).f40838y.f40846a.a();
                return;
            case 12:
                pg.s1 s1Var = ((pg.t1) this.f38938b).f41034a;
                if (s1Var != null) {
                    s1Var.e();
                    return;
                }
                return;
            case 13:
                ph.c cVar = (ph.c) this.f38938b;
                ph.b bVar = cVar.f41081c;
                if (bVar == ph.b.f41077b) {
                    cVar.a(ph.b.f41076a, true);
                    return;
                } else if (bVar == ph.b.f41078c) {
                    cVar.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 14:
                c6 c6Var = (c6) this.f38938b;
                c6Var.f41399x0 = true;
                c6Var.s();
                return;
            case 15:
                ((View) this.f38938b).performClick();
                return;
            case 16:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.n2) this.f38938b).f41505f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 17:
                AndroidUtilities.showKeyboard(((x2) this.f38938b).f41728q0);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((qh.c) this.f38938b).f41774a);
                return;
            case 19:
                qh.c cVar2 = (qh.c) ((b6) this.f38938b).d;
                org.telegram.ui.Cells.t1 t1Var = cVar2.f41778n;
                if (t1Var != null && t1Var.getDelegate() != null) {
                    cVar2.f41778n.getDelegate().D1(cVar2.f41778n, false);
                    return;
                }
                return;
            case 20:
                ((qh.q) this.f38938b).f41827c.Y2.N(true);
                return;
            case 21:
                ((qh.p) this.f38938b).a();
                return;
            case 22:
                r2.f fVar = (r2.f) this.f38938b;
                synchronized (fVar.f41964a) {
                    try {
                        if (!fVar.f41973m) {
                            long j11 = fVar.f41972l - 1;
                            fVar.f41972l = j11;
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
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f38938b;
                ((s5.g) ((t5.c) tVar.e)).f(new r5.d(tVar, 2));
                return;
            case 24:
                ((cf.c) this.f38938b).y();
                return;
            case 25:
                rg.j0 j0Var = ((rg.c0) this.f38938b).f42288c;
                j0Var.f30451n.presentFragment(ab1.d0(j0Var.s1(), true));
                return;
            case 26:
                bj0 bj0Var = ((rg.p0) this.f38938b).f42452y;
                bj0Var.getAnimatedDrawable().N(0, true, false);
                bj0Var.d();
                return;
            case 27:
                ((rg.v0) this.f38938b).f42543b.y();
                return;
            case 28:
                rg.o1 o1Var = (rg.o1) this.f38938b;
                int size = 1073741823 - (1073741823 % o1Var.X2.size());
                s4.c0 c0Var = o1Var.Y2;
                o1Var.f42437l3 = size;
                c0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.x1(null, false);
                return;
            default:
                ((rg.q1) this.f38938b).invalidate();
                return;
        }
    }
}
