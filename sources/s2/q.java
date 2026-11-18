package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f56863a;
    public final List f56864b;
    public final boolean f56865c;

    public q(String str, List list, boolean z10) {
        this.f56863a = str;
        this.f56864b = DesugarCollections.unmodifiableList(list);
        this.f56865c = z10;
    }
}
