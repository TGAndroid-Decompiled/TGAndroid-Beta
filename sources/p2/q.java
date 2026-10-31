package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f44645a;
    public final List f44646b;
    public final boolean f44647c;

    public q(String str, List list, boolean z10) {
        this.f44645a = str;
        this.f44646b = DesugarCollections.unmodifiableList(list);
        this.f44647c = z10;
    }
}
