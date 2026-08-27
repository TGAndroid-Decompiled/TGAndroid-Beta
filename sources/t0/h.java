package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class h implements i {

    public final InputContentInfo f48002a;

    public h(Object obj) {
        this.f48002a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f48002a.getContentUri();
    }

    @Override
    public final void f() {
        this.f48002a.requestPermission();
    }

    @Override
    public final Uri g() {
        return this.f48002a.getLinkUri();
    }

    @Override
    public final ClipDescription k() {
        return this.f48002a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f48002a;
    }

    @Override
    public final void o() {
        this.f48002a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48002a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
