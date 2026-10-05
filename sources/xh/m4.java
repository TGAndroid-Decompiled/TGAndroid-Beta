package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import yh.l5;
public final class m4 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final l5 Y;
    public final HashSet Z;
    public final qz f50129a0;
    public final FrameLayout f50130b0;
    public final ci.d f50131c0;
    public b80 f50132d0;
    public w61 f50133e0;
    public i0.b f50134f0;

    public m4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, ei.s4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.n2, long, int, ei.s4):void");
    }

    public final void Q() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f50134f0.f11526a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f50134f0.f11528c + this.backgroundPaddingLeft, this.f50134f0.d);
        i0.b bVar = this.f50134f0;
        int i10 = bVar.f11526a;
        int i11 = this.backgroundPaddingLeft;
        this.f50130b0.setPadding(i10 + i11, 0, bVar.f11528c + i11, bVar.d);
    }

    public final boolean R() {
        zl0 zl0Var = this.d;
        if (zl0Var != null && zl0Var.G) {
            for (int i10 = 0; i10 < zl0Var.getChildCount(); i10++) {
                if (zl0Var.getChildAt(i10) instanceof w00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w61 w61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (w61Var = this.f50133e0) != null) {
            w61Var.N(true);
            if (R()) {
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
        this.f50134f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        Q();
        return r0.l1.f45623b;
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(zl0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f50133e0 = w61Var;
        w61Var.f32531r = false;
        return w61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
