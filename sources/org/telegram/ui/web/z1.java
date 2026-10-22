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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Wallet.l6;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.p91;
import rg.v2;
public final class z1 implements Runnable {
    public final int f42873a;
    public final Object f42874b;

    public z1(Object obj, int i10) {
        this.f42873a = i10;
        this.f42874b = obj;
    }

    @Override
    public final void run() {
        switch (this.f42873a) {
            case 0:
                ((boolean[]) this.f42874b)[0] = true;
                return;
            case 1:
                ((p4.e) this.f42874b).k();
                return;
            case 2:
                ((p4.g) this.f42874b).f44132n = -1;
                return;
            case 3:
                ((ml0) this.f42874b).b();
                return;
            case 4:
                ki.t1 t1Var = ((qg.s0) this.f42874b).f44619b.f44638a;
                if (t1Var != null) {
                    t1Var.s();
                    return;
                }
                return;
            case 5:
                qg.t0 t0Var = ((qg.s0) this.f42874b).f44619b;
                if (t0Var.d == null) {
                    t0Var.L = null;
                    return;
                }
                int currentColor = t0Var.f44641f.getCurrentColor();
                t0Var.l(t0Var.f44639b, false, false);
                a5.a d = t0Var.d(t0Var.f44639b, currentColor, new RectF(t0Var.h));
                t0Var.b();
                qg.i1 i1Var = t0Var.d;
                RectF rectF = new RectF();
                t0Var.h = rectF;
                i1Var.a(rectF);
                t0Var.p(t0Var.e(i1Var, currentColor, new RectF(t0Var.h)), false);
                t0Var.p(d, false);
                t0Var.e(i1Var, currentColor, null);
                t0Var.d = null;
                t0Var.J = 0.0f;
                t0Var.L = null;
                return;
            case 6:
                ((qg.d1) ((p8.b) this.f42874b).f44287b).f44499y.f44523a.a();
                return;
            case 7:
                qg.v1 v1Var = ((qg.w1) this.f42874b).f44698a;
                if (v1Var != null) {
                    v1Var.e();
                    return;
                }
                return;
            case 8:
                qh.c cVar = (qh.c) this.f42874b;
                qh.b bVar = cVar.f44733c;
                if (bVar == qh.b.f44729b) {
                    cVar.a(qh.b.f44728a, true);
                    return;
                } else if (bVar == qh.b.f44730c) {
                    cVar.a(qh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 9:
                qi.c cVar2 = (qi.c) this.f42874b;
                AndroidUtilities.runOnUIThread(new qi.b(cVar2.f44758a, cVar2.f44759b, 1), 500L);
                return;
            case 10:
                r2.f fVar = (r2.f) this.f42874b;
                synchronized (fVar.f44923a) {
                    try {
                        if (!fVar.f44932m) {
                            long j10 = fVar.f44931l - 1;
                            fVar.f44931l = j10;
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
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f42874b;
                ((s5.g) ((t5.c) rVar.e)).f(new qg.h0(rVar, 5));
                return;
            case 12:
                r5 r5Var = (r5) this.f42874b;
                r5Var.f45343x0 = true;
                r5Var.s();
                return;
            case 13:
                ((View) this.f42874b).performClick();
                return;
            case 14:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.l2) this.f42874b).f45459f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 15:
                AndroidUtilities.showKeyboard(((v2) this.f42874b).f45672q0);
                return;
            case 16:
                AndroidUtilities.showKeyboard(((rh.c) this.f42874b).f45745a);
                return;
            case 17:
                rh.c cVar3 = (rh.c) ((b6) this.f42874b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar3.f45749n;
                if (u1Var != null && u1Var.getDelegate() != null) {
                    cVar3.f45749n.getDelegate().x1(cVar3.f45749n, false);
                    return;
                }
                return;
            case 18:
                ((rh.q) this.f42874b).f45798c.W2.N(true);
                return;
            case 19:
                ((rh.p) this.f42874b).a();
                return;
            case 20:
                RecyclerView recyclerView = (RecyclerView) this.f42874b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 21:
                sg.k0 k0Var = ((sg.d0) this.f42874b).f46243c;
                k0Var.f24885n.presentFragment(p91.d0(k0Var.t1(), true));
                return;
            case 22:
                yj0 yj0Var = ((sg.q0) this.f42874b).f46395y;
                yj0Var.getAnimatedDrawable().N(0, true, false);
                yj0Var.d();
                return;
            case 23:
                ((sg.w0) this.f42874b).f46477b.A();
                return;
            case 24:
                sg.q1 q1Var = (sg.q1) this.f42874b;
                int size = 1073741823 - (1073741823 % q1Var.V2.size());
                s4.b0 b0Var = q1Var.W2;
                q1Var.f46405j3 = size;
                b0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.x1(null, false);
                return;
            case 25:
                ((sg.s1) this.f42874b).invalidate();
                return;
            case 26:
                ((sg.a2) this.f42874b).a();
                return;
            case 27:
                l60 l60Var = (l60) ((l2.f) this.f42874b).f15843b;
                l60Var.f28049p0 = true;
                FileLog.d("RoundVideo camera flip first frame: elapsedMs=" + l60.k(l60Var));
                l60Var.t(true);
                l60.l(l60Var);
                return;
            case 28:
                ((z5) this.f42874b).A();
                return;
            default:
                tg.f fVar2 = ((tg.d) this.f42874b).d;
                fVar2.f47070s = false;
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
