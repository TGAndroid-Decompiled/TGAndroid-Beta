package qg;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import bi.u6;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.nj0;
import wh.q2;
import xh.l8;
import xh.p7;
public final class q0 implements Runnable {
    public final int f40866a;
    public final Object f40867b;

    public q0(Object obj, int i10) {
        this.f40866a = i10;
        this.f40867b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40866a) {
            case 0:
                kj0 kj0Var = ((s0) this.f40867b).f40908y;
                kj0Var.getAnimatedDrawable().N(0, true, false);
                kj0Var.d();
                return;
            case 1:
                ((y0) this.f40867b).f40990b.y();
                return;
            case 2:
                q1 q1Var = (q1) this.f40867b;
                int size = 1073741823 - (1073741823 % q1Var.X2.size());
                s4.c0 c0Var = q1Var.Y2;
                q1Var.f40878l3 = size;
                c0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.v1(null, false);
                return;
            case 3:
                ((s1) this.f40867b).invalidate();
                return;
            case 4:
                ((a2) this.f40867b).a();
                return;
            case 5:
                r2.f fVar = (r2.f) this.f40867b;
                synchronized (fVar.f41161a) {
                    try {
                        if (!fVar.f41170m) {
                            long j3 = fVar.f41169l - 1;
                            fVar.f41169l = j3;
                            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
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
            case 6:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f40867b;
                ((s5.g) ((t5.c) sVar.e)).f(new org.telegram.tgnet.j(sVar, 22));
                return;
            case 7:
                ((u6) this.f40867b).z();
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.f40867b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 9:
                ((rf.b) ((com.google.android.gms.internal.cast.p) this.f40867b).f5236c).a(false);
                return;
            case 10:
                CharSequence charSequence = (CharSequence) this.f40867b;
                wc X = wc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 11:
                ((sg.y) this.f40867b).run(null);
                return;
            case 12:
                ((nj0) this.f40867b).run(Collections.EMPTY_LIST);
                return;
            case 13:
                ((sg.v) this.f40867b).run(null);
                return;
            case 14:
                sg.c0 c0Var2 = ((sg.b0) this.f40867b).f41875r;
                m1 m1Var = new m1(c0Var2.f21452n, sg.c0.Q(c0Var2), null, null, null, sg.c0.R(c0Var2));
                m1Var.J0 = true;
                m1Var.f40814c0 = true;
                c0Var2.f21452n.showDialog(m1Var);
                return;
            case 15:
                ((h3) this.f40867b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(8), 220L);
                return;
            case 16:
                ((sh.f) this.f40867b).f42047d0.N(true);
                return;
            case 17:
                vh.o oVar = (vh.o) this.f40867b;
                oVar.f();
                oVar.e(true);
                return;
            case 18:
                ((wg.b) this.f40867b).f();
                return;
            case 19:
                wh.m mVar = (wh.m) this.f40867b;
                mVar.f44221h0.setTranslationX(mVar.f44220g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 20:
                ((wh.d0) this.f40867b).onBackPressed();
                return;
            case 21:
                j61 j61Var = ((wh.p1) this.f40867b).Y;
                if (j61Var != null) {
                    j61Var.N(false);
                    return;
                }
                return;
            case 22:
                ((wh.e1) this.f40867b).c();
                return;
            case 23:
                wh.m1 m1Var2 = (wh.m1) this.f40867b;
                l8 l8Var = m1Var2.e;
                if (l8Var != null) {
                    l8Var.d();
                    m1Var2.invalidateSelf();
                    return;
                }
                return;
            case 24:
                ((q2) this.f40867b).o();
                return;
            case 25:
                try {
                    ((Bitmap) this.f40867b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                xf.n nVar = (xf.n) this.f40867b;
                long j10 = nVar.f45163b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    nVar.f45163b = j11;
                    nVar.f45162a.h(j11);
                }
                if (nVar.f45163b <= 0) {
                    nVar.f45164c = false;
                }
                if (nVar.f45164c) {
                    AndroidUtilities.runOnUIThread(nVar.d, 1000L);
                    return;
                }
                return;
            case 27:
                xh.a aVar = (xh.a) this.f40867b;
                aVar.getClass();
                new p7(aVar.getContext(), aVar.f45208b).show();
                return;
            case 28:
                xh.g gVar = (xh.g) this.f40867b;
                gVar.getClass();
                try {
                    vl0 currentListView = gVar.f45428x0.F.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            default:
                new pw0(((xh.t) this.f40867b).getContext()).show();
                return;
        }
    }
}
