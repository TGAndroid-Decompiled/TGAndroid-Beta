package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f56873a;
    public final List f56874b;
    public final boolean f56875c;

    public q(String str, List list, boolean z10) {
        this.f56873a = str;
        this.f56874b = DesugarCollections.unmodifiableList(list);
        this.f56875c = z10;
    }
}
