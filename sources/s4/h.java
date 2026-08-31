package s4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f46975a;
    public final long f46976b;
    public final List f46977c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f46975a = str;
        this.f46976b = j10;
        this.f46977c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
