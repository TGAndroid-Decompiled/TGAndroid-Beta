package xd;

import id.h;
import id.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
public abstract class d extends f {
    public static List a(b bVar) {
        i.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return o.f12114a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return h.b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
