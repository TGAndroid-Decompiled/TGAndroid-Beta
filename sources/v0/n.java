package v0;

import java.util.Collection;
import java.util.List;
public final class n {
    public final List f56982a;
    public final boolean f56983b;

    public n(List list, boolean z9) {
        this.f56982a = list;
        this.f56983b = z9;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<h> list2 = list;
                int i7 = 0;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (h hVar : list2) {
                        if ((hVar instanceof p) && (i7 = i7 + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                if (i7 > 0 && i7 != this.f56982a.size()) {
                    throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
                }
                for (h hVar2 : this.f56982a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
