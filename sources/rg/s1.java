package rg;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ft;
import org.telegram.ui.n21;
import xh.s2;
import yh.j8;
import yh.m2;
import yh.n7;
import yh.x2;
public final class s1 implements Runnable {
    public final int f46311a;
    public final Object f46312b;

    public s1(Object obj, int i10) {
        this.f46311a = i10;
        this.f46312b = obj;
    }

    @Override
    public final void run() {
        switch (this.f46311a) {
            case 0:
                ((t1) this.f46312b).invalidate();
                return;
            case 1:
                ((b2) this.f46312b).a();
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f46312b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 3:
                ((rf.b) ((com.google.android.gms.internal.cast.p) this.f46312b).f6950c).a(false);
                return;
            case 4:
                CharSequence charSequence = (CharSequence) this.f46312b;
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 5:
                ((tg.y) this.f46312b).run(null);
                return;
            case 6:
                ((ft) this.f46312b).run(Collections.EMPTY_LIST);
                return;
            case 7:
                ((tg.v) this.f46312b).run(null);
                return;
            case 8:
                tg.c0 c0Var = ((tg.b0) this.f46312b).f46988r;
                m1 m1Var = new m1(c0Var.f25309n, tg.c0.O(c0Var), null, null, null, tg.c0.P(c0Var));
                m1Var.J0 = true;
                m1Var.f46195c0 = true;
                c0Var.f25309n.showDialog(m1Var);
                return;
            case 9:
                ((f3) this.f46312b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new n21(16), 220L);
                return;
            case 10:
                ((th.f) this.f46312b).f47163d0.N(true);
                return;
            case 11:
                wh.m mVar = (wh.m) this.f46312b;
                mVar.f();
                mVar.e(true);
                return;
            case 12:
                ((xg.b) this.f46312b).f();
                return;
            case 13:
                xh.m mVar2 = (xh.m) this.f46312b;
                mVar2.f50091h0.setTranslationX(mVar2.f50090g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 14:
                ((xh.c0) this.f46312b).onBackPressed();
                return;
            case 15:
                u61 u61Var = ((xh.q1) this.f46312b).Y;
                if (u61Var != null) {
                    u61Var.N(false);
                    return;
                }
                return;
            case 16:
                ((xh.f1) this.f46312b).c();
                return;
            case 17:
                xh.n1 n1Var = (xh.n1) this.f46312b;
                j8 j8Var = n1Var.f50136e;
                if (j8Var != null) {
                    j8Var.d();
                    n1Var.invalidateSelf();
                    return;
                }
                return;
            case 18:
                ((s2) this.f46312b).o();
                return;
            case 19:
                try {
                    ((Bitmap) this.f46312b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 20:
                yf.n nVar = (yf.n) this.f46312b;
                long j3 = nVar.f51007b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    nVar.f51007b = j10;
                    nVar.f51006a.e(j10);
                }
                if (nVar.f51007b <= 0) {
                    nVar.f51008c = false;
                }
                if (nVar.f51008c) {
                    AndroidUtilities.runOnUIThread(nVar.d, 1000L);
                    return;
                }
                return;
            case 21:
                yh.a aVar = (yh.a) this.f46312b;
                aVar.getClass();
                new n7(aVar.getContext(), aVar.f51058b).show();
                return;
            case 22:
                yh.f fVar = (yh.f) this.f46312b;
                fVar.getClass();
                try {
                    zl0 currentListView = fVar.f51255x0.F.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 23:
                new ax0(((yh.s) this.f46312b).getContext()).show();
                return;
            case 24:
                AndroidUtilities.showKeyboard(((yh.a0) this.f46312b).f51066d0);
                return;
            case 25:
                AndroidUtilities.showKeyboard(((yh.e0) this.f46312b).h);
                return;
            case 26:
                AndroidUtilities.showKeyboard(((yh.i0) this.f46312b).f51407c);
                return;
            case 27:
                ((yh.s0) this.f46312b).onBackPressed();
                return;
            case 28:
                x2 x2Var = (x2) this.f46312b;
                x2Var.f52200h0 = false;
                x2Var.f52202j0 = false;
                x2Var.a(x2Var.W, x2Var.f52189a0, x2Var.f52191b0, x2Var.f52193c0);
                return;
            default:
                ((m2) this.f46312b).invalidateSelf();
                return;
        }
    }
}
