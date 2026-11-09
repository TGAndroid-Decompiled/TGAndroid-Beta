package y7;

import java.util.HashMap;
public final class d6 implements oa.a {
    public Object f59011a;
    public Object f59012b;
    public Object f59013c;

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f59011a).put(cls, dVar);
        ((HashMap) this.f59012b).remove(cls);
        return this;
    }
}
