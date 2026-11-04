package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f54771a;

    public g(Object obj) {
        this.f54771a = (InputContentInfo) obj;
    }

    @Override
    public final Uri a() {
        return this.f54771a.getContentUri();
    }

    @Override
    public final void b() {
        this.f54771a.requestPermission();
    }

    @Override
    public final Uri d() {
        return this.f54771a.getLinkUri();
    }

    @Override
    public final Object e() {
        return this.f54771a;
    }

    @Override
    public final void f() {
        this.f54771a.releasePermission();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f54771a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f54771a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
