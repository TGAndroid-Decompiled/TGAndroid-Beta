package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48429a;

    public g(Object obj) {
        this.f48429a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f48429a.getContentUri();
    }

    @Override
    public final void d() {
        this.f48429a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f48429a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48429a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f48429a;
    }

    @Override
    public final void m() {
        this.f48429a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48429a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
