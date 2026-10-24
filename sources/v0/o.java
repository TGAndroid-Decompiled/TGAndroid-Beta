package v0;

import java.util.Collection;
import java.util.List;
public final class o {
    public final List f48305a;
    public final boolean f48306b;

    public o(List list, boolean z10) {
        this.f48305a = list;
        this.f48306b = z10;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<q> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (q qVar : list2) {
                    }
                }
                for (q qVar2 : this.f48305a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
