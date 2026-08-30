package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
public final class d implements e, g {
    public final int f43088a = 0;
    public final Object f43089b;

    public d(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f43089b = contentInfo;
    }

    @Override
    public ClipData a() {
        return ((ContentInfo) this.f43089b).getClip();
    }

    @Override
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f43089b).setLinkUri(uri);
    }

    @Override
    public h build() {
        return new h(new d(((ContentInfo.Builder) this.f43089b).build()));
    }

    @Override
    public void c(int i10) {
        ((ContentInfo.Builder) this.f43089b).setFlags(i10);
    }

    @Override
    public ContentInfo d() {
        return (ContentInfo) this.f43089b;
    }

    @Override
    public int e() {
        return ((ContentInfo) this.f43089b).getSource();
    }

    @Override
    public int f() {
        return ((ContentInfo) this.f43089b).getFlags();
    }

    @Override
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f43089b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f43088a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f43089b) + "}";
            default:
                return super.toString();
        }
    }

    public d(ClipData clipData, int i10) {
        this.f43089b = c.a(clipData, i10);
    }
}
