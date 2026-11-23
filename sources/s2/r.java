package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements w2.a {
    public final String f56989a;
    public final List f56990b;
    public final boolean f56991c;

    public r(String str, List list, boolean z10) {
        this.f56989a = str;
        this.f56990b = DesugarCollections.unmodifiableList(list);
        this.f56991c = z10;
    }
}
