package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class h implements i {
    public final InputContentInfo f42996a;

    public h(Object obj) {
        this.f42996a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f42996a.getContentUri();
    }

    @Override
    public final void d() {
        this.f42996a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f42996a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f42996a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f42996a;
    }

    @Override
    public final void p() {
        this.f42996a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f42996a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
