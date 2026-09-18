package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f40749a;
    public final List f40750b;
    public final boolean f40751c;

    public p(String str, List list, boolean z10) {
        this.f40749a = str;
        this.f40750b = DesugarCollections.unmodifiableList(list);
        this.f40751c = z10;
    }
}
