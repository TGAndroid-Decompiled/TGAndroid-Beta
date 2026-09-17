package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f43748a;
    public final List f43749b;
    public final boolean f43750c;

    public p(String str, List list, boolean z10) {
        this.f43748a = str;
        this.f43749b = DesugarCollections.unmodifiableList(list);
        this.f43750c = z10;
    }
}
