package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f40790a;
    public final List f40791b;
    public final boolean f40792c;

    public p(String str, List list, boolean z10) {
        this.f40790a = str;
        this.f40791b = DesugarCollections.unmodifiableList(list);
        this.f40792c = z10;
    }
}
