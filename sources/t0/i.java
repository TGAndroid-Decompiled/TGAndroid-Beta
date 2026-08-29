package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import l3.g0;
public final class i {
    public final h f48084a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f48084a = new g(uri, clipDescription, uri2);
        } else {
            this.f48084a = new g0(uri, clipDescription, uri2, false, 26);
        }
    }

    public final ClipDescription a() {
        return this.f48084a.getDescription();
    }

    public i(g gVar) {
        this.f48084a = gVar;
    }
}
