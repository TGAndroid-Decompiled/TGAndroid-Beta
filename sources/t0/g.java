package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f57520a;

    public g(Object obj) {
        this.f57520a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f57520a.getContentUri();
    }

    @Override
    public final void e() {
        this.f57520a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f57520a.getLinkUri();
    }

    @Override
    public final Object g() {
        return this.f57520a;
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f57520a.getDescription();
    }

    @Override
    public final void i() {
        this.f57520a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f57520a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
