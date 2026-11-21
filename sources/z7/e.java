package z7;

import java.util.Map;
public final class e implements na.d {
    public static final e f61557b = new e(0);
    public static final e f61558c = new e(1);
    public final int f61559a;

    public e(int i7) {
        this.f61559a = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f61559a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(f.f61569g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                na.e eVar2 = (na.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
