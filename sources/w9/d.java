package w9;

import java.util.Date;
import java.util.HashMap;
import u9.g;
public final class d implements v9.a {
    public static final a f49473e = new a(0);
    public static final b f49474f = new u9.f() {
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
    public static final c f49475n = new Object();
    public final HashMap f49476a;
    public final HashMap f49477b;
    public final a f49478c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f49476a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f49477b = hashMap2;
        this.f49478c = f49473e;
        this.d = false;
        hashMap2.put(String.class, f49474f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f49475n);
        hashMap.remove(Date.class);
    }

    @Override
    public final v9.a b(Class cls, u9.d dVar) {
        this.f49476a.put(cls, dVar);
        this.f49477b.remove(cls);
        return this;
    }
}
