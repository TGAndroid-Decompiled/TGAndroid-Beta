package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;
public final class d implements oa.a {
    public static final a f53416e = new a(0);
    public static final b f53417f = new na.f() {
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
    public static final c f53418n = new Object();
    public final HashMap f53419a;
    public final HashMap f53420b;
    public final a f53421c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f53419a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f53420b = hashMap2;
        this.f53421c = f53416e;
        this.d = false;
        hashMap2.put(String.class, f53417f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f53418n);
        hashMap.remove(Date.class);
    }

    @Override
    public final oa.a b(Class cls, na.d dVar) {
        this.f53419a.put(cls, dVar);
        this.f53420b.remove(cls);
        return this;
    }
}
