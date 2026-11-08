package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f54723a;
    public final List f54724b;
    public final boolean f54725c;

    public q(String str, List list, boolean z9) {
        this.f54723a = str;
        this.f54724b = DesugarCollections.unmodifiableList(list);
        this.f54725c = z9;
    }
}
