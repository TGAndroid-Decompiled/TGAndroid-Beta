package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wl0;
import yh.l5;
public final class m4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final l5 Y;
    public final HashSet Z;
    public final nz f46266a0;
    public final FrameLayout f46267b0;
    public final ci.d f46268c0;
    public w70 f46269d0;
    public l61 f46270e0;
    public i0.b f46271f0;

    public m4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, ei.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.n2, long, int, ei.r4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f46271f0.f10591a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f46271f0.f10593c + this.backgroundPaddingLeft, this.f46271f0.d);
        i0.b bVar = this.f46271f0;
        int i10 = bVar.f10591a;
        int i11 = this.backgroundPaddingLeft;
        this.f46267b0.setPadding(i10 + i11, 0, bVar.f10593c + i11, bVar.d);
    }

    public final boolean T() {
        wl0 wl0Var = this.d;
        if (wl0Var != null && wl0Var.G) {
            for (int i10 = 0; i10 < wl0Var.getChildCount(); i10++) {
                if (wl0Var.getChildAt(i10) instanceof t00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l61 l61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (l61Var = this.f46270e0) != null) {
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
    public final r0.m1 onApplyWindowInsetsToRoot(View view, r0.m1 m1Var) {
        this.f46271f0 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        S();
        return r0.m1.f42108b;
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        l61 l61Var = new l61(wl0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f46270e0 = l61Var;
        l61Var.f26042r = false;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
