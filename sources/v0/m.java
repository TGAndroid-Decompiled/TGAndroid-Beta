package v0;

import java.util.Collection;
import java.util.List;
public final class m {
    public final List f59031a;
    public final boolean f59032b;

    public m(List list, boolean z10) {
        this.f59031a = list;
        this.f59032b = z10;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<h> list2 = list;
                int i7 = 0;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (h hVar : list2) {
                        if ((hVar instanceof o) && (i7 = i7 + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                if (i7 > 0 && i7 != this.f59031a.size()) {
                    throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
                }
                for (h hVar2 : this.f59031a) {
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
