package x7;

import java.util.Map;
public final class d0 implements ia.d {
    public static final d0 f45630b = new d0(0);
    public static final d0 f45631c = new d0(1);
    public final int f45632a;

    public d0(int i10) {
        this.f45632a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f45632a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(e0.f45648g, entry.getKey());
                eVar.a(e0.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
