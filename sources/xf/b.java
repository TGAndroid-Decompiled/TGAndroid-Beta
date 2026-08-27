package xf;

import f2.q;
import java.util.ArrayList;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.yk0;

public abstract class b extends yk0 {

    public final fx f49415c = new fx();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        fx fxVar = this.f49415c;
        fxVar.f28463c = arrayList;
        fxVar.d = arrayList2;
        q.c(fxVar, true).b(this);
    }
}
