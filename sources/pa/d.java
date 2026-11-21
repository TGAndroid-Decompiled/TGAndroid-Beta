package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;
public final class d implements oa.a {
    public static final a f55544e = new a(0);
    public static final b f55545f = new na.f() {
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
    public static final c f55546n = new Object();
    public final HashMap f55547a;
    public final HashMap f55548b;
    public final a f55549c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f55547a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f55548b = hashMap2;
        this.f55549c = f55544e;
        this.d = false;
        hashMap2.put(String.class, f55545f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f55546n);
        hashMap.remove(Date.class);
    }

    @Override
    public final oa.a b(Class cls, na.d dVar) {
        this.f55547a.put(cls, dVar);
        this.f55548b.remove(cls);
        return this;
    }
}
