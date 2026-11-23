package xg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.y0;
public final class g extends rg.a {
    public TLRPC.User f60535c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country f60536e;
    public CharSequence f60537f;
    public String f60538g;
    public int h;
    public int f60539i;
    public boolean f60540j;
    public int f60541k;
    public y0 f60542l;
    public y0 f60543m;
    public a1 f60544n;
    public a1 f60545o;
    public View f60546p;

    public g(int i7, boolean z10) {
        super(i7, z10);
        this.f60541k = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f60537f = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f60535c = user;
        gVar.d = null;
        gVar.f60540j = z10;
        return gVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f60540j == gVar.f60540j) {
                    if (this.f56634a == 8) {
                        if (TextUtils.equals(this.f60538g, gVar.f60538g)) {
                            if (this.f60542l == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f60542l == null) {
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
                int i7 = this.f56634a;
                if (i7 == gVar.f56634a) {
                    if (i7 != -1 || this.f60541k == gVar.f60541k) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f60535c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f28583id;
                            } else {
                                TLRPC.InputPeer inputPeer = this.d;
                                if (inputPeer != null) {
                                    j3 = n5.n(inputPeer);
                                } else {
                                    j3 = 0;
                                }
                            }
                            TLRPC.User user2 = gVar.f60535c;
                            if (user2 != null) {
                                j10 = user2.f28583id;
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
                        int i10 = this.f56634a;
                        if (i10 != 6 || this.f60536e == gVar.f60536e) {
                            if (i10 != 7 || TextUtils.equals(this.f60537f, gVar.f60537f)) {
                                if (this.f56634a != 8 || TextUtils.equals(this.f60537f, gVar.f60537f)) {
                                    if (this.f56634a != 9 || (TextUtils.equals(this.f60537f, gVar.f60537f) && this.h == gVar.h && this.f60539i == gVar.f60539i)) {
                                        if (this.f56634a != 10 || this.f60546p == gVar.f60546p) {
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
