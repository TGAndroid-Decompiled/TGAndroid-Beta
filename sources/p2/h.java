package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f53138a;
    public final long f53139b;
    public final List f53140c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f53138a = str;
        this.f53139b = j3;
        this.f53140c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
