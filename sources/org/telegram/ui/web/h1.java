package org.telegram.ui.web;

import a8.ng;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.q5;
import java.io.File;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.af1;
import org.telegram.ui.io;
import org.telegram.ui.un;
import org.telegram.ui.w91;
import sg.n2;
import sg.x2;
public final class h1 implements Runnable {
    public final int f45257a;
    public final Object f45258b;

    public h1(Object obj, int i10) {
        this.f45257a = i10;
        this.f45258b = obj;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f45257a) {
            case 0:
                HttpGetFileTask.a((HttpGetFileTask) this.f45258b);
                return;
            case 1:
                ((org.telegram.ui.Cells.m1) this.f45258b).invalidateSelf();
                return;
            case 2:
                y1 y1Var = (y1) this.f45258b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long j11 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j10 = databasePath.length();
                } else {
                    j10 = 0;
                }
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j10 += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j10 += y1.a0(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += y1.a0(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = y1.a0(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new io(y1Var, j10, j11, 1));
                return;
            case 3:
                ((boolean[]) this.f45258b)[0] = true;
                return;
            case 4:
                ((p4.e) this.f45258b).k();
                return;
            case 5:
                ((p4.g) this.f45258b).f46690n = -1;
                return;
            case 6:
                ((pl0) this.f45258b).b();
                return;
            case 7:
                af1 af1Var = (af1) this.f45258b;
                if (af1Var.getParentLayout() != null) {
                    af1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", af1Var.f37734a);
                    un unVar = new un(bundle);
                    unVar.va = true;
                    af1Var.presentFragment(unVar);
                    return;
                }
                return;
            case 8:
                r2.f fVar = (r2.f) this.f45258b;
                synchronized (fVar.f47203a) {
                    try {
                        if (!fVar.f47212m) {
                            long j12 = fVar.f47211l - 1;
                            fVar.f47211l = j12;
                            int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
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
            case 9:
                e3 e3Var = ((rg.p0) this.f45258b).f47489b.f47503a;
                if (e3Var != null) {
                    e3Var.v0();
                    return;
                }
                return;
            case 10:
                rg.q0 q0Var = ((rg.p0) this.f45258b).f47489b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f47506f.getCurrentColor();
                q0Var.l(q0Var.f47504b, false, false);
                ng d = q0Var.d(q0Var.f47504b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                rg.f1 f1Var = q0Var.d;
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
                ((rg.a1) ((cy0) this.f45258b).f27284b).f47368y.f47375a.a();
                return;
            case 12:
                rg.s1 s1Var = ((rg.t1) this.f45258b).f47562a;
                if (s1Var != null) {
                    s1Var.a();
                    return;
                }
                return;
            case 13:
                rh.c cVar = (rh.c) this.f45258b;
                rh.b bVar = cVar.f47613c;
                if (bVar == rh.b.f47609b) {
                    cVar.a(rh.b.f47608a, true);
                    return;
                } else if (bVar == rh.b.f47610c) {
                    cVar.a(rh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 14:
                RecyclerView recyclerView = (RecyclerView) this.f45258b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.f45258b;
                ((t5.g) ((u5.c) qVar.d)).f(new org.telegram.ui.Components.voip.j1(qVar, 9));
                return;
            case 16:
                q5 q5Var = (q5) this.f45258b;
                q5Var.f48219x0 = true;
                q5Var.s();
                return;
            case 17:
                ((View) this.f45258b).performClick();
                return;
            case 18:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((n2) this.f45258b).f48376f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((x2) this.f45258b).f48563q0);
                return;
            case 20:
                AndroidUtilities.showKeyboard(((sh.c) this.f45258b).f48618a);
                return;
            case 21:
                sh.c cVar2 = (sh.c) ((g6) this.f45258b).d;
                org.telegram.ui.Cells.s1 s1Var2 = cVar2.f48622n;
                if (s1Var2 != null && s1Var2.getDelegate() != null) {
                    cVar2.f48622n.getDelegate().n1(cVar2.f48622n, false);
                    return;
                }
                return;
            case 22:
                ((sh.q) this.f45258b).f48671c.f32152g3.O(true);
                return;
            case 23:
                ((sh.p) this.f45258b).a();
                return;
            case 24:
                tg.j0 j0Var = ((tg.c0) this.f45258b).f48829c;
                j0Var.f26811n.presentFragment(w91.c0(j0Var.w1(), true));
                return;
            case 25:
                ak0 ak0Var = ((tg.p0) this.f45258b).F;
                ak0Var.getAnimatedDrawable().N(0, true, false);
                ak0Var.d();
                return;
            case 26:
                ((tg.w0) this.f45258b).f49089b.B();
                return;
            case 27:
                tg.q1 q1Var = (tg.q1) this.f45258b;
                int size = 1073741823 - (1073741823 % q1Var.f49000f3.size());
                s4.c0 c0Var = q1Var.f49001g3;
                q1Var.f49014t3 = size;
                c0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.C1(null, false);
                return;
            case 28:
                ((tg.s1) this.f45258b).invalidate();
                return;
            default:
                ((tg.a2) this.f45258b).a();
                return;
        }
    }
}
