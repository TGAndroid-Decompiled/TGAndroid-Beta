package wg;

import bi.j6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.og0;
public final class w0 implements z10 {
    public final int f59268a;
    public final c1 f59269b;

    public w0(c1 c1Var, int i7) {
        this.f59268a = i7;
        this.f59269b = c1Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        switch (this.f59268a) {
            case 0:
                c1 c1Var = this.f59269b;
                ArrayList arrayList = c1Var.f59156n2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                og0 og0Var = c1Var.U1;
                if (og0Var.R) {
                    og0Var.setLoading(false);
                    if (c1Var.f35931o1.H) {
                        c1Var.k1();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f59269b.dismiss();
                return;
            case 2:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                c1 c1Var2 = this.f59269b;
                TLRPC.UserFull b22 = np.s1(c1Var2.f29679a).b2(m10.i(c1Var2.f29679a).e());
                if (b22 != null) {
                    tL_birthday = b22.birthday;
                } else {
                    tL_birthday = null;
                }
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday2;
                }
                ConnectionsManager.getInstance(c1Var2.f29679a).sendRequest(updatebirthday, new j6(c1Var2, b22, tL_birthday, 26), 1024);
                np.s1(c1Var2.f29679a).m2();
                np.s1(c1Var2.f29679a).k4(0L, "BIRTHDAY_SETUP");
                ns.f(c1Var2.f29679a).k(107, new Object[0]);
                c1Var2.o1(true, true);
                return;
            default:
                c1 c1Var3 = this.f59269b;
                c1Var3.f59153k2 = (String) obj;
                s4.s0 s0Var = c1Var3.f59161s2;
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.i3(s0Var, 350L);
                return;
        }
    }
}
