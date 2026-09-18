package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class j {
    public final i f43028a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f43028a = new h(uri, clipDescription, uri2);
        } else {
            this.f43028a = new lf.i(uri, clipDescription, uri2, 26);
        }
    }

    public final ClipDescription a() {
        return this.f43028a.getDescription();
    }

    public j(h hVar) {
        this.f43028a = hVar;
    }
}
