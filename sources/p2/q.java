package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f46596a;
    public final List f46597b;
    public final boolean f46598c;

    public q(String str, List list, boolean z10) {
        this.f46596a = str;
        this.f46597b = DesugarCollections.unmodifiableList(list);
        this.f46598c = z10;
    }
}
