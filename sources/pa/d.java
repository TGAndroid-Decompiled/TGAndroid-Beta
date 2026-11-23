package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;
public final class d implements oa.a {
    public static final a f55626e = new a(0);
    public static final b f55627f = new na.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).f((String) obj);
                    return;
                default:
                    ((g) obj2).g(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final b h = new na.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).f((String) obj);
                    return;
                default:
                    ((g) obj2).g(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final c f55628n = new Object();
    public final HashMap f55629a;
    public final HashMap f55630b;
    public final a f55631c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f55629a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f55630b = hashMap2;
        this.f55631c = f55626e;
        this.d = false;
        hashMap2.put(String.class, f55627f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f55628n);
        hashMap.remove(Date.class);
    }

    @Override
    public final oa.a c(Class cls, na.d dVar) {
        this.f55629a.put(cls, dVar);
        this.f55630b.remove(cls);
        return this;
    }
}
