package xg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import ug.a0;
import wg.z0;
public final class g extends rg.a {
    public TLRPC.User f60489c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country f60490e;
    public CharSequence f60491f;
    public String f60492g;
    public int h;
    public int f60493i;
    public boolean f60494j;
    public int f60495k;
    public a0 f60496l;
    public a0 f60497m;
    public z0 f60498n;
    public z0 f60499o;
    public View f60500p;

    public g(int i7, boolean z10) {
        super(i7, z10);
        this.f60495k = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f60491f = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f60489c = user;
        gVar.d = null;
        gVar.f60494j = z10;
        return gVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f60494j == gVar.f60494j) {
                    if (this.f56589a == 8) {
                        if (TextUtils.equals(this.f60492g, gVar.f60492g)) {
                            if (this.f60496l == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f60496l == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10 == z11) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        long j3;
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                int i7 = this.f56589a;
                if (i7 == gVar.f56589a) {
                    if (i7 != -1 || this.f60495k == gVar.f60495k) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f60489c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f28554id;
                            } else {
                                TLRPC.InputPeer inputPeer = this.d;
                                if (inputPeer != null) {
                                    j3 = n5.n(inputPeer);
                                } else {
                                    j3 = 0;
                                }
                            }
                            TLRPC.User user2 = gVar.f60489c;
                            if (user2 != null) {
                                j10 = user2.f28554id;
                            } else {
                                TLRPC.InputPeer inputPeer2 = gVar.d;
                                if (inputPeer2 != null) {
                                    j10 = n5.n(inputPeer2);
                                }
                            }
                            if (j3 != j10) {
                                return false;
                            }
                        }
                        int i10 = this.f56589a;
                        if (i10 != 6 || this.f60490e == gVar.f60490e) {
                            if (i10 != 7 || TextUtils.equals(this.f60491f, gVar.f60491f)) {
                                if (this.f56589a != 8 || TextUtils.equals(this.f60491f, gVar.f60491f)) {
                                    if (this.f56589a != 9 || (TextUtils.equals(this.f60491f, gVar.f60491f) && this.h == gVar.h && this.f60493i == gVar.f60493i)) {
                                        if (this.f56589a != 10 || this.f60500p == gVar.f60500p) {
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
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
