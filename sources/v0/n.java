package v0;

import java.util.Collection;
import java.util.List;
public final class n {
    public final List f44099a;
    public final boolean f44100b;

    public n(List list, boolean z10) {
        this.f44099a = list;
        this.f44100b = z10;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<p> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (p pVar : list2) {
                    }
                }
                for (p pVar2 : this.f44099a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
