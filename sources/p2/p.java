package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f40762a;
    public final List f40763b;
    public final boolean f40764c;

    public p(String str, List list, boolean z10) {
        this.f40762a = str;
        this.f40763b = DesugarCollections.unmodifiableList(list);
        this.f40764c = z10;
    }
}
