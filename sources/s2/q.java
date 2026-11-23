package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f56908a;
    public final List f56909b;
    public final boolean f56910c;

    public q(String str, List list, boolean z10) {
        this.f56908a = str;
        this.f56909b = DesugarCollections.unmodifiableList(list);
        this.f56910c = z10;
    }
}
