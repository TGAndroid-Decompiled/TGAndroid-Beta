package v7;

import java.util.Map;
public final class i implements ia.d {
    public static final i f44278b = new i(0);
    public static final i f44279c = new i(1);
    public final int f44280a;

    public i(int i10) {
        this.f44280a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f44280a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(k.f44298g, entry.getKey());
                eVar.a(k.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
