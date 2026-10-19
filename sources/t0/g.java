package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f46864a;

    public g(Object obj) {
        this.f46864a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f46864a.getContentUri();
    }

    @Override
    public final void d() {
        this.f46864a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f46864a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f46864a.getDescription();
    }

    @Override
    public final Object j() {
        return this.f46864a;
    }

    @Override
    public final void k() {
        this.f46864a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46864a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
