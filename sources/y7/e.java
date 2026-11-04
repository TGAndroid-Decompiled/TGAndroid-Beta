package y7;

import java.util.Map;
public final class e implements ma.d {
    public static final e f59068b = new e(0);
    public static final e f59069c = new e(1);
    public final int f59070a;

    public e(int i3) {
        this.f59070a = i3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f59070a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ma.e eVar = (ma.e) obj2;
                eVar.a(f.f59080g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                ma.e eVar2 = (ma.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
