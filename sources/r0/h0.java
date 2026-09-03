package r0;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;
public abstract class h0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static h b(View view, h hVar) {
        ContentInfo d = hVar.f43130a.d();
        Objects.requireNonNull(d);
        ContentInfo performReceiveContent = view.performReceiveContent(d);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == d) {
            return hVar;
        }
        return new h(new d(performReceiveContent));
    }
}
