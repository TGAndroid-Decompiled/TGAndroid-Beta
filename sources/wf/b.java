package wf;

import f2.s;
import java.util.ArrayList;
import of.g;
import org.telegram.ui.Components.vk0;
public abstract class b extends vk0 {
    public final g f48816c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f48816c;
        gVar.f19355c = arrayList;
        gVar.d = arrayList2;
        s.c(gVar, true).b(this);
    }
}
