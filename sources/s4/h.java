package s4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f44010a;
    public final long f44011b;
    public final List f44012c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f44010a = str;
        this.f44011b = j10;
        this.f44012c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
