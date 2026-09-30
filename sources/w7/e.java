package w7;

import java.util.Map;
public final class e implements ia.d {
    public static final e f45021b = new e(0);
    public static final e f45022c = new e(1);
    public final int f45023a;

    public e(int i10) {
        this.f45023a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f45023a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(f.f45035g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
