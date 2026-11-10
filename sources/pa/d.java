package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;
public final class d implements oa.a {
    public static final a f53521e = new a(0);
    public static final b f53522f = new na.f() {
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
    public static final c f53523n = new Object();
    public final HashMap f53524a;
    public final HashMap f53525b;
    public final a f53526c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f53524a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f53525b = hashMap2;
        this.f53526c = f53521e;
        this.d = false;
        hashMap2.put(String.class, f53522f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f53523n);
        hashMap.remove(Date.class);
    }

    @Override
    public final oa.a b(Class cls, na.d dVar) {
        this.f53524a.put(cls, dVar);
        this.f53525b.remove(cls);
        return this;
    }
}
