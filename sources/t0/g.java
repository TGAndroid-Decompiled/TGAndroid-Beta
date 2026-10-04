package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f46880a;

    public g(Object obj) {
        this.f46880a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f46880a.getContentUri();
    }

    @Override
    public final void d() {
        this.f46880a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f46880a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f46880a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f46880a;
    }

    @Override
    public final void m() {
        this.f46880a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46880a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
