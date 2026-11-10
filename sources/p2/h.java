package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f53137a;
    public final long f53138b;
    public final List f53139c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f53137a = str;
        this.f53138b = j3;
        this.f53139c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
