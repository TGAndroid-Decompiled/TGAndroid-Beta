package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f44491a;

    public g(Object obj) {
        this.f44491a = (InputContentInfo) obj;
    }

    @Override
    public final Uri a() {
        return this.f44491a.getContentUri();
    }

    @Override
    public final void b() {
        this.f44491a.requestPermission();
    }

    @Override
    public final Uri c() {
        return this.f44491a.getLinkUri();
    }

    @Override
    public final Object d() {
        return this.f44491a;
    }

    @Override
    public final void e() {
        this.f44491a.releasePermission();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f44491a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f44491a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
