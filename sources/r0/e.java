package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
public final class e implements d, f {
    public final int f53998a = 0;
    public ClipData f53999b;
    public int f54000c;
    public int d;
    public Uri f54001e;
    public Bundle f54002f;

    public e() {
    }

    @Override
    public ClipData a() {
        return this.f53999b;
    }

    @Override
    public void b(Uri uri) {
        this.f54001e = uri;
    }

    @Override
    public g build() {
        return new g(new e(this));
    }

    @Override
    public void c(int i3) {
        this.d = i3;
    }

    @Override
    public ContentInfo d() {
        return null;
    }

    @Override
    public int e() {
        return this.f54000c;
    }

    @Override
    public int l() {
        return this.d;
    }

    @Override
    public void setExtras(Bundle bundle) {
        this.f54002f = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f53998a) {
            case 1:
                Uri uri = this.f54001e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f53999b.getDescription());
                sb2.append(", source=");
                int i3 = this.f54000c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        str = String.valueOf(i3);
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
                if (this.f54002f != null) {
                    str3 = ", hasExtras";
                }
                return a1.g.s(sb2, str3, "}");
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.f53999b;
        clipData.getClass();
        this.f53999b = clipData;
        int i3 = eVar.f54000c;
        if (i3 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i3 <= 5) {
            this.f54000c = i3;
            int i10 = eVar.d;
            if ((i10 & 1) == i10) {
                this.d = i10;
                this.f54001e = eVar.f54001e;
                this.f54002f = eVar.f54002f;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
