package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f44030a;
    public final List f44031b;
    public final boolean f44032c;

    public q(String str, List list, boolean z10) {
        this.f44030a = str;
        this.f44031b = DesugarCollections.unmodifiableList(list);
        this.f44032c = z10;
    }
}
