package y7;

import android.content.Context;
import java.util.ArrayList;
public final class la implements ka {
    public final ArrayList f59188a;

    public la(Context context, ja jaVar) {
        ArrayList arrayList = new ArrayList();
        this.f59188a = arrayList;
        jaVar.getClass();
        arrayList.add(new na(context, jaVar));
    }

    @Override
    public final void a(w9.b bVar) {
        ArrayList arrayList = this.f59188a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((ka) obj).a(bVar);
        }
    }
}
