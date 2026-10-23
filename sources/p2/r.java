package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements t2.a {
    public final String f44039a;
    public final List f44040b;
    public final boolean f44041c;

    public r(String str, List list, boolean z10) {
        this.f44039a = str;
        this.f44040b = DesugarCollections.unmodifiableList(list);
        this.f44041c = z10;
    }
}
