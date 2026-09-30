package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rq;
import org.telegram.ui.ny0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f44011c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f44012f;
    public CharSequence f44013g;
    public String h;
    public int f44014i;
    public int f44015j;
    public boolean f44016k;
    public int f44017l;
    public ny0 f44018m;
    public ny0 f44019n;
    public c1 f44020o;
    public c1 f44021p;
    public View f44022q;
    public rq f44023r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f44017l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f44013g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f44011c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f44016k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f44016k == gVar.f44016k) {
                    if (this.f15716a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f44018m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f44018m == null) {
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
                int i10 = this.f15716a;
                if (i10 == gVar.f15716a) {
                    if (i10 != -1 || this.f44017l == gVar.f44017l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f44011c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18484id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18337id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f44011c;
                            if (user2 != null) {
                                j10 = user2.f18484id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18337id;
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
                        int i11 = this.f15716a;
                        if (i11 != 6 || this.f44012f == gVar.f44012f) {
                            if (i11 != 7 || TextUtils.equals(this.f44013g, gVar.f44013g)) {
                                if (this.f15716a != 8 || TextUtils.equals(this.f44013g, gVar.f44013g)) {
                                    if (this.f15716a != 9 || (TextUtils.equals(this.f44013g, gVar.f44013g) && this.f44014i == gVar.f44014i && this.f44015j == gVar.f44015j)) {
                                        if (this.f15716a != 10 || this.f44022q == gVar.f44022q) {
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
