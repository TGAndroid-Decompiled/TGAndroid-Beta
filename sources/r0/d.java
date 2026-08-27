package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

public final class d implements e, g {

    public final int f46572a = 0;

    public final Object f46573b;

    public d(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f46573b = contentInfo;
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f46573b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f46573b).setLinkUri(uri);
    }

    @Override
    public h build() {
        return new h(new d(((ContentInfo.Builder) this.f46573b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f46573b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f46573b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f46573b).getSource();
    }

    @Override
    public int f() {
        return ((ContentInfo) this.f46573b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f46573b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f46572a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f46573b) + "}";
            default:
                return super.toString();
        }
    }

    public d(ClipData clipData, int i10) {
        this.f46573b = c.a(clipData, i10);
    }
}
