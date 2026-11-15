package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f54507a;
    public final int f54508b;
    public final List f54509c;
    public final List d;
    public final List f54510e;
    public final List f54511f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f54507a = j3;
        this.f54508b = i7;
        this.f54509c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f54510e = DesugarCollections.unmodifiableList(list2);
        this.f54511f = DesugarCollections.unmodifiableList(list3);
    }
}
