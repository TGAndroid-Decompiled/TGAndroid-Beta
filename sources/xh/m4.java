package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yl0;
import yh.l5;
public final class m4 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final l5 Y;
    public final HashSet Z;
    public final nz f46334a0;
    public final FrameLayout f46335b0;
    public final ci.d f46336c0;
    public y70 f46337d0;
    public m61 f46338e0;
    public i0.b f46339f0;

    public m4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, ei.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.n2, long, int, ei.r4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f46339f0.f10592a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f46339f0.f10594c + this.backgroundPaddingLeft, this.f46339f0.d);
        i0.b bVar = this.f46339f0;
        int i10 = bVar.f10592a;
        int i11 = this.backgroundPaddingLeft;
        this.f46335b0.setPadding(i10 + i11, 0, bVar.f10594c + i11, bVar.d);
    }

    public final boolean T() {
        yl0 yl0Var = this.d;
        if (yl0Var != null && yl0Var.G) {
            for (int i10 = 0; i10 < yl0Var.getChildCount(); i10++) {
                if (yl0Var.getChildAt(i10) instanceof t00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m61 m61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (m61Var = this.f46338e0) != null) {
            m61Var.N(true);
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
        this.f46339f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f42174b;
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        m61 m61Var = new m61(yl0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f46338e0 = m61Var;
        m61Var.f26342r = false;
        return m61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
