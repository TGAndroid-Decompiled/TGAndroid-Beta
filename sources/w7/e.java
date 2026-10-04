package w7;

import java.util.Map;
public final class e implements ia.d {
    public static final e f48625b = new e(0);
    public static final e f48626c = new e(1);
    public final int f48627a;

    public e(int i10) {
        this.f48627a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f48627a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(f.f48640g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
