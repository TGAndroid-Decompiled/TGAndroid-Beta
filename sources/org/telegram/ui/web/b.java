package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.c6;
import java.io.File;
import java.util.ArrayList;
import ji.k5;
import ji.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.zt;
import org.telegram.ui.bb1;
import org.telegram.ui.so;
import rg.x2;
public final class b implements Runnable {
    public final int f42032a;
    public final Object f42033b;

    public b(Object obj, int i10) {
        this.f42032a = i10;
        this.f42033b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f42032a) {
            case 0:
                ((l) this.f42033b).f42194w.Y2.N(true);
                return;
            case 1:
                j jVar = ((p) this.f42033b).h.f42239e;
                if (jVar != null) {
                    jVar.d();
                    return;
                }
                return;
            case 2:
                ((zt) this.f42033b).requestFocus();
                return;
            case 3:
                of.f.s(((v0) this.f42033b).f42288b.f42301e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 4:
                h1 h1Var = (h1) this.f42033b;
                Utilities.searchQueue.postRunnable(new er0(h1Var, new ArrayList(h1Var.h.f42150e), h1Var.h.f42152n));
                return;
            case 5:
                HttpGetFileTask.a((HttpGetFileTask) this.f42033b);
                return;
            case 6:
                ((org.telegram.ui.Cells.n1) this.f42033b).invalidateSelf();
                return;
            case 7:
                a2 a2Var = (a2) this.f42033b;
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
                AndroidUtilities.runOnUIThread(new so(a2Var, j3, j10, 1));
                return;
            case 8:
                ((boolean[]) this.f42033b)[0] = true;
                return;
            case 9:
                ((p4.e) this.f42033b).k();
                return;
            case 10:
                ((p4.g) this.f42033b).f43866n = -1;
                return;
            case 11:
                ((ok0) this.f42033b).b();
                return;
            case 12:
                u4 u4Var = ((qg.p0) this.f42033b).f44531b.f44547a;
                if (u4Var != null) {
                    u4Var.n();
                    return;
                }
                return;
            case 13:
                qg.q0 q0Var = ((qg.p0) this.f42033b).f44531b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f44551f.getCurrentColor();
                q0Var.l(q0Var.f44548b, false, false);
                a5.a d = q0Var.d(q0Var.f44548b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                qg.f1 f1Var = q0Var.d;
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
            case 14:
                ((qg.a1) ((l7) this.f42033b).f22283b).f44407y.f44416a.a();
                return;
            case 15:
                qg.s1 s1Var = ((qg.t1) this.f42033b).f44618a;
                if (s1Var != null) {
                    s1Var.f();
                    return;
                }
                return;
            case 16:
                qh.c cVar = (qh.c) this.f42033b;
                qh.b bVar = cVar.f44671c;
                if (bVar == qh.b.f44666b) {
                    cVar.a(qh.b.f44665a, true);
                    return;
                } else if (bVar == qh.b.f44667c) {
                    cVar.a(qh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 17:
                r2.f fVar = (r2.f) this.f42033b;
                synchronized (fVar.f44838a) {
                    try {
                        if (!fVar.f44848m) {
                            long j11 = fVar.f44847l - 1;
                            fVar.f44847l = j11;
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
            case 18:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f42033b;
                ((s5.g) ((t5.c) sVar.f6420e)).f(new k5(sVar, 22));
                return;
            case 19:
                c6 c6Var = (c6) this.f42033b;
                c6Var.f45225x0 = true;
                c6Var.s();
                return;
            case 20:
                ((View) this.f42033b).performClick();
                return;
            case 21:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.m2) this.f42033b).f45334f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 22:
                AndroidUtilities.showKeyboard(((x2) this.f42033b).f45571q0);
                return;
            case 23:
                AndroidUtilities.showKeyboard(((rh.c) this.f42033b).f45632a);
                return;
            case 24:
                rh.c cVar2 = (rh.c) ((b6) this.f42033b).d;
                org.telegram.ui.Cells.t1 t1Var = cVar2.f45637n;
                if (t1Var != null && t1Var.getDelegate() != null) {
                    cVar2.f45637n.getDelegate().w1(cVar2.f45637n, false);
                    return;
                }
                return;
            case 25:
                ((rh.q) this.f42033b).f45689c.Y2.N(true);
                return;
            case 26:
                ((rh.p) this.f42033b).a();
                return;
            case 27:
                RecyclerView recyclerView = (RecyclerView) this.f42033b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 28:
                ((cf.c) this.f42033b).v();
                return;
            default:
                sg.k0 k0Var = ((sg.d0) this.f42033b).f46092c;
                k0Var.f24677n.presentFragment(bb1.d0(k0Var.s1(), true));
                return;
        }
    }
}
