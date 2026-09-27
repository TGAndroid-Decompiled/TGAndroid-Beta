package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rq;
import org.telegram.ui.py0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f44055c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f44056f;
    public CharSequence f44057g;
    public String h;
    public int f44058i;
    public int f44059j;
    public boolean f44060k;
    public int f44061l;
    public py0 f44062m;
    public py0 f44063n;
    public c1 f44064o;
    public c1 f44065p;
    public View f44066q;
    public rq f44067r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f44061l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f44057g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f44055c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f44060k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f44060k == gVar.f44060k) {
                    if (this.f15754a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f44062m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f44062m == null) {
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
                int i10 = this.f15754a;
                if (i10 == gVar.f15754a) {
                    if (i10 != -1 || this.f44061l == gVar.f44061l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f44055c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18476id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18329id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f44055c;
                            if (user2 != null) {
                                j10 = user2.f18476id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18329id;
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
                        int i11 = this.f15754a;
                        if (i11 != 6 || this.f44056f == gVar.f44056f) {
                            if (i11 != 7 || TextUtils.equals(this.f44057g, gVar.f44057g)) {
                                if (this.f15754a != 8 || TextUtils.equals(this.f44057g, gVar.f44057g)) {
                                    if (this.f15754a != 9 || (TextUtils.equals(this.f44057g, gVar.f44057g) && this.f44058i == gVar.f44058i && this.f44059j == gVar.f44059j)) {
                                        if (this.f15754a != 10 || this.f44066q == gVar.f44066q) {
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
