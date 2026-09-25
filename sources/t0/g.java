package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f43288a;

    public g(Object obj) {
        this.f43288a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43288a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43288a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43288a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43288a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43288a;
    }

    @Override
    public final void o() {
        this.f43288a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43288a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
