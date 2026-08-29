package sf;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class h0 implements Runnable {
    public final int f47817a;
    public final l0 f47818b;

    public h0(l0 l0Var, int i10) {
        this.f47817a = i10;
        this.f47818b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f47817a) {
            case 0:
                l0 l0Var = this.f47818b;
                TL_account.TL_businessBotRights tL_businessBotRights = l0Var.F;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                l0Var.f47862c.U2.N(true);
                l0Var.Y(true);
                return;
            case 1:
                l0 l0Var2 = this.f47818b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var2.F;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                l0Var2.f47862c.U2.N(true);
                l0Var2.Y(true);
                return;
            case 2:
                l0 l0Var3 = this.f47818b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var3.F;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                l0Var3.f47862c.U2.N(true);
                l0Var3.Y(true);
                return;
            case 3:
                l0 l0Var4 = this.f47818b;
                l0Var4.f47862c.U2.N(true);
                l0Var4.Y(true);
                return;
            default:
                l0 l0Var5 = this.f47818b;
                String obj = l0Var5.f47864f.getText().toString();
                String str = l0Var5.f47870y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    l0Var5.f47869x = false;
                    if (TextUtils.isEmpty(obj)) {
                        l0Var5.f47870y = null;
                        l0Var5.d.b();
                        l0Var5.f47862c.U2.N(true);
                        return;
                    }
                    rf.k1 k1Var = l0Var5.d;
                    l0Var5.f47870y = obj;
                    int i10 = l0Var5.A;
                    l0Var5.A = i10 + 1;
                    k1Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
