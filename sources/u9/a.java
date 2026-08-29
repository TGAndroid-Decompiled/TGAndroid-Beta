package u9;

import java.util.Map;
public final class a implements s9.d {
    public final int f49149a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f49149a) {
            case 0:
                s9.e eVar = (s9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                s9.e eVar2 = (s9.e) obj2;
                eVar2.e(v9.e.f49468g, entry.getKey());
                eVar2.e(v9.e.h, entry.getValue());
                return;
            default:
                s9.e eVar3 = (s9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
