package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;
public final class d implements oa.a {
    public static final a f55503e = new a(0);
    public static final b f55504f = new na.f() {
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
    public static final c f55505n = new Object();
    public final HashMap f55506a;
    public final HashMap f55507b;
    public final a f55508c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f55506a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f55507b = hashMap2;
        this.f55508c = f55503e;
        this.d = false;
        hashMap2.put(String.class, f55504f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f55505n);
        hashMap.remove(Date.class);
    }

    @Override
    public final oa.a b(Class cls, na.d dVar) {
        this.f55506a.put(cls, dVar);
        this.f55507b.remove(cls);
        return this;
    }
}
