package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class i {
    public final h f48689a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f48689a = new g(uri, clipDescription, uri2);
        } else {
            this.f48689a = new s4.d(uri, clipDescription, uri2, 2);
        }
    }

    public final ClipDescription a() {
        return this.f48689a.getDescription();
    }

    public i(g gVar) {
        this.f48689a = gVar;
    }
}
