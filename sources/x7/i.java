package x7;

import java.util.Map;
public final class i implements ma.d {
    public static final i f58312b = new i(0);
    public static final i f58313c = new i(1);
    public final int f58314a;

    public i(int i3) {
        this.f58314a = i3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f58314a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ma.e eVar = (ma.e) obj2;
                eVar.a(j.f58327g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                ma.e eVar2 = (ma.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
