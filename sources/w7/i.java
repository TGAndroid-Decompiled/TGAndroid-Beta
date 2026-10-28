package w7;

import java.util.Map;
public final class i implements ka.d {
    public static final i f50938b = new i(0);
    public static final i f50939c = new i(1);
    public final int f50940a;

    public i(int i10) {
        this.f50940a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f50940a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar = (ka.e) obj2;
                eVar.a(j.f50950g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                ka.e eVar2 = (ka.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
