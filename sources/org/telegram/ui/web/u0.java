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
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.po;
import org.telegram.ui.za1;
import qg.u2;
public final class u0 implements Runnable {
    public final int f39055a;
    public final Object f39056b;

    public u0(Object obj, int i10) {
        this.f39055a = i10;
        this.f39056b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f39055a) {
            case 0:
                nf.f.s(((v0) this.f39056b).f39061b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                g1 g1Var = (g1) this.f39056b;
                Utilities.searchQueue.postRunnable(new dn0(g1Var, new ArrayList(g1Var.h.f38915f), g1Var.h.f38917r, 22));
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) this.f39056b);
                return;
            case 3:
                ((org.telegram.ui.Cells.o1) this.f39056b).invalidateSelf();
                return;
            case 4:
                a2 a2Var = (a2) this.f39056b;
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
                    j3 += a2.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += a2.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = a2.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new po(a2Var, j3, j10, 1));
                return;
            case 5:
                ((boolean[]) this.f39056b)[0] = true;
                return;
            case 6:
                ((p4.e) this.f39056b).k();
                return;
            case 7:
                ((p4.g) this.f39056b).f40837n = -1;
                return;
            case 8:
                ((zk0) this.f39056b).b();
                return;
            case 9:
                n2.e eVar = ((pg.r0) this.f39056b).f41201b.f41220a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            case 10:
                pg.s0 s0Var = ((pg.r0) this.f39056b).f41201b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f41223f.getCurrentColor();
                s0Var.l(s0Var.f41221b, false, false);
                a5.a d = s0Var.d(s0Var.f41221b, currentColor, new RectF(s0Var.h));
                s0Var.b();
                pg.h1 h1Var = s0Var.d;
                RectF rectF = new RectF();
                s0Var.h = rectF;
                h1Var.a(rectF);
                s0Var.p(s0Var.e(h1Var, currentColor, new RectF(s0Var.h)), false);
                s0Var.p(d, false);
                s0Var.e(h1Var, currentColor, null);
                s0Var.d = null;
                s0Var.J = 0.0f;
                s0Var.L = null;
                return;
            case 11:
                ((pg.c1) ((p8.b) this.f39056b).f40992b).f41082y.f41107a.a();
                return;
            case 12:
                pg.u1 u1Var = ((pg.v1) this.f39056b).f41280a;
                if (u1Var != null) {
                    u1Var.e();
                    return;
                }
                return;
            case 13:
                ph.c cVar = (ph.c) this.f39056b;
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
            case 14:
                c6 c6Var = (c6) this.f39056b;
                c6Var.f41603x0 = true;
                c6Var.s();
                return;
            case 15:
                ((View) this.f39056b).performClick();
                return;
            case 16:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.k2) this.f39056b).f41706f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 17:
                AndroidUtilities.showKeyboard(((u2) this.f39056b).f41929q0);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((qh.c) this.f39056b).f42006a);
                return;
            case 19:
                qh.c cVar2 = (qh.c) ((org.telegram.ui.Cells.c6) this.f39056b).d;
                org.telegram.ui.Cells.u1 u1Var2 = cVar2.f42010n;
                if (u1Var2 != null && u1Var2.getDelegate() != null) {
                    cVar2.f42010n.getDelegate().D1(cVar2.f42010n, false);
                    return;
                }
                return;
            case 20:
                ((qh.q) this.f39056b).f42059c.Y2.N(true);
                return;
            case 21:
                ((qh.p) this.f39056b).a();
                return;
            case 22:
                r2.f fVar = (r2.f) this.f39056b;
                synchronized (fVar.f42197a) {
                    try {
                        if (!fVar.f42206m) {
                            long j11 = fVar.f42205l - 1;
                            fVar.f42205l = j11;
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
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f39056b;
                ((s5.h) ((t5.c) tVar.e)).f(new r5.d(tVar, 2));
                return;
            case 24:
                ((cf.c) this.f39056b).z();
                return;
            case 25:
                rg.j0 j0Var = ((rg.c0) this.f39056b).f42520c;
                j0Var.f22943n.presentFragment(za1.d0(j0Var.s1(), true));
                return;
            case 26:
                lj0 lj0Var = ((rg.p0) this.f39056b).f42684y;
                lj0Var.getAnimatedDrawable().N(0, true, false);
                lj0Var.d();
                return;
            case 27:
                ((rg.v0) this.f39056b).f42775b.y();
                return;
            case 28:
                rg.o1 o1Var = (rg.o1) this.f39056b;
                int size = 1073741823 - (1073741823 % o1Var.X2.size());
                s4.c0 c0Var = o1Var.Y2;
                o1Var.f42669l3 = size;
                c0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.x1(null, false);
                return;
            default:
                ((rg.q1) this.f39056b).invalidate();
                return;
        }
    }
}
