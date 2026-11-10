package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f53101a;
    public final int f53102b;
    public final List f53103c;
    public final List d;
    public final List f53104e;
    public final List f53105f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f53101a = j3;
        this.f53102b = i7;
        this.f53103c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f53104e = DesugarCollections.unmodifiableList(list2);
        this.f53105f = DesugarCollections.unmodifiableList(list3);
    }
}
