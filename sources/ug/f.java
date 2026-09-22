package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.vy0;
import tg.c1;
public final class f extends og.a {
    public TLRPC.User f44046c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f44047f;
    public CharSequence f44048g;
    public String h;
    public int f44049i;
    public int f44050j;
    public boolean f44051k;
    public int f44052l;
    public vy0 f44053m;
    public vy0 f44054n;
    public c1 f44055o;
    public c1 f44056p;
    public View f44057q;
    public pq f44058r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f44052l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f44048g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f44046c = user;
        fVar.d = null;
        fVar.e = null;
        fVar.f44051k = z10;
        return fVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f44051k == fVar.f44051k) {
                    if (this.f15719a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f44053m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f44053m == null) {
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
                int i10 = this.f15719a;
                if (i10 == fVar.f15719a) {
                    if (i10 != -1 || this.f44052l == fVar.f44052l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f44046c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18490id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18343id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = fVar.f44046c;
                            if (user2 != null) {
                                j10 = user2.f18490id;
                            } else {
                                TLRPC.Chat chat2 = fVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18343id;
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
                        int i11 = this.f15719a;
                        if (i11 != 6 || this.f44047f == fVar.f44047f) {
                            if (i11 != 7 || TextUtils.equals(this.f44048g, fVar.f44048g)) {
                                if (this.f15719a != 8 || TextUtils.equals(this.f44048g, fVar.f44048g)) {
                                    if (this.f15719a != 9 || (TextUtils.equals(this.f44048g, fVar.f44048g) && this.f44049i == fVar.f44049i && this.f44050j == fVar.f44050j)) {
                                        if (this.f15719a != 10 || this.f44057q == fVar.f44057q) {
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
