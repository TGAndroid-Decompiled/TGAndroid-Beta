package vh;

import java.util.ArrayList;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.jx;
import org.telegram.ui.zx;
public final class m6 implements r20 {
    public final int f51499a;
    public final Object f51500b;

    public m6(Object obj, int i10) {
        this.f51499a = i10;
        this.f51500b = obj;
    }

    @Override
    public final void a(Object obj) {
        q51 q51Var;
        boolean z10;
        switch (this.f51499a) {
            case 0:
                ((n6) this.f51500b).f51582n.W.f52133y1 = ((Integer) obj).intValue();
                return;
            case 1:
                ((o7) this.f51500b).h((r20) obj);
                return;
            case 2:
                xh.o oVar = (xh.o) this.f51500b;
                ArrayList arrayList = oVar.f53949b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                v51 v51Var = oVar.f53948a;
                if (v51Var != null && (q51Var = v51Var.f31183f3) != null) {
                    q51Var.O(true);
                    return;
                }
                return;
            case 3:
                yh.e eVar = (yh.e) this.f51500b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = eVar.f54490n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                eVar.f54490n = arrayList2;
                v51 v51Var2 = eVar.f54489f;
                if (v51Var2 != null) {
                    v51Var2.f31183f3.O(z10);
                    return;
                }
                return;
            case 4:
                ((zf.m) this.f51500b).M((TLRPC.User) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                an0 an0Var = (an0) ((zf.z) this.f51500b);
                jx jxVar = an0Var.K0;
                if (user != null) {
                    zx zxVar = jxVar.L0;
                    if (zxVar != null) {
                        zxVar.W3();
                    }
                    wp.r1(jxVar.J0).u3(null, user, null, 0, null, false, false);
                    an0Var.Q(user.f19943id, user);
                    return;
                }
                return;
        }
    }
}
