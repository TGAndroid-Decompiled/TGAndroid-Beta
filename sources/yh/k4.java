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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.za;
public final class k4 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final y9 Y;
    public final HashSet Z;
    public final uz f50802a0;
    public final FrameLayout f50803b0;
    public final ei.d f50804c0;
    public h80 f50805d0;
    public final gh.c f50806e0;
    public final gh.c f50807f0;
    public a71 f50808g0;
    public i0.b f50809h0;
    public boolean f50810i0;
    public int f50811j0;

    public k4(org.telegram.ui.ActionBar.o2 r20, long r21, int r23, gi.g4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k4.<init>(org.telegram.ui.ActionBar.o2, long, int, gi.g4):void");
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f50809h0.f12315a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f50809h0.f12317c + this.backgroundPaddingLeft, this.f50809h0.d);
        i0.b bVar = this.f50809h0;
        int i10 = bVar.f12315a;
        int i11 = this.backgroundPaddingLeft;
        this.f50803b0.setPadding(i10 + i11, 0, bVar.f12317c + i11, bVar.d);
    }

    public final boolean T() {
        lm0 lm0Var = this.d;
        if (lm0Var != null && lm0Var.G) {
            for (int i10 = 0; i10 < lm0Var.getChildCount(); i10++) {
                if (lm0Var.getChildAt(i10) instanceof z00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (a71Var = this.f50808g0) != null) {
            a71Var.N(true);
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
        this.f50809h0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        S();
        return r0.k1.f45249b;
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            gh.c cVar = this.f50806e0;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.f21184d6));
            }
            gh.c cVar2 = this.f50807f0;
            if (cVar2 != null) {
                cVar2.a(getThemedColor(k6.f21126a7));
            }
            int themedColor = getThemedColor(k6.f21126a7);
            if (this.f50810i0 && themedColor == this.f50811j0) {
                return;
            }
            this.f50810i0 = true;
            this.f50811j0 = themedColor;
            setBackgroundColor(themedColor);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(lm0Var, getContext(), this.currentAccount, 0, false, new t3(this, 1), this.resourcesProvider);
        this.f50808g0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
