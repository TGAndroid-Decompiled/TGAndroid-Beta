package xh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s3 {
    public int f54040a;
    public long f54041b;
    public long f54042c;
    public long d;
    public String e;
    public String f54043f;
    public int f54044g;
    public int h;
    public long f54045i;
    public TLRPC.BotApp f54046j;
    public boolean f54047k;
    public String f54048l;
    public TLRPC.User f54049m;
    public int f54050n;
    public boolean f54051o;
    public boolean f54052p;
    public TLObject f54053q;
    public long f54054r;

    public static s3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        ?? obj = new Object();
        obj.f54040a = i10;
        obj.f54041b = j10;
        obj.f54042c = j11;
        obj.e = str;
        obj.f54043f = str2;
        obj.f54044g = i11;
        obj.h = i12;
        obj.f54045i = j12;
        obj.f54046j = botApp;
        obj.f54047k = z10;
        obj.f54048l = str3;
        obj.f54049m = user;
        obj.f54050n = i13;
        obj.f54051o = z11;
        obj.f54052p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                obj.f54051o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                obj.f54052p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return obj;
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        return obj;
    }

    public final void a(TLObject tLObject) {
        this.f54053q = tLObject;
        this.f54054r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (obj instanceof s3) {
            s3 s3Var = (s3) obj;
            if (this.f54040a == s3Var.f54040a && this.f54041b == s3Var.f54041b && this.f54042c == s3Var.f54042c && TextUtils.equals(this.f54043f, s3Var.f54043f) && this.f54044g == s3Var.f54044g && this.h == s3Var.h) {
                TLRPC.BotApp botApp = this.f54046j;
                long j13 = 0;
                if (botApp == null) {
                    j10 = 0;
                } else {
                    j10 = botApp.f19790id;
                }
                TLRPC.BotApp botApp2 = s3Var.f54046j;
                if (botApp2 == null) {
                    j11 = 0;
                } else {
                    j11 = botApp2.f19790id;
                }
                if (j10 == j11 && this.f54047k == s3Var.f54047k && TextUtils.equals(this.f54048l, s3Var.f54048l)) {
                    TLRPC.User user = this.f54049m;
                    if (user == null) {
                        j12 = 0;
                    } else {
                        j12 = user.f19942id;
                    }
                    TLRPC.User user2 = s3Var.f54049m;
                    if (user2 != null) {
                        j13 = user2.f19942id;
                    }
                    if (j12 == j13 && this.f54050n == s3Var.f54050n) {
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
