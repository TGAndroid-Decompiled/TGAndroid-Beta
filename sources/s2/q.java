package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f56904a;
    public final List f56905b;
    public final boolean f56906c;

    public q(String str, List list, boolean z10) {
        this.f56904a = str;
        this.f56905b = DesugarCollections.unmodifiableList(list);
        this.f56906c = z10;
    }
}
