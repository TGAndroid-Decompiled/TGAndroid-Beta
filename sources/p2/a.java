package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f53102a;
    public final int f53103b;
    public final List f53104c;
    public final List d;
    public final List f53105e;
    public final List f53106f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f53102a = j3;
        this.f53103b = i7;
        this.f53104c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f53105e = DesugarCollections.unmodifiableList(list2);
        this.f53106f = DesugarCollections.unmodifiableList(list3);
    }
}
