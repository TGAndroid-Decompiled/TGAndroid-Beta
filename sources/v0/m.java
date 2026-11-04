package v0;

import java.util.Collection;
import java.util.List;
public final class m {
    public final List f56431a;
    public final boolean f56432b;

    public m(List list, boolean z10) {
        this.f56431a = list;
        this.f56432b = z10;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<o> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (o oVar : list2) {
                    }
                }
                for (o oVar2 : this.f56431a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
