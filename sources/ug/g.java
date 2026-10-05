package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sq;
import org.telegram.ui.py0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f47669c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47670e;
    public TLRPC.TL_help_country f47671f;
    public CharSequence f47672g;
    public String h;
    public int f47673i;
    public int f47674j;
    public boolean f47675k;
    public int f47676l;
    public py0 f47677m;
    public py0 f47678n;
    public c1 f47679o;
    public c1 f47680p;
    public View f47681q;
    public sq f47682r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f47676l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f47672g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f47669c = user;
        gVar.d = null;
        gVar.f47670e = null;
        gVar.f47675k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f47675k == gVar.f47675k) {
                    if (this.f17192a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f47677m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f47677m == null) {
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
                int i10 = this.f17192a;
                if (i10 == gVar.f17192a) {
                    if (i10 != -1 || this.f47676l == gVar.f47676l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f47669c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20194id;
                            } else {
                                TLRPC.Chat chat = this.f47670e;
                                if (chat != null) {
                                    j3 = -chat.f20047id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f47669c;
                            if (user2 != null) {
                                j10 = user2.f20194id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f47670e;
                                if (chat2 != null) {
                                    j10 = -chat2.f20047id;
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
                        int i11 = this.f17192a;
                        if (i11 != 6 || this.f47671f == gVar.f47671f) {
                            if (i11 != 7 || TextUtils.equals(this.f47672g, gVar.f47672g)) {
                                if (this.f17192a != 8 || TextUtils.equals(this.f47672g, gVar.f47672g)) {
                                    if (this.f17192a != 9 || (TextUtils.equals(this.f47672g, gVar.f47672g) && this.f47673i == gVar.f47673i && this.f47674j == gVar.f47674j)) {
                                        if (this.f17192a != 10 || this.f47681q == gVar.f47681q) {
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
