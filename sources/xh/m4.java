package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import yh.e5;
public final class m4 extends eb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final e5 Y;
    public final HashSet Z;
    public final e00 f51421a0;
    public final FrameLayout f51422b0;
    public final ci.d f51423c0;
    public q80 f51424d0;
    public d71 f51425e0;
    public i0.b f51426f0;

    public m4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, ei.q4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.n2, long, int, ei.q4):void");
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f51426f0.f11576a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f51426f0.f11578c + this.backgroundPaddingLeft, this.f51426f0.d);
        i0.b bVar = this.f51426f0;
        int i10 = bVar.f11576a;
        int i11 = this.backgroundPaddingLeft;
        this.f51422b0.setPadding(i10 + i11, 0, bVar.f11578c + i11, bVar.d);
    }

    public final boolean U() {
        rm0 rm0Var = this.d;
        if (rm0Var != null && rm0Var.G) {
            for (int i10 = 0; i10 < rm0Var.getChildCount(); i10++) {
                if (rm0Var.getChildAt(i10) instanceof k10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d71 d71Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (d71Var = this.f51425e0) != null) {
            d71Var.N(true);
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
        this.f51426f0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        T();
        return r0.k1.f46820b;
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        d71 d71Var = new d71(rm0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f51425e0 = d71Var;
        d71Var.f25587r = false;
        return d71Var;
    }
}
