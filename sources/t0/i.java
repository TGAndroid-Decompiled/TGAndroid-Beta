package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class i {
    public final h f48281a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f48281a = new g(uri, clipDescription, uri2);
        } else {
            this.f48281a = new la.h(uri, clipDescription, uri2, 28);
        }
    }

    public final ClipDescription a() {
        return this.f48281a.getDescription();
    }

    public i(g gVar) {
        this.f48281a = gVar;
    }
}
