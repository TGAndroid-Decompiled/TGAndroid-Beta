package xg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import ug.a0;
import wg.z0;
public final class g extends rg.a {
    public TLRPC.User f60490c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country f60491e;
    public CharSequence f60492f;
    public String f60493g;
    public int h;
    public int f60494i;
    public boolean f60495j;
    public int f60496k;
    public a0 f60497l;
    public a0 f60498m;
    public z0 f60499n;
    public z0 f60500o;
    public View f60501p;

    public g(int i7, boolean z10) {
        super(i7, z10);
        this.f60496k = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f60492f = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f60490c = user;
        gVar.d = null;
        gVar.f60495j = z10;
        return gVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f60495j == gVar.f60495j) {
                    if (this.f56589a == 8) {
                        if (TextUtils.equals(this.f60493g, gVar.f60493g)) {
                            if (this.f60497l == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f60497l == null) {
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
                    if (i7 != -1 || this.f60496k == gVar.f60496k) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f60490c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f28552id;
                            } else {
                                TLRPC.InputPeer inputPeer = this.d;
                                if (inputPeer != null) {
                                    j3 = n5.n(inputPeer);
                                } else {
                                    j3 = 0;
                                }
                            }
                            TLRPC.User user2 = gVar.f60490c;
                            if (user2 != null) {
                                j10 = user2.f28552id;
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
                        if (i10 != 6 || this.f60491e == gVar.f60491e) {
                            if (i10 != 7 || TextUtils.equals(this.f60492f, gVar.f60492f)) {
                                if (this.f56589a != 8 || TextUtils.equals(this.f60492f, gVar.f60492f)) {
                                    if (this.f56589a != 9 || (TextUtils.equals(this.f60492f, gVar.f60492f) && this.h == gVar.h && this.f60494i == gVar.f60494i)) {
                                        if (this.f56589a != 10 || this.f60501p == gVar.f60501p) {
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
