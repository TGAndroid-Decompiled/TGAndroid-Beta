package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;
public final class d implements oa.a {
    public static final a f53418e = new a(0);
    public static final b f53419f = new na.f() {
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
    public static final c f53420n = new Object();
    public final HashMap f53421a;
    public final HashMap f53422b;
    public final a f53423c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f53421a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f53422b = hashMap2;
        this.f53423c = f53418e;
        this.d = false;
        hashMap2.put(String.class, f53419f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f53420n);
        hashMap.remove(Date.class);
    }

    @Override
    public final oa.a b(Class cls, na.d dVar) {
        this.f53421a.put(cls, dVar);
        this.f53422b.remove(cls);
        return this;
    }
}
