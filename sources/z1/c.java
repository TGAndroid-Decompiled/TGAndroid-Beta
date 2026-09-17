package z1;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import e0.b0;
import e0.i0;
public final class c extends b0 {
    public int[] f50675e;
    public MediaSessionCompat$Token f50676f;

    @Override
    public final void b(i0 i0Var) {
        Notification.Builder builder = (Notification.Builder) i0Var.f8627c;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f50675e, this.f50676f));
        } else {
            a.d(builder, a.b(a.a(), this.f50675e, this.f50676f));
        }
    }
}
