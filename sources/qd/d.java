package qd;

import bd.j;
import bd.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
public abstract class d extends f {
    public static List a(b bVar) {
        i.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return q.f2660a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return j.b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
