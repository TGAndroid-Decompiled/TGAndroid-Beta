package v7;

import java.util.Map;
public final class i implements ia.d {
    public static final i f47497b = new i(0);
    public static final i f47498c = new i(1);
    public final int f47499a;

    public i(int i10) {
        this.f47499a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f47499a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(j.f47509g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
