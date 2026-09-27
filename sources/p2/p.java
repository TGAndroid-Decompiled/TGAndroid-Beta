package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f40761a;
    public final List f40762b;
    public final boolean f40763c;

    public p(String str, List list, boolean z10) {
        this.f40761a = str;
        this.f40762b = DesugarCollections.unmodifiableList(list);
        this.f40763c = z10;
    }
}
