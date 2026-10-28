package sb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class l extends PhantomReference {
    public final Set f48100a;
    public final androidx.emoji2.text.n f48101b;

    public l(a aVar, ReferenceQueue referenceQueue, Set set, androidx.emoji2.text.n nVar) {
        super(aVar, referenceQueue);
        this.f48100a = set;
        this.f48101b = nVar;
    }
}
