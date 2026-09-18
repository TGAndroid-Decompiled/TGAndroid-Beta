package w7;

import java.util.Map;
public final class e implements ia.d {
    public static final e f44886b = new e(0);
    public static final e f44887c = new e(1);
    public final int f44888a;

    public e(int i10) {
        this.f44888a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f44888a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(f.f44900g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
