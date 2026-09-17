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
    public final int f42005a;
    public final Object f42006b;

    public b(Object obj, int i10) {
        this.f42005a = i10;
        this.f42006b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f42005a) {
            case 0:
                ((l) this.f42006b).f42167w.Y2.N(true);
                return;
            case 1:
                j jVar = ((p) this.f42006b).h.f42212e;
                if (jVar != null) {
                    jVar.d();
                    return;
                }
                return;
            case 2:
                ((zt) this.f42006b).requestFocus();
                return;
            case 3:
                of.f.s(((v0) this.f42006b).f42261b.f42274e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 4:
                h1 h1Var = (h1) this.f42006b;
                Utilities.searchQueue.postRunnable(new er0(h1Var, new ArrayList(h1Var.h.f42123e), h1Var.h.f42125n));
                return;
            case 5:
                HttpGetFileTask.a((HttpGetFileTask) this.f42006b);
                return;
            case 6:
                ((org.telegram.ui.Cells.n1) this.f42006b).invalidateSelf();
                return;
            case 7:
                a2 a2Var = (a2) this.f42006b;
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
                ((boolean[]) this.f42006b)[0] = true;
                return;
            case 9:
                ((p4.e) this.f42006b).k();
                return;
            case 10:
                ((p4.g) this.f42006b).f43839n = -1;
                return;
            case 11:
                ((ok0) this.f42006b).b();
                return;
            case 12:
                u4 u4Var = ((qg.p0) this.f42006b).f44503b.f44519a;
                if (u4Var != null) {
                    u4Var.n();
                    return;
                }
                return;
            case 13:
                qg.q0 q0Var = ((qg.p0) this.f42006b).f44503b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f44523f.getCurrentColor();
                q0Var.l(q0Var.f44520b, false, false);
                a5.a d = q0Var.d(q0Var.f44520b, currentColor, new RectF(q0Var.h));
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
                ((qg.a1) ((l7) this.f42006b).f22256b).f44379y.f44388a.a();
                return;
            case 15:
                qg.s1 s1Var = ((qg.t1) this.f42006b).f44590a;
                if (s1Var != null) {
                    s1Var.f();
                    return;
                }
                return;
            case 16:
                qh.c cVar = (qh.c) this.f42006b;
                qh.b bVar = cVar.f44643c;
                if (bVar == qh.b.f44638b) {
                    cVar.a(qh.b.f44637a, true);
                    return;
                } else if (bVar == qh.b.f44639c) {
                    cVar.a(qh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 17:
                r2.f fVar = (r2.f) this.f42006b;
                synchronized (fVar.f44810a) {
                    try {
                        if (!fVar.f44820m) {
                            long j11 = fVar.f44819l - 1;
                            fVar.f44819l = j11;
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
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f42006b;
                ((s5.g) ((t5.c) sVar.f6393e)).f(new k5(sVar, 22));
                return;
            case 19:
                c6 c6Var = (c6) this.f42006b;
                c6Var.f45197x0 = true;
                c6Var.s();
                return;
            case 20:
                ((View) this.f42006b).performClick();
                return;
            case 21:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.m2) this.f42006b).f45306f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 22:
                AndroidUtilities.showKeyboard(((x2) this.f42006b).f45543q0);
                return;
            case 23:
                AndroidUtilities.showKeyboard(((rh.c) this.f42006b).f45604a);
                return;
            case 24:
                rh.c cVar2 = (rh.c) ((b6) this.f42006b).d;
                org.telegram.ui.Cells.t1 t1Var = cVar2.f45609n;
                if (t1Var != null && t1Var.getDelegate() != null) {
                    cVar2.f45609n.getDelegate().w1(cVar2.f45609n, false);
                    return;
                }
                return;
            case 25:
                ((rh.q) this.f42006b).f45661c.Y2.N(true);
                return;
            case 26:
                ((rh.p) this.f42006b).a();
                return;
            case 27:
                RecyclerView recyclerView = (RecyclerView) this.f42006b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 28:
                ((cf.c) this.f42006b).v();
                return;
            default:
                sg.k0 k0Var = ((sg.d0) this.f42006b).f46064c;
                k0Var.f24650n.presentFragment(bb1.d0(k0Var.s1(), true));
                return;
        }
    }
}
