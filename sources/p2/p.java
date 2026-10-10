package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f45313a;
    public final List f45314b;
    public final boolean f45315c;

    public p(String str, List list, boolean z10) {
        this.f45313a = str;
        this.f45314b = DesugarCollections.unmodifiableList(list);
        this.f45315c = z10;
    }
}
