package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48083a;

    public g(Object obj) {
        this.f48083a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f48083a.getContentUri();
    }

    @Override
    public final void d() {
        this.f48083a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f48083a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48083a.getDescription();
    }

    @Override
    public final Object k() {
        return this.f48083a;
    }

    @Override
    public final void l() {
        this.f48083a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48083a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
