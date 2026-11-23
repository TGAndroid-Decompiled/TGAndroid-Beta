package va;

import a8.p0;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f59477a;
    public final TaskCompletionSource f59478b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f59477a = jVar;
        this.f59478b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f59478b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(wa.b bVar) {
        if (bVar.f59774b != 4 || this.f59477a.a(bVar)) {
            return false;
        }
        String str = bVar.f59775c;
        if (str != null) {
            long j3 = bVar.f59776e;
            long j10 = bVar.f59777f;
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                this.f59478b.setResult(new a(j3, str, j10));
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" tokenExpirationTimestamp");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" tokenCreationTimestamp");
            }
            throw new IllegalStateException(p0.q("Missing required properties:", sb2));
        }
        throw new NullPointerException("Null token");
    }
}
