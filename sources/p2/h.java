package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f55157a;
    public final long f55158b;
    public final List f55159c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f55157a = str;
        this.f55158b = j3;
        this.f55159c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
