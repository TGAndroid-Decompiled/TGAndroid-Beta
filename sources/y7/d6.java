package y7;

import java.util.HashMap;
public final class d6 implements oa.a {
    public Object f58912a;
    public Object f58913b;
    public Object f58914c;

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f58912a).put(cls, dVar);
        ((HashMap) this.f58913b).remove(cls);
        return this;
    }
}
