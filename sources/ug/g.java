package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hr;
import org.telegram.ui.xy0;
import tg.b1;
public final class g extends og.a {
    public TLRPC.User f49155c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f49156e;
    public TLRPC.TL_help_country f49157f;
    public CharSequence f49158g;
    public String h;
    public int f49159i;
    public int f49160j;
    public boolean f49161k;
    public int f49162l;
    public xy0 f49163m;
    public xy0 f49164n;
    public b1 f49165o;
    public b1 f49166p;
    public View f49167q;
    public hr f49168r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f49162l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f49158g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f49155c = user;
        gVar.d = null;
        gVar.f49156e = null;
        gVar.f49161k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f49161k == gVar.f49161k) {
                    if (this.f16876a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f49163m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f49163m == null) {
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
                int i10 = this.f16876a;
                if (i10 == gVar.f16876a) {
                    if (i10 != -1 || this.f49162l == gVar.f49162l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f49155c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f19949id;
                            } else {
                                TLRPC.Chat chat = this.f49156e;
                                if (chat != null) {
                                    j3 = -chat.f19802id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f49155c;
                            if (user2 != null) {
                                j10 = user2.f19949id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f49156e;
                                if (chat2 != null) {
                                    j10 = -chat2.f19802id;
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
                        int i11 = this.f16876a;
                        if (i11 != 6 || this.f49157f == gVar.f49157f) {
                            if (i11 != 7 || TextUtils.equals(this.f49158g, gVar.f49158g)) {
                                if (this.f16876a != 8 || TextUtils.equals(this.f49158g, gVar.f49158g)) {
                                    if (this.f16876a != 9 || (TextUtils.equals(this.f49158g, gVar.f49158g) && this.f49159i == gVar.f49159i && this.f49160j == gVar.f49160j)) {
                                        if (this.f16876a != 10 || this.f49167q == gVar.f49167q) {
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
