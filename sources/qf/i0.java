package qf;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

public final class i0 implements Runnable {

    public final int f46322a;

    public final m0 f46323b;

    public i0(m0 m0Var, int i10) {
        this.f46322a = i10;
        this.f46323b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f46322a) {
            case 0:
                m0 m0Var = this.f46323b;
                TL_account.TL_businessBotRights tL_businessBotRights = m0Var.F;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                m0Var.f46372c.U2.N(true);
                m0Var.Y(true);
                break;
            case 1:
                m0 m0Var2 = this.f46323b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var2.F;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                m0Var2.f46372c.U2.N(true);
                m0Var2.Y(true);
                break;
            case 2:
                m0 m0Var3 = this.f46323b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var3.F;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                m0Var3.f46372c.U2.N(true);
                m0Var3.Y(true);
                break;
            case 3:
                m0 m0Var4 = this.f46323b;
                m0Var4.f46372c.U2.N(true);
                m0Var4.Y(true);
                break;
            default:
                m0 m0Var5 = this.f46323b;
                String string = m0Var5.f46374f.getText().toString();
                String str = m0Var5.f46380y;
                if (str == null || !TextUtils.equals(str, string)) {
                    m0Var5.f46379x = false;
                    if (!TextUtils.isEmpty(string)) {
                        pf.j1 j1Var = m0Var5.d;
                        m0Var5.f46380y = string;
                        int i10 = m0Var5.A;
                        m0Var5.A = i10 + 1;
                        j1Var.h(string, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    } else {
                        m0Var5.f46380y = null;
                        m0Var5.d.b();
                        m0Var5.f46372c.U2.N(true);
                    }
                }
                break;
        }
    }
}
