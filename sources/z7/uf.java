package z7;

import android.content.Context;
import java.util.ArrayList;
public final class uf implements tf {
    public final ArrayList f51258a;

    public uf(Context context, sf sfVar) {
        ArrayList arrayList = new ArrayList();
        this.f51258a = arrayList;
        sfVar.getClass();
        arrayList.add(new xf(context, sfVar));
    }

    @Override
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.f51258a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((tf) obj).a(aVar);
        }
    }
}
