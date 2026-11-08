package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f53126a;
    public final long f53127b;
    public final List f53128c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f53126a = str;
        this.f53127b = j3;
        this.f53128c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
