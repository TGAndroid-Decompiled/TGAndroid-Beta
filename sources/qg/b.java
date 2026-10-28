package qg;

import ig.h;
import java.util.ArrayList;
import org.telegram.ui.Components.mm0;
import s4.p;
public abstract class b extends mm0 {
    public final h f47077c = new h();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        h hVar = this.f47077c;
        hVar.f14062c = arrayList;
        hVar.d = arrayList2;
        p.c(hVar, true).c(this);
    }
}
