package r0;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;
public abstract class g0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo d = gVar.f44712a.d();
        Objects.requireNonNull(d);
        ContentInfo performReceiveContent = view.performReceiveContent(d);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == d) {
            return gVar;
        }
        return new g(new j2.j(performReceiveContent));
    }
}
