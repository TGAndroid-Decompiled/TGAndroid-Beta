package s9;

import java.util.Map;
public final class a implements q9.d {
    public final int f47488a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f47488a) {
            case 0:
                q9.e eVar = (q9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                q9.e eVar2 = (q9.e) obj2;
                eVar2.g(t9.e.f47738g, entry.getKey());
                eVar2.g(t9.e.h, entry.getValue());
                return;
            default:
                q9.e eVar3 = (q9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
