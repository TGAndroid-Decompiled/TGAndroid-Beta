package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import yh.k5;
public final class m4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final k5 Y;
    public final HashSet Z;
    public final pz f46295a0;
    public final FrameLayout f46296b0;
    public final ci.d f46297c0;
    public a80 f46298d0;
    public l61 f46299e0;
    public i0.b f46300f0;

    public m4(org.telegram.ui.ActionBar.m2 r20, long r21, int r23, ei.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.m2, long, int, ei.r4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f46300f0.f10576a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f46300f0.f10578c + this.backgroundPaddingLeft, this.f46300f0.d);
        i0.b bVar = this.f46300f0;
        int i10 = bVar.f10576a;
        int i11 = this.backgroundPaddingLeft;
        this.f46296b0.setPadding(i10 + i11, 0, bVar.f10578c + i11, bVar.d);
    }

    public final boolean T() {
        yl0 yl0Var = this.d;
        if (yl0Var != null && yl0Var.G) {
            for (int i10 = 0; i10 < yl0Var.getChildCount(); i10++) {
                if (yl0Var.getChildAt(i10) instanceof v00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l61 l61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (l61Var = this.f46299e0) != null) {
            l61Var.N(true);
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
        this.f46300f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f42141b;
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        l61 l61Var = new l61(yl0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f46299e0 = l61Var;
        l61Var.f25924r = false;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
