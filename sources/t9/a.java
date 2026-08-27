package t9;

import java.util.Map;

public final class a implements r9.d {

    public final int f48137a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f48137a) {
            case 0:
                throw new r9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                r9.e eVar = (r9.e) obj2;
                eVar.a(u9.e.f48460g, entry.getKey());
                eVar.a(u9.e.h, entry.getValue());
                return;
            default:
                throw new r9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
