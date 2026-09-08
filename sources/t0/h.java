package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class h implements i {
    public final InputContentInfo f46449a;

    public h(Object obj) {
        this.f46449a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f46449a.getContentUri();
    }

    @Override
    public final void d() {
        this.f46449a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f46449a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f46449a.getDescription();
    }

    @Override
    public final Object i() {
        return this.f46449a;
    }

    @Override
    public final void k() {
        this.f46449a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46449a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
