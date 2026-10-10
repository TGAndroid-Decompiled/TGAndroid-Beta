package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48234a;

    public g(Object obj) {
        this.f48234a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f48234a.getContentUri();
    }

    @Override
    public final void d() {
        this.f48234a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f48234a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48234a.getDescription();
    }

    @Override
    public final Object i() {
        return this.f48234a;
    }

    @Override
    public final void j() {
        this.f48234a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48234a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
