package u4;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class m implements n4.a {
    public final String f45064a;
    public final List f45065b;
    public final boolean f45066c;

    public m(String str, List list, boolean z4) {
        this.f45064a = str;
        this.f45065b = DesugarCollections.unmodifiableList(list);
        this.f45066c = z4;
    }
}
