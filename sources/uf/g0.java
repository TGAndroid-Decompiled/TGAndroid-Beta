package uf;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class g0 implements Runnable {
    public final int f45309a;
    public final k0 f45310b;

    public g0(k0 k0Var, int i10) {
        this.f45309a = i10;
        this.f45310b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f45309a) {
            case 0:
                k0 k0Var = this.f45310b;
                TL_account.TL_businessBotRights tL_businessBotRights = k0Var.G;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                k0Var.f45352c.V2.N(true);
                k0Var.Y(true);
                return;
            case 1:
                k0 k0Var2 = this.f45310b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = k0Var2.G;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                k0Var2.f45352c.V2.N(true);
                k0Var2.Y(true);
                return;
            case 2:
                k0 k0Var3 = this.f45310b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = k0Var3.G;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                k0Var3.f45352c.V2.N(true);
                k0Var3.Y(true);
                return;
            case 3:
                k0 k0Var4 = this.f45310b;
                k0Var4.f45352c.V2.N(true);
                k0Var4.Y(true);
                return;
            default:
                k0 k0Var5 = this.f45310b;
                String obj = k0Var5.f45353f.getText().toString();
                String str = k0Var5.f45359y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    k0Var5.f45358x = false;
                    if (TextUtils.isEmpty(obj)) {
                        k0Var5.f45359y = null;
                        k0Var5.d.b();
                        k0Var5.f45352c.V2.N(true);
                        return;
                    }
                    tf.k1 k1Var = k0Var5.d;
                    k0Var5.f45359y = obj;
                    int i10 = k0Var5.B;
                    k0Var5.B = i10 + 1;
                    k1Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
