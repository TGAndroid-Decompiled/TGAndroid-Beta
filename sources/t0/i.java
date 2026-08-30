package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import s5.m;
public final class i {
    public final h f44430a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f44430a = new g(uri, clipDescription, uri2);
        } else {
            this.f44430a = new m(uri, clipDescription, uri2, 1);
        }
    }

    public final ClipDescription a() {
        return this.f44430a.getDescription();
    }

    public i(g gVar) {
        this.f44430a = gVar;
    }
}
