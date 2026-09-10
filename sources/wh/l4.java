package wh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import xh.n5;
public final class l4 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final n5 Y;
    public final HashSet Z;
    public final uz f44208a0;
    public final FrameLayout f44209b0;
    public final bi.d f44210c0;
    public w70 f44211d0;
    public j61 f44212e0;
    public i0.c f44213f0;

    public l4(org.telegram.ui.ActionBar.p2 r20, long r21, int r23, di.v4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: wh.l4.<init>(org.telegram.ui.ActionBar.p2, long, int, di.v4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f44213f0.f10074a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f44213f0.f10076c + this.backgroundPaddingLeft, this.f44213f0.d);
        i0.c cVar = this.f44213f0;
        int i10 = cVar.f10074a;
        int i11 = this.backgroundPaddingLeft;
        this.f44209b0.setPadding(i10 + i11, 0, cVar.f10076c + i11, cVar.d);
    }

    public final boolean T() {
        vl0 vl0Var = this.d;
        if (vl0Var != null && vl0Var.G) {
            for (int i10 = 0; i10 < vl0Var.getChildCount(); i10++) {
                if (vl0Var.getChildAt(i10) instanceof a10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (j61Var = this.f44212e0) != null) {
            j61Var.N(true);
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
        this.f44213f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.f41073b;
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, false, new gi.a(this, 20), this.resourcesProvider);
        this.f44212e0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
