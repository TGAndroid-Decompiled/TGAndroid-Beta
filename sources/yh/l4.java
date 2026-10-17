package yh;

import ai.x9;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.wz;
public final class l4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final x9 Y;
    public final HashSet Z;
    public final wz f50376a0;
    public final FrameLayout f50377b0;
    public final ei.d f50378c0;
    public i80 f50379d0;
    public s61 f50380e0;
    public i0.c f50381f0;

    public l4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, gi.g4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.l4.<init>(org.telegram.ui.ActionBar.n2, long, int, gi.g4):void");
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f50381f0.f12284a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f50381f0.f12286c + this.backgroundPaddingLeft, this.f50381f0.d);
        i0.c cVar = this.f50381f0;
        int i10 = cVar.f12284a;
        int i11 = this.backgroundPaddingLeft;
        this.f50377b0.setPadding(i10 + i11, 0, cVar.f12286c + i11, cVar.d);
    }

    public final boolean U() {
        im0 im0Var = this.d;
        if (im0Var != null && im0Var.G) {
            for (int i10 = 0; i10 < im0Var.getChildCount(); i10++) {
                if (im0Var.getChildAt(i10) instanceof b10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (s61Var = this.f50380e0) != null) {
            s61Var.N(true);
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
        this.f50381f0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        T();
        return r0.k1.f44852b;
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(im0Var, getContext(), this.currentAccount, 0, false, new u3(this, 1), this.resourcesProvider);
        this.f50380e0 = s61Var;
        s61Var.f30200r = false;
        return s61Var;
    }
}
