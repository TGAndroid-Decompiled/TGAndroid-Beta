package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements t2.a {
    public final String f44053a;
    public final List f44054b;
    public final boolean f44055c;

    public r(String str, List list, boolean z10) {
        this.f44053a = str;
        this.f44054b = DesugarCollections.unmodifiableList(list);
        this.f44055c = z10;
    }
}
