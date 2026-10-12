package pg;

import hg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.lm0;
import s4.o;
public abstract class b extends lm0 {
    public final g f43205c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f43205c;
        gVar.f10557c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).c(this);
    }
}
