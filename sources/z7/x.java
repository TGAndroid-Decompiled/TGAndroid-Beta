package z7;

import java.util.Map;
public final class x implements ia.d {
    public static final x f48710b = new x(0);
    public static final x f48711c = new x(1);
    public final int f48712a;

    public x(int i10) {
        this.f48712a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f48712a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(y.f48727g, entry.getKey());
                eVar.a(y.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
