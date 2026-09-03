package sh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y3 {
    public int f47824a;
    public long f47825b;
    public long f47826c;
    public long d;
    public String f47827e;
    public String f47828f;
    public int f47829g;
    public int h;
    public long f47830i;
    public TLRPC.BotApp f47831j;
    public boolean f47832k;
    public String f47833l;
    public TLRPC.User f47834m;
    public int f47835n;
    public boolean f47836o;
    public boolean f47837p;
    public TLObject f47838q;
    public long f47839r;

    public static y3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z4, String str3, TLRPC.User user, int i13, boolean z10, boolean z11) {
        ?? obj = new Object();
        obj.f47824a = i10;
        obj.f47825b = j10;
        obj.f47826c = j11;
        obj.f47827e = str;
        obj.f47828f = str2;
        obj.f47829g = i11;
        obj.h = i12;
        obj.f47830i = j12;
        obj.f47831j = botApp;
        obj.f47832k = z4;
        obj.f47833l = str3;
        obj.f47834m = user;
        obj.f47835n = i13;
        obj.f47836o = z10;
        obj.f47837p = z11;
        if (!z10 && !z11 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f47836o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f47837p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f47838q = tLObject;
        this.f47839r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof y3) {
            y3 y3Var = (y3) obj;
            if (this.f47824a == y3Var.f47824a && this.f47825b == y3Var.f47825b && this.f47826c == y3Var.f47826c && TextUtils.equals(this.f47828f, y3Var.f47828f) && this.f47829g == y3Var.f47829g && this.h == y3Var.h) {
                TLRPC.BotApp botApp = this.f47831j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f20842id;
                }
                TLRPC.BotApp botApp2 = y3Var.f47831j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f20842id;
                }
                if (j10 == j11 && this.f47832k == y3Var.f47832k && TextUtils.equals(this.f47833l, y3Var.f47833l)) {
                    TLRPC.User user = this.f47834m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f20992id;
                    }
                    TLRPC.User user2 = y3Var.f47834m;
                    if (user2 != null) {
                        j13 = user2.f20992id;
                    }
                    if (j12 == j13 && this.f47835n == y3Var.f47835n) {
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
