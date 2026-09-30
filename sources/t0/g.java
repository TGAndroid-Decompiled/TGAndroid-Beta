package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f43289a;

    public g(Object obj) {
        this.f43289a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43289a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43289a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43289a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43289a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43289a;
    }

    @Override
    public final void o() {
        this.f43289a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43289a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
