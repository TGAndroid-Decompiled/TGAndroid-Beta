package y7;

import java.util.HashMap;
public final class d6 implements oa.a {
    public Object f58907a;
    public Object f58908b;
    public Object f58909c;

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f58907a).put(cls, dVar);
        ((HashMap) this.f58908b).remove(cls);
        return this;
    }
}
