package u9;

import java.util.Date;
import java.util.HashMap;
import s9.g;
public final class d implements t9.a {
    public static final a f49152e = new a(0);
    public static final b f49153f = new s9.f() {
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
    public static final b h = new s9.f() {
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
    public static final c f49154n = new Object();
    public final HashMap f49155a;
    public final HashMap f49156b;
    public final a f49157c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f49155a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f49156b = hashMap2;
        this.f49157c = f49152e;
        this.d = false;
        hashMap2.put(String.class, f49153f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f49154n);
        hashMap.remove(Date.class);
    }

    @Override
    public final t9.a i(Class cls, s9.d dVar) {
        this.f49155a.put(cls, dVar);
        this.f49156b.remove(cls);
        return this;
    }
}
