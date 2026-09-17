package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.xy0;
import tg.d1;
public final class f extends og.a {
    public TLRPC.User f43746c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f43747f;
    public CharSequence f43748g;
    public String h;
    public int f43749i;
    public int f43750j;
    public boolean f43751k;
    public int f43752l;
    public xy0 f43753m;
    public xy0 f43754n;
    public d1 f43755o;
    public d1 f43756p;
    public View f43757q;
    public pq f43758r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f43752l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f43748g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f43746c = user;
        fVar.d = null;
        fVar.e = null;
        fVar.f43751k = z10;
        return fVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f43751k == fVar.f43751k) {
                    if (this.f15543a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f43753m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f43753m == null) {
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
                int i10 = this.f15543a;
                if (i10 == fVar.f15543a) {
                    if (i10 != -1 || this.f43752l == fVar.f43752l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f43746c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18268id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18121id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = fVar.f43746c;
                            if (user2 != null) {
                                j10 = user2.f18268id;
                            } else {
                                TLRPC.Chat chat2 = fVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18121id;
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
                        int i11 = this.f15543a;
                        if (i11 != 6 || this.f43747f == fVar.f43747f) {
                            if (i11 != 7 || TextUtils.equals(this.f43748g, fVar.f43748g)) {
                                if (this.f15543a != 8 || TextUtils.equals(this.f43748g, fVar.f43748g)) {
                                    if (this.f15543a != 9 || (TextUtils.equals(this.f43748g, fVar.f43748g) && this.f43749i == fVar.f43749i && this.f43750j == fVar.f43750j)) {
                                        if (this.f15543a != 10 || this.f43757q == fVar.f43757q) {
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
