package vh;

import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ay;
import org.telegram.ui.kx;
public final class m6 implements q20 {
    public final int f51484a;
    public final Object f51485b;

    public m6(Object obj, int i10) {
        this.f51484a = i10;
        this.f51485b = obj;
    }

    @Override
    public final void a(Object obj) {
        p51 p51Var;
        boolean z10;
        switch (this.f51484a) {
            case 0:
                ((n6) this.f51485b).f51567n.W.f52115y1 = ((Integer) obj).intValue();
                return;
            case 1:
                ((o7) this.f51485b).h((q20) obj);
                return;
            case 2:
                xh.o oVar = (xh.o) this.f51485b;
                ArrayList arrayList = oVar.f53928b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                u51 u51Var = oVar.f53927a;
                if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
                    p51Var.O(true);
                    return;
                }
                return;
            case 3:
                yh.e eVar = (yh.e) this.f51485b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = eVar.f54471n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                eVar.f54471n = arrayList2;
                u51 u51Var2 = eVar.f54470f;
                if (u51Var2 != null) {
                    u51Var2.f30819f3.O(z10);
                    return;
                }
                return;
            case 4:
                ((zf.m) this.f51485b).M((TLRPC.User) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                zm0 zm0Var = (zm0) ((zf.z) this.f51485b);
                kx kxVar = zm0Var.K0;
                if (user != null) {
                    ay ayVar = kxVar.L0;
                    if (ayVar != null) {
                        ayVar.V3();
                    }
                    vp.r1(kxVar.J0).u3(null, user, null, 0, null, false, false);
                    zm0Var.Q(user.f19942id, user);
                    return;
                }
                return;
        }
    }
}
