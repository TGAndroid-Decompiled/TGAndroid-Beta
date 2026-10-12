package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import m.f3;
public final class i {
    public final h f48430a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f48430a = new g(uri, clipDescription, uri2);
        } else {
            this.f48430a = new f3(uri, clipDescription, uri2, 28);
        }
    }

    public final ClipDescription a() {
        return this.f48430a.getDescription();
    }

    public i(g gVar) {
        this.f48430a = gVar;
    }
}
