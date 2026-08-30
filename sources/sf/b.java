package sf;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class b {
    public final String f44302a;
    public final String f44303b;

    public b(String str, String str2) {
        this.f44302a = str;
        this.f44303b = str2;
    }

    public static boolean a(b bVar, b bVar2) {
        if (bVar == bVar2) {
            return true;
        }
        if (bVar != null && bVar2 != null) {
            return bVar.equals(bVar2);
        }
        return false;
    }

    public static b c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new b(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (!(chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
            return null;
        }
        return new b(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
    }

    public static b d(String str) {
        return new b(str, null);
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.f44302a) && TextUtils.isEmpty(this.f44303b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f44302a, bVar.f44302a) && TextUtils.equals(this.f44303b, bVar.f44303b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f44302a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        String str2 = this.f44303b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i11 ^ i10;
    }
}
