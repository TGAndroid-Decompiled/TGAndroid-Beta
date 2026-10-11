package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48280a;

    public g(Object obj) {
        this.f48280a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f48280a.getContentUri();
    }

    @Override
    public final void d() {
        this.f48280a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f48280a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48280a.getDescription();
    }

    @Override
    public final Object i() {
        return this.f48280a;
    }

    @Override
    public final void j() {
        this.f48280a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48280a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
