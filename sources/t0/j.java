package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class j {
    public final i f46913a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f46913a = new g(uri, clipDescription, uri2);
        } else {
            this.f46913a = new h(uri, clipDescription, uri2);
        }
    }

    public final ClipDescription a() {
        return this.f46913a.getDescription();
    }

    public j(g gVar) {
        this.f46913a = gVar;
    }
}
