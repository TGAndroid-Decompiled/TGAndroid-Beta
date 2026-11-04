package ti;

import android.util.SparseArray;
import cg.d;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public final class a {
    public SparseArray f55443a;

    public final void a(HashMap hashMap) {
        if (this.f55443a == null) {
            this.f55443a = new SparseArray(hashMap.size());
            ArrayList arrayList = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList, Comparator$CC.comparingInt(new d(22)));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                Map.Entry entry = (Map.Entry) obj;
                this.f55443a.append(((String) entry.getKey()).hashCode(), (String) entry.getValue());
            }
            return;
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f55443a.put(((String) entry2.getKey()).hashCode(), (String) entry2.getValue());
        }
    }
}
