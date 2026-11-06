package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f52996a;
    public final int f52997b;
    public final List f52998c;
    public final List d;
    public final List f52999e;
    public final List f53000f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f52996a = j3;
        this.f52997b = i7;
        this.f52998c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f52999e = DesugarCollections.unmodifiableList(list2);
        this.f53000f = DesugarCollections.unmodifiableList(list3);
    }
}
