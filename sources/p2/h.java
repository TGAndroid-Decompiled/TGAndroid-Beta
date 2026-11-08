package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f53125a;
    public final long f53126b;
    public final List f53127c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f53125a = str;
        this.f53126b = j3;
        this.f53127c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
