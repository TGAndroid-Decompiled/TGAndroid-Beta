package s4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f43979a;
    public final int f43980b;
    public final List f43981c;
    public final List d;
    public final List e;
    public final List f43982f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f43979a = j10;
        this.f43980b = i10;
        this.f43981c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f43982f = DesugarCollections.unmodifiableList(list3);
    }
}
