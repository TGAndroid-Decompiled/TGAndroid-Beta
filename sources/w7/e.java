package w7;

import java.util.Map;
public final class e implements ja.d {
    public static final e f48619b = new e(0);
    public static final e f48620c = new e(1);
    public final int f48621a;

    public e(int i10) {
        this.f48621a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f48621a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ja.e eVar = (ja.e) obj2;
                eVar.d(f.f48635g, entry.getKey());
                eVar.d(f.h, entry.getValue());
                return;
            default:
                ja.e eVar2 = (ja.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
