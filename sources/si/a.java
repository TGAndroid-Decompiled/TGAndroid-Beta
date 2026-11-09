package si;

import android.util.SparseArray;
import bg.d;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public final class a {
    public SparseArray f55350a;

    public final void a(HashMap hashMap) {
        if (this.f55350a == null) {
            this.f55350a = new SparseArray(hashMap.size());
            ArrayList arrayList = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList, Comparator$CC.comparingInt(new d(22)));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                Map.Entry entry = (Map.Entry) obj;
                this.f55350a.append(((String) entry.getKey()).hashCode(), (String) entry.getValue());
            }
            return;
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f55350a.put(((String) entry2.getKey()).hashCode(), (String) entry2.getValue());
        }
    }
}
