package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f55234a;

    public g(Object obj) {
        this.f55234a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f55234a.getContentUri();
    }

    @Override
    public final void e() {
        this.f55234a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f55234a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f55234a.getDescription();
    }

    @Override
    public final Object h() {
        return this.f55234a;
    }

    @Override
    public final void i() {
        this.f55234a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f55234a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
