package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class h implements i {
    public final InputContentInfo f43027a;

    public h(Object obj) {
        this.f43027a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f43027a.getContentUri();
    }

    @Override
    public final void d() {
        this.f43027a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f43027a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f43027a.getDescription();
    }

    @Override
    public final Object l() {
        return this.f43027a;
    }

    @Override
    public final void p() {
        this.f43027a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43027a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
