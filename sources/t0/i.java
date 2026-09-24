package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class i {
    public final h f43274a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f43274a = new g(uri, clipDescription, uri2);
        } else {
            this.f43274a = new la.h(uri, clipDescription, uri2, 27);
        }
    }

    public final ClipDescription a() {
        return this.f43274a.getDescription();
    }

    public i(g gVar) {
        this.f43274a = gVar;
    }
}
