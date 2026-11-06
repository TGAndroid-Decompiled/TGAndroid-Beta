package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f53008a;
    public final long f53009b;
    public final List f53010c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f53008a = str;
        this.f53009b = j3;
        this.f53010c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
