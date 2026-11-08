package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f55351a;

    public g(Object obj) {
        this.f55351a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f55351a.getContentUri();
    }

    @Override
    public final void e() {
        this.f55351a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f55351a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f55351a.getDescription();
    }

    @Override
    public final Object h() {
        return this.f55351a;
    }

    @Override
    public final void i() {
        this.f55351a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f55351a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
