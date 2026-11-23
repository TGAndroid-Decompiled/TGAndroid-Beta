package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f55202a;
    public final int f55203b;
    public final List f55204c;
    public final List d;
    public final List f55205e;
    public final List f55206f;

    public a(long j3, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f55202a = j3;
        this.f55203b = i7;
        this.f55204c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f55205e = DesugarCollections.unmodifiableList(list2);
        this.f55206f = DesugarCollections.unmodifiableList(list3);
    }
}
