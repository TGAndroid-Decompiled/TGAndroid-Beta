package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f52998a;
    public final int f52999b;
    public final List f53000c;
    public final List d;
    public final List f53001e;
    public final List f53002f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f52998a = j3;
        this.f52999b = i7;
        this.f53000c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f53001e = DesugarCollections.unmodifiableList(list2);
        this.f53002f = DesugarCollections.unmodifiableList(list3);
    }
}
