package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f57563a;

    public g(Object obj) {
        this.f57563a = (InputContentInfo) obj;
    }

    @Override
    public final Uri c() {
        return this.f57563a.getContentUri();
    }

    @Override
    public final void e() {
        this.f57563a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f57563a.getLinkUri();
    }

    @Override
    public final Object g() {
        return this.f57563a;
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f57563a.getDescription();
    }

    @Override
    public final void i() {
        this.f57563a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f57563a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
