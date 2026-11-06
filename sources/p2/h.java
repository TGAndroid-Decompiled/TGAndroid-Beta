package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f53034a;
    public final long f53035b;
    public final List f53036c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f53034a = str;
        this.f53035b = j3;
        this.f53036c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
