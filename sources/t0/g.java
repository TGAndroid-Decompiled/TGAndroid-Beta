package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f55362a;

    public g(Object obj) {
        this.f55362a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f55362a.getContentUri();
    }

    @Override
    public final void e() {
        this.f55362a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f55362a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f55362a.getDescription();
    }

    @Override
    public final Object h() {
        return this.f55362a;
    }

    @Override
    public final void i() {
        this.f55362a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f55362a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
