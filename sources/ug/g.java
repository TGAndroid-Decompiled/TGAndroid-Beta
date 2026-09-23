package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qq;
import org.telegram.ui.py0;
import tg.d1;
public final class g extends og.a {
    public TLRPC.User f43672c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f43673f;
    public CharSequence f43674g;
    public String h;
    public int f43675i;
    public int f43676j;
    public boolean f43677k;
    public int f43678l;
    public py0 f43679m;
    public py0 f43680n;
    public d1 f43681o;
    public d1 f43682p;
    public View f43683q;
    public qq f43684r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f43678l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f43674g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f43672c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f43677k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f43677k == gVar.f43677k) {
                    if (this.f15508a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f43679m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f43679m == null) {
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
                int i10 = this.f15508a;
                if (i10 == gVar.f15508a) {
                    if (i10 != -1 || this.f43678l == gVar.f43678l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f43672c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18230id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18083id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f43672c;
                            if (user2 != null) {
                                j10 = user2.f18230id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18083id;
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
                        int i11 = this.f15508a;
                        if (i11 != 6 || this.f43673f == gVar.f43673f) {
                            if (i11 != 7 || TextUtils.equals(this.f43674g, gVar.f43674g)) {
                                if (this.f15508a != 8 || TextUtils.equals(this.f43674g, gVar.f43674g)) {
                                    if (this.f15508a != 9 || (TextUtils.equals(this.f43674g, gVar.f43674g) && this.f43675i == gVar.f43675i && this.f43676j == gVar.f43676j)) {
                                        if (this.f15508a != 10 || this.f43683q == gVar.f43683q) {
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
