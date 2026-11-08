package y7;

import java.util.HashMap;
public final class d6 implements oa.a {
    public Object f59001a;
    public Object f59002b;
    public Object f59003c;

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f59001a).put(cls, dVar);
        ((HashMap) this.f59002b).remove(cls);
        return this;
    }
}
