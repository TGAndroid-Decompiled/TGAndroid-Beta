package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f55153a;
    public final long f55154b;
    public final List f55155c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f55153a = str;
        this.f55154b = j3;
        this.f55155c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
