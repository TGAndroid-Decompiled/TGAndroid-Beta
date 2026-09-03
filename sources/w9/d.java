package w9;

import java.util.Date;
import java.util.HashMap;
import u9.g;
public final class d implements v9.a {
    public static final a f49509e = new a(0);
    public static final b f49510f = new u9.f() {
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
    public static final c f49511n = new Object();
    public final HashMap f49512a;
    public final HashMap f49513b;
    public final a f49514c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f49512a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f49513b = hashMap2;
        this.f49514c = f49509e;
        this.d = false;
        hashMap2.put(String.class, f49510f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f49511n);
        hashMap.remove(Date.class);
    }

    @Override
    public final v9.a b(Class cls, u9.d dVar) {
        this.f49512a.put(cls, dVar);
        this.f49513b.remove(cls);
        return this;
    }
}
