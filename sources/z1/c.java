package z1;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import e0.f0;
import e0.y;
public final class c extends y {
    public int[] e;
    public MediaSessionCompat$Token f51092f;

    @Override
    public final void b(f0 f0Var) {
        Notification.Builder builder = (Notification.Builder) f0Var.d;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.e, this.f51092f));
        } else {
            a.d(builder, a.b(a.a(), this.e, this.f51092f));
        }
    }
}
