package u4;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class m implements n4.a {
    public final String f48314a;
    public final List f48315b;
    public final boolean f48316c;

    public m(String str, List list, boolean z4) {
        this.f48314a = str;
        this.f48315b = DesugarCollections.unmodifiableList(list);
        this.f48316c = z4;
    }
}
