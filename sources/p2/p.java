package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f44096a;
    public final List f44097b;
    public final boolean f44098c;

    public p(String str, List list, boolean z10) {
        this.f44096a = str;
        this.f44097b = DesugarCollections.unmodifiableList(list);
        this.f44098c = z10;
    }
}
