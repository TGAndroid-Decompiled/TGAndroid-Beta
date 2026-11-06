package y7;

import java.util.HashMap;
public final class d6 implements oa.a {
    public Object f58906a;
    public Object f58907b;
    public Object f58908c;

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f58906a).put(cls, dVar);
        ((HashMap) this.f58907b).remove(cls);
        return this;
    }
}
