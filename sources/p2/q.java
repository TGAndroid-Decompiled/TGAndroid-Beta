package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f45152a;
    public final List f45153b;
    public final boolean f45154c;

    public q(String str, List list, boolean z10) {
        this.f45152a = str;
        this.f45153b = DesugarCollections.unmodifiableList(list);
        this.f45154c = z10;
    }
}
