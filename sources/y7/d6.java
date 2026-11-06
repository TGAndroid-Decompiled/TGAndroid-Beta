package y7;

import java.util.HashMap;
public final class d6 implements oa.a {
    public Object f58882a;
    public Object f58883b;
    public Object f58884c;

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f58882a).put(cls, dVar);
        ((HashMap) this.f58883b).remove(cls);
        return this;
    }
}
