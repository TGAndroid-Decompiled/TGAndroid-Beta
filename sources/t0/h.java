package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class h implements i {
    public final InputContentInfo f43022a;

    public h(Object obj) {
        this.f43022a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43022a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43022a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43022a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43022a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43022a;
    }

    @Override
    public final void p() {
        this.f43022a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43022a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
