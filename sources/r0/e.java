package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
public final class e implements d, f {
    public final int f54185a = 0;
    public ClipData f54186b;
    public int f54187c;
    public int d;
    public Uri f54188e;
    public Bundle f54189f;

    public e() {
    }

    @Override
    public ClipData a() {
        return this.f54186b;
    }

    @Override
    public void b(Uri uri) {
        this.f54188e = uri;
    }

    @Override
    public g build() {
        return new g(new e(this));
    }

    @Override
    public void c(int i7) {
        this.d = i7;
    }

    @Override
    public ContentInfo d() {
        return null;
    }

    @Override
    public int e() {
        return this.f54187c;
    }

    @Override
    public int l() {
        return this.d;
    }

    @Override
    public void setExtras(Bundle bundle) {
        this.f54189f = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f54185a) {
            case 1:
                Uri uri = this.f54188e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f54186b.getDescription());
                sb2.append(", source=");
                int i7 = this.f54187c;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        str = String.valueOf(i7);
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
                int i10 = this.d;
                if ((i10 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i10);
                }
                sb2.append(valueOf);
                String str3 = "";
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str2);
                if (this.f54189f != null) {
                    str3 = ", hasExtras";
                }
                return a8.p0.s(sb2, str3, "}");
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.f54186b;
        clipData.getClass();
        this.f54186b = clipData;
        int i7 = eVar.f54187c;
        if (i7 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i7 <= 5) {
            this.f54187c = i7;
            int i10 = eVar.d;
            if ((i10 & 1) == i10) {
                this.d = i10;
                this.f54188e = eVar.f54188e;
                this.f54189f = eVar.f54189f;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
