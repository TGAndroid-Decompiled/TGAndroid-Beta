package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f45337a;
    public final List f45338b;
    public final boolean f45339c;

    public p(String str, List list, boolean z10) {
        this.f45337a = str;
        this.f45338b = DesugarCollections.unmodifiableList(list);
        this.f45339c = z10;
    }
}
