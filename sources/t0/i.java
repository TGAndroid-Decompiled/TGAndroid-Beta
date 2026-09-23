package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class i {
    public final h f42952a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f42952a = new g(uri, clipDescription, uri2);
        } else {
            this.f42952a = new lf.i(uri, clipDescription, uri2, 26);
        }
    }

    public final ClipDescription a() {
        return this.f42952a.getDescription();
    }

    public i(g gVar) {
        this.f42952a = gVar;
    }
}
