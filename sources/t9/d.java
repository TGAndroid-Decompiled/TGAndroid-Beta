package t9;

import java.util.Date;
import java.util.HashMap;
import r9.g;

public final class d implements s9.a {

    public static final b f48141f;
    public static final b h;

    public final HashMap f48143a;

    public final HashMap f48144b;

    public final a f48145c;
    public boolean d;

    public static final a f48140e = new a(0);

    public static final c f48142n = new c();

    static {
        final int i10 = 0;
        f48141f = new r9.f() {
            @Override
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        h = new r9.f() {
            @Override
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f48143a = map;
        HashMap map2 = new HashMap();
        this.f48144b = map2;
        this.f48145c = f48140e;
        this.d = false;
        map2.put(String.class, f48141f);
        map.remove(String.class);
        map2.put(Boolean.class, h);
        map.remove(Boolean.class);
        map2.put(Date.class, f48142n);
        map.remove(Date.class);
    }

    @Override
    public final s9.a d(Class cls, r9.d dVar) {
        this.f48143a.put(cls, dVar);
        this.f48144b.remove(cls);
        return this;
    }
}
