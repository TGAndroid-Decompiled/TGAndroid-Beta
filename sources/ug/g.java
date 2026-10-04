package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sq;
import org.telegram.ui.py0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f47654c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47655e;
    public TLRPC.TL_help_country f47656f;
    public CharSequence f47657g;
    public String h;
    public int f47658i;
    public int f47659j;
    public boolean f47660k;
    public int f47661l;
    public py0 f47662m;
    public py0 f47663n;
    public c1 f47664o;
    public c1 f47665p;
    public View f47666q;
    public sq f47667r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f47661l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f47657g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f47654c = user;
        gVar.d = null;
        gVar.f47655e = null;
        gVar.f47660k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f47660k == gVar.f47660k) {
                    if (this.f17183a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f47662m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f47662m == null) {
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
                int i10 = this.f17183a;
                if (i10 == gVar.f17183a) {
                    if (i10 != -1 || this.f47661l == gVar.f47661l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f47654c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20185id;
                            } else {
                                TLRPC.Chat chat = this.f47655e;
                                if (chat != null) {
                                    j3 = -chat.f20038id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f47654c;
                            if (user2 != null) {
                                j10 = user2.f20185id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f47655e;
                                if (chat2 != null) {
                                    j10 = -chat2.f20038id;
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
                        int i11 = this.f17183a;
                        if (i11 != 6 || this.f47656f == gVar.f47656f) {
                            if (i11 != 7 || TextUtils.equals(this.f47657g, gVar.f47657g)) {
                                if (this.f17183a != 8 || TextUtils.equals(this.f47657g, gVar.f47657g)) {
                                    if (this.f17183a != 9 || (TextUtils.equals(this.f47657g, gVar.f47657g) && this.f47658i == gVar.f47658i && this.f47659j == gVar.f47659j)) {
                                        if (this.f17183a != 10 || this.f47666q == gVar.f47666q) {
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
