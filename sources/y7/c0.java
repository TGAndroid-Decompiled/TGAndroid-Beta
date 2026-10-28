package y7;

import java.util.Map;
public final class c0 implements ka.d {
    public static final c0 f52147b = new c0(0);
    public static final c0 f52148c = new c0(1);
    public final int f52149a;

    public c0(int i10) {
        this.f52149a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f52149a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar = (ka.e) obj2;
                eVar.a(d0.f52168g, entry.getKey());
                eVar.a(d0.h, entry.getValue());
                return;
            default:
                ka.e eVar2 = (ka.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
