package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
public final class e implements d, f {
    public final int f44676a = 0;
    public ClipData f44677b;
    public int f44678c;
    public int d;
    public Uri f44679e;
    public Bundle f44680f;

    public e() {
    }

    @Override
    public ClipData a() {
        return this.f44677b;
    }

    @Override
    public void b(Uri uri) {
        this.f44679e = uri;
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
        return this.f44678c;
    }

    @Override
    public int k() {
        return this.d;
    }

    @Override
    public void setExtras(Bundle bundle) {
        this.f44680f = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f44676a) {
            case 1:
                Uri uri = this.f44679e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f44677b.getDescription());
                sb2.append(", source=");
                int i10 = this.f44678c;
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
                if (this.f44680f != null) {
                    str3 = ", hasExtras";
                }
                return a4.a.s(sb2, str3, "}");
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.f44677b;
        clipData.getClass();
        this.f44677b = clipData;
        int i10 = eVar.f44678c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i10 <= 5) {
            this.f44678c = i10;
            int i11 = eVar.d;
            if ((i11 & 1) == i11) {
                this.d = i11;
                this.f44679e = eVar.f44679e;
                this.f44680f = eVar.f44680f;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
