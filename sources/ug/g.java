package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sq;
import org.telegram.ui.py0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f47662c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47663e;
    public TLRPC.TL_help_country f47664f;
    public CharSequence f47665g;
    public String h;
    public int f47666i;
    public int f47667j;
    public boolean f47668k;
    public int f47669l;
    public py0 f47670m;
    public py0 f47671n;
    public c1 f47672o;
    public c1 f47673p;
    public View f47674q;
    public sq f47675r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f47669l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f47665g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f47662c = user;
        gVar.d = null;
        gVar.f47663e = null;
        gVar.f47668k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f47668k == gVar.f47668k) {
                    if (this.f17187a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f47670m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f47670m == null) {
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
                int i10 = this.f17187a;
                if (i10 == gVar.f17187a) {
                    if (i10 != -1 || this.f47669l == gVar.f47669l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f47662c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20189id;
                            } else {
                                TLRPC.Chat chat = this.f47663e;
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
                            TLRPC.User user2 = gVar.f47662c;
                            if (user2 != null) {
                                j10 = user2.f20189id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f47663e;
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
                        int i11 = this.f17187a;
                        if (i11 != 6 || this.f47664f == gVar.f47664f) {
                            if (i11 != 7 || TextUtils.equals(this.f47665g, gVar.f47665g)) {
                                if (this.f17187a != 8 || TextUtils.equals(this.f47665g, gVar.f47665g)) {
                                    if (this.f17187a != 9 || (TextUtils.equals(this.f47665g, gVar.f47665g) && this.f47666i == gVar.f47666i && this.f47667j == gVar.f47667j)) {
                                        if (this.f17187a != 10 || this.f47674q == gVar.f47674q) {
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
