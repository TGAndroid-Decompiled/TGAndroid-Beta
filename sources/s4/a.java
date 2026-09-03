package s4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f44044a;
    public final int f44045b;
    public final List f44046c;
    public final List d;
    public final List e;
    public final List f44047f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f44044a = j10;
        this.f44045b = i10;
        this.f44046c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f44047f = DesugarCollections.unmodifiableList(list3);
    }
}
