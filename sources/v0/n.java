package v0;

import java.util.Collection;
import java.util.List;
public final class n {
    public final List f45611a;
    public final boolean f45612b;

    public n(List list, boolean z4) {
        this.f45611a = list;
        this.f45612b = z4;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<p> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (p pVar : list2) {
                    }
                }
                for (p pVar2 : this.f45611a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
