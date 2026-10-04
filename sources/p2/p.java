package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f44088a;
    public final List f44089b;
    public final boolean f44090c;

    public p(String str, List list, boolean z10) {
        this.f44088a = str;
        this.f44089b = DesugarCollections.unmodifiableList(list);
        this.f44090c = z10;
    }
}
