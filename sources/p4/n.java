package p4;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class n implements i4.a {
    public final String f45426a;
    public final List f45427b;
    public final boolean f45428c;

    public n(String str, List list, boolean z10) {
        this.f45426a = str;
        this.f45427b = DesugarCollections.unmodifiableList(list);
        this.f45428c = z10;
    }
}
