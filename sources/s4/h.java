package s4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f44075a;
    public final long f44076b;
    public final List f44077c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f44075a = str;
        this.f44076b = j10;
        this.f44077c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
