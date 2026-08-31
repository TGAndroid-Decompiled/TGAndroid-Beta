package s4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f46940a;
    public final int f46941b;
    public final List f46942c;
    public final List d;
    public final List f46943e;
    public final List f46944f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f46940a = j10;
        this.f46941b = i10;
        this.f46942c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f46943e = DesugarCollections.unmodifiableList(list2);
        this.f46944f = DesugarCollections.unmodifiableList(list3);
    }
}
