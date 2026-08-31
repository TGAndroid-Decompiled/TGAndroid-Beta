package sh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 {
    public int f47788a;
    public long f47789b;
    public long f47790c;
    public long d;
    public String f47791e;
    public String f47792f;
    public int f47793g;
    public int h;
    public long f47794i;
    public TLRPC.BotApp f47795j;
    public boolean f47796k;
    public String f47797l;
    public TLRPC.User f47798m;
    public int f47799n;
    public boolean f47800o;
    public boolean f47801p;
    public TLObject f47802q;
    public long f47803r;

    public static y3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z4, String str3, TLRPC.User user, int i13, boolean z10, boolean z11) {
        ?? obj = new Object();
        obj.f47788a = i10;
        obj.f47789b = j10;
        obj.f47790c = j11;
        obj.f47791e = str;
        obj.f47792f = str2;
        obj.f47793g = i11;
        obj.h = i12;
        obj.f47794i = j12;
        obj.f47795j = botApp;
        obj.f47796k = z4;
        obj.f47797l = str3;
        obj.f47798m = user;
        obj.f47799n = i13;
        obj.f47800o = z10;
        obj.f47801p = z11;
        if (!z10 && !z11 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f47800o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f47801p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f47802q = tLObject;
        this.f47803r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof y3) {
            y3 y3Var = (y3) obj;
            if (this.f47788a == y3Var.f47788a && this.f47789b == y3Var.f47789b && this.f47790c == y3Var.f47790c && TextUtils.equals(this.f47792f, y3Var.f47792f) && this.f47793g == y3Var.f47793g && this.h == y3Var.h) {
                TLRPC.BotApp botApp = this.f47795j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f20840id;
                }
                TLRPC.BotApp botApp2 = y3Var.f47795j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f20840id;
                }
                if (j10 == j11 && this.f47796k == y3Var.f47796k && TextUtils.equals(this.f47797l, y3Var.f47797l)) {
                    TLRPC.User user = this.f47798m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f20990id;
                    }
                    TLRPC.User user2 = y3Var.f47798m;
                    if (user2 != null) {
                        j13 = user2.f20990id;
                    }
                    if (j12 == j13 && this.f47799n == y3Var.f47799n) {
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
