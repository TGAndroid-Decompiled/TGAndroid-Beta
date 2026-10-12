package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wm0;
import yh.f5;
public final class l4 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final f5 Y;
    public final HashSet Z;
    public final g00 f51578a0;
    public final FrameLayout f51579b0;
    public final ci.d f51580c0;
    public s80 f51581d0;
    public h71 f51582e0;
    public i0.b f51583f0;

    public l4(org.telegram.ui.ActionBar.m2 r20, long r21, int r23, ei.q4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.l4.<init>(org.telegram.ui.ActionBar.m2, long, int, ei.q4):void");
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f51583f0.f11574a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f51583f0.f11576c + this.backgroundPaddingLeft, this.f51583f0.d);
        i0.b bVar = this.f51583f0;
        int i10 = bVar.f11574a;
        int i11 = this.backgroundPaddingLeft;
        this.f51579b0.setPadding(i10 + i11, 0, bVar.f11576c + i11, bVar.d);
    }

    public final boolean U() {
        wm0 wm0Var = this.d;
        if (wm0Var != null && wm0Var.G) {
            for (int i10 = 0; i10 < wm0Var.getChildCount(); i10++) {
                if (wm0Var.getChildAt(i10) instanceof m10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h71 h71Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (h71Var = this.f51582e0) != null) {
            h71Var.N(true);
            if (U()) {
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
    public final r0.k1 onApplyWindowInsetsToRoot(View view, r0.k1 k1Var) {
        this.f51583f0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        T();
        return r0.k1.f46999b;
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(wm0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f51582e0 = h71Var;
        h71Var.f26679r = false;
        return h71Var;
    }
}
