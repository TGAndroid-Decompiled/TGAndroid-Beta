package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f43257a;

    public g(Object obj) {
        this.f43257a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43257a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43257a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43257a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43257a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43257a;
    }

    @Override
    public final void o() {
        this.f43257a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43257a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
