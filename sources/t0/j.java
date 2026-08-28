package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class j {
    public final i f47592a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f47592a = new h(uri, clipDescription, uri2);
        } else {
            this.f47592a = new j4.c(uri, clipDescription, uri2, false, 29);
        }
    }

    public final ClipDescription a() {
        return this.f47592a.j();
    }

    public j(h hVar) {
        this.f47592a = hVar;
    }
}
