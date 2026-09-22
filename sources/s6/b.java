package s6;

import java.util.Comparator;
public final class b implements Comparator {
    public static final b f43187a = new Object();

    @Override
    public final int compare(Object obj, Object obj2) {
        k6.c cVar = (k6.c) obj;
        k6.c cVar2 = (k6.c) obj2;
        if (!cVar.f13506a.equals(cVar2.f13506a)) {
            return cVar.f13506a.compareTo(cVar2.f13506a);
        }
        return (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
    }
}
