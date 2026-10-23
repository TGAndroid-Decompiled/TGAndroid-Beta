package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f47308a;

    public g(Object obj) {
        this.f47308a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f47308a.getContentUri();
    }

    @Override
    public final void d() {
        this.f47308a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f47308a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f47308a.getDescription();
    }

    @Override
    public final Object j() {
        return this.f47308a;
    }

    @Override
    public final void k() {
        this.f47308a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f47308a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
