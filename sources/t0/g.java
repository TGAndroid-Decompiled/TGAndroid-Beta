package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
public final class g implements h {
    public final InputContentInfo f48723a;

    public g(Object obj) {
        this.f48723a = (InputContentInfo) obj;
    }

    @Override
    public final Uri a() {
        return this.f48723a.getContentUri();
    }

    @Override
    public final void b() {
        this.f48723a.requestPermission();
    }

    @Override
    public final Uri c() {
        return this.f48723a.getLinkUri();
    }

    @Override
    public final Object e() {
        return this.f48723a;
    }

    @Override
    public final void f() {
        this.f48723a.releasePermission();
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f48723a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f48723a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
