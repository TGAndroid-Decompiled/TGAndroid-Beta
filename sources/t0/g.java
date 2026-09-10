package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f42069a;

    public g(Object obj) {
        this.f42069a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f42069a.getContentUri();
    }

    @Override
    public final void d() {
        this.f42069a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f42069a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f42069a.getDescription();
    }

    @Override
    public final Object i() {
        return this.f42069a;
    }

    @Override
    public final void n() {
        this.f42069a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f42069a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
