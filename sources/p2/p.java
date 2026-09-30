package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f40765a;
    public final List f40766b;
    public final boolean f40767c;

    public p(String str, List list, boolean z10) {
        this.f40765a = str;
        this.f40766b = DesugarCollections.unmodifiableList(list);
        this.f40767c = z10;
    }
}
