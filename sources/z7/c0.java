package z7;

import java.util.Map;
public final class c0 implements ma.d {
    public static final c0 f59810b = new c0(0);
    public static final c0 f59811c = new c0(1);
    public final int f59812a;

    public c0(int i3) {
        this.f59812a = i3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f59812a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ma.e eVar = (ma.e) obj2;
                eVar.a(d0.f59827g, entry.getKey());
                eVar.a(d0.h, entry.getValue());
                return;
            default:
                ma.e eVar2 = (ma.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
