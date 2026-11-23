package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f55238a;
    public final long f55239b;
    public final List f55240c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f55238a = str;
        this.f55239b = j3;
        this.f55240c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
