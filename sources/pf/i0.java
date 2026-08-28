package pf;

import android.text.TextUtils;
import of.v1;
import org.telegram.tgnet.tl.TL_account;
public final class i0 implements Runnable {
    public final int f45651a;
    public final m0 f45652b;

    public i0(m0 m0Var, int i9) {
        this.f45651a = i9;
        this.f45652b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f45651a) {
            case 0:
                m0 m0Var = this.f45652b;
                TL_account.TL_businessBotRights tL_businessBotRights = m0Var.F;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                m0Var.f45702c.U2.N(true);
                m0Var.X(true);
                return;
            case 1:
                m0 m0Var2 = this.f45652b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var2.F;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                m0Var2.f45702c.U2.N(true);
                m0Var2.X(true);
                return;
            case 2:
                m0 m0Var3 = this.f45652b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var3.F;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                m0Var3.f45702c.U2.N(true);
                m0Var3.X(true);
                return;
            case 3:
                m0 m0Var4 = this.f45652b;
                m0Var4.f45702c.U2.N(true);
                m0Var4.X(true);
                return;
            default:
                m0 m0Var5 = this.f45652b;
                String obj = m0Var5.f45704f.getText().toString();
                String str = m0Var5.f45710y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    m0Var5.f45709x = false;
                    if (TextUtils.isEmpty(obj)) {
                        m0Var5.f45710y = null;
                        m0Var5.d.b();
                        m0Var5.f45702c.U2.N(true);
                        return;
                    }
                    v1 v1Var = m0Var5.d;
                    m0Var5.f45710y = obj;
                    int i9 = m0Var5.A;
                    m0Var5.A = i9 + 1;
                    v1Var.h(obj, true, false, true, false, false, 0L, false, 0, i9, 0L, null);
                    return;
                }
                return;
        }
    }
}
