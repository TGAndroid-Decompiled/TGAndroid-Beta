package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f52972a;
    public final int f52973b;
    public final List f52974c;
    public final List d;
    public final List f52975e;
    public final List f52976f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f52972a = j3;
        this.f52973b = i7;
        this.f52974c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f52975e = DesugarCollections.unmodifiableList(list2);
        this.f52976f = DesugarCollections.unmodifiableList(list3);
    }
}
