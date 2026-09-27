package z7;

import java.util.Map;
public final class x implements ia.d {
    public static final x f48997b = new x(0);
    public static final x f48998c = new x(1);
    public final int f48999a;

    public x(int i10) {
        this.f48999a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f48999a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(y.f49014g, entry.getKey());
                eVar.a(y.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
