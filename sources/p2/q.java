package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f40447a;
    public final List f40448b;
    public final boolean f40449c;

    public q(String str, List list, boolean z10) {
        this.f40447a = str;
        this.f40448b = DesugarCollections.unmodifiableList(list);
        this.f40449c = z10;
    }
}
