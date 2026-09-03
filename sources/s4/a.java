package s4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f46971a;
    public final int f46972b;
    public final List f46973c;
    public final List d;
    public final List f46974e;
    public final List f46975f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f46971a = j10;
        this.f46972b = i10;
        this.f46973c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f46974e = DesugarCollections.unmodifiableList(list2);
        this.f46975f = DesugarCollections.unmodifiableList(list3);
    }
}
