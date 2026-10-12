package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f42943a;
    public final List f42944b;
    public final boolean f42945c;

    public q(String str, List list, boolean z10) {
        this.f42943a = str;
        this.f42944b = DesugarCollections.unmodifiableList(list);
        this.f42945c = z10;
    }
}
