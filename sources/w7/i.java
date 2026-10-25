package w7;

import java.util.Map;
public final class i implements ka.d {
    public static final i f50877b = new i(0);
    public static final i f50878c = new i(1);
    public final int f50879a;

    public i(int i10) {
        this.f50879a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f50879a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar = (ka.e) obj2;
                eVar.a(j.f50889g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                ka.e eVar2 = (ka.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
