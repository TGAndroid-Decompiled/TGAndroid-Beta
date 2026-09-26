package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rq;
import org.telegram.ui.ny0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f44008c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f44009f;
    public CharSequence f44010g;
    public String h;
    public int f44011i;
    public int f44012j;
    public boolean f44013k;
    public int f44014l;
    public ny0 f44015m;
    public ny0 f44016n;
    public c1 f44017o;
    public c1 f44018p;
    public View f44019q;
    public rq f44020r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f44014l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f44010g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f44008c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f44013k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f44013k == gVar.f44013k) {
                    if (this.f15715a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f44015m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f44015m == null) {
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
                int i10 = this.f15715a;
                if (i10 == gVar.f15715a) {
                    if (i10 != -1 || this.f44014l == gVar.f44014l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f44008c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18482id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18335id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f44008c;
                            if (user2 != null) {
                                j10 = user2.f18482id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18335id;
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
                        int i11 = this.f15715a;
                        if (i11 != 6 || this.f44009f == gVar.f44009f) {
                            if (i11 != 7 || TextUtils.equals(this.f44010g, gVar.f44010g)) {
                                if (this.f15715a != 8 || TextUtils.equals(this.f44010g, gVar.f44010g)) {
                                    if (this.f15715a != 9 || (TextUtils.equals(this.f44010g, gVar.f44010g) && this.f44011i == gVar.f44011i && this.f44012j == gVar.f44012j)) {
                                        if (this.f15715a != 10 || this.f44019q == gVar.f44019q) {
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
