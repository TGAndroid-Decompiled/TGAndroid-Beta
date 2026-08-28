package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class d implements e, g {
    public final int f46882a = 0;
    public final Object f46883b;

    public d(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f46883b = contentInfo;
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f46883b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f46883b).setLinkUri(uri);
    }

    @Override
    public h build() {
        return new h(new d(((ContentInfo.Builder) this.f46883b).build()));
    }

    @Override
    public void c(int i9) {
        ((ContentInfo.Builder) this.f46883b).setFlags(i9);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f46883b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f46883b).getSource();
    }

    @Override
    public int f() {
        return ((ContentInfo) this.f46883b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f46883b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f46882a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f46883b) + "}";
            default:
                return super.toString();
        }
    }

    public d(ClipData clipData, int i9) {
        this.f46883b = c.a(clipData, i9);
    }
}
