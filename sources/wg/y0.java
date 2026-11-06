package wg;

import bi.f2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.og0;
public final class y0 implements c20 {
    public final int f57750a;
    public final f1 f57751b;

    public y0(f1 f1Var, int i7) {
        this.f57750a = i7;
        this.f57751b = f1Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        switch (this.f57750a) {
            case 0:
                f1 f1Var = this.f57751b;
                ArrayList arrayList = f1Var.f57644j2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                og0 og0Var = f1Var.Q1;
                if (og0Var.Q) {
                    og0Var.setLoading(false);
                    if (f1Var.f36222k1.G) {
                        f1Var.k1();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f57751b.dismiss();
                return;
            case 2:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                f1 f1Var2 = this.f57751b;
                TLRPC.UserFull b22 = qp.s1(f1Var2.f28612a).b2(p10.i(f1Var2.f28612a).e());
                if (b22 != null) {
                    tL_birthday = b22.birthday;
                } else {
                    tL_birthday = null;
                }
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday2;
                }
                ConnectionsManager.getInstance(f1Var2.f28612a).sendRequest(updatebirthday, new f2(f1Var2, b22, tL_birthday, 25), 1024);
                qp.s1(f1Var2.f28612a).m2();
                qp.s1(f1Var2.f28612a).k4(0L, "BIRTHDAY_SETUP");
                qs.f(f1Var2.f28612a).k(107, new Object[0]);
                f1Var2.o1(true, true);
                return;
            default:
                f1 f1Var3 = this.f57751b;
                f1Var3.f57641g2 = (String) obj;
                tg.y yVar = f1Var3.f57649o2;
                org.telegram.messenger.g0.r(yVar);
                org.telegram.messenger.g0.i3(yVar, 350L);
                return;
        }
    }
}
