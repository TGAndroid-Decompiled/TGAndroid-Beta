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
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
public final class r6 implements Runnable {
    public final int f45977a;
    public final int f45978b;
    public final KeyEvent.Callback f45979c;
    public final Object d;
    public final TLObject e;
    public final Object f45980f;

    public r6(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.f45977a = i11;
        this.f45979c = callback;
        this.d = obj;
        this.f45978b = i10;
        this.e = tLObject;
        this.f45980f = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        int i10 = this.f45977a;
        Object obj = this.f45980f;
        TLObject tLObject = this.e;
        Object obj2 = this.d;
        KeyEvent.Callback callback = this.f45979c;
        switch (i10) {
            case 0:
                String str = (String) obj;
                ((bi.d) callback).setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.ActionBar.h3[]) obj2)[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                v5.y(this.f45978b, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    wc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    return;
                }
                return;
            default:
                wh.p1 p1Var = (wh.p1) callback;
                Context context = (Context) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) tLObject;
                long j3 = p1Var.f44289c0;
                wh.n0 n0Var = new wh.n0(p1Var, (Utilities.Callback) obj, 2);
                boolean z12 = starGift.limited;
                if (z12 && (disallowedGiftsSettings2 = p1Var.f44288b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (disallowedGiftsSettings = p1Var.f44288b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new wh.s0(p1Var, context, this.f45978b, starGift, j3, n0Var, z10, z11).show();
                return;
        }
    }
}
