package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f55086a;
    public final int f55087b;
    public final List f55088c;
    public final List d;
    public final List f55089e;
    public final List f55090f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f55086a = j3;
        this.f55087b = i7;
        this.f55088c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f55089e = DesugarCollections.unmodifiableList(list2);
        this.f55090f = DesugarCollections.unmodifiableList(list3);
    }
}
