package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import s5.m;
public final class i {
    public final h f47829a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f47829a = new g(uri, clipDescription, uri2);
        } else {
            this.f47829a = new m(uri, clipDescription, uri2, 1);
        }
    }

    public final ClipDescription a() {
        return this.f47829a.getDescription();
    }

    public i(g gVar) {
        this.f47829a = gVar;
    }
}
