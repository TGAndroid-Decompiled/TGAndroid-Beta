package ua;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements j {
    public final k f55798a;
    public final TaskCompletionSource f55799b;

    public g(k kVar, TaskCompletionSource taskCompletionSource) {
        this.f55798a = kVar;
        this.f55799b = taskCompletionSource;
    }

    @Override
    public final boolean a(va.b bVar) {
        if (bVar.f56493b != 4 || this.f55798a.a(bVar)) {
            return false;
        }
        String str = bVar.f56494c;
        if (str != null) {
            long j10 = bVar.f56495e;
            long j11 = bVar.f56496f;
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                this.f55799b.setResult(new a(j10, str, j11));
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" tokenExpirationTimestamp");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" tokenCreationTimestamp");
            }
            throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
        }
        throw new NullPointerException("Null token");
    }

    @Override
    public final boolean b(Exception exc) {
        this.f55799b.trySetException(exc);
        return true;
    }
}
