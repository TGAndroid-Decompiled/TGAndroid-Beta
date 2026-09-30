package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f40862a;
    public final List f40863b;
    public final boolean f40864c;

    public p(String str, List list, boolean z10) {
        this.f40862a = str;
        this.f40863b = DesugarCollections.unmodifiableList(list);
        this.f40864c = z10;
    }
}
