package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class h implements i {
    public final InputContentInfo f46422a;

    public h(Object obj) {
        this.f46422a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f46422a.getContentUri();
    }

    @Override
    public final void d() {
        this.f46422a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f46422a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f46422a.getDescription();
    }

    @Override
    public final Object i() {
        return this.f46422a;
    }

    @Override
    public final void k() {
        this.f46422a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46422a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
