package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

public final class j {

    public final i f48003a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f48003a = new h(uri, clipDescription, uri2);
        } else {
            this.f48003a = new j9.a(uri, clipDescription, uri2, false, 29);
        }
    }

    public final ClipDescription a() {
        return this.f48003a.k();
    }

    public j(h hVar) {
        this.f48003a = hVar;
    }
}
