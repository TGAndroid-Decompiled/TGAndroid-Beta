package r2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements v2.a {
    public final String f54189a;
    public final List f54190b;
    public final boolean f54191c;

    public q(String str, List list, boolean z10) {
        this.f54189a = str;
        this.f54190b = DesugarCollections.unmodifiableList(list);
        this.f54191c = z10;
    }
}
