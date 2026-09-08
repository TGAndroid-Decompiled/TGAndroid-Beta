package zh;

import android.content.Context;
import android.view.KeyEvent;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
public final class o6 implements Runnable {
    public final int f52421a;
    public final int f52422b;
    public final KeyEvent.Callback f52423c;
    public final Object d;
    public final TLObject f52424e;
    public final Object f52425f;

    public o6(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.f52421a = i11;
        this.f52423c = callback;
        this.d = obj;
        this.f52422b = i10;
        this.f52424e = tLObject;
        this.f52425f = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        int i10 = this.f52421a;
        Object obj = this.f52425f;
        TLObject tLObject = this.f52424e;
        Object obj2 = this.d;
        KeyEvent.Callback callback = this.f52423c;
        switch (i10) {
            case 0:
                String str = (String) obj;
                ((di.d) callback).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj2)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                s5.y(this.f52422b, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    yc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    return;
                }
                return;
            default:
                yh.p1 p1Var = (yh.p1) callback;
                Context context = (Context) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) tLObject;
                long j3 = p1Var.f50514c0;
                yh.m0 m0Var = new yh.m0(p1Var, (Utilities.Callback) obj, 2);
                boolean z12 = starGift.limited;
                if (z12 && (disallowedGiftsSettings2 = p1Var.f50513b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (disallowedGiftsSettings = p1Var.f50513b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new yh.s0(p1Var, context, this.f52422b, starGift, j3, m0Var, z10, z11).show();
                return;
        }
    }
}
