package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements t2.a {
    public final String f44038a;
    public final List f44039b;
    public final boolean f44040c;

    public r(String str, List list, boolean z10) {
        this.f44038a = str;
        this.f44039b = DesugarCollections.unmodifiableList(list);
        this.f44040c = z10;
    }
}
