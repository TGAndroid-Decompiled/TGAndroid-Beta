package z7;

import java.util.Map;
public final class x implements ia.d {
    public static final x f51345b = new x(0);
    public static final x f51346c = new x(1);
    public final int f51347a;

    public x(int i10) {
        this.f51347a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f51347a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(y.f51363g, entry.getKey());
                eVar.a(y.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
