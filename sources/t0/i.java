package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import m.e3;
public final class i {
    public final h f42070a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f42070a = new g(uri, clipDescription, uri2);
        } else {
            this.f42070a = new e3(uri, clipDescription, uri2, 24);
        }
    }

    public final ClipDescription a() {
        return this.f42070a.getDescription();
    }

    public i(g gVar) {
        this.f42070a = gVar;
    }
}
