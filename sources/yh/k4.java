package yh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zz;
import zh.f5;
public final class k4 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final f5 Y;
    public final HashSet Z;
    public final zz f48944a0;
    public final FrameLayout f48945b0;
    public final di.d f48946c0;
    public m80 f48947d0;
    public z61 f48948e0;
    public i0.b f48949f0;

    public k4(org.telegram.ui.ActionBar.m2 r20, long r21, int r23, fi.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k4.<init>(org.telegram.ui.ActionBar.m2, long, int, fi.r4):void");
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f48949f0.f10888a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f48949f0.f10890c + this.backgroundPaddingLeft, this.f48949f0.d);
        i0.b bVar = this.f48949f0;
        int i10 = bVar.f10888a;
        int i11 = this.backgroundPaddingLeft;
        this.f48945b0.setPadding(i10 + i11, 0, bVar.f10890c + i11, bVar.d);
    }

    public final boolean U() {
        mm0 mm0Var = this.d;
        if (mm0Var != null && mm0Var.G) {
            for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                if (mm0Var.getChildAt(i10) instanceof f10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z61 z61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (z61Var = this.f48948e0) != null) {
            z61Var.N(true);
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
    public final r0.l1 onApplyWindowInsetsToRoot(View view, r0.l1 l1Var) {
        this.f48949f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        T();
        return r0.l1.f43740b;
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.currentAccount, 0, false, new ii.a(this, 20), this.resourcesProvider);
        this.f48948e0 = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
