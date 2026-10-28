package x7;

import java.util.Map;
public final class e implements ka.d {
    public static final e f51497b = new e(0);
    public static final e f51498c = new e(1);
    public final int f51499a;

    public e(int i10) {
        this.f51499a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f51499a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar = (ka.e) obj2;
                eVar.a(f.f51509g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                ka.e eVar2 = (ka.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
