package z1;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import e0.b0;
import e0.i0;
public final class c extends b0 {
    public int[] e;
    public MediaSessionCompat$Token f47190f;

    @Override
    public final void b(i0 i0Var) {
        Notification.Builder builder = (Notification.Builder) i0Var.f7091c;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.e, this.f47190f));
        } else {
            a.d(builder, a.b(a.a(), this.e, this.f47190f));
        }
    }
}
