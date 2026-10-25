package x7;

import java.util.Map;
public final class e implements ka.d {
    public static final e f51436b = new e(0);
    public static final e f51437c = new e(1);
    public final int f51438a;

    public e(int i10) {
        this.f51438a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f51438a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar = (ka.e) obj2;
                eVar.a(f.f51448g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                ka.e eVar2 = (ka.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
