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
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wz;
public final class k4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final y9 Y;
    public final HashSet Z;
    public final wz f50342a0;
    public final FrameLayout f50343b0;
    public final ei.d f50344c0;
    public i80 f50345d0;
    public t61 f50346e0;
    public i0.b f50347f0;

    public k4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, gi.g4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k4.<init>(org.telegram.ui.ActionBar.n2, long, int, gi.g4):void");
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f50347f0.f12283a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f50347f0.f12285c + this.backgroundPaddingLeft, this.f50347f0.d);
        i0.b bVar = this.f50347f0;
        int i10 = bVar.f12283a;
        int i11 = this.backgroundPaddingLeft;
        this.f50343b0.setPadding(i10 + i11, 0, bVar.f12285c + i11, bVar.d);
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
        t61 t61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (t61Var = this.f50346e0) != null) {
            t61Var.N(true);
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
        this.f50347f0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        T();
        return r0.k1.f44826b;
    }

    @Override
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(im0Var, getContext(), this.currentAccount, 0, false, new t3(this, 1), this.resourcesProvider);
        this.f50346e0 = t61Var;
        t61Var.f30436r = false;
        return t61Var;
    }
}
