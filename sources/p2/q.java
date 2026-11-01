package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f44656a;
    public final List f44657b;
    public final boolean f44658c;

    public q(String str, List list, boolean z10) {
        this.f44656a = str;
        this.f44657b = DesugarCollections.unmodifiableList(list);
        this.f44658c = z10;
    }
}
