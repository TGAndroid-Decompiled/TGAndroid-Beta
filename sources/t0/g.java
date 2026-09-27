package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f43332a;

    public g(Object obj) {
        this.f43332a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43332a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43332a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43332a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43332a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43332a;
    }

    @Override
    public final void m() {
        this.f43332a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43332a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
