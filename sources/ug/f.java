package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.vy0;
import tg.c1;
public final class f extends og.a {
    public TLRPC.User f43981c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f43982f;
    public CharSequence f43983g;
    public String h;
    public int f43984i;
    public int f43985j;
    public boolean f43986k;
    public int f43987l;
    public vy0 f43988m;
    public vy0 f43989n;
    public c1 f43990o;
    public c1 f43991p;
    public View f43992q;
    public pq f43993r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f43987l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f43983g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f43981c = user;
        fVar.d = null;
        fVar.e = null;
        fVar.f43986k = z10;
        return fVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f43986k == fVar.f43986k) {
                    if (this.f15672a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f43988m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f43988m == null) {
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
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                int i10 = this.f15672a;
                if (i10 == fVar.f15672a) {
                    if (i10 != -1 || this.f43987l == fVar.f43987l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f43981c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18443id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18296id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = fVar.f43981c;
                            if (user2 != null) {
                                j10 = user2.f18443id;
                            } else {
                                TLRPC.Chat chat2 = fVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18296id;
                                } else {
                                    TLRPC.InputPeer inputPeer2 = fVar.d;
                                    if (inputPeer2 != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer2);
                                    }
                                }
                            }
                            if (j3 != j10) {
                                return false;
                            }
                        }
                        int i11 = this.f15672a;
                        if (i11 != 6 || this.f43982f == fVar.f43982f) {
                            if (i11 != 7 || TextUtils.equals(this.f43983g, fVar.f43983g)) {
                                if (this.f15672a != 8 || TextUtils.equals(this.f43983g, fVar.f43983g)) {
                                    if (this.f15672a != 9 || (TextUtils.equals(this.f43983g, fVar.f43983g) && this.f43984i == fVar.f43984i && this.f43985j == fVar.f43985j)) {
                                        if (this.f15672a != 10 || this.f43992q == fVar.f43992q) {
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
