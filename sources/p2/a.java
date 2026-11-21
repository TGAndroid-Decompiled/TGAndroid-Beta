package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f55117a;
    public final int f55118b;
    public final List f55119c;
    public final List d;
    public final List f55120e;
    public final List f55121f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f55117a = j3;
        this.f55118b = i7;
        this.f55119c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f55120e = DesugarCollections.unmodifiableList(list2);
        this.f55121f = DesugarCollections.unmodifiableList(list3);
    }
}
