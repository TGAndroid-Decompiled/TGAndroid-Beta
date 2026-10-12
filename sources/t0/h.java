package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class h implements i {
    public final InputContentInfo f45501a;

    public h(Object obj) {
        this.f45501a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f45501a.getContentUri();
    }

    @Override
    public final void d() {
        this.f45501a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f45501a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f45501a.getDescription();
    }

    @Override
    public final Object j() {
        return this.f45501a;
    }

    @Override
    public final void k() {
        this.f45501a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f45501a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
