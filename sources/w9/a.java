package w9;

import java.util.Map;
public final class a implements u9.d {
    public final int f49506a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f49506a) {
            case 0:
                u9.e eVar = (u9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                u9.e eVar2 = (u9.e) obj2;
                eVar2.e(x9.e.f50504g, entry.getKey());
                eVar2.e(x9.e.h, entry.getValue());
                return;
            default:
                u9.e eVar3 = (u9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
