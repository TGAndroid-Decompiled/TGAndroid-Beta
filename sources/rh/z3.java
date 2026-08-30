package rh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z3 {
    public int f43867a;
    public long f43868b;
    public long f43869c;
    public long d;
    public String e;
    public String f43870f;
    public int f43871g;
    public int h;
    public long f43872i;
    public TLRPC.BotApp f43873j;
    public boolean f43874k;
    public String f43875l;
    public TLRPC.User f43876m;
    public int f43877n;
    public boolean f43878o;
    public boolean f43879p;
    public TLObject f43880q;
    public long f43881r;

    public static z3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z4, String str3, TLRPC.User user, int i13, boolean z10, boolean z11) {
        ?? obj = new Object();
        obj.f43867a = i10;
        obj.f43868b = j10;
        obj.f43869c = j11;
        obj.e = str;
        obj.f43870f = str2;
        obj.f43871g = i11;
        obj.h = i12;
        obj.f43872i = j12;
        obj.f43873j = botApp;
        obj.f43874k = z4;
        obj.f43875l = str3;
        obj.f43876m = user;
        obj.f43877n = i13;
        obj.f43878o = z10;
        obj.f43879p = z11;
        if (!z10 && !z11 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f43878o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f43879p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f43880q = tLObject;
        this.f43881r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof z3) {
            z3 z3Var = (z3) obj;
            if (this.f43867a == z3Var.f43867a && this.f43868b == z3Var.f43868b && this.f43869c == z3Var.f43869c && TextUtils.equals(this.f43870f, z3Var.f43870f) && this.f43871g == z3Var.f43871g && this.h == z3Var.h) {
                TLRPC.BotApp botApp = this.f43873j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f19181id;
                }
                TLRPC.BotApp botApp2 = z3Var.f43873j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f19181id;
                }
                if (j10 == j11 && this.f43874k == z3Var.f43874k && TextUtils.equals(this.f43875l, z3Var.f43875l)) {
                    TLRPC.User user = this.f43876m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f19331id;
                    }
                    TLRPC.User user2 = z3Var.f43876m;
                    if (user2 != null) {
                        j13 = user2.f19331id;
                    }
                    if (j12 == j13 && this.f43877n == z3Var.f43877n) {
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
