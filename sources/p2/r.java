package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements t2.a {
    public final String f44073a;
    public final List f44074b;
    public final boolean f44075c;

    public r(String str, List list, boolean z10) {
        this.f44073a = str;
        this.f44074b = DesugarCollections.unmodifiableList(list);
        this.f44075c = z10;
    }
}
