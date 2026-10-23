package yh;

import ai.y9;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wz;
public final class k4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final y9 Y;
    public final HashSet Z;
    public final wz f50803a0;
    public final FrameLayout f50804b0;
    public final ei.d f50805c0;
    public j80 f50806d0;
    public final gh.c f50807e0;
    public final gh.c f50808f0;
    public b71 f50809g0;
    public i0.b f50810h0;
    public boolean f50811i0;
    public int f50812j0;

    public k4(org.telegram.ui.ActionBar.o2 r20, long r21, int r23, gi.g4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k4.<init>(org.telegram.ui.ActionBar.o2, long, int, gi.g4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f50810h0.f12315a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f50810h0.f12317c + this.backgroundPaddingLeft, this.f50810h0.d);
        i0.b bVar = this.f50810h0;
        int i10 = bVar.f12315a;
        int i11 = this.backgroundPaddingLeft;
        this.f50804b0.setPadding(i10 + i11, 0, bVar.f12317c + i11, bVar.d);
    }

    public final boolean T() {
        mm0 mm0Var = this.d;
        if (mm0Var != null && mm0Var.G) {
            for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                if (mm0Var.getChildAt(i10) instanceof b10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (b71Var = this.f50809g0) != null) {
            b71Var.N(true);
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
    public final r0.k1 onApplyWindowInsetsToRoot(View view, r0.k1 k1Var) {
        this.f50810h0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        S();
        return r0.k1.f45250b;
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            gh.c cVar = this.f50807e0;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.f21183d6));
            }
            gh.c cVar2 = this.f50808f0;
            if (cVar2 != null) {
                cVar2.a(getThemedColor(k6.f21125a7));
            }
            int themedColor = getThemedColor(k6.f21125a7);
            if (this.f50811i0 && themedColor == this.f50812j0) {
                return;
            }
            this.f50811i0 = true;
            this.f50812j0 = themedColor;
            setBackgroundColor(themedColor);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, false, new t3(this, 1), this.resourcesProvider);
        this.f50809g0 = b71Var;
        b71Var.f24972r = false;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
