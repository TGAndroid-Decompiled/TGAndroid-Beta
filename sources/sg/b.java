package sg;

import java.util.ArrayList;
import kg.g;
import org.telegram.ui.Components.sj0;
import u4.o;
public abstract class b extends sj0 {
    public final g f54717c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f54717c;
        gVar.f17028c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).c(this);
    }
}
