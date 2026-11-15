package xg;

import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.messenger.ur;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;
public final class d implements sw {
    public final Object f59912a;
    public final Object f59913b;

    public d(Object obj, Object obj2) {
        this.f59912a = obj;
        this.f59913b = obj2;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        f fVar = (f) this.f59912a;
        String str = (String) this.f59913b;
        long j3 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            j3 = ((ur) arrayList.get(i11)).f26861a;
            fVar.f59918e.getSendMessagesHelper().r0(cz.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        ywVar.finishFragment();
        wg.h.h(j3);
        return true;
    }
}
