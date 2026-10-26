package sb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class l extends PhantomReference {
    public final Set f48062a;
    public final androidx.emoji2.text.n f48063b;

    public l(a aVar, ReferenceQueue referenceQueue, Set set, androidx.emoji2.text.n nVar) {
        super(aVar, referenceQueue);
        this.f48062a = set;
        this.f48063b = nVar;
    }
}
