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
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vz;
public final class l4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final t9 Y;
    public final HashSet Z;
    public final vz f53099a0;
    public final FrameLayout f53100b0;
    public final fi.d f53101c0;
    public k80 f53102d0;
    public final hh.c f53103e0;
    public final hh.c f53104f0;
    public j71 f53105g0;
    public i0.b f53106h0;
    public boolean f53107i0;
    public int f53108j0;

    public l4(org.telegram.ui.ActionBar.r2 r20, long r21, int r23, hi.p4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l4.<init>(org.telegram.ui.ActionBar.r2, long, int, hi.p4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f53106h0.f13450a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f53106h0.f13452c + this.backgroundPaddingLeft, this.f53106h0.d);
        i0.b bVar = this.f53106h0;
        int i10 = bVar.f13450a;
        int i11 = this.backgroundPaddingLeft;
        this.f53100b0.setPadding(i10 + i11, 0, bVar.f13452c + i11, bVar.d);
    }

    public final boolean T() {
        mm0 mm0Var = this.d;
        if (mm0Var != null && mm0Var.G) {
            for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                if (mm0Var.getChildAt(i10) instanceof c10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (j71Var = this.f53105g0) != null) {
            j71Var.O(true);
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
        this.f53106h0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        S();
        return r0.k1.f47114b;
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hh.c cVar = this.f53103e0;
            if (cVar != null) {
                cVar.a(getThemedColor(y6.f23354d6));
            }
            hh.c cVar2 = this.f53104f0;
            if (cVar2 != null) {
                cVar2.a(getThemedColor(y6.f23297a7));
            }
            int themedColor = getThemedColor(y6.f23297a7);
            if (this.f53107i0 && themedColor == this.f53108j0) {
                return;
            }
            this.f53107i0 = true;
            this.f53108j0 = themedColor;
            setBackgroundColor(themedColor);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, false, new q0(this, 4), this.resourcesProvider);
        this.f53105g0 = j71Var;
        j71Var.f29505r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
