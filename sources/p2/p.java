package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f40764a;
    public final List f40765b;
    public final boolean f40766c;

    public p(String str, List list, boolean z10) {
        this.f40764a = str;
        this.f40765b = DesugarCollections.unmodifiableList(list);
        this.f40766c = z10;
    }
}
