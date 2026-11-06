package z7;

import java.util.Map;
public final class e implements na.d {
    public static final e f59645b = new e(0);
    public static final e f59646c = new e(1);
    public final int f59647a;

    public e(int i7) {
        this.f59647a = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f59647a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(f.f59657g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                na.e eVar2 = (na.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
