package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import li.k;
public final class j {
    public final i f45502a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f45502a = new h(uri, clipDescription, uri2);
        } else {
            this.f45502a = new k(uri, clipDescription, uri2, 29);
        }
    }

    public final ClipDescription a() {
        return this.f45502a.getDescription();
    }

    public j(h hVar) {
        this.f45502a = hVar;
    }
}
