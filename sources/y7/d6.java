package y7;

import java.util.HashMap;
public final class d6 implements oa.a {
    public Object f59009a;
    public Object f59010b;
    public Object f59011c;

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f59009a).put(cls, dVar);
        ((HashMap) this.f59010b).remove(cls);
        return this;
    }
}
