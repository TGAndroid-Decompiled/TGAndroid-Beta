package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f43774a;
    public final List f43775b;
    public final boolean f43776c;

    public p(String str, List list, boolean z10) {
        this.f43774a = str;
        this.f43775b = DesugarCollections.unmodifiableList(list);
        this.f43776c = z10;
    }
}
