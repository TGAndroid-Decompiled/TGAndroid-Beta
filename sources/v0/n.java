package v0;

import java.util.Collection;
import java.util.List;
public final class n {
    public final List f49251a;
    public final boolean f49252b;

    public n(List list, boolean z10) {
        this.f49251a = list;
        this.f49252b = z10;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<p> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (p pVar : list2) {
                    }
                }
                for (p pVar2 : this.f49251a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
