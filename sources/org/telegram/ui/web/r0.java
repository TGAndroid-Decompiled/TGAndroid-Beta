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
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.bb1;
import org.telegram.ui.po;
import qg.v2;
public final class r0 implements Runnable {
    public final int f39032a;
    public final Object f39033b;

    public r0(Object obj, int i10) {
        this.f39032a = i10;
        this.f39033b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f39032a) {
            case 0:
                ((bu) this.f39033b).requestFocus();
                return;
            case 1:
                nf.f.s(((v0) this.f39033b).f39061b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 2:
                h1 h1Var = (h1) this.f39033b;
                Utilities.searchQueue.postRunnable(new cn0(h1Var, new ArrayList(h1Var.h.f38934f), h1Var.h.f38936r, 22));
                return;
            case 3:
                HttpGetFileTask.a((HttpGetFileTask) this.f39033b);
                return;
            case 4:
                ((org.telegram.ui.Cells.o1) this.f39033b).invalidateSelf();
                return;
            case 5:
                a2 a2Var = (a2) this.f39033b;
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
            case 6:
                ((boolean[]) this.f39033b)[0] = true;
                return;
            case 7:
                ((p4.e) this.f39033b).k();
                return;
            case 8:
                ((p4.g) this.f39033b).f40878n = -1;
                return;
            case 9:
                ((yk0) this.f39033b).b();
                return;
            case 10:
                n2.e eVar = ((pg.r0) this.f39033b).f41242b.f41261a;
                if (eVar != null) {
                    eVar.p();
                    return;
                }
                return;
            case 11:
                pg.s0 s0Var = ((pg.r0) this.f39033b).f41242b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f41264f.getCurrentColor();
                s0Var.l(s0Var.f41262b, false, false);
                a5.a d = s0Var.d(s0Var.f41262b, currentColor, new RectF(s0Var.h));
                s0Var.b();
                pg.h1 h1Var2 = s0Var.d;
                RectF rectF = new RectF();
                s0Var.h = rectF;
                h1Var2.a(rectF);
                s0Var.p(s0Var.e(h1Var2, currentColor, new RectF(s0Var.h)), false);
                s0Var.p(d, false);
                s0Var.e(h1Var2, currentColor, null);
                s0Var.d = null;
                s0Var.J = 0.0f;
                s0Var.L = null;
                return;
            case 12:
                ((pg.c1) ((p8.b) this.f39033b).f41033b).f41123y.f41148a.a();
                return;
            case 13:
                pg.u1 u1Var = ((pg.v1) this.f39033b).f41321a;
                if (u1Var != null) {
                    u1Var.e();
                    return;
                }
                return;
            case 14:
                ph.c cVar = (ph.c) this.f39033b;
                ph.b bVar = cVar.f41360c;
                if (bVar == ph.b.f41356b) {
                    cVar.a(ph.b.f41355a, true);
                    return;
                } else if (bVar == ph.b.f41357c) {
                    cVar.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 15:
                c6 c6Var = (c6) this.f39033b;
                c6Var.f41650x0 = true;
                c6Var.s();
                return;
            case 16:
                ((View) this.f39033b).performClick();
                return;
            case 17:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.l2) this.f39033b).f41753f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((v2) this.f39033b).f41977q0);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((qh.c) this.f39033b).f42051a);
                return;
            case 20:
                qh.c cVar2 = (qh.c) ((d6) this.f39033b).d;
                org.telegram.ui.Cells.u1 u1Var2 = cVar2.f42055n;
                if (u1Var2 != null && u1Var2.getDelegate() != null) {
                    cVar2.f42055n.getDelegate().E1(cVar2.f42055n, false);
                    return;
                }
                return;
            case 21:
                ((qh.q) this.f39033b).f42104c.Y2.N(true);
                return;
            case 22:
                ((qh.p) this.f39033b).a();
                return;
            case 23:
                r2.f fVar = (r2.f) this.f39033b;
                synchronized (fVar.f42241a) {
                    try {
                        if (!fVar.f42250m) {
                            long j11 = fVar.f42249l - 1;
                            fVar.f42249l = j11;
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
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f39033b;
                ((s5.h) ((t5.c) tVar.e)).f(new r5.d(tVar, 2));
                return;
            case 25:
                ((cf.c) this.f39033b).z();
                return;
            case 26:
                rg.j0 j0Var = ((rg.c0) this.f39033b).f42564c;
                j0Var.f22638n.presentFragment(bb1.d0(j0Var.s1(), true));
                return;
            case 27:
                kj0 kj0Var = ((rg.p0) this.f39033b).f42728y;
                kj0Var.getAnimatedDrawable().N(0, true, false);
                kj0Var.d();
                return;
            case 28:
                ((rg.v0) this.f39033b).f42799b.y();
                return;
            default:
                rg.o1 o1Var = (rg.o1) this.f39033b;
                int size = 1073741823 - (1073741823 % o1Var.X2.size());
                s4.c0 c0Var = o1Var.Y2;
                o1Var.f42713l3 = size;
                c0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.x1(null, false);
                return;
        }
    }
}
