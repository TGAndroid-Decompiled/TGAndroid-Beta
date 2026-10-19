package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f46862a;

    public g(Object obj) {
        this.f46862a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f46862a.getContentUri();
    }

    @Override
    public final void d() {
        this.f46862a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f46862a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f46862a.getDescription();
    }

    @Override
    public final Object j() {
        return this.f46862a;
    }

    @Override
    public final void k() {
        this.f46862a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46862a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
