package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f43747a;
    public final List f43748b;
    public final boolean f43749c;

    public p(String str, List list, boolean z10) {
        this.f43747a = str;
        this.f43748b = DesugarCollections.unmodifiableList(list);
        this.f43749c = z10;
    }
}
