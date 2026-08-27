package v0;

import java.util.Collection;
import java.util.List;

public final class o {

    public final List f48666a;

    public final boolean f48667b;

    public o(List list, boolean z10) {
        this.f48666a = list;
        this.f48667b = z10;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (list.size() > 1) {
            List<q> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (q qVar : list2) {
                }
            }
            for (q qVar2 : this.f48666a) {
            }
        }
    }
}
