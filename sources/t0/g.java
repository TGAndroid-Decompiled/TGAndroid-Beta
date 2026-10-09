package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48188a;

    public g(Object obj) {
        this.f48188a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f48188a.getContentUri();
    }

    @Override
    public final void d() {
        this.f48188a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f48188a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48188a.getDescription();
    }

    @Override
    public final Object i() {
        return this.f48188a;
    }

    @Override
    public final void j() {
        this.f48188a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48188a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
