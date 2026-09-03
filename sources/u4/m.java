package u4;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class m implements n4.a {
    public final String f48350a;
    public final List f48351b;
    public final boolean f48352c;

    public m(String str, List list, boolean z4) {
        this.f48350a = str;
        this.f48351b = DesugarCollections.unmodifiableList(list);
        this.f48352c = z4;
    }
}
