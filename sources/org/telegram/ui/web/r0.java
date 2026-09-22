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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.bb1;
import org.telegram.ui.po;
import qg.v2;
public final class r0 implements Runnable {
    public final int f39053a;
    public final Object f39054b;

    public r0(Object obj, int i10) {
        this.f39053a = i10;
        this.f39054b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f39053a) {
            case 0:
                ((bu) this.f39054b).requestFocus();
                return;
            case 1:
                nf.f.s(((v0) this.f39054b).f39082b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 2:
                h1 h1Var = (h1) this.f39054b;
                Utilities.searchQueue.postRunnable(new en0(h1Var, new ArrayList(h1Var.h.f38955f), h1Var.h.f38957r, 22));
                return;
            case 3:
                HttpGetFileTask.a((HttpGetFileTask) this.f39054b);
                return;
            case 4:
                ((org.telegram.ui.Cells.o1) this.f39054b).invalidateSelf();
                return;
            case 5:
                a2 a2Var = (a2) this.f39054b;
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
                ((boolean[]) this.f39054b)[0] = true;
                return;
            case 7:
                ((p4.e) this.f39054b).k();
                return;
            case 8:
                ((p4.g) this.f39054b).f40899n = -1;
                return;
            case 9:
                ((bl0) this.f39054b).b();
                return;
            case 10:
                l.d dVar = ((pg.r0) this.f39054b).f41261b.f41270a;
                if (dVar != null) {
                    dVar.V();
                    return;
                }
                return;
            case 11:
                pg.s0 s0Var = ((pg.r0) this.f39054b).f41261b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f41273f.getCurrentColor();
                s0Var.l(s0Var.f41271b, false, false);
                a5.a d = s0Var.d(s0Var.f41271b, currentColor, new RectF(s0Var.h));
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
                ((pg.d1) ((pg.c1) this.f39054b).f41135b).f41147y.f41172a.a();
                return;
            case 13:
                pg.v1 v1Var = ((pg.w1) this.f39054b).f41350a;
                if (v1Var != null) {
                    v1Var.e();
                    return;
                }
                return;
            case 14:
                ph.c cVar = (ph.c) this.f39054b;
                ph.b bVar = cVar.f41382c;
                if (bVar == ph.b.f41378b) {
                    cVar.a(ph.b.f41377a, true);
                    return;
                } else if (bVar == ph.b.f41379c) {
                    cVar.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 15:
                c6 c6Var = (c6) this.f39054b;
                c6Var.f41671x0 = true;
                c6Var.s();
                return;
            case 16:
                ((View) this.f39054b).performClick();
                return;
            case 17:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.l2) this.f39054b).f41774f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((v2) this.f39054b).f41998q0);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((qh.c) this.f39054b).f42072a);
                return;
            case 20:
                qh.c cVar2 = (qh.c) ((d6) this.f39054b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar2.f42076n;
                if (u1Var != null && u1Var.getDelegate() != null) {
                    cVar2.f42076n.getDelegate().E1(cVar2.f42076n, false);
                    return;
                }
                return;
            case 21:
                ((qh.q) this.f39054b).f42125c.Y2.N(true);
                return;
            case 22:
                ((qh.p) this.f39054b).a();
                return;
            case 23:
                r2.f fVar = (r2.f) this.f39054b;
                synchronized (fVar.f42262a) {
                    try {
                        if (!fVar.f42271m) {
                            long j11 = fVar.f42270l - 1;
                            fVar.f42270l = j11;
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
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f39054b;
                ((s5.h) ((t5.c) tVar.e)).f(new r5.d(tVar, 2));
                return;
            case 25:
                ((cf.c) this.f39054b).z();
                return;
            case 26:
                rg.j0 j0Var = ((rg.c0) this.f39054b).f42585c;
                j0Var.f22602n.presentFragment(bb1.d0(j0Var.s1(), true));
                return;
            case 27:
                nj0 nj0Var = ((rg.p0) this.f39054b).f42749y;
                nj0Var.getAnimatedDrawable().N(0, true, false);
                nj0Var.d();
                return;
            case 28:
                ((rg.v0) this.f39054b).f42820b.y();
                return;
            default:
                rg.o1 o1Var = (rg.o1) this.f39054b;
                int size = 1073741823 - (1073741823 % o1Var.X2.size());
                s4.c0 c0Var = o1Var.Y2;
                o1Var.f42734l3 = size;
                c0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.x1(null, false);
                return;
        }
    }
}
