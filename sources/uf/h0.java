package uf;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class h0 implements Runnable {
    public final int f45380a;
    public final l0 f45381b;

    public h0(l0 l0Var, int i10) {
        this.f45380a = i10;
        this.f45381b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45380a) {
            case 0:
                l0 l0Var = this.f45381b;
                TL_account.TL_businessBotRights tL_businessBotRights = l0Var.G;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                l0Var.f45429c.V2.N(true);
                l0Var.Y(true);
                return;
            case 1:
                l0 l0Var2 = this.f45381b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var2.G;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                l0Var2.f45429c.V2.N(true);
                l0Var2.Y(true);
                return;
            case 2:
                l0 l0Var3 = this.f45381b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var3.G;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                l0Var3.f45429c.V2.N(true);
                l0Var3.Y(true);
                return;
            case 3:
                l0 l0Var4 = this.f45381b;
                l0Var4.f45429c.V2.N(true);
                l0Var4.Y(true);
                return;
            default:
                l0 l0Var5 = this.f45381b;
                String obj = l0Var5.f45430f.getText().toString();
                String str = l0Var5.f45436y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    l0Var5.f45435x = false;
                    if (TextUtils.isEmpty(obj)) {
                        l0Var5.f45436y = null;
                        l0Var5.d.b();
                        l0Var5.f45429c.V2.N(true);
                        return;
                    }
                    tf.j1 j1Var = l0Var5.d;
                    l0Var5.f45436y = obj;
                    int i10 = l0Var5.B;
                    l0Var5.B = i10 + 1;
                    j1Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
