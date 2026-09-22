package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f40492a;
    public final List f40493b;
    public final boolean f40494c;

    public q(String str, List list, boolean z10) {
        this.f40492a = str;
        this.f40493b = DesugarCollections.unmodifiableList(list);
        this.f40494c = z10;
    }
}
