package v7;

import java.util.Map;
public final class i implements ia.d {
    public static final i f44293b = new i(0);
    public static final i f44294c = new i(1);
    public final int f44295a;

    public i(int i10) {
        this.f44295a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f44295a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(j.f44305g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
