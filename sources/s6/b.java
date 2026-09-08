package s6;

import java.util.Comparator;
public final class b implements Comparator {
    public static final b f45978a = new Object();

    @Override
    public final int compare(Object obj, Object obj2) {
        k6.c cVar = (k6.c) obj;
        k6.c cVar2 = (k6.c) obj2;
        if (!cVar.f14837a.equals(cVar2.f14837a)) {
            return cVar.f14837a.compareTo(cVar2.f14837a);
        }
        return (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
    }
}
