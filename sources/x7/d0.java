package x7;

import java.util.Map;
public final class d0 implements ja.d {
    public static final d0 f49334b = new d0(0);
    public static final d0 f49335c = new d0(1);
    public final int f49336a;

    public d0(int i10) {
        this.f49336a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f49336a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ja.e eVar = (ja.e) obj2;
                eVar.d(e0.f49352g, entry.getKey());
                eVar.d(e0.h, entry.getValue());
                return;
            default:
                ja.e eVar2 = (ja.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
