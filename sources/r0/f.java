package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
public final class f implements e, g {
    public final int f46448a = 0;
    public ClipData f46449b;
    public int f46450c;
    public int d;
    public Uri f46451e;
    public Bundle f46452f;

    public f() {
    }

    @Override
    public ClipData a() {
        return this.f46449b;
    }

    @Override
    public void b(Uri uri) {
        this.f46451e = uri;
    }

    @Override
    public h build() {
        return new h(new f(this));
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
        return this.f46450c;
    }

    @Override
    public int f() {
        return this.d;
    }

    @Override
    public void setExtras(Bundle bundle) {
        this.f46452f = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f46448a) {
            case 1:
                Uri uri = this.f46451e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f46449b.getDescription());
                sb.append(", source=");
                int i10 = this.f46450c;
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
                sb.append(str);
                sb.append(", flags=");
                int i11 = this.d;
                if ((i11 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i11);
                }
                sb.append(valueOf);
                String str3 = "";
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (this.f46452f != null) {
                    str3 = ", hasExtras";
                }
                return android.support.v4.media.a.r(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    public f(f fVar) {
        ClipData clipData = fVar.f46449b;
        clipData.getClass();
        this.f46449b = clipData;
        int i10 = fVar.f46450c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i10 <= 5) {
            this.f46450c = i10;
            int i11 = fVar.d;
            if ((i11 & 1) == i11) {
                this.d = i11;
                this.f46451e = fVar.f46451e;
                this.f46452f = fVar.f46452f;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
