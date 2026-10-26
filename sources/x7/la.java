package x7;

import android.content.Context;
import java.util.ArrayList;
public final class la implements ka {
    public final ArrayList f51555a;

    public la(Context context, ja jaVar) {
        ArrayList arrayList = new ArrayList();
        this.f51555a = arrayList;
        jaVar.getClass();
        arrayList.add(new na(context, jaVar));
    }

    @Override
    public final void a(m4.c cVar) {
        ArrayList arrayList = this.f51555a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ka) obj).a(cVar);
        }
    }
}
