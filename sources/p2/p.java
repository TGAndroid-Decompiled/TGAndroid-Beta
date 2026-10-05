package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f44103a;
    public final List f44104b;
    public final boolean f44105c;

    public p(String str, List list, boolean z10) {
        this.f44103a = str;
        this.f44104b = DesugarCollections.unmodifiableList(list);
        this.f44105c = z10;
    }
}
