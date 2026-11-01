package xh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t3 {
    public int f54070a;
    public long f54071b;
    public long f54072c;
    public long d;
    public String e;
    public String f54073f;
    public int f54074g;
    public int h;
    public long f54075i;
    public TLRPC.BotApp f54076j;
    public boolean f54077k;
    public String f54078l;
    public TLRPC.User f54079m;
    public int f54080n;
    public boolean f54081o;
    public boolean f54082p;
    public TLObject f54083q;
    public long f54084r;

    public static t3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f54070a = i10;
        obj.f54071b = j10;
        obj.f54072c = j11;
        obj.e = str;
        obj.f54073f = str2;
        obj.f54074g = i11;
        obj.h = i12;
        obj.f54075i = j12;
        obj.f54076j = botApp;
        obj.f54077k = z10;
        obj.f54078l = str3;
        obj.f54079m = user;
        obj.f54080n = i13;
        obj.f54081o = z11;
        obj.f54082p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f54081o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f54082p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f54083q = tLObject;
        this.f54084r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            if (this.f54070a == t3Var.f54070a && this.f54071b == t3Var.f54071b && this.f54072c == t3Var.f54072c && TextUtils.equals(this.f54073f, t3Var.f54073f) && this.f54074g == t3Var.f54074g && this.h == t3Var.h) {
                TLRPC.BotApp botApp = this.f54076j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f19791id;
                }
                TLRPC.BotApp botApp2 = t3Var.f54076j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f19791id;
                }
                if (j10 == j11 && this.f54077k == t3Var.f54077k && TextUtils.equals(this.f54078l, t3Var.f54078l)) {
                    TLRPC.User user = this.f54079m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f19943id;
                    }
                    TLRPC.User user2 = t3Var.f54079m;
                    if (user2 != null) {
                        j13 = user2.f19943id;
                    }
                    if (j12 == j13 && this.f54080n == t3Var.f54080n) {
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
