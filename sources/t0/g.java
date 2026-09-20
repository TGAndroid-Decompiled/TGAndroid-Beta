package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f43301a;

    public g(Object obj) {
        this.f43301a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43301a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43301a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43301a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43301a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43301a;
    }

    @Override
    public final void p() {
        this.f43301a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43301a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
