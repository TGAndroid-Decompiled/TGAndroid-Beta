package xg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import wg.x0;
import wg.z0;
public final class g extends rg.a {
    public TLRPC.User f60618c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country f60619e;
    public CharSequence f60620f;
    public String f60621g;
    public int h;
    public int f60622i;
    public boolean f60623j;
    public int f60624k;
    public x0 f60625l;
    public x0 f60626m;
    public z0 f60627n;
    public z0 f60628o;
    public View f60629p;

    public g(int i7, boolean z10) {
        super(i7, z10);
        this.f60624k = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f60620f = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f60618c = user;
        gVar.d = null;
        gVar.f60623j = z10;
        return gVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f60623j == gVar.f60623j) {
                    if (this.f56712a == 8) {
                        if (TextUtils.equals(this.f60621g, gVar.f60621g)) {
                            if (this.f60625l == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f60625l == null) {
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
                int i7 = this.f56712a;
                if (i7 == gVar.f56712a) {
                    if (i7 != -1 || this.f60624k == gVar.f60624k) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f60618c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f28641id;
                            } else {
                                TLRPC.InputPeer inputPeer = this.d;
                                if (inputPeer != null) {
                                    j3 = n5.n(inputPeer);
                                } else {
                                    j3 = 0;
                                }
                            }
                            TLRPC.User user2 = gVar.f60618c;
                            if (user2 != null) {
                                j10 = user2.f28641id;
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
                        int i10 = this.f56712a;
                        if (i10 != 6 || this.f60619e == gVar.f60619e) {
                            if (i10 != 7 || TextUtils.equals(this.f60620f, gVar.f60620f)) {
                                if (this.f56712a != 8 || TextUtils.equals(this.f60620f, gVar.f60620f)) {
                                    if (this.f56712a != 9 || (TextUtils.equals(this.f60620f, gVar.f60620f) && this.h == gVar.h && this.f60622i == gVar.f60622i)) {
                                        if (this.f56712a != 10 || this.f60629p == gVar.f60629p) {
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
