package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f43273a;

    public g(Object obj) {
        this.f43273a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43273a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43273a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43273a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43273a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43273a;
    }

    @Override
    public final void o() {
        this.f43273a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43273a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
