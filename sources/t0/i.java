package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class i {
    public final h f46888a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f46888a = new g(uri, clipDescription, uri2);
        } else {
            this.f46888a = new la.h(uri, clipDescription, uri2, 27);
        }
    }

    public final ClipDescription a() {
        return this.f46888a.getDescription();
    }

    public i(g gVar) {
        this.f46888a = gVar;
    }
}
