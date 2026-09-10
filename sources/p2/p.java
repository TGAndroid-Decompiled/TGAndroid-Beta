package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f39621a;
    public final List f39622b;
    public final boolean f39623c;

    public p(String str, List list, boolean z10) {
        this.f39621a = str;
        this.f39622b = DesugarCollections.unmodifiableList(list);
        this.f39623c = z10;
    }
}
