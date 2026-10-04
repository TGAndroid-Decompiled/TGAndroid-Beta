package xh;

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
import yh.t5;
public final class o0 implements Runnable {
    public final int f50146a;
    public final int f50147b;
    public final KeyEvent.Callback f50148c;
    public final Object d;
    public final TLObject f50149e;
    public final Object f50150f;

    public o0(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.f50146a = i11;
        this.f50148c = callback;
        this.d = obj;
        this.f50147b = i10;
        this.f50149e = tLObject;
        this.f50150f = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        int i10 = this.f50146a;
        Object obj = this.f50150f;
        TLObject tLObject = this.f50149e;
        Object obj2 = this.d;
        KeyEvent.Callback callback = this.f50148c;
        switch (i10) {
            case 0:
                q1 q1Var = (q1) callback;
                Context context = (Context) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) tLObject;
                long j3 = q1Var.f50190c0;
                m0 m0Var = new m0(q1Var, (Utilities.Callback) obj, 2);
                boolean z12 = starGift.limited;
                if (z12 && (disallowedGiftsSettings2 = q1Var.f50189b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (disallowedGiftsSettings = q1Var.f50189b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new t0(q1Var, context, this.f50147b, starGift, j3, m0Var, z10, z11).show();
                return;
            default:
                String str = (String) obj;
                ((ci.d) callback).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj2)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                t5.y(this.f50147b, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    yc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    return;
                }
                return;
        }
    }
}
