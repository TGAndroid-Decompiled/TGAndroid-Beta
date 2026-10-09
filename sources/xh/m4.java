package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import yh.e5;
public final class m4 extends eb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final e5 Y;
    public final HashSet Z;
    public final d00 f51377a0;
    public final FrameLayout f51378b0;
    public final ci.d f51379c0;
    public p80 f51380d0;
    public c71 f51381e0;
    public i0.b f51382f0;

    public m4(org.telegram.ui.ActionBar.n2 r20, long r21, int r23, ei.q4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.n2, long, int, ei.q4):void");
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f51382f0.f11576a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f51382f0.f11578c + this.backgroundPaddingLeft, this.f51382f0.d);
        i0.b bVar = this.f51382f0;
        int i10 = bVar.f11576a;
        int i11 = this.backgroundPaddingLeft;
        this.f51378b0.setPadding(i10 + i11, 0, bVar.f11578c + i11, bVar.d);
    }

    public final boolean U() {
        qm0 qm0Var = this.d;
        if (qm0Var != null && qm0Var.G) {
            for (int i10 = 0; i10 < qm0Var.getChildCount(); i10++) {
                if (qm0Var.getChildAt(i10) instanceof j10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (c71Var = this.f51381e0) != null) {
            c71Var.N(true);
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
        this.f51382f0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        T();
        return r0.k1.f46776b;
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(qm0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f51381e0 = c71Var;
        c71Var.f25280r = false;
        return c71Var;
    }
}
