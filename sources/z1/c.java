package z1;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import e0.g0;
import e0.z;
public final class c extends z {
    public int[] f53481e;
    public MediaSessionCompat$Token f53482f;

    @Override
    public final void b(g0 g0Var) {
        Notification.Builder builder = (Notification.Builder) g0Var.f8414c;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f53481e, this.f53482f));
        } else {
            a.d(builder, a.b(a.a(), this.f53481e, this.f53482f));
        }
    }
}
