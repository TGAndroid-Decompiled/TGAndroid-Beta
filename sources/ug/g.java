package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr;
import org.telegram.ui.vy0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f48927c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f48928e;
    public TLRPC.TL_help_country f48929f;
    public CharSequence f48930g;
    public String h;
    public int f48931i;
    public int f48932j;
    public boolean f48933k;
    public int f48934l;
    public vy0 f48935m;
    public vy0 f48936n;
    public c1 f48937o;
    public c1 f48938p;
    public View f48939q;
    public fr f48940r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48934l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48930g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48927c = user;
        gVar.d = null;
        gVar.f48928e = null;
        gVar.f48933k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48933k == gVar.f48933k) {
                    if (this.f17125a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48935m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48935m == null) {
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
                int i10 = this.f17125a;
                if (i10 == gVar.f17125a) {
                    if (i10 != -1 || this.f48934l == gVar.f48934l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48927c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20185id;
                            } else {
                                TLRPC.Chat chat = this.f48928e;
                                if (chat != null) {
                                    j3 = -chat.f20038id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f48927c;
                            if (user2 != null) {
                                j10 = user2.f20185id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f48928e;
                                if (chat2 != null) {
                                    j10 = -chat2.f20038id;
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
                        int i11 = this.f17125a;
                        if (i11 != 6 || this.f48929f == gVar.f48929f) {
                            if (i11 != 7 || TextUtils.equals(this.f48930g, gVar.f48930g)) {
                                if (this.f17125a != 8 || TextUtils.equals(this.f48930g, gVar.f48930g)) {
                                    if (this.f17125a != 9 || (TextUtils.equals(this.f48930g, gVar.f48930g) && this.f48931i == gVar.f48931i && this.f48932j == gVar.f48932j)) {
                                        if (this.f17125a != 10 || this.f48939q == gVar.f48939q) {
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
