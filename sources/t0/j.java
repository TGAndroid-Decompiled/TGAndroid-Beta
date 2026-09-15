package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import m.e3;
public final class j {
    public final i f43001a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f43001a = new h(uri, clipDescription, uri2);
        } else {
            this.f43001a = new e3(uri, clipDescription, uri2, 25);
        }
    }

    public final ClipDescription a() {
        return this.f43001a.getDescription();
    }

    public j(h hVar) {
        this.f43001a = hVar;
    }
}
