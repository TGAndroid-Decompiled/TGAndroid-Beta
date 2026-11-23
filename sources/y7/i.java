package y7;

import java.util.Map;
public final class i implements na.d {
    public static final i f60887b = new i(0);
    public static final i f60888c = new i(1);
    public final int f60889a;

    public i(int i7) {
        this.f60889a = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f60889a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(j.f60898g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                na.e eVar2 = (na.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
