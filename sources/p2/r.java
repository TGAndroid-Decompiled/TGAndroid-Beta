package p2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class r implements t2.a {
    public final String f44035a;
    public final List f44036b;
    public final boolean f44037c;

    public r(String str, List list, boolean z10) {
        this.f44035a = str;
        this.f44036b = DesugarCollections.unmodifiableList(list);
        this.f44037c = z10;
    }
}
