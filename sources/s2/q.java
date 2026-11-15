package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f56289a;
    public final List f56290b;
    public final boolean f56291c;

    public q(String str, List list, boolean z10) {
        this.f56289a = str;
        this.f56290b = DesugarCollections.unmodifiableList(list);
        this.f56291c = z10;
    }
}
