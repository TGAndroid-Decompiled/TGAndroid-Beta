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
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.ab1;
import org.telegram.ui.po;
import qg.v2;
public final class t0 implements Runnable {
    public final int f43685a;
    public final Object f43686b;

    public t0(Object obj, int i10) {
        this.f43685a = i10;
        this.f43686b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f43685a) {
            case 0:
                of.f.s(((u0) this.f43686b).f43697b.f43742e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                f1 f1Var = (f1) this.f43686b;
                Utilities.searchQueue.postRunnable(new bf0(f1Var, new ArrayList(f1Var.h.f43528e), f1Var.h.f43530n, 25));
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) this.f43686b);
                return;
            case 3:
                ((org.telegram.ui.Cells.o1) this.f43686b).invalidateSelf();
                return;
            case 4:
                y1 y1Var = (y1) this.f43686b;
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
                AndroidUtilities.runOnUIThread(new po(y1Var, j3, j10, 1));
                return;
            case 5:
                ((boolean[]) this.f43686b)[0] = true;
                return;
            case 6:
                ((p4.e) this.f43686b).k();
                return;
            case 7:
                ((p4.g) this.f43686b).f45428n = -1;
                return;
            case 8:
                ((ul0) this.f43686b).b();
                return;
            case 9:
                f3 f3Var = ((pg.r0) this.f43686b).f45802b.f45823a;
                if (f3Var != null) {
                    f3Var.g();
                    return;
                }
                return;
            case 10:
                pg.s0 s0Var = ((pg.r0) this.f43686b).f45802b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f45827f.getCurrentColor();
                s0Var.l(s0Var.f45824b, false, false);
                a5.a d = s0Var.d(s0Var.f45824b, currentColor, new RectF(s0Var.h));
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
                ((pg.c1) ((p5) this.f43686b).f35452b).f45676y.f45701a.a();
                return;
            case 12:
                pg.u1 u1Var = ((pg.v1) this.f43686b).f45889a;
                if (u1Var != null) {
                    u1Var.e();
                    return;
                }
                return;
            case 13:
                ph.c cVar = (ph.c) this.f43686b;
                ph.b bVar = cVar.f45933c;
                if (bVar == ph.b.f45928b) {
                    cVar.a(ph.b.f45927a, true);
                    return;
                } else if (bVar == ph.b.f45929c) {
                    cVar.a(ph.b.d, true);
                    return;
                } else {
                    return;
                }
            case 14:
                pi.d dVar = (pi.d) this.f43686b;
                AndroidUtilities.runOnUIThread(new pi.c(dVar.f45966a, dVar.f45967b, 1), 500L);
                return;
            case 15:
                b6 b6Var = (b6) this.f43686b;
                b6Var.f46348x0 = true;
                b6Var.s();
                return;
            case 16:
                ((View) this.f43686b).performClick();
                return;
            case 17:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.l2) this.f43686b).f46472f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((v2) this.f43686b).f46697q0);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((qh.c) this.f43686b).f46772a);
                return;
            case 20:
                qh.c cVar2 = (qh.c) ((c6) this.f43686b).d;
                org.telegram.ui.Cells.u1 u1Var2 = cVar2.f46777n;
                if (u1Var2 != null && u1Var2.getDelegate() != null) {
                    cVar2.f46777n.getDelegate().K1(cVar2.f46777n, false);
                    return;
                }
                return;
            case 21:
                ((qh.q) this.f43686b).f46829c.W2.N(true);
                return;
            case 22:
                ((qh.p) this.f43686b).a();
                return;
            case 23:
                r2.f fVar = (r2.f) this.f43686b;
                synchronized (fVar.f46997a) {
                    try {
                        if (!fVar.f47007m) {
                            long j11 = fVar.f47006l - 1;
                            fVar.f47006l = j11;
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
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f43686b;
                ((s5.g) ((t5.c) sVar.f7972e)).f(new r5.d(sVar, 2));
                return;
            case 25:
                rg.j0 j0Var = ((rg.c0) this.f43686b).f47337c;
                j0Var.f25736n.presentFragment(ab1.d0(j0Var.t1(), true));
                return;
            case 26:
                gk0 gk0Var = ((rg.p0) this.f43686b).f47513y;
                gk0Var.getAnimatedDrawable().N(0, true, false);
                gk0Var.d();
                return;
            case 27:
                ((rg.w0) this.f43686b).f47626b.B();
                return;
            case 28:
                rg.p1 p1Var = (rg.p1) this.f43686b;
                int size = 1073741823 - (1073741823 % p1Var.V2.size());
                s4.d0 d0Var = p1Var.W2;
                p1Var.j3 = size;
                d0Var.h1(size, (p1Var.getMeasuredHeight() - p1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                p1Var.x1(null, false);
                return;
            default:
                ((rg.r1) this.f43686b).invalidate();
                return;
        }
    }
}
