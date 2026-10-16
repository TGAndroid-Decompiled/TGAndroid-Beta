package pg;

import hg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.lm0;
import s4.o;
public abstract class b extends lm0 {
    public final g f42906c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f42906c;
        gVar.f10561c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).c(this);
    }
}
