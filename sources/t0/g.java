package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f44429a;

    public g(Object obj) {
        this.f44429a = (InputContentInfo) obj;
    }

    @Override
    public final Uri a() {
        return this.f44429a.getContentUri();
    }

    @Override
    public final void b() {
        this.f44429a.requestPermission();
    }

    @Override
    public final Uri c() {
        return this.f44429a.getLinkUri();
    }

    @Override
    public final Object d() {
        return this.f44429a;
    }

    @Override
    public final void e() {
        this.f44429a.releasePermission();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f44429a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f44429a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
