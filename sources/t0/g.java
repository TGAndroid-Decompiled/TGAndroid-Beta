package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements i {
    public final InputContentInfo f46909a;

    public g(Object obj) {
        this.f46909a = (InputContentInfo) obj;
    }

    @Override
    public final Uri a() {
        return this.f46909a.getContentUri();
    }

    @Override
    public final void b() {
        this.f46909a.requestPermission();
    }

    @Override
    public final Uri c() {
        return this.f46909a.getLinkUri();
    }

    @Override
    public final Object e() {
        return this.f46909a;
    }

    @Override
    public final void f() {
        this.f46909a.releasePermission();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f46909a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46909a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
