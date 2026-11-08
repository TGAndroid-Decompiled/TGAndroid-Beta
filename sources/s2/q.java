package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f54724a;
    public final List f54725b;
    public final boolean f54726c;

    public q(String str, List list, boolean z9) {
        this.f54724a = str;
        this.f54725b = DesugarCollections.unmodifiableList(list);
        this.f54726c = z9;
    }
}
