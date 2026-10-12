package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48421a;

    public g(Object obj) {
        this.f48421a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f48421a.getContentUri();
    }

    @Override
    public final void d() {
        this.f48421a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f48421a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48421a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f48421a;
    }

    @Override
    public final void m() {
        this.f48421a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48421a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
