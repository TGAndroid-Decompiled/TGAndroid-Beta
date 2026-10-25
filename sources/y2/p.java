package y2;

import aa.e0;
import aa.j1;
import java.io.File;
import java.util.Comparator;
public final class p implements Comparator {
    public final int f51968a;

    public p(int i10) {
        this.f51968a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f51968a) {
            case 0:
                return Float.compare(((q) obj).f51971c, ((q) obj2).f51971c);
            case 1:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                return ((e0) ((j1) obj)).f1068a.compareTo(((e0) ((j1) obj2)).f1068a);
        }
    }
}
