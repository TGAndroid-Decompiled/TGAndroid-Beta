package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class j {
    public final i f43023a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f43023a = new h(uri, clipDescription, uri2);
        } else {
            this.f43023a = new lf.i(uri, clipDescription, uri2, 26);
        }
    }

    public final ClipDescription a() {
        return this.f43023a.getDescription();
    }

    public j(h hVar) {
        this.f43023a = hVar;
    }
}
