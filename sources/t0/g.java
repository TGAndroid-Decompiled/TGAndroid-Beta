package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f43286a;

    public g(Object obj) {
        this.f43286a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43286a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43286a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43286a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43286a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43286a;
    }

    @Override
    public final void o() {
        this.f43286a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43286a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
