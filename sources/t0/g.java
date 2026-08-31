package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f47828a;

    public g(Object obj) {
        this.f47828a = (InputContentInfo) obj;
    }

    @Override
    public final Uri a() {
        return this.f47828a.getContentUri();
    }

    @Override
    public final void b() {
        this.f47828a.requestPermission();
    }

    @Override
    public final Uri c() {
        return this.f47828a.getLinkUri();
    }

    @Override
    public final Object d() {
        return this.f47828a;
    }

    @Override
    public final void e() {
        this.f47828a.releasePermission();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f47828a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f47828a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
