package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sq;
import org.telegram.ui.ny0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f44117c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f44118f;
    public CharSequence f44119g;
    public String h;
    public int f44120i;
    public int f44121j;
    public boolean f44122k;
    public int f44123l;
    public ny0 f44124m;
    public ny0 f44125n;
    public c1 f44126o;
    public c1 f44127p;
    public View f44128q;
    public sq f44129r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f44123l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f44119g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f44117c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f44122k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f44122k == gVar.f44122k) {
                    if (this.f15731a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f44124m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f44124m == null) {
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
                int i10 = this.f15731a;
                if (i10 == gVar.f15731a) {
                    if (i10 != -1 || this.f44123l == gVar.f44123l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f44117c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18499id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18352id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f44117c;
                            if (user2 != null) {
                                j10 = user2.f18499id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18352id;
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
                        int i11 = this.f15731a;
                        if (i11 != 6 || this.f44118f == gVar.f44118f) {
                            if (i11 != 7 || TextUtils.equals(this.f44119g, gVar.f44119g)) {
                                if (this.f15731a != 8 || TextUtils.equals(this.f44119g, gVar.f44119g)) {
                                    if (this.f15731a != 9 || (TextUtils.equals(this.f44119g, gVar.f44119g) && this.f44120i == gVar.f44120i && this.f44121j == gVar.f44121j)) {
                                        if (this.f15731a != 10 || this.f44128q == gVar.f44128q) {
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
