package wg;

import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.pg0;
public final class x0 implements Runnable {
    public final int f57836a;
    public final f1 f57837b;

    public x0(f1 f1Var, int i7) {
        this.f57836a = i7;
        this.f57837b = f1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f57836a;
        f1 f1Var = this.f57837b;
        switch (i7) {
            case 0:
                f1Var.j1(true);
                return;
            case 1:
                f1Var.V1.setVisibility(8);
                return;
            case 2:
                f1Var.e1();
                f1Var.p1(true, false);
                return;
            case 3:
                pg0 pg0Var = f1Var.R1;
                pg0Var.f1097b.r(id.M0(2131745836, null), true);
                return;
            case 4:
                pg0 pg0Var2 = f1Var.R1;
                pg0Var2.f1097b.r(id.M0(2131749650, null), true);
                return;
            case 5:
                f1Var.e1();
                f1Var.p1(true, false);
                return;
            case 6:
                ArrayList arrayList = f1Var.f57727b2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ui.b0(f1Var.f28621a).f25821i1);
                    f1Var.o1(true, true);
                    return;
                }
                return;
            case 7:
                f1Var.V1.setVisibility(8);
                return;
            case 8:
                f1Var.e1();
                f1Var.p1(true, false);
                return;
            case 9:
                f2 f2Var = f1Var.f36305o1;
                if (f2Var != 0) {
                    ?? obj = new Object();
                    obj.f27408a = true;
                    f2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                f1Var.o1(true, true);
                return;
            case 11:
                f1Var.dismiss();
                return;
            default:
                f1Var.e1();
                f1Var.p1(true, false);
                return;
        }
    }
}
