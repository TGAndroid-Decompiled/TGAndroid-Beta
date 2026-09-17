package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f43775a;
    public final List f43776b;
    public final boolean f43777c;

    public p(String str, List list, boolean z10) {
        this.f43775a = str;
        this.f43776b = DesugarCollections.unmodifiableList(list);
        this.f43777c = z10;
    }
}
