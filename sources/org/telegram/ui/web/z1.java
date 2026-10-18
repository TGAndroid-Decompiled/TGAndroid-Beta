package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.Choreographer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.z5;
import ei.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Wallet.r6;
import org.telegram.ui.Wallet.s6;
import org.telegram.ui.r91;
import rg.v2;
public final class z1 implements Runnable {
    public final int f42847a;
    public final Object f42848b;

    public z1(Object obj, int i10) {
        this.f42847a = i10;
        this.f42848b = obj;
    }

    @Override
    public final void run() {
        switch (this.f42847a) {
            case 0:
                ((boolean[]) this.f42848b)[0] = true;
                return;
            case 1:
                ((p4.e) this.f42848b).k();
                return;
            case 2:
                ((p4.g) this.f42848b).f44167n = -1;
                return;
            case 3:
                ((ll0) this.f42848b).b();
                return;
            case 4:
                le.b bVar = ((qg.r0) this.f42848b).f44648b.f44665a;
                if (bVar != null) {
                    bVar.a0();
                    return;
                }
                return;
            case 5:
                qg.s0 s0Var = ((qg.r0) this.f42848b).f44648b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f44668f.getCurrentColor();
                s0Var.l(s0Var.f44666b, false, false);
                a5.a d = s0Var.d(s0Var.f44666b, currentColor, new RectF(s0Var.h));
                s0Var.b();
                qg.h1 h1Var = s0Var.d;
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
            case 6:
                ((qg.c1) ((p4.s0) this.f42848b).f44234b).f44528y.f44555a.a();
                return;
            case 7:
                qg.u1 u1Var = ((qg.v1) this.f42848b).f44726a;
                if (u1Var != null) {
                    u1Var.e();
                    return;
                }
                return;
            case 8:
                qh.c cVar = (qh.c) this.f42848b;
                qh.b bVar2 = cVar.f44767c;
                if (bVar2 == qh.b.f44763b) {
                    cVar.a(qh.b.f44762a, true);
                    return;
                } else if (bVar2 == qh.b.f44764c) {
                    cVar.a(qh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 9:
                qi.c cVar2 = (qi.c) this.f42848b;
                AndroidUtilities.runOnUIThread(new qi.b(cVar2.f44792a, cVar2.f44793b, 1), 500L);
                return;
            case 10:
                r2.f fVar = (r2.f) this.f42848b;
                synchronized (fVar.f44958a) {
                    try {
                        if (!fVar.f44967m) {
                            long j10 = fVar.f44966l - 1;
                            fVar.f44966l = j10;
                            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
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
            case 11:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f42848b;
                ((s5.g) ((t5.c) rVar.e)).f(new qg.g0(rVar, 5));
                return;
            case 12:
                r5 r5Var = (r5) this.f42848b;
                r5Var.f45378x0 = true;
                r5Var.s();
                return;
            case 13:
                ((View) this.f42848b).performClick();
                return;
            case 14:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.k2) this.f42848b).f45481f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 15:
                AndroidUtilities.showKeyboard(((v2) this.f42848b).f45707q0);
                return;
            case 16:
                AndroidUtilities.showKeyboard(((rh.c) this.f42848b).f45780a);
                return;
            case 17:
                rh.c cVar3 = (rh.c) ((b6) this.f42848b).d;
                org.telegram.ui.Cells.u1 u1Var2 = cVar3.f45784n;
                if (u1Var2 != null && u1Var2.getDelegate() != null) {
                    cVar3.f45784n.getDelegate().x1(cVar3.f45784n, false);
                    return;
                }
                return;
            case 18:
                ((rh.q) this.f42848b).f45833c.W2.N(true);
                return;
            case 19:
                ((rh.p) this.f42848b).a();
                return;
            case 20:
                RecyclerView recyclerView = (RecyclerView) this.f42848b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 21:
                sg.j0 j0Var = ((sg.c0) this.f42848b).f46252c;
                j0Var.f24922n.presentFragment(r91.d0(j0Var.t1(), true));
                return;
            case 22:
                xj0 xj0Var = ((sg.p0) this.f42848b).f46406y;
                xj0Var.getAnimatedDrawable().N(0, true, false);
                xj0Var.d();
                return;
            case 23:
                ((sg.v0) this.f42848b).f46489b.A();
                return;
            case 24:
                sg.p1 p1Var = (sg.p1) this.f42848b;
                int size = 1073741823 - (1073741823 % p1Var.V2.size());
                s4.b0 b0Var = p1Var.W2;
                p1Var.f46416j3 = size;
                b0Var.h1(size, (p1Var.getMeasuredHeight() - p1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                p1Var.x1(null, false);
                return;
            case 25:
                ((sg.r1) this.f42848b).invalidate();
                return;
            case 26:
                ((sg.z1) this.f42848b).a();
                return;
            case 27:
                l60 l60Var = (l60) ((l2.f) this.f42848b).f15844b;
                l60Var.f28103p0 = true;
                FileLog.d("RoundVideo camera flip first frame: elapsedMs=" + l60.k(l60Var));
                l60Var.t(true);
                l60.l(l60Var);
                return;
            case 28:
                ((z5) this.f42848b).A();
                return;
            default:
                tg.f fVar2 = ((tg.d) this.f42848b).d;
                fVar2.f47108s = false;
                fVar2.v = null;
                Choreographer.getInstance().removeFrameCallback(fVar2);
                fVar2.F = 0L;
                r6 r6Var = (r6) fVar2;
                s6 s6Var = r6Var.L;
                if (s6Var.d == r6Var) {
                    s6.c(s6Var);
                    return;
                }
                return;
        }
    }
}
