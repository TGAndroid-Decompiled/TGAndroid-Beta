package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f55122a;
    public final long f55123b;
    public final List f55124c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f55122a = str;
        this.f55123b = j3;
        this.f55124c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
