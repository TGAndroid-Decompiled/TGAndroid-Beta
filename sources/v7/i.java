package v7;

import java.util.Map;
public final class i implements ja.d {
    public static final i f48044b = new i(0);
    public static final i f48045c = new i(1);
    public final int f48046a;

    public i(int i10) {
        this.f48046a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f48046a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ja.e eVar = (ja.e) obj2;
                eVar.d(j.f48056g, entry.getKey());
                eVar.d(j.h, entry.getValue());
                return;
            default:
                ja.e eVar2 = (ja.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
