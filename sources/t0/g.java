package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48688a;

    public g(Object obj) {
        this.f48688a = (InputContentInfo) obj;
    }

    @Override
    public final Uri a() {
        return this.f48688a.getContentUri();
    }

    @Override
    public final void b() {
        this.f48688a.requestPermission();
    }

    @Override
    public final Uri c() {
        return this.f48688a.getLinkUri();
    }

    @Override
    public final Object e() {
        return this.f48688a;
    }

    @Override
    public final void f() {
        this.f48688a.releasePermission();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48688a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48688a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
