package r0;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

public abstract class h0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static h b(View view, h hVar) {
        ContentInfo contentInfoD = hVar.f46592a.d();
        Objects.requireNonNull(contentInfoD);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoD);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoD ? hVar : new h(new d(contentInfoPerformReceiveContent));
    }
}
