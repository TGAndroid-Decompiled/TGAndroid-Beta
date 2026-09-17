package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f40518a;
    public final List f40519b;
    public final boolean f40520c;

    public q(String str, List list, boolean z10) {
        this.f40518a = str;
        this.f40519b = DesugarCollections.unmodifiableList(list);
        this.f40520c = z10;
    }
}
