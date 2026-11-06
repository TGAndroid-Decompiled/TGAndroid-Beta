package rg;

import java.util.ArrayList;
import jg.h;
import org.telegram.ui.Components.oj0;
import v4.o;
public abstract class b extends oj0 {
    public final h f54417c = new h();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        h hVar = this.f54417c;
        hVar.f16733c = arrayList;
        hVar.d = arrayList2;
        o.c(hVar, true).c(this);
    }
}
