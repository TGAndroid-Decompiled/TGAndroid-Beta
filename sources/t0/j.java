package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import m2.t;
public final class j {
    public final i f46451a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f46451a = new h(uri, clipDescription, uri2);
        } else {
            this.f46451a = new t(uri, clipDescription, uri2, 24);
        }
    }

    public final ClipDescription a() {
        return this.f46451a.getDescription();
    }

    public j(h hVar) {
        this.f46451a = hVar;
    }
}
