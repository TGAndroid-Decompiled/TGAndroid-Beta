package y7;

import java.util.HashMap;
public final class d6 implements oa.a {
    public Object f59002a;
    public Object f59003b;
    public Object f59004c;

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f59002a).put(cls, dVar);
        ((HashMap) this.f59003b).remove(cls);
        return this;
    }
}
