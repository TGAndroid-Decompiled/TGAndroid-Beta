package sg;

import android.graphics.Bitmap;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.yc;
import org.telegram.ui.oj0;
import org.telegram.ui.q31;
import yh.q2;
import zh.h8;
import zh.l7;
import zh.x2;
public final class p0 implements Runnable {
    public final int f46222a;
    public final Object f46223b;

    public p0(Object obj, int i10) {
        this.f46222a = i10;
        this.f46223b = obj;
    }

    @Override
    public final void run() {
        switch (this.f46222a) {
            case 0:
                aj0 aj0Var = ((r0) this.f46223b).f46245y;
                aj0Var.getAnimatedDrawable().L(0, true, false);
                aj0Var.d();
                return;
            case 1:
                ((y0) this.f46223b).f46343b.y();
                return;
            case 2:
                s1 s1Var = (s1) this.f46223b;
                int size = 1073741823 - (1073741823 % s1Var.X2.size());
                s4.c0 c0Var = s1Var.Y2;
                s1Var.f46277l3 = size;
                c0Var.h1(size, (s1Var.getMeasuredHeight() - s1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                s1Var.v1(null, false);
                return;
            case 3:
                ((u1) this.f46223b).invalidate();
                return;
            case 4:
                ((c2) this.f46223b).a();
                return;
            case 5:
                ((sf.b) ((com.google.android.gms.internal.cast.p) this.f46223b).f5423c).a(false);
                return;
            case 6:
                CharSequence charSequence = (CharSequence) this.f46223b;
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 7:
                ((ug.z) this.f46223b).run(null);
                return;
            case 8:
                ((oj0) this.f46223b).run(Collections.EMPTY_LIST);
                return;
            case 9:
                ((ug.w) this.f46223b).run(null);
                return;
            case 10:
                ug.d0 d0Var = ((ug.c0) this.f46223b).f47098r;
                o1 o1Var = new o1(d0Var.f24649n, ug.d0.Q(d0Var), null, null, null, ug.d0.R(d0Var));
                o1Var.J0 = true;
                o1Var.f46196c0 = true;
                d0Var.f24649n.showDialog(o1Var);
                return;
            case 11:
                ((f3) this.f46223b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new q31(15), 220L);
                return;
            case 12:
                ((uh.f) this.f46223b).f47250d0.N(true);
                return;
            case 13:
                xh.m mVar = (xh.m) this.f46223b;
                mVar.f();
                mVar.e(true);
                return;
            case 14:
                try {
                    ((Bitmap) this.f46223b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 15:
                yf.n nVar = (yf.n) this.f46223b;
                long j3 = nVar.f50122b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    nVar.f50122b = j10;
                    nVar.f50121a.c(j10);
                }
                if (nVar.f50122b <= 0) {
                    nVar.f50123c = false;
                }
                if (nVar.f50123c) {
                    AndroidUtilities.runOnUIThread(nVar.d, 1000L);
                    return;
                }
                return;
            case 16:
                ((yg.b) this.f46223b).f();
                return;
            case 17:
                yh.m mVar2 = (yh.m) this.f46223b;
                mVar2.f50411h0.setTranslationX(mVar2.f50410g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 18:
                ((yh.c0) this.f46223b).onBackPressed();
                return;
            case 19:
                v51 v51Var = ((yh.p1) this.f46223b).Y;
                if (v51Var != null) {
                    v51Var.N(false);
                    return;
                }
                return;
            case 20:
                ((yh.e1) this.f46223b).c();
                return;
            case 21:
                yh.m1 m1Var = (yh.m1) this.f46223b;
                h8 h8Var = m1Var.f50435e;
                if (h8Var != null) {
                    h8Var.d();
                    m1Var.invalidateSelf();
                    return;
                }
                return;
            case 22:
                ((q2) this.f46223b).o();
                return;
            case 23:
                zh.a aVar = (zh.a) this.f46223b;
                aVar.getClass();
                new l7(aVar.getContext(), aVar.f51641b).show();
                return;
            case 24:
                zh.f fVar = (zh.f) this.f46223b;
                fVar.getClass();
                try {
                    ll0 currentListView = fVar.f51841x0.F.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 25:
                new dw0(((zh.s) this.f46223b).getContext()).show();
                return;
            case 26:
                AndroidUtilities.showKeyboard(((zh.a0) this.f46223b).f51649d0);
                return;
            case 27:
                AndroidUtilities.showKeyboard(((zh.e0) this.f46223b).h);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((zh.i0) this.f46223b).f52007c);
                return;
            default:
                x2 x2Var = (x2) this.f46223b;
                x2Var.f52831h0 = false;
                x2Var.f52833j0 = false;
                x2Var.a(x2Var.W, x2Var.f52820a0, x2Var.f52822b0, x2Var.f52824c0);
                return;
        }
    }
}
