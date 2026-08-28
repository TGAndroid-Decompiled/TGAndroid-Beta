package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class h implements i {
    public final InputContentInfo f47591a;

    public h(Object obj) {
        this.f47591a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f47591a.getContentUri();
    }

    @Override
    public final void f() {
        this.f47591a.requestPermission();
    }

    @Override
    public final Uri g() {
        return this.f47591a.getLinkUri();
    }

    @Override
    public final ClipDescription j() {
        return this.f47591a.getDescription();
    }

    @Override
    public final Object k() {
        return this.f47591a;
    }

    @Override
    public final void m() {
        this.f47591a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f47591a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
