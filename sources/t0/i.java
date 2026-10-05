package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
public final class i {
    public final h f46895a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f46895a = new g(uri, clipDescription, uri2);
        } else {
            this.f46895a = new la.h(uri, clipDescription, uri2, 27);
        }
    }

    public final ClipDescription a() {
        return this.f46895a.getDescription();
    }

    public i(g gVar) {
        this.f46895a = gVar;
    }
}
