package v0;

import java.util.Collection;
import java.util.List;
public final class n {
    public final List f48837a;
    public final boolean f48838b;

    public n(List list, boolean z4) {
        this.f48837a = list;
        this.f48838b = z4;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<p> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (p pVar : list2) {
                    }
                }
                for (p pVar2 : this.f48837a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
