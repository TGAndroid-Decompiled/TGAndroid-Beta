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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import yh.k5;
public final class m4 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final k5 Y;
    public final HashSet Z;
    public final qz f46401a0;
    public final FrameLayout f46402b0;
    public final ci.d f46403c0;
    public b80 f46404d0;
    public m61 f46405e0;
    public i0.b f46406f0;

    public m4(org.telegram.ui.ActionBar.m2 r20, long r21, int r23, ei.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.m2, long, int, ei.r4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f46406f0.f10590a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f46406f0.f10592c + this.backgroundPaddingLeft, this.f46406f0.d);
        i0.b bVar = this.f46406f0;
        int i10 = bVar.f10590a;
        int i11 = this.backgroundPaddingLeft;
        this.f46402b0.setPadding(i10 + i11, 0, bVar.f10592c + i11, bVar.d);
    }

    public final boolean T() {
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
        m61 m61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (m61Var = this.f46405e0) != null) {
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
        this.f46406f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f42244b;
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        m61 m61Var = new m61(zl0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f46405e0 = m61Var;
        m61Var.f26223r = false;
        return m61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
