package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f43322a;

    public g(Object obj) {
        this.f43322a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43322a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43322a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43322a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43322a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43322a;
    }

    @Override
    public final void p() {
        this.f43322a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43322a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
