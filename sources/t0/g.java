package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f42951a;

    public g(Object obj) {
        this.f42951a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f42951a.getContentUri();
    }

    @Override
    public final void d() {
        this.f42951a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f42951a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f42951a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f42951a;
    }

    @Override
    public final void p() {
        this.f42951a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f42951a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
