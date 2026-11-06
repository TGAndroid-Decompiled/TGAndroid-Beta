package pa;

import java.util.Map;
public final class a implements na.d {
    public final int f53389a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f53389a) {
            case 0:
                na.e eVar = (na.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar2 = (na.e) obj2;
                eVar2.a(qa.e.f53935g, entry.getKey());
                eVar2.a(qa.e.h, entry.getValue());
                return;
            default:
                na.e eVar3 = (na.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
