package v0;

import java.util.Collection;
import java.util.List;
public final class o {
    public final List f46470a;
    public final boolean f46471b;

    public o(List list, boolean z10) {
        this.f46470a = list;
        this.f46471b = z10;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<q> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (q qVar : list2) {
                    }
                }
                for (q qVar2 : this.f46470a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
