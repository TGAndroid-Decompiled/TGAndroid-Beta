package zh;

import android.view.View;
import android.widget.FrameLayout;
import bi.t9;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.vz;
public final class l4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final t9 Y;
    public final HashSet Z;
    public final vz f53160a0;
    public final FrameLayout f53161b0;
    public final fi.d f53162c0;
    public l80 f53163d0;
    public final hh.c f53164e0;
    public final hh.c f53165f0;
    public k71 f53166g0;
    public i0.b f53167h0;
    public boolean f53168i0;
    public int f53169j0;

    public l4(org.telegram.ui.ActionBar.r2 r20, long r21, int r23, hi.p4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l4.<init>(org.telegram.ui.ActionBar.r2, long, int, hi.p4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f53167h0.f13449a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f53167h0.f13451c + this.backgroundPaddingLeft, this.f53167h0.d);
        i0.b bVar = this.f53167h0;
        int i10 = bVar.f13449a;
        int i11 = this.backgroundPaddingLeft;
        this.f53161b0.setPadding(i10 + i11, 0, bVar.f13451c + i11, bVar.d);
    }

    public final boolean T() {
        nm0 nm0Var = this.d;
        if (nm0Var != null && nm0Var.G) {
            for (int i10 = 0; i10 < nm0Var.getChildCount(); i10++) {
                if (nm0Var.getChildAt(i10) instanceof c10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (k71Var = this.f53166g0) != null) {
            k71Var.O(true);
            if (T()) {
                this.Y.b();
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
        this.f53167h0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        S();
        return r0.k1.f47152b;
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hh.c cVar = this.f53164e0;
            if (cVar != null) {
                cVar.a(getThemedColor(y6.f23357d6));
            }
            hh.c cVar2 = this.f53165f0;
            if (cVar2 != null) {
                cVar2.a(getThemedColor(y6.f23300a7));
            }
            int themedColor = getThemedColor(y6.f23300a7);
            if (this.f53168i0 && themedColor == this.f53169j0) {
                return;
            }
            this.f53168i0 = true;
            this.f53169j0 = themedColor;
            setBackgroundColor(themedColor);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(nm0Var, getContext(), this.currentAccount, 0, false, new q0(this, 4), this.resourcesProvider);
        this.f53166g0 = k71Var;
        k71Var.f29878r = false;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
