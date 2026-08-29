package r4;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class n implements k4.a {
    public final String f47007a;
    public final List f47008b;
    public final boolean f47009c;

    public n(String str, List list, boolean z10) {
        this.f47007a = str;
        this.f47008b = DesugarCollections.unmodifiableList(list);
        this.f47009c = z10;
    }
}
