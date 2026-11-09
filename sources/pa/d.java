package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;
public final class d implements oa.a {
    public static final a f53522e = new a(0);
    public static final b f53523f = new na.f() {
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
    public static final c f53524n = new Object();
    public final HashMap f53525a;
    public final HashMap f53526b;
    public final a f53527c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f53525a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f53526b = hashMap2;
        this.f53527c = f53522e;
        this.d = false;
        hashMap2.put(String.class, f53523f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f53524n);
        hashMap.remove(Date.class);
    }

    @Override
    public final oa.a b(Class cls, na.d dVar) {
        this.f53525a.put(cls, dVar);
        this.f53526b.remove(cls);
        return this;
    }
}
