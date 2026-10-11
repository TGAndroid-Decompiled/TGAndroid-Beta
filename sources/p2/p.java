package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f45303a;
    public final List f45304b;
    public final boolean f45305c;

    public p(String str, List list, boolean z10) {
        this.f45303a = str;
        this.f45304b = DesugarCollections.unmodifiableList(list);
        this.f45305c = z10;
    }
}
