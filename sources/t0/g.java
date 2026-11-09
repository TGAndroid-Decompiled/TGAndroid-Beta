package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f55363a;

    public g(Object obj) {
        this.f55363a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f55363a.getContentUri();
    }

    @Override
    public final void e() {
        this.f55363a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f55363a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f55363a.getDescription();
    }

    @Override
    public final Object h() {
        return this.f55363a;
    }

    @Override
    public final void i() {
        this.f55363a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f55363a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
