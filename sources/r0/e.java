package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
public final class e implements d, f {
    public final int f46833a = 0;
    public ClipData f46834b;
    public int f46835c;
    public int d;
    public Uri f46836e;
    public Bundle f46837f;

    public e() {
    }

    @Override
    public ClipData a() {
        return this.f46834b;
    }

    @Override
    public void b(Uri uri) {
        this.f46836e = uri;
    }

    @Override
    public g build() {
        return new g(new e(this));
    }

    @Override
    public void c(int i10) {
        this.d = i10;
    }

    @Override
    public ContentInfo d() {
        return null;
    }

    @Override
    public int e() {
        return this.f46835c;
    }

    @Override
    public int k() {
        return this.d;
    }

    @Override
    public void setExtras(Bundle bundle) {
        this.f46837f = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f46833a) {
            case 1:
                Uri uri = this.f46836e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f46834b.getDescription());
                sb2.append(", source=");
                int i10 = this.f46835c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        str = String.valueOf(i10);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb2.append(str);
                sb2.append(", flags=");
                int i11 = this.d;
                if ((i11 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i11);
                }
                sb2.append(valueOf);
                String str3 = "";
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str2);
                if (this.f46837f != null) {
                    str3 = ", hasExtras";
                }
                return a1.g.t(sb2, str3, "}");
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.f46834b;
        clipData.getClass();
        this.f46834b = clipData;
        int i10 = eVar.f46835c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i10 <= 5) {
            this.f46835c = i10;
            int i11 = eVar.d;
            if ((i11 & 1) == i11) {
                this.d = i11;
                this.f46836e = eVar.f46836e;
                this.f46837f = eVar.f46837f;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
