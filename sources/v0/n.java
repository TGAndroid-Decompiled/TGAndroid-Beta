package v0;

import java.util.Collection;
import java.util.List;
public final class n {
    public final List f49067a;
    public final boolean f49068b;

    public n(List list, boolean z10) {
        this.f49067a = list;
        this.f49068b = z10;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<p> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (p pVar : list2) {
                    }
                }
                for (p pVar2 : this.f49067a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
