package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import m.g3;
public final class i {
    public final h f46891a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f46891a = new g(uri, clipDescription, uri2);
        } else {
            this.f46891a = new g3(uri, clipDescription, uri2, 29);
        }
    }

    public final ClipDescription a() {
        return this.f46891a.getDescription();
    }

    public i(g gVar) {
        this.f46891a = gVar;
    }
}
