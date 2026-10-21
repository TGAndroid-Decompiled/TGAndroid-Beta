package yh;

import ai.y9;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wz;
public final class k4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final y9 Y;
    public final HashSet Z;
    public final wz f50347a0;
    public final FrameLayout f50348b0;
    public final ei.d f50349c0;
    public i80 f50350d0;
    public u61 f50351e0;
    public i0.b f50352f0;

    public k4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, gi.g4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k4.<init>(org.telegram.ui.ActionBar.n2, long, int, gi.g4):void");
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f50352f0.f12283a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f50352f0.f12285c + this.backgroundPaddingLeft, this.f50352f0.d);
        i0.b bVar = this.f50352f0;
        int i10 = bVar.f12283a;
        int i11 = this.backgroundPaddingLeft;
        this.f50348b0.setPadding(i10 + i11, 0, bVar.f12285c + i11, bVar.d);
    }

    public final boolean U() {
        jm0 jm0Var = this.d;
        if (jm0Var != null && jm0Var.G) {
            for (int i10 = 0; i10 < jm0Var.getChildCount(); i10++) {
                if (jm0Var.getChildAt(i10) instanceof b10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (u61Var = this.f50351e0) != null) {
            u61Var.N(true);
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
        this.f50352f0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        T();
        return r0.k1.f44834b;
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        u61 u61Var = new u61(jm0Var, getContext(), this.currentAccount, 0, false, new t3(this, 1), this.resourcesProvider);
        this.f50351e0 = u61Var;
        u61Var.f30861r = false;
        return u61Var;
    }
}
