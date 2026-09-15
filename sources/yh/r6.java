package yh;

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
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
public final class r6 implements Runnable {
    public final int f47729a;
    public final int f47730b;
    public final KeyEvent.Callback f47731c;
    public final Object d;
    public final TLObject e;
    public final Object f47732f;

    public r6(KeyEvent.Callback callback, Object obj, int i10, TLObject tLObject, Object obj2, int i11) {
        this.f47729a = i11;
        this.f47731c = callback;
        this.d = obj;
        this.f47730b = i10;
        this.e = tLObject;
        this.f47732f = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        int i10 = this.f47729a;
        Object obj = this.f47732f;
        TLObject tLObject = this.e;
        Object obj2 = this.d;
        KeyEvent.Callback callback = this.f47731c;
        switch (i10) {
            case 0:
                String str = (String) obj;
                ((ci.d) callback).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj2)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                v5.y(this.f47730b, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    vc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    return;
                }
                return;
            default:
                xh.q1 q1Var = (xh.q1) callback;
                Context context = (Context) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) tLObject;
                long j3 = q1Var.f46078c0;
                xh.m0 m0Var = new xh.m0(q1Var, (Utilities.Callback) obj, 2);
                boolean z12 = starGift.limited;
                if (z12 && (disallowedGiftsSettings2 = q1Var.f46077b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (disallowedGiftsSettings = q1Var.f46077b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new xh.s0(q1Var, context, this.f47730b, starGift, j3, m0Var, z10, z11).show();
                return;
        }
    }
}
