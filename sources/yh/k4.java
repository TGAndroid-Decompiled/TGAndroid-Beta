package yh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.v51;
import zh.j5;
public final class k4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final j5 Y;
    public final HashSet Z;
    public final nz f50410a0;
    public final FrameLayout f50411b0;
    public final di.d f50412c0;
    public n70 f50413d0;
    public v51 f50414e0;
    public i0.c f50415f0;

    public k4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, fi.s4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k4.<init>(org.telegram.ui.ActionBar.n2, long, int, fi.s4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f50415f0.f11451a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f50415f0.f11453c + this.backgroundPaddingLeft, this.f50415f0.d);
        i0.c cVar = this.f50415f0;
        int i10 = cVar.f11451a;
        int i11 = this.backgroundPaddingLeft;
        this.f50411b0.setPadding(i10 + i11, 0, cVar.f11453c + i11, cVar.d);
    }

    public final boolean T() {
        ll0 ll0Var = this.d;
        if (ll0Var != null && ll0Var.G) {
            for (int i10 = 0; i10 < ll0Var.getChildCount(); i10++) {
                if (ll0Var.getChildAt(i10) instanceof t00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (v51Var = this.f50414e0) != null) {
            v51Var.N(true);
            if (T()) {
                this.Y.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override
    public final r0.l1 onApplyWindowInsetsToRoot(View view, r0.l1 l1Var) {
        this.f50415f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f44738b;
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, false, new ii.a(this, 20), this.resourcesProvider);
        this.f50414e0 = v51Var;
        v51Var.f31162r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
