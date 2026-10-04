package v0;

import java.util.Collection;
import java.util.List;
public final class o {
    public final List f47751a;
    public final boolean f47752b;

    public o(List list, boolean z10) {
        this.f47751a = list;
        this.f47752b = z10;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<q> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (q qVar : list2) {
                    }
                }
                for (q qVar2 : this.f47751a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
