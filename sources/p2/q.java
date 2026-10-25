package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f46593a;
    public final List f46594b;
    public final boolean f46595c;

    public q(String str, List list, boolean z10) {
        this.f46593a = str;
        this.f46594b = DesugarCollections.unmodifiableList(list);
        this.f46595c = z10;
    }
}
