package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;
public final class d implements oa.a {
    public static final a f53392e = new a(0);
    public static final b f53393f = new na.f() {
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
    public static final c f53394n = new Object();
    public final HashMap f53395a;
    public final HashMap f53396b;
    public final a f53397c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f53395a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f53396b = hashMap2;
        this.f53397c = f53392e;
        this.d = false;
        hashMap2.put(String.class, f53393f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f53394n);
        hashMap.remove(Date.class);
    }

    @Override
    public final oa.a b(Class cls, na.d dVar) {
        this.f53395a.put(cls, dVar);
        this.f53396b.remove(cls);
        return this;
    }
}
