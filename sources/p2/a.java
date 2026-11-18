package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f55076a;
    public final int f55077b;
    public final List f55078c;
    public final List d;
    public final List f55079e;
    public final List f55080f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f55076a = j3;
        this.f55077b = i7;
        this.f55078c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f55079e = DesugarCollections.unmodifiableList(list2);
        this.f55080f = DesugarCollections.unmodifiableList(list3);
    }
}
