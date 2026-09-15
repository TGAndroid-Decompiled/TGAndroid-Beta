package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.za;
import yh.n5;
public final class l4 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final n5 Y;
    public final HashSet Z;
    public final nz f45978a0;
    public final FrameLayout f45979b0;
    public final ci.d f45980c0;
    public n70 f45981d0;
    public w51 f45982e0;
    public i0.b f45983f0;

    public l4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, ei.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.l4.<init>(org.telegram.ui.ActionBar.n2, long, int, ei.r4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f45983f0.f10588a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f45983f0.f10590c + this.backgroundPaddingLeft, this.f45983f0.d);
        i0.b bVar = this.f45983f0;
        int i10 = bVar.f10588a;
        int i11 = this.backgroundPaddingLeft;
        this.f45979b0.setPadding(i10 + i11, 0, bVar.f10590c + i11, bVar.d);
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
        w51 w51Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (w51Var = this.f45982e0) != null) {
            w51Var.N(true);
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
        this.f45983f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f41854b;
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(ll0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f45982e0 = w51Var;
        w51Var.f29613r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
