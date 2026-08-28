package s9;

import java.util.Date;
import java.util.HashMap;
import q9.g;
public final class d implements r9.a {
    public static final a f47491e = new a(0);
    public static final b f47492f = new q9.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).e((String) obj);
                    return;
                default:
                    ((g) obj2).f(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final b h = new q9.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).e((String) obj);
                    return;
                default:
                    ((g) obj2).f(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final c f47493n = new Object();
    public final HashMap f47494a;
    public final HashMap f47495b;
    public final a f47496c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f47494a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f47495b = hashMap2;
        this.f47496c = f47491e;
        this.d = false;
        hashMap2.put(String.class, f47492f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f47493n);
        hashMap.remove(Date.class);
    }

    @Override
    public final r9.a l(Class cls, q9.d dVar) {
        this.f47494a.put(cls, dVar);
        this.f47495b.remove(cls);
        return this;
    }
}
