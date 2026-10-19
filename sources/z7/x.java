package z7;

import java.util.Map;
public final class x implements ja.d {
    public static final x f51224b = new x(0);
    public static final x f51225c = new x(1);
    public final int f51226a;

    public x(int i10) {
        this.f51226a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f51226a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ja.e eVar = (ja.e) obj2;
                eVar.d(y.f51256g, entry.getKey());
                eVar.d(y.h, entry.getValue());
                return;
            default:
                ja.e eVar2 = (ja.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
