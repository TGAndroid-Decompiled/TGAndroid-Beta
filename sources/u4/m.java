package u4;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class m implements n4.a {
    public final String f45126a;
    public final List f45127b;
    public final boolean f45128c;

    public m(String str, List list, boolean z4) {
        this.f45126a = str;
        this.f45127b = DesugarCollections.unmodifiableList(list);
        this.f45128c = z4;
    }
}
