package rh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 {
    public int f43919a;
    public long f43920b;
    public long f43921c;
    public long d;
    public String e;
    public String f43922f;
    public int f43923g;
    public int h;
    public long f43924i;
    public TLRPC.BotApp f43925j;
    public boolean f43926k;
    public String f43927l;
    public TLRPC.User f43928m;
    public int f43929n;
    public boolean f43930o;
    public boolean f43931p;
    public TLObject f43932q;
    public long f43933r;

    public static y3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z4, String str3, TLRPC.User user, int i13, boolean z10, boolean z11) {
        ?? obj = new Object();
        obj.f43919a = i10;
        obj.f43920b = j10;
        obj.f43921c = j11;
        obj.e = str;
        obj.f43922f = str2;
        obj.f43923g = i11;
        obj.h = i12;
        obj.f43924i = j12;
        obj.f43925j = botApp;
        obj.f43926k = z4;
        obj.f43927l = str3;
        obj.f43928m = user;
        obj.f43929n = i13;
        obj.f43930o = z10;
        obj.f43931p = z11;
        if (!z10 && !z11 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f43930o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f43931p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f43932q = tLObject;
        this.f43933r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof y3) {
            y3 y3Var = (y3) obj;
            if (this.f43919a == y3Var.f43919a && this.f43920b == y3Var.f43920b && this.f43921c == y3Var.f43921c && TextUtils.equals(this.f43922f, y3Var.f43922f) && this.f43923g == y3Var.f43923g && this.h == y3Var.h) {
                TLRPC.BotApp botApp = this.f43925j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f19156id;
                }
                TLRPC.BotApp botApp2 = y3Var.f43925j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f19156id;
                }
                if (j10 == j11 && this.f43926k == y3Var.f43926k && TextUtils.equals(this.f43927l, y3Var.f43927l)) {
                    TLRPC.User user = this.f43928m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f19306id;
                    }
                    TLRPC.User user2 = y3Var.f43928m;
                    if (user2 != null) {
                        j13 = user2.f19306id;
                    }
                    if (j12 == j13 && this.f43929n == y3Var.f43929n) {
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
