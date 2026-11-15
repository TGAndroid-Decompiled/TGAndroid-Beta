package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f56944a;

    public g(Object obj) {
        this.f56944a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f56944a.getContentUri();
    }

    @Override
    public final void e() {
        this.f56944a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f56944a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f56944a.getDescription();
    }

    @Override
    public final Object h() {
        return this.f56944a;
    }

    @Override
    public final void i() {
        this.f56944a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f56944a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
