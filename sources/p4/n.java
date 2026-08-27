package p4;

import j$.util.DesugarCollections;
import java.util.List;

public abstract class n implements i4.a {

    public final String f45432a;

    public final List f45433b;

    public final boolean f45434c;

    public n(String str, List list, boolean z10) {
        this.f45432a = str;
        this.f45433b = DesugarCollections.unmodifiableList(list);
        this.f45434c = z10;
    }
}
