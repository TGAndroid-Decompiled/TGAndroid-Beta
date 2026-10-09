package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.View;
import ci.b6;
import java.io.File;
import java.util.ArrayList;
import m.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.bb1;
import org.telegram.ui.po;
import qg.w2;
public final class q0 implements Runnable {
    public final int f43438a;
    public final Object f43439b;

    public q0(Object obj, int i10) {
        this.f43438a = i10;
        this.f43439b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f43438a) {
            case 0:
                ((ru) this.f43439b).requestFocus();
                return;
            case 1:
                of.f.s(((u0) this.f43439b).f43473b.f43518e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 2:
                f1 f1Var = (f1) this.f43439b;
                Utilities.searchQueue.postRunnable(new og0(f1Var, new ArrayList(f1Var.h.f43304e), f1Var.h.f43306n));
                return;
            case 3:
                HttpGetFileTask.a((HttpGetFileTask) this.f43439b);
                return;
            case 4:
                ((org.telegram.ui.Cells.o1) this.f43439b).invalidateSelf();
                return;
            case 5:
                z1 z1Var = (z1) this.f43439b;
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
                AndroidUtilities.runOnUIThread(new po(z1Var, j3, j10, 1));
                return;
            case 6:
                ((boolean[]) this.f43439b)[0] = true;
                return;
            case 7:
                ((p4.e) this.f43439b).k();
                return;
            case 8:
                ((p4.g) this.f43439b).f45358n = -1;
                return;
            case 9:
                ((tl0) this.f43439b).b();
                return;
            case 10:
                f3 f3Var = ((pg.r0) this.f43439b).f45732b.f45753a;
                if (f3Var != null) {
                    f3Var.g();
                    return;
                }
                return;
            case 11:
                pg.s0 s0Var = ((pg.r0) this.f43439b).f45732b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f45757f.getCurrentColor();
                s0Var.l(s0Var.f45754b, false, false);
                a5.a d = s0Var.d(s0Var.f45754b, currentColor, new RectF(s0Var.h));
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
            case 12:
                ((pg.c1) ((m5) this.f43439b).f35229b).f45606y.f45631a.a();
                return;
            case 13:
                pg.u1 u1Var = ((pg.v1) this.f43439b).f45819a;
                if (u1Var != null) {
                    u1Var.e();
                    return;
                }
                return;
            case 14:
                ph.c cVar = (ph.c) this.f43439b;
                ph.b bVar = cVar.f45863c;
                if (bVar == ph.b.f45858b) {
                    cVar.a(ph.b.f45857a, true);
                    return;
                } else if (bVar == ph.b.f45859c) {
                    cVar.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 15:
                b6 b6Var = (b6) this.f43439b;
                b6Var.f46234x0 = true;
                b6Var.s();
                return;
            case 16:
                ((View) this.f43439b).performClick();
                return;
            case 17:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.m2) this.f43439b).f46400f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((w2) this.f43439b).f46607q0);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((qh.c) this.f43439b).f46661a);
                return;
            case 20:
                qh.c cVar2 = (qh.c) ((c6) this.f43439b).d;
                org.telegram.ui.Cells.u1 u1Var2 = cVar2.f46666n;
                if (u1Var2 != null && u1Var2.getDelegate() != null) {
                    cVar2.f46666n.getDelegate().K1(cVar2.f46666n, false);
                    return;
                }
                return;
            case 21:
                ((qh.q) this.f43439b).f46718c.W2.N(true);
                return;
            case 22:
                ((qh.p) this.f43439b).a();
                return;
            case 23:
                r2.f fVar = (r2.f) this.f43439b;
                synchronized (fVar.f46871a) {
                    try {
                        if (!fVar.f46881m) {
                            long j11 = fVar.f46880l - 1;
                            fVar.f46880l = j11;
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
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f43439b;
                ((s5.g) ((t5.c) sVar.f7973e)).f(new r5.d(sVar, 2));
                return;
            case 25:
                rg.j0 j0Var = ((rg.c0) this.f43439b).f47211c;
                j0Var.f26025n.presentFragment(bb1.d0(j0Var.t1(), true));
                return;
            case 26:
                fk0 fk0Var = ((rg.p0) this.f43439b).f47387y;
                fk0Var.getAnimatedDrawable().N(0, true, false);
                fk0Var.d();
                return;
            case 27:
                ((rg.w0) this.f43439b).f47500b.B();
                return;
            case 28:
                rg.p1 p1Var = (rg.p1) this.f43439b;
                int size = 1073741823 - (1073741823 % p1Var.V2.size());
                s4.d0 d0Var = p1Var.W2;
                p1Var.j3 = size;
                d0Var.h1(size, (p1Var.getMeasuredHeight() - p1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                p1Var.x1(null, false);
                return;
            default:
                ((rg.r1) this.f43439b).invalidate();
                return;
        }
    }
}
