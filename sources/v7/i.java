package v7;

import java.util.Map;
public final class i implements ia.d {
    public static final i f49212b = new i(0);
    public static final i f49213c = new i(1);
    public final int f49214a;

    public i(int i10) {
        this.f49214a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f49214a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(j.f49230g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
