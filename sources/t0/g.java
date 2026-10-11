package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48314a;

    public g(Object obj) {
        this.f48314a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f48314a.getContentUri();
    }

    @Override
    public final void d() {
        this.f48314a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f48314a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48314a.getDescription();
    }

    @Override
    public final Object i() {
        return this.f48314a;
    }

    @Override
    public final void j() {
        this.f48314a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48314a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
