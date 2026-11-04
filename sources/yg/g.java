package yg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import xg.z0;
public final class g extends sg.a {
    public TLRPC.User f59448c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f59449e;
    public TLRPC.TL_help_country f59450f;
    public CharSequence f59451g;
    public CharSequence h;
    public int f59452i;
    public int f59453j;
    public boolean f59454k;
    public int f59455l;
    public org.telegram.ui.web.d f59456m;
    public org.telegram.ui.web.d f59457n;
    public z0 f59458o;
    public z0 f59459p;
    public View f59460q;
    public Drawable f59461r;

    public g(int i3, boolean z10) {
        super(i3, z10);
        this.f59455l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f59451g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f59448c = user;
        gVar.d = null;
        gVar.f59449e = null;
        gVar.f59454k = z10;
        return gVar;
    }

    @Override
    public final boolean a(sg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f59454k == gVar.f59454k) {
                    if (this.f54715a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f59456m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f59456m == null) {
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
        long j10;
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                int i3 = this.f54715a;
                if (i3 == gVar.f54715a) {
                    if (i3 != -1 || this.f59455l == gVar.f59455l) {
                        if (i3 == 3) {
                            TLRPC.User user = this.f59448c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f27150id;
                            } else {
                                TLRPC.Chat chat = this.f59449e;
                                if (chat != null) {
                                    j10 = -chat.f27001id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = m5.n(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f59448c;
                            if (user2 != null) {
                                j11 = user2.f27150id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f59449e;
                                if (chat2 != null) {
                                    j11 = -chat2.f27001id;
                                } else {
                                    TLRPC.InputPeer inputPeer2 = gVar.d;
                                    if (inputPeer2 != null) {
                                        j11 = m5.n(inputPeer2);
                                    }
                                }
                            }
                            if (j10 != j11) {
                                return false;
                            }
                        }
                        int i10 = this.f54715a;
                        if (i10 != 6 || this.f59450f == gVar.f59450f) {
                            if (i10 != 7 || TextUtils.equals(this.f59451g, gVar.f59451g)) {
                                if (this.f54715a != 8 || TextUtils.equals(this.f59451g, gVar.f59451g)) {
                                    if (this.f54715a != 9 || (TextUtils.equals(this.f59451g, gVar.f59451g) && this.f59452i == gVar.f59452i && this.f59453j == gVar.f59453j)) {
                                        if (this.f54715a != 10 || this.f59460q == gVar.f59460q) {
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
