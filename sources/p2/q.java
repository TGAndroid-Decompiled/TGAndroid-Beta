package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements t2.a {
    public final String f40523a;
    public final List f40524b;
    public final boolean f40525c;

    public q(String str, List list, boolean z10) {
        this.f40523a = str;
        this.f40524b = DesugarCollections.unmodifiableList(list);
        this.f40525c = z10;
    }
}
