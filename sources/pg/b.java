package pg;

import hg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.im0;
import s4.o;
public abstract class b extends im0 {
    public final g f44302c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f44302c;
        gVar.f11865c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).c(this);
    }
}
