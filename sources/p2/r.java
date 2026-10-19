package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements t2.a {
    public final String f44025a;
    public final List f44026b;
    public final boolean f44027c;

    public r(String str, List list, boolean z10) {
        this.f44025a = str;
        this.f44026b = DesugarCollections.unmodifiableList(list);
        this.f44027c = z10;
    }
}
