package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f55121a;
    public final int f55122b;
    public final List f55123c;
    public final List d;
    public final List f55124e;
    public final List f55125f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f55121a = j3;
        this.f55122b = i7;
        this.f55123c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f55124e = DesugarCollections.unmodifiableList(list2);
        this.f55125f = DesugarCollections.unmodifiableList(list3);
    }
}
