package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;
public final class d implements oa.a {
    public static final a f54927e = new a(0);
    public static final b f54928f = new na.f() {
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
    public static final c f54929n = new Object();
    public final HashMap f54930a;
    public final HashMap f54931b;
    public final a f54932c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f54930a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f54931b = hashMap2;
        this.f54932c = f54927e;
        this.d = false;
        hashMap2.put(String.class, f54928f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f54929n);
        hashMap.remove(Date.class);
    }

    @Override
    public final oa.a b(Class cls, na.d dVar) {
        this.f54930a.put(cls, dVar);
        this.f54931b.remove(cls);
        return this;
    }
}
