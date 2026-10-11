package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr;
import org.telegram.ui.uy0;
import tg.b1;
public final class g extends og.a {
    public TLRPC.User f49048c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f49049e;
    public TLRPC.TL_help_country f49050f;
    public CharSequence f49051g;
    public String h;
    public int f49052i;
    public int f49053j;
    public boolean f49054k;
    public int f49055l;
    public uy0 f49056m;
    public uy0 f49057n;
    public b1 f49058o;
    public b1 f49059p;
    public View f49060q;
    public fr f49061r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f49055l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f49051g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f49048c = user;
        gVar.d = null;
        gVar.f49049e = null;
        gVar.f49054k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f49054k == gVar.f49054k) {
                    if (this.f17211a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f49056m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f49056m == null) {
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
                int i10 = this.f17211a;
                if (i10 == gVar.f17211a) {
                    if (i10 != -1 || this.f49055l == gVar.f49055l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f49048c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20215id;
                            } else {
                                TLRPC.Chat chat = this.f49049e;
                                if (chat != null) {
                                    j3 = -chat.f20068id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f49048c;
                            if (user2 != null) {
                                j10 = user2.f20215id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f49049e;
                                if (chat2 != null) {
                                    j10 = -chat2.f20068id;
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
                        int i11 = this.f17211a;
                        if (i11 != 6 || this.f49050f == gVar.f49050f) {
                            if (i11 != 7 || TextUtils.equals(this.f49051g, gVar.f49051g)) {
                                if (this.f17211a != 8 || TextUtils.equals(this.f49051g, gVar.f49051g)) {
                                    if (this.f17211a != 9 || (TextUtils.equals(this.f49051g, gVar.f49051g) && this.f49052i == gVar.f49052i && this.f49053j == gVar.f49053j)) {
                                        if (this.f17211a != 10 || this.f49060q == gVar.f49060q) {
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
