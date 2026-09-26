package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f40763a;
    public final List f40764b;
    public final boolean f40765c;

    public p(String str, List list, boolean z10) {
        this.f40763a = str;
        this.f40764b = DesugarCollections.unmodifiableList(list);
        this.f40765c = z10;
    }
}
