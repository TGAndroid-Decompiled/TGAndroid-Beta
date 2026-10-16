package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f42643a;
    public final List f42644b;
    public final boolean f42645c;

    public q(String str, List list, boolean z10) {
        this.f42643a = str;
        this.f42644b = DesugarCollections.unmodifiableList(list);
        this.f42645c = z10;
    }
}
