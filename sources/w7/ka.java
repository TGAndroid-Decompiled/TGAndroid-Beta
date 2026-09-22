package w7;

import android.content.Context;
import java.util.ArrayList;
public final class ka implements ja {
    public final ArrayList f44734a;

    public ka(Context context, ia iaVar) {
        ArrayList arrayList = new ArrayList();
        this.f44734a = arrayList;
        iaVar.getClass();
        arrayList.add(new ma(context, iaVar));
    }

    @Override
    public final void a(n7.a1 a1Var) {
        ArrayList arrayList = this.f44734a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ja) obj).a(a1Var);
        }
    }
}
