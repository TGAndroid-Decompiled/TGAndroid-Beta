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
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Wallet.l6;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.t91;
import rg.w2;
public final class a2 implements Runnable {
    public final int f43023a;
    public final Object f43024b;

    public a2(Object obj, int i10) {
        this.f43023a = i10;
        this.f43024b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43023a) {
            case 0:
                ((boolean[]) this.f43024b)[0] = true;
                return;
            case 1:
                ((p4.e) this.f43024b).k();
                return;
            case 2:
                ((p4.g) this.f43024b).f44547n = -1;
                return;
            case 3:
                ((ol0) this.f43024b).b();
                return;
            case 4:
                ki.t1 t1Var = ((qg.r0) this.f43024b).f45026b.f45043a;
                if (t1Var != null) {
                    t1Var.J();
                    return;
                }
                return;
            case 5:
                qg.s0 s0Var = ((qg.r0) this.f43024b).f45026b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f45046f.getCurrentColor();
                s0Var.l(s0Var.f45044b, false, false);
                a5.a d = s0Var.d(s0Var.f45044b, currentColor, new RectF(s0Var.h));
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
                ((qg.c1) ((m4) this.f43024b).f34853b).f44906y.f44933a.a();
                return;
            case 7:
                qg.u1 u1Var = ((qg.v1) this.f43024b).f45104a;
                if (u1Var != null) {
                    u1Var.e();
                    return;
                }
                return;
            case 8:
                qh.c cVar = (qh.c) this.f43024b;
                qh.b bVar = cVar.f45145c;
                if (bVar == qh.b.f45141b) {
                    cVar.a(qh.b.f45140a, true);
                    return;
                } else if (bVar == qh.b.f45142c) {
                    cVar.a(qh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 9:
                qi.c cVar2 = (qi.c) this.f43024b;
                AndroidUtilities.runOnUIThread(new qi.b(cVar2.f45170a, cVar2.f45171b, 1), 500L);
                return;
            case 10:
                r2.f fVar = (r2.f) this.f43024b;
                synchronized (fVar.f45335a) {
                    try {
                        if (!fVar.f45344m) {
                            long j10 = fVar.f45343l - 1;
                            fVar.f45343l = j10;
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
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f43024b;
                ((s5.g) ((t5.c) rVar.e)).f(new qg.g0(rVar, 5));
                return;
            case 12:
                r5 r5Var = (r5) this.f43024b;
                r5Var.f45772x0 = true;
                r5Var.s();
                return;
            case 13:
                ((View) this.f43024b).performClick();
                return;
            case 14:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.m2) this.f43024b).f45926f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 15:
                AndroidUtilities.showKeyboard(((w2) this.f43024b).f46110q0);
                return;
            case 16:
                AndroidUtilities.showKeyboard(((rh.c) this.f43024b).f46166a);
                return;
            case 17:
                rh.c cVar3 = (rh.c) ((c6) this.f43024b).d;
                org.telegram.ui.Cells.t1 t1Var2 = cVar3.f46170n;
                if (t1Var2 != null && t1Var2.getDelegate() != null) {
                    cVar3.f46170n.getDelegate().x1(cVar3.f46170n, false);
                    return;
                }
                return;
            case 18:
                ((rh.q) this.f43024b).f46219c.Z2.N(true);
                return;
            case 19:
                ((rh.p) this.f43024b).a();
                return;
            case 20:
                RecyclerView recyclerView = (RecyclerView) this.f43024b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 21:
                sg.j0 j0Var = ((sg.c0) this.f43024b).f46650c;
                j0Var.f33212n.presentFragment(t91.d0(j0Var.w1(), true));
                return;
            case 22:
                ak0 ak0Var = ((sg.p0) this.f43024b).F;
                ak0Var.getAnimatedDrawable().N(0, true, false);
                ak0Var.d();
                return;
            case 23:
                ((sg.w0) this.f43024b).f46908b.B();
                return;
            case 24:
                sg.q1 q1Var = (sg.q1) this.f43024b;
                int size = 1073741823 - (1073741823 % q1Var.Y2.size());
                s4.b0 b0Var = q1Var.Z2;
                q1Var.f46833m3 = size;
                b0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.C1(null, false);
                return;
            case 25:
                ((sg.s1) this.f43024b).invalidate();
                return;
            case 26:
                ((sg.a2) this.f43024b).a();
                return;
            case 27:
                k60 k60Var = (k60) ((l2.f) this.f43024b).f15906b;
                k60Var.f27891p0 = true;
                FileLog.d("RoundVideo camera flip first frame: elapsedMs=" + k60.k(k60Var));
                k60Var.t(true);
                k60.l(k60Var);
                return;
            case 28:
                ((z5) this.f43024b).A();
                return;
            default:
                tg.f fVar2 = ((tg.d) this.f43024b).d;
                fVar2.f47505s = false;
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
