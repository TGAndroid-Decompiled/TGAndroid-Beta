package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr;
import org.telegram.ui.vy0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f48925c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f48926e;
    public TLRPC.TL_help_country f48927f;
    public CharSequence f48928g;
    public String h;
    public int f48929i;
    public int f48930j;
    public boolean f48931k;
    public int f48932l;
    public vy0 f48933m;
    public vy0 f48934n;
    public c1 f48935o;
    public c1 f48936p;
    public View f48937q;
    public fr f48938r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48932l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48928g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48925c = user;
        gVar.d = null;
        gVar.f48926e = null;
        gVar.f48931k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48931k == gVar.f48931k) {
                    if (this.f17125a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48933m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48933m == null) {
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
                    if (i10 != -1 || this.f48932l == gVar.f48932l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48925c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20185id;
                            } else {
                                TLRPC.Chat chat = this.f48926e;
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
                            TLRPC.User user2 = gVar.f48925c;
                            if (user2 != null) {
                                j10 = user2.f20185id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f48926e;
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
                        if (i11 != 6 || this.f48927f == gVar.f48927f) {
                            if (i11 != 7 || TextUtils.equals(this.f48928g, gVar.f48928g)) {
                                if (this.f17125a != 8 || TextUtils.equals(this.f48928g, gVar.f48928g)) {
                                    if (this.f17125a != 9 || (TextUtils.equals(this.f48928g, gVar.f48928g) && this.f48929i == gVar.f48929i && this.f48930j == gVar.f48930j)) {
                                        if (this.f17125a != 10 || this.f48937q == gVar.f48937q) {
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
