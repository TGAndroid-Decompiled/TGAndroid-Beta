package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.z70;
import yh.k5;
public final class m4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final k5 Y;
    public final HashSet Z;
    public final pz f46292a0;
    public final FrameLayout f46293b0;
    public final ci.d f46294c0;
    public z70 f46295d0;
    public k61 f46296e0;
    public i0.b f46297f0;

    public m4(org.telegram.ui.ActionBar.m2 r20, long r21, int r23, ei.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.m2, long, int, ei.r4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f46297f0.f10576a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f46297f0.f10578c + this.backgroundPaddingLeft, this.f46297f0.d);
        i0.b bVar = this.f46297f0;
        int i10 = bVar.f10576a;
        int i11 = this.backgroundPaddingLeft;
        this.f46293b0.setPadding(i10 + i11, 0, bVar.f10578c + i11, bVar.d);
    }

    public final boolean T() {
        xl0 xl0Var = this.d;
        if (xl0Var != null && xl0Var.G) {
            for (int i10 = 0; i10 < xl0Var.getChildCount(); i10++) {
                if (xl0Var.getChildAt(i10) instanceof v00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k61 k61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (k61Var = this.f46296e0) != null) {
            k61Var.N(true);
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
        this.f46297f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f42138b;
    }

    @Override
    public final wl0 v(xl0 xl0Var) {
        k61 k61Var = new k61(xl0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f46296e0 = k61Var;
        k61Var.f25644r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
