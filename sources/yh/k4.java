package yh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zz;
import zh.f5;
public final class k4 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final f5 Y;
    public final HashSet Z;
    public final zz f48943a0;
    public final FrameLayout f48944b0;
    public final di.d f48945c0;
    public l80 f48946d0;
    public a71 f48947e0;
    public i0.b f48948f0;

    public k4(org.telegram.ui.ActionBar.m2 r20, long r21, int r23, fi.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k4.<init>(org.telegram.ui.ActionBar.m2, long, int, fi.r4):void");
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f48948f0.f10892a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f48948f0.f10894c + this.backgroundPaddingLeft, this.f48948f0.d);
        i0.b bVar = this.f48948f0;
        int i10 = bVar.f10892a;
        int i11 = this.backgroundPaddingLeft;
        this.f48944b0.setPadding(i10 + i11, 0, bVar.f10894c + i11, bVar.d);
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
        a71 a71Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (a71Var = this.f48947e0) != null) {
            a71Var.N(true);
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
        this.f48948f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        T();
        return r0.l1.f43496b;
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(mm0Var, getContext(), this.currentAccount, 0, false, new ii.a(this, 20), this.resourcesProvider);
        this.f48947e0 = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }
}
