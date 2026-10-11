package xh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import yh.f5;
public final class m4 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final f5 Y;
    public final HashSet Z;
    public final e00 f51464a0;
    public final FrameLayout f51465b0;
    public final ci.d f51466c0;
    public q80 f51467d0;
    public e71 f51468e0;
    public i0.b f51469f0;

    public m4(org.telegram.ui.ActionBar.m2 r20, long r21, int r23, ei.q4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.m4.<init>(org.telegram.ui.ActionBar.m2, long, int, ei.q4):void");
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f51469f0.f11575a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f51469f0.f11577c + this.backgroundPaddingLeft, this.f51469f0.d);
        i0.b bVar = this.f51469f0;
        int i10 = bVar.f11575a;
        int i11 = this.backgroundPaddingLeft;
        this.f51465b0.setPadding(i10 + i11, 0, bVar.f11577c + i11, bVar.d);
    }

    public final boolean U() {
        sm0 sm0Var = this.d;
        if (sm0Var != null && sm0Var.G) {
            for (int i10 = 0; i10 < sm0Var.getChildCount(); i10++) {
                if (sm0Var.getChildAt(i10) instanceof k10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (e71Var = this.f51468e0) != null) {
            e71Var.N(true);
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
        this.f51469f0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        T();
        return r0.k1.f46866b;
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(sm0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.f51468e0 = e71Var;
        e71Var.f25890r = false;
        return e71Var;
    }
}
