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
import org.telegram.ui.Wallet.l6;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.r91;
import rg.u2;
public final class a2 implements Runnable {
    public final int f42510a;
    public final Object f42511b;

    public a2(Object obj, int i10) {
        this.f42510a = i10;
        this.f42511b = obj;
    }

    @Override
    public final void run() {
        switch (this.f42510a) {
            case 0:
                ((boolean[]) this.f42511b)[0] = true;
                return;
            case 1:
                ((p4.e) this.f42511b).k();
                return;
            case 2:
                ((p4.g) this.f42511b).f44124n = -1;
                return;
            case 3:
                ((ll0) this.f42511b).b();
                return;
            case 4:
                le.b bVar = ((qg.r0) this.f42511b).f44604b.f44623a;
                if (bVar != null) {
                    bVar.a0();
                    return;
                }
                return;
            case 5:
                qg.s0 s0Var = ((qg.r0) this.f42511b).f44604b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f44626f.getCurrentColor();
                s0Var.l(s0Var.f44624b, false, false);
                a5.a d = s0Var.d(s0Var.f44624b, currentColor, new RectF(s0Var.h));
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
                ((qg.c1) ((p8.b) this.f42511b).f44279b).f44487y.f44511a.a();
                return;
            case 7:
                qg.u1 u1Var = ((qg.v1) this.f42511b).f44683a;
                if (u1Var != null) {
                    u1Var.e();
                    return;
                }
                return;
            case 8:
                qh.c cVar = (qh.c) this.f42511b;
                qh.b bVar2 = cVar.f44722c;
                if (bVar2 == qh.b.f44718b) {
                    cVar.a(qh.b.f44717a, true);
                    return;
                } else if (bVar2 == qh.b.f44719c) {
                    cVar.a(qh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 9:
                qi.c cVar2 = (qi.c) this.f42511b;
                AndroidUtilities.runOnUIThread(new qi.b(cVar2.f44747a, cVar2.f44748b, 1), 500L);
                return;
            case 10:
                r2.f fVar = (r2.f) this.f42511b;
                synchronized (fVar.f44912a) {
                    try {
                        if (!fVar.f44921m) {
                            long j10 = fVar.f44920l - 1;
                            fVar.f44920l = j10;
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
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f42511b;
                ((s5.g) ((t5.c) rVar.e)).f(new qg.g0(rVar, 5));
                return;
            case 12:
                r5 r5Var = (r5) this.f42511b;
                r5Var.f45332x0 = true;
                r5Var.s();
                return;
            case 13:
                ((View) this.f42511b).performClick();
                return;
            case 14:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.k2) this.f42511b).f45435f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 15:
                AndroidUtilities.showKeyboard(((u2) this.f42511b).f45658q0);
                return;
            case 16:
                AndroidUtilities.showKeyboard(((rh.c) this.f42511b).f45732a);
                return;
            case 17:
                rh.c cVar3 = (rh.c) ((b6) this.f42511b).d;
                org.telegram.ui.Cells.u1 u1Var2 = cVar3.f45736n;
                if (u1Var2 != null && u1Var2.getDelegate() != null) {
                    cVar3.f45736n.getDelegate().x1(cVar3.f45736n, false);
                    return;
                }
                return;
            case 18:
                ((rh.q) this.f42511b).f45785c.W2.N(true);
                return;
            case 19:
                ((rh.p) this.f42511b).a();
                return;
            case 20:
                RecyclerView recyclerView = (RecyclerView) this.f42511b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 21:
                sg.k0 k0Var = ((sg.d0) this.f42511b).f46233c;
                k0Var.f24915n.presentFragment(r91.d0(k0Var.t1(), true));
                return;
            case 22:
                xj0 xj0Var = ((sg.q0) this.f42511b).f46385y;
                xj0Var.getAnimatedDrawable().N(0, true, false);
                xj0Var.d();
                return;
            case 23:
                ((sg.w0) this.f42511b).f46467b.A();
                return;
            case 24:
                sg.q1 q1Var = (sg.q1) this.f42511b;
                int size = 1073741823 - (1073741823 % q1Var.V2.size());
                s4.b0 b0Var = q1Var.W2;
                q1Var.f46395j3 = size;
                b0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.x1(null, false);
                return;
            case 25:
                ((sg.s1) this.f42511b).invalidate();
                return;
            case 26:
                ((sg.a2) this.f42511b).a();
                return;
            case 27:
                l60 l60Var = (l60) ((l2.f) this.f42511b).f15842b;
                l60Var.f28096p0 = true;
                FileLog.d("RoundVideo camera flip first frame: elapsedMs=" + l60.k(l60Var));
                l60Var.t(true);
                l60.l(l60Var);
                return;
            case 28:
                ((z5) this.f42511b).A();
                return;
            default:
                tg.f fVar2 = ((tg.d) this.f42511b).d;
                fVar2.f47058s = false;
                fVar2.v = null;
                Choreographer.getInstance().removeFrameCallback(fVar2);
                fVar2.F = 0L;
                l6 l6Var = (l6) fVar2;
                m6 m6Var = l6Var.L;
                if (m6Var.d == l6Var) {
                    m6.c(m6Var);
                    return;
                }
                return;
        }
    }
}
