package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.v51;
import yh.l5;
public final class m4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final l5 Y;
    public final HashSet Z;
    public final oz f45965a0;
    public final FrameLayout f45966b0;
    public final ci.d f45967c0;
    public o70 f45968d0;
    public v51 f45969e0;
    public i0.b f45970f0;

    public m4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, ei.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.n2, long, int, ei.r4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f45970f0.f10576a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f45970f0.f10578c + this.backgroundPaddingLeft, this.f45970f0.d);
        i0.b bVar = this.f45970f0;
        int i10 = bVar.f10576a;
        int i11 = this.backgroundPaddingLeft;
        this.f45966b0.setPadding(i10 + i11, 0, bVar.f10578c + i11, bVar.d);
    }

    public final boolean T() {
        ml0 ml0Var = this.d;
        if (ml0Var != null && ml0Var.G) {
            for (int i10 = 0; i10 < ml0Var.getChildCount(); i10++) {
                if (ml0Var.getChildAt(i10) instanceof u00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (v51Var = this.f45969e0) != null) {
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
        this.f45970f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f41806b;
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        v51 v51Var = new v51(ml0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f45969e0 = v51Var;
        v51Var.f28662r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
