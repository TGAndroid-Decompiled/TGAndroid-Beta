package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f57639a;

    public g(Object obj) {
        this.f57639a = (InputContentInfo) obj;
    }

    @Override
    public final Uri b() {
        return this.f57639a.getContentUri();
    }

    @Override
    public final void e() {
        this.f57639a.requestPermission();
    }

    @Override
    public final Uri f() {
        return this.f57639a.getLinkUri();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f57639a.getDescription();
    }

    @Override
    public final Object h() {
        return this.f57639a;
    }

    @Override
    public final void k() {
        this.f57639a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f57639a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
