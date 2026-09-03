package s4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f47006a;
    public final long f47007b;
    public final List f47008c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f47006a = str;
        this.f47007b = j10;
        this.f47008c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
