package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
public final class e implements d, f {
    public final int f45589a = 0;
    public ClipData f45590b;
    public int f45591c;
    public int d;
    public Uri f45592e;
    public Bundle f45593f;

    public e() {
    }

    @Override
    public ClipData a() {
        return this.f45590b;
    }

    @Override
    public void b(Uri uri) {
        this.f45592e = uri;
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
        return this.f45591c;
    }

    @Override
    public int k() {
        return this.d;
    }

    @Override
    public void setExtras(Bundle bundle) {
        this.f45593f = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f45589a) {
            case 1:
                Uri uri = this.f45592e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f45590b.getDescription());
                sb2.append(", source=");
                int i10 = this.f45591c;
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
                if (this.f45593f != null) {
                    str3 = ", hasExtras";
                }
                return a4.a.t(sb2, str3, "}");
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.f45590b;
        clipData.getClass();
        this.f45590b = clipData;
        int i10 = eVar.f45591c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i10 <= 5) {
            this.f45591c = i10;
            int i11 = eVar.d;
            if ((i11 & 1) == i11) {
                this.d = i11;
                this.f45592e = eVar.f45592e;
                this.f45593f = eVar.f45593f;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
