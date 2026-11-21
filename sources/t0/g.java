package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f57559a;

    public g(Object obj) {
        this.f57559a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f57559a.getContentUri();
    }

    @Override
    public final void e() {
        this.f57559a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f57559a.getLinkUri();
    }

    @Override
    public final Object g() {
        return this.f57559a;
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f57559a.getDescription();
    }

    @Override
    public final void i() {
        this.f57559a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f57559a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
