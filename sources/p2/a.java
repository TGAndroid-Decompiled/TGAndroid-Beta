package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f53089a;
    public final int f53090b;
    public final List f53091c;
    public final List d;
    public final List f53092e;
    public final List f53093f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f53089a = j3;
        this.f53090b = i7;
        this.f53091c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f53092e = DesugarCollections.unmodifiableList(list2);
        this.f53093f = DesugarCollections.unmodifiableList(list3);
    }
}
