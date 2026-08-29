package zf;

import f2.q;
import java.util.ArrayList;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.mx;
public abstract class b extends il0 {
    public final mx f50847c = new mx();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        mx mxVar = this.f50847c;
        mxVar.f30775c = arrayList;
        mxVar.d = arrayList2;
        q.c(mxVar, true).b(this);
    }
}
