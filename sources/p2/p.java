package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f40811a;
    public final List f40812b;
    public final boolean f40813c;

    public p(String str, List list, boolean z10) {
        this.f40811a = str;
        this.f40812b = DesugarCollections.unmodifiableList(list);
        this.f40813c = z10;
    }
}
