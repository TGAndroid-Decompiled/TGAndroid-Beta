package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f55112a;
    public final long f55113b;
    public final List f55114c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f55112a = str;
        this.f55113b = j3;
        this.f55114c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
