package v7;

import java.util.Map;
public final class i implements ia.d {
    public static final i f47468b = new i(0);
    public static final i f47469c = new i(1);
    public final int f47470a;

    public i(int i10) {
        this.f47470a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f47470a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(j.f47480g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
