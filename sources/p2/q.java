package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f40496a;
    public final List f40497b;
    public final boolean f40498c;

    public q(String str, List list, boolean z10) {
        this.f40496a = str;
        this.f40497b = DesugarCollections.unmodifiableList(list);
        this.f40498c = z10;
    }
}
