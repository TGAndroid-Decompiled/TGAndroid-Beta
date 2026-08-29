package ph;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 {
    public int f46163a;
    public long f46164b;
    public long f46165c;
    public long d;
    public String f46166e;
    public String f46167f;
    public int f46168g;
    public int h;
    public long f46169i;
    public TLRPC.BotApp f46170j;
    public boolean f46171k;
    public String f46172l;
    public TLRPC.User f46173m;
    public int f46174n;
    public boolean f46175o;
    public boolean f46176p;
    public TLObject f46177q;
    public long f46178r;

    public static y3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f46163a = i10;
        obj.f46164b = j10;
        obj.f46165c = j11;
        obj.f46166e = str;
        obj.f46167f = str2;
        obj.f46168g = i11;
        obj.h = i12;
        obj.f46169i = j12;
        obj.f46170j = botApp;
        obj.f46171k = z10;
        obj.f46172l = str3;
        obj.f46173m = user;
        obj.f46174n = i13;
        obj.f46175o = z11;
        obj.f46176p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f46175o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f46176p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f46177q = tLObject;
        this.f46178r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof y3) {
            y3 y3Var = (y3) obj;
            if (this.f46163a == y3Var.f46163a && this.f46164b == y3Var.f46164b && this.f46165c == y3Var.f46165c && TextUtils.equals(this.f46167f, y3Var.f46167f) && this.f46168g == y3Var.f46168g && this.h == y3Var.h) {
                TLRPC.BotApp botApp = this.f46170j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f22389id;
                }
                TLRPC.BotApp botApp2 = y3Var.f46170j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f22389id;
                }
                if (j10 == j11 && this.f46171k == y3Var.f46171k && TextUtils.equals(this.f46172l, y3Var.f46172l)) {
                    TLRPC.User user = this.f46173m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f22539id;
                    }
                    TLRPC.User user2 = y3Var.f46173m;
                    if (user2 != null) {
                        j13 = user2.f22539id;
                    }
                    if (j12 == j13 && this.f46174n == y3Var.f46174n) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
