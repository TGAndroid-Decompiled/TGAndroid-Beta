package t6;

import java.util.Comparator;
public final class b implements Comparator {
    public static final b f48717a = new Object();

    @Override
    public final int compare(Object obj, Object obj2) {
        l6.c cVar = (l6.c) obj;
        l6.c cVar2 = (l6.c) obj2;
        if (!cVar.f16927a.equals(cVar2.f16927a)) {
            return cVar.f16927a.compareTo(cVar2.f16927a);
        }
        return (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
    }
}
