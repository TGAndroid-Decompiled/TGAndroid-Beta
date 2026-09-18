package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.za;
import yh.n5;
public final class l4 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final n5 Y;
    public final HashSet Z;
    public final nz f46006a0;
    public final FrameLayout f46007b0;
    public final ci.d f46008c0;
    public n70 f46009d0;
    public x51 f46010e0;
    public i0.b f46011f0;

    public l4(org.telegram.ui.ActionBar.o2 r20, long r21, int r23, ei.r4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.l4.<init>(org.telegram.ui.ActionBar.o2, long, int, ei.r4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f46011f0.f10591a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f46011f0.f10593c + this.backgroundPaddingLeft, this.f46011f0.d);
        i0.b bVar = this.f46011f0;
        int i10 = bVar.f10591a;
        int i11 = this.backgroundPaddingLeft;
        this.f46007b0.setPadding(i10 + i11, 0, bVar.f10593c + i11, bVar.d);
    }

    public final boolean T() {
        ml0 ml0Var = this.d;
        if (ml0Var != null && ml0Var.G) {
            for (int i10 = 0; i10 < ml0Var.getChildCount(); i10++) {
                if (ml0Var.getChildAt(i10) instanceof t00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x51 x51Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (x51Var = this.f46010e0) != null) {
            x51Var.N(true);
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
        this.f46011f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f41881b;
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(ml0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f46010e0 = x51Var;
        x51Var.f29854r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
