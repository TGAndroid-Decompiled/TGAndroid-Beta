package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.y70;
import yh.k5;
public final class m4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final k5 Y;
    public final HashSet Z;
    public final oz f46294a0;
    public final FrameLayout f46295b0;
    public final ci.d f46296c0;
    public y70 f46297d0;
    public j61 f46298e0;
    public i0.b f46299f0;

    public m4(org.telegram.ui.ActionBar.m2 r20, long r21, int r23, ei.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.m2, long, int, ei.r4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f46299f0.f10576a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f46299f0.f10578c + this.backgroundPaddingLeft, this.f46299f0.d);
        i0.b bVar = this.f46299f0;
        int i10 = bVar.f10576a;
        int i11 = this.backgroundPaddingLeft;
        this.f46295b0.setPadding(i10 + i11, 0, bVar.f10578c + i11, bVar.d);
    }

    public final boolean T() {
        wl0 wl0Var = this.d;
        if (wl0Var != null && wl0Var.G) {
            for (int i10 = 0; i10 < wl0Var.getChildCount(); i10++) {
                if (wl0Var.getChildAt(i10) instanceof u00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (j61Var = this.f46298e0) != null) {
            j61Var.N(true);
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
        this.f46299f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f42140b;
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        j61 j61Var = new j61(wl0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f46298e0 = j61Var;
        j61Var.f25291r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
