package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class p implements t2.a {
    public final String f45269a;
    public final List f45270b;
    public final boolean f45271c;

    public p(String str, List list, boolean z10) {
        this.f45269a = str;
        this.f45270b = DesugarCollections.unmodifiableList(list);
        this.f45271c = z10;
    }
}
