package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr;
import org.telegram.ui.uy0;
import tg.b1;
public final class g extends og.a {
    public TLRPC.User f49014c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f49015e;
    public TLRPC.TL_help_country f49016f;
    public CharSequence f49017g;
    public String h;
    public int f49018i;
    public int f49019j;
    public boolean f49020k;
    public int f49021l;
    public uy0 f49022m;
    public uy0 f49023n;
    public b1 f49024o;
    public b1 f49025p;
    public View f49026q;
    public fr f49027r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f49021l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f49017g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f49014c = user;
        gVar.d = null;
        gVar.f49015e = null;
        gVar.f49020k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f49020k == gVar.f49020k) {
                    if (this.f17175a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f49022m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f49022m == null) {
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
                int i10 = this.f17175a;
                if (i10 == gVar.f17175a) {
                    if (i10 != -1 || this.f49021l == gVar.f49021l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f49014c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20179id;
                            } else {
                                TLRPC.Chat chat = this.f49015e;
                                if (chat != null) {
                                    j3 = -chat.f20032id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f49014c;
                            if (user2 != null) {
                                j10 = user2.f20179id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f49015e;
                                if (chat2 != null) {
                                    j10 = -chat2.f20032id;
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
                        int i11 = this.f17175a;
                        if (i11 != 6 || this.f49016f == gVar.f49016f) {
                            if (i11 != 7 || TextUtils.equals(this.f49017g, gVar.f49017g)) {
                                if (this.f17175a != 8 || TextUtils.equals(this.f49017g, gVar.f49017g)) {
                                    if (this.f17175a != 9 || (TextUtils.equals(this.f49017g, gVar.f49017g) && this.f49018i == gVar.f49018i && this.f49019j == gVar.f49019j)) {
                                        if (this.f17175a != 10 || this.f49026q == gVar.f49026q) {
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
