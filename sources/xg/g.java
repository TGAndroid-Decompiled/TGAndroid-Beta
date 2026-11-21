package xg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.y0;
public final class g extends rg.a {
    public TLRPC.User f60531c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country f60532e;
    public CharSequence f60533f;
    public String f60534g;
    public int h;
    public int f60535i;
    public boolean f60536j;
    public int f60537k;
    public y0 f60538l;
    public y0 f60539m;
    public a1 f60540n;
    public a1 f60541o;
    public View f60542p;

    public g(int i7, boolean z10) {
        super(i7, z10);
        this.f60537k = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f60533f = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f60531c = user;
        gVar.d = null;
        gVar.f60536j = z10;
        return gVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f60536j == gVar.f60536j) {
                    if (this.f56630a == 8) {
                        if (TextUtils.equals(this.f60534g, gVar.f60534g)) {
                            if (this.f60538l == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f60538l == null) {
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
                int i7 = this.f56630a;
                if (i7 == gVar.f56630a) {
                    if (i7 != -1 || this.f60537k == gVar.f60537k) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f60531c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f28580id;
                            } else {
                                TLRPC.InputPeer inputPeer = this.d;
                                if (inputPeer != null) {
                                    j3 = n5.n(inputPeer);
                                } else {
                                    j3 = 0;
                                }
                            }
                            TLRPC.User user2 = gVar.f60531c;
                            if (user2 != null) {
                                j10 = user2.f28580id;
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
                        int i10 = this.f56630a;
                        if (i10 != 6 || this.f60532e == gVar.f60532e) {
                            if (i10 != 7 || TextUtils.equals(this.f60533f, gVar.f60533f)) {
                                if (this.f56630a != 8 || TextUtils.equals(this.f60533f, gVar.f60533f)) {
                                    if (this.f56630a != 9 || (TextUtils.equals(this.f60533f, gVar.f60533f) && this.h == gVar.h && this.f60535i == gVar.f60535i)) {
                                        if (this.f56630a != 10 || this.f60542p == gVar.f60542p) {
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
