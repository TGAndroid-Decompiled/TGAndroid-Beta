package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f45267a;
    public final List f45268b;
    public final boolean f45269c;

    public p(String str, List list, boolean z10) {
        this.f45267a = str;
        this.f45268b = DesugarCollections.unmodifiableList(list);
        this.f45269c = z10;
    }
}
