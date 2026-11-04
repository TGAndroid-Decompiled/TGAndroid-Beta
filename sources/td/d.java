package td;

import b8.tb;
import ed.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
public abstract class d extends f {
    public static List a(b bVar) {
        j.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return o.f9953a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return tb.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
