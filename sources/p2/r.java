package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements t2.a {
    public final String f44453a;
    public final List f44454b;
    public final boolean f44455c;

    public r(String str, List list, boolean z10) {
        this.f44453a = str;
        this.f44454b = DesugarCollections.unmodifiableList(list);
        this.f44455c = z10;
    }
}
