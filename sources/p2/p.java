package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f44089a;
    public final List f44090b;
    public final boolean f44091c;

    public p(String str, List list, boolean z10) {
        this.f44089a = str;
        this.f44090b = DesugarCollections.unmodifiableList(list);
        this.f44091c = z10;
    }
}
