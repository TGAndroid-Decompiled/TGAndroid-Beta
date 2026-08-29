package p4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final int f45531a;
    public final int f45532b;
    public final List f45533c;
    public final List d;
    public final List f45534e;
    public final List f45535f;

    public a(int i10, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.f45531a = i10;
        this.f45532b = i11;
        this.f45533c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f45534e = DesugarCollections.unmodifiableList(list2);
        this.f45535f = DesugarCollections.unmodifiableList(list3);
    }
}
