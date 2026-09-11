package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class h implements i {
    public final InputContentInfo f46421a;

    public h(Object obj) {
        this.f46421a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f46421a.getContentUri();
    }

    @Override
    public final void d() {
        this.f46421a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f46421a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f46421a.getDescription();
    }

    @Override
    public final Object i() {
        return this.f46421a;
    }

    @Override
    public final void k() {
        this.f46421a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46421a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
