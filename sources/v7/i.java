package v7;

import java.util.Map;
public final class i implements ia.d {
    public static final i f44019b = new i(0);
    public static final i f44020c = new i(1);
    public final int f44021a;

    public i(int i10) {
        this.f44021a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f44021a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(j.f44031g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                ia.e eVar2 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
