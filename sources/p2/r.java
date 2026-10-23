package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements t2.a {
    public final String f44454a;
    public final List f44455b;
    public final boolean f44456c;

    public r(String str, List list, boolean z10) {
        this.f44454a = str;
        this.f44455b = DesugarCollections.unmodifiableList(list);
        this.f44456c = z10;
    }
}
