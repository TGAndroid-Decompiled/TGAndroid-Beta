package xg;

import ai.r6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ig0;
public final class y0 implements u10 {
    public final int f58793a;
    public final e1 f58794b;

    public y0(e1 e1Var, int i3) {
        this.f58793a = i3;
        this.f58794b = e1Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        switch (this.f58793a) {
            case 0:
                e1 e1Var = this.f58794b;
                ArrayList arrayList = e1Var.f58682k2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                ig0 ig0Var = e1Var.R1;
                if (ig0Var.R) {
                    ig0Var.setLoading(false);
                    if (e1Var.f36102l1.H) {
                        e1Var.k1();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f58794b.dismiss();
                return;
            case 2:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                e1 e1Var2 = this.f58794b;
                TLRPC.UserFull b22 = hp.s1(e1Var2.f28583a).b2(h10.i(e1Var2.f28583a).e());
                if (b22 != null) {
                    tL_birthday = b22.birthday;
                } else {
                    tL_birthday = null;
                }
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday2;
                }
                ConnectionsManager.getInstance(e1Var2.f28583a).sendRequest(updatebirthday, new r6(e1Var2, b22, tL_birthday, 26), 1024);
                hp.s1(e1Var2.f28583a).m2();
                hp.s1(e1Var2.f28583a).k4(0L, "BIRTHDAY_SETUP");
                hs.f(e1Var2.f28583a).k(107, new Object[0]);
                e1Var2.o1(true, true);
                return;
            default:
                e1 e1Var3 = this.f58794b;
                e1Var3.f58679h2 = (String) obj;
                wi.i0 i0Var = e1Var3.f58687p2;
                org.telegram.messenger.g0.r(i0Var);
                org.telegram.messenger.g0.i3(i0Var, 350L);
                return;
        }
    }
}
