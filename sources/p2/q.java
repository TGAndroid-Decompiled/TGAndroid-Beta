package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f46631a;
    public final List f46632b;
    public final boolean f46633c;

    public q(String str, List list, boolean z10) {
        this.f46631a = str;
        this.f46632b = DesugarCollections.unmodifiableList(list);
        this.f46633c = z10;
    }
}
