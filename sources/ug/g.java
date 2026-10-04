package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sq;
import org.telegram.ui.py0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f47653c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47654e;
    public TLRPC.TL_help_country f47655f;
    public CharSequence f47656g;
    public String h;
    public int f47657i;
    public int f47658j;
    public boolean f47659k;
    public int f47660l;
    public py0 f47661m;
    public py0 f47662n;
    public c1 f47663o;
    public c1 f47664p;
    public View f47665q;
    public sq f47666r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f47660l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f47656g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f47653c = user;
        gVar.d = null;
        gVar.f47654e = null;
        gVar.f47659k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f47659k == gVar.f47659k) {
                    if (this.f17182a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f47661m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f47661m == null) {
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
                int i10 = this.f17182a;
                if (i10 == gVar.f17182a) {
                    if (i10 != -1 || this.f47660l == gVar.f47660l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f47653c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20184id;
                            } else {
                                TLRPC.Chat chat = this.f47654e;
                                if (chat != null) {
                                    j3 = -chat.f20037id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f47653c;
                            if (user2 != null) {
                                j10 = user2.f20184id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f47654e;
                                if (chat2 != null) {
                                    j10 = -chat2.f20037id;
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
                        int i11 = this.f17182a;
                        if (i11 != 6 || this.f47655f == gVar.f47655f) {
                            if (i11 != 7 || TextUtils.equals(this.f47656g, gVar.f47656g)) {
                                if (this.f17182a != 8 || TextUtils.equals(this.f47656g, gVar.f47656g)) {
                                    if (this.f17182a != 9 || (TextUtils.equals(this.f47656g, gVar.f47656g) && this.f47657i == gVar.f47657i && this.f47658j == gVar.f47658j)) {
                                        if (this.f17182a != 10 || this.f47665q == gVar.f47665q) {
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
