package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f45157a;
    public final List f45158b;
    public final boolean f45159c;

    public p(String str, List list, boolean z10) {
        this.f45157a = str;
        this.f45158b = DesugarCollections.unmodifiableList(list);
        this.f45159c = z10;
    }
}
