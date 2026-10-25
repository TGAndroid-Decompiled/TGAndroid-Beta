package zd;

import a8.ud;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.o;
import kotlin.jvm.internal.i;
public abstract class d extends e {
    public static List a(b bVar) {
        i.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return o.f16525a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ud.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
