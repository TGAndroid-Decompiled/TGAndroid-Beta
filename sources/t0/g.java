package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f46879a;

    public g(Object obj) {
        this.f46879a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f46879a.getContentUri();
    }

    @Override
    public final void d() {
        this.f46879a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f46879a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f46879a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f46879a;
    }

    @Override
    public final void m() {
        this.f46879a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46879a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
