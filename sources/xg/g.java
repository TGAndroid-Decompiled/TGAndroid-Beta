package xg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.y0;
public final class g extends rg.a {
    public TLRPC.User f60500c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country f60501e;
    public CharSequence f60502f;
    public String f60503g;
    public int h;
    public int f60504i;
    public boolean f60505j;
    public int f60506k;
    public y0 f60507l;
    public y0 f60508m;
    public a1 f60509n;
    public a1 f60510o;
    public View f60511p;

    public g(int i7, boolean z10) {
        super(i7, z10);
        this.f60506k = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f60502f = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f60500c = user;
        gVar.d = null;
        gVar.f60505j = z10;
        return gVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f60505j == gVar.f60505j) {
                    if (this.f56599a == 8) {
                        if (TextUtils.equals(this.f60503g, gVar.f60503g)) {
                            if (this.f60507l == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f60507l == null) {
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
                int i7 = this.f56599a;
                if (i7 == gVar.f56599a) {
                    if (i7 != -1 || this.f60506k == gVar.f60506k) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f60500c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f28547id;
                            } else {
                                TLRPC.InputPeer inputPeer = this.d;
                                if (inputPeer != null) {
                                    j3 = n5.n(inputPeer);
                                } else {
                                    j3 = 0;
                                }
                            }
                            TLRPC.User user2 = gVar.f60500c;
                            if (user2 != null) {
                                j10 = user2.f28547id;
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
                        int i10 = this.f56599a;
                        if (i10 != 6 || this.f60501e == gVar.f60501e) {
                            if (i10 != 7 || TextUtils.equals(this.f60502f, gVar.f60502f)) {
                                if (this.f56599a != 8 || TextUtils.equals(this.f60502f, gVar.f60502f)) {
                                    if (this.f56599a != 9 || (TextUtils.equals(this.f60502f, gVar.f60502f) && this.h == gVar.h && this.f60504i == gVar.f60504i)) {
                                        if (this.f56599a != 10 || this.f60511p == gVar.f60511p) {
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
