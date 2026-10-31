package w7;

import java.util.Map;
public final class e implements ja.d {
    public static final e f52498b = new e(0);
    public static final e f52499c = new e(1);
    public final int f52500a;

    public e(int i10) {
        this.f52500a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f52500a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ja.e eVar = (ja.e) obj2;
                eVar.d(f.f52507g, entry.getKey());
                eVar.d(f.h, entry.getValue());
                return;
            default:
                ja.e eVar2 = (ja.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
