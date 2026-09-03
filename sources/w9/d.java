package w9;

import java.util.Date;
import java.util.HashMap;
import u9.g;
public final class d implements v9.a {
    public static final a e = new a(0);
    public static final b f46578f = new u9.f() {
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
    public static final b h = new u9.f() {
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
    public static final c f46579n = new Object();
    public final HashMap f46580a;
    public final HashMap f46581b;
    public final a f46582c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f46580a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f46581b = hashMap2;
        this.f46582c = e;
        this.d = false;
        hashMap2.put(String.class, f46578f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f46579n);
        hashMap.remove(Date.class);
    }

    @Override
    public final v9.a b(Class cls, u9.d dVar) {
        this.f46580a.put(cls, dVar);
        this.f46581b.remove(cls);
        return this;
    }
}
