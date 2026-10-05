package rg;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ft;
import org.telegram.ui.n21;
import xh.s2;
import yh.l8;
import yh.n2;
import yh.p7;
import yh.y2;
public final class s1 implements Runnable {
    public final int f46318a;
    public final Object f46319b;

    public s1(Object obj, int i10) {
        this.f46318a = i10;
        this.f46319b = obj;
    }

    @Override
    public final void run() {
        switch (this.f46318a) {
            case 0:
                ((t1) this.f46319b).invalidate();
                return;
            case 1:
                ((b2) this.f46319b).a();
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f46319b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 3:
                ((rf.b) ((com.google.android.gms.internal.cast.p) this.f46319b).f6950c).a(false);
                return;
            case 4:
                CharSequence charSequence = (CharSequence) this.f46319b;
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 5:
                ((tg.y) this.f46319b).run(null);
                return;
            case 6:
                ((ft) this.f46319b).run(Collections.EMPTY_LIST);
                return;
            case 7:
                ((tg.v) this.f46319b).run(null);
                return;
            case 8:
                tg.c0 c0Var = ((tg.b0) this.f46319b).f46995r;
                m1 m1Var = new m1(c0Var.f25357n, tg.c0.O(c0Var), null, null, null, tg.c0.P(c0Var));
                m1Var.J0 = true;
                m1Var.f46202c0 = true;
                c0Var.f25357n.showDialog(m1Var);
                return;
            case 9:
                ((f3) this.f46319b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new n21(16), 220L);
                return;
            case 10:
                ((th.f) this.f46319b).f47170d0.N(true);
                return;
            case 11:
                wh.m mVar = (wh.m) this.f46319b;
                mVar.f();
                mVar.e(true);
                return;
            case 12:
                ((xg.b) this.f46319b).f();
                return;
            case 13:
                xh.m mVar2 = (xh.m) this.f46319b;
                mVar2.f50098h0.setTranslationX(mVar2.f50097g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 14:
                ((xh.c0) this.f46319b).onBackPressed();
                return;
            case 15:
                w61 w61Var = ((xh.q1) this.f46319b).Y;
                if (w61Var != null) {
                    w61Var.N(false);
                    return;
                }
                return;
            case 16:
                ((xh.f1) this.f46319b).c();
                return;
            case 17:
                xh.n1 n1Var = (xh.n1) this.f46319b;
                l8 l8Var = n1Var.f50143e;
                if (l8Var != null) {
                    l8Var.d();
                    n1Var.invalidateSelf();
                    return;
                }
                return;
            case 18:
                ((s2) this.f46319b).o();
                return;
            case 19:
                try {
                    ((Bitmap) this.f46319b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 20:
                yf.n nVar = (yf.n) this.f46319b;
                long j3 = nVar.f51014b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    nVar.f51014b = j10;
                    nVar.f51013a.e(j10);
                }
                if (nVar.f51014b <= 0) {
                    nVar.f51015c = false;
                }
                if (nVar.f51015c) {
                    AndroidUtilities.runOnUIThread(nVar.d, 1000L);
                    return;
                }
                return;
            case 21:
                yh.a aVar = (yh.a) this.f46319b;
                aVar.getClass();
                new p7(aVar.getContext(), aVar.f51065b).show();
                return;
            case 22:
                yh.g gVar = (yh.g) this.f46319b;
                if (gVar.isAttachedToWindow() && !gVar.f51312c.canScrollVertically(1)) {
                    gVar.a();
                    return;
                }
                return;
            case 23:
                new bx0(((yh.t) this.f46319b).getContext()).show();
                return;
            case 24:
                AndroidUtilities.showKeyboard(((yh.b0) this.f46319b).f51122d0);
                return;
            case 25:
                AndroidUtilities.showKeyboard(((yh.f0) this.f46319b).h);
                return;
            case 26:
                AndroidUtilities.showKeyboard(((yh.j0) this.f46319b).f51472c);
                return;
            case 27:
                ((yh.t0) this.f46319b).onBackPressed();
                return;
            case 28:
                y2 y2Var = (y2) this.f46319b;
                y2Var.f52268h0 = false;
                y2Var.f52270j0 = false;
                y2Var.a(y2Var.W, y2Var.f52257a0, y2Var.f52259b0, y2Var.f52261c0);
                return;
            default:
                ((n2) this.f46319b).invalidateSelf();
                return;
        }
    }
}
