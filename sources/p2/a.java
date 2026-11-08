package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f53090a;
    public final int f53091b;
    public final List f53092c;
    public final List d;
    public final List f53093e;
    public final List f53094f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f53090a = j3;
        this.f53091b = i7;
        this.f53092c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f53093e = DesugarCollections.unmodifiableList(list2);
        this.f53094f = DesugarCollections.unmodifiableList(list3);
    }
}
