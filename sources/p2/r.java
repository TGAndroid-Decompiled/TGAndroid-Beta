package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements t2.a {
    public final String f44027a;
    public final List f44028b;
    public final boolean f44029c;

    public r(String str, List list, boolean z10) {
        this.f44027a = str;
        this.f44028b = DesugarCollections.unmodifiableList(list);
        this.f44029c = z10;
    }
}
