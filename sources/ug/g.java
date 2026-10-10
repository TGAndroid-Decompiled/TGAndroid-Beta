package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr;
import org.telegram.ui.vy0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f48971c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f48972e;
    public TLRPC.TL_help_country f48973f;
    public CharSequence f48974g;
    public String h;
    public int f48975i;
    public int f48976j;
    public boolean f48977k;
    public int f48978l;
    public vy0 f48979m;
    public vy0 f48980n;
    public c1 f48981o;
    public c1 f48982p;
    public View f48983q;
    public fr f48984r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48978l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48974g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48971c = user;
        gVar.d = null;
        gVar.f48972e = null;
        gVar.f48977k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48977k == gVar.f48977k) {
                    if (this.f17129a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48979m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48979m == null) {
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
                int i10 = this.f17129a;
                if (i10 == gVar.f17129a) {
                    if (i10 != -1 || this.f48978l == gVar.f48978l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48971c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20189id;
                            } else {
                                TLRPC.Chat chat = this.f48972e;
                                if (chat != null) {
                                    j3 = -chat.f20042id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f48971c;
                            if (user2 != null) {
                                j10 = user2.f20189id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f48972e;
                                if (chat2 != null) {
                                    j10 = -chat2.f20042id;
                                } else {
                                    TLRPC.InputPeer inputPeer2 = gVar.d;
                                    if (inputPeer2 != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer2);
                                    }
                                }
                            }
                            if (j3 != j10) {
                                return false;
                            }
                        }
                        int i11 = this.f17129a;
                        if (i11 != 6 || this.f48973f == gVar.f48973f) {
                            if (i11 != 7 || TextUtils.equals(this.f48974g, gVar.f48974g)) {
                                if (this.f17129a != 8 || TextUtils.equals(this.f48974g, gVar.f48974g)) {
                                    if (this.f17129a != 9 || (TextUtils.equals(this.f48974g, gVar.f48974g) && this.f48975i == gVar.f48975i && this.f48976j == gVar.f48976j)) {
                                        if (this.f17129a != 10 || this.f48983q == gVar.f48983q) {
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
