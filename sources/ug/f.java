package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.xy0;
import tg.d1;
public final class f extends og.a {
    public TLRPC.User f43751c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f43752f;
    public CharSequence f43753g;
    public String h;
    public int f43754i;
    public int f43755j;
    public boolean f43756k;
    public int f43757l;
    public xy0 f43758m;
    public xy0 f43759n;
    public d1 f43760o;
    public d1 f43761p;
    public View f43762q;
    public pq f43763r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f43757l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f43753g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f43751c = user;
        fVar.d = null;
        fVar.e = null;
        fVar.f43756k = z10;
        return fVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f43756k == fVar.f43756k) {
                    if (this.f15543a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f43758m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f43758m == null) {
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
                    if (i10 != -1 || this.f43757l == fVar.f43757l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f43751c;
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
                            TLRPC.User user2 = fVar.f43751c;
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
                        if (i11 != 6 || this.f43752f == fVar.f43752f) {
                            if (i11 != 7 || TextUtils.equals(this.f43753g, fVar.f43753g)) {
                                if (this.f15543a != 8 || TextUtils.equals(this.f43753g, fVar.f43753g)) {
                                    if (this.f15543a != 9 || (TextUtils.equals(this.f43753g, fVar.f43753g) && this.f43754i == fVar.f43754i && this.f43755j == fVar.f43755j)) {
                                        if (this.f15543a != 10 || this.f43762q == fVar.f43762q) {
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
