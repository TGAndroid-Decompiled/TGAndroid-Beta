package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48524a;

    public g(Object obj) {
        this.f48524a = (InputContentInfo) obj;
    }

    @Override
    public final Uri a() {
        return this.f48524a.getContentUri();
    }

    @Override
    public final void c() {
        this.f48524a.requestPermission();
    }

    @Override
    public final Uri d() {
        return this.f48524a.getLinkUri();
    }

    @Override
    public final Object f() {
        return this.f48524a;
    }

    @Override
    public final void g() {
        this.f48524a.releasePermission();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48524a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48524a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
