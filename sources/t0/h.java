package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class h implements i {
    public final InputContentInfo f46450a;

    public h(Object obj) {
        this.f46450a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f46450a.getContentUri();
    }

    @Override
    public final void d() {
        this.f46450a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f46450a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f46450a.getDescription();
    }

    @Override
    public final Object i() {
        return this.f46450a;
    }

    @Override
    public final void k() {
        this.f46450a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46450a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
