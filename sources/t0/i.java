package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import m.g3;
public final class i {
    public final h f47308a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f47308a = new g(uri, clipDescription, uri2);
        } else {
            this.f47308a = new g3(uri, clipDescription, uri2, 29);
        }
    }

    public final ClipDescription a() {
        return this.f47308a.getDescription();
    }

    public i(g gVar) {
        this.f47308a = gVar;
    }
}
