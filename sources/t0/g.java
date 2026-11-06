package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f55259a;

    public g(Object obj) {
        this.f55259a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f55259a.getContentUri();
    }

    @Override
    public final void e() {
        this.f55259a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f55259a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f55259a.getDescription();
    }

    @Override
    public final Object h() {
        return this.f55259a;
    }

    @Override
    public final void i() {
        this.f55259a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f55259a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
