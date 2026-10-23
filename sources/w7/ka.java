package w7;

import android.content.Context;
import java.util.ArrayList;
public final class ka implements ja {
    public final ArrayList f49180a;

    public ka(Context context, ia iaVar) {
        ArrayList arrayList = new ArrayList();
        this.f49180a = arrayList;
        iaVar.getClass();
        arrayList.add(new ma(context, iaVar));
    }

    @Override
    public final void a(n2.e eVar) {
        ArrayList arrayList = this.f49180a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ja) obj).a(eVar);
        }
    }
}
