package vg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.wy0;
import ug.d1;
public final class f extends pg.a {
    public TLRPC.User f47837c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47838e;
    public TLRPC.TL_help_country f47839f;
    public CharSequence f47840g;
    public String h;
    public int f47841i;
    public int f47842j;
    public boolean f47843k;
    public int f47844l;
    public wy0 f47845m;
    public wy0 f47846n;
    public d1 f47847o;
    public d1 f47848p;
    public View f47849q;
    public oq f47850r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f47844l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f47840g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f47837c = user;
        fVar.d = null;
        fVar.f47838e = null;
        fVar.f47843k = z10;
        return fVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f47843k == fVar.f47843k) {
                    if (this.f44098a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f47845m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f47845m == null) {
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
                int i10 = this.f44098a;
                if (i10 == fVar.f44098a) {
                    if (i10 != -1 || this.f47844l == fVar.f47844l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f47837c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20043id;
                            } else {
                                TLRPC.Chat chat = this.f47838e;
                                if (chat != null) {
                                    j3 = -chat.f19896id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = fVar.f47837c;
                            if (user2 != null) {
                                j10 = user2.f20043id;
                            } else {
                                TLRPC.Chat chat2 = fVar.f47838e;
                                if (chat2 != null) {
                                    j10 = -chat2.f19896id;
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
                        int i11 = this.f44098a;
                        if (i11 != 6 || this.f47839f == fVar.f47839f) {
                            if (i11 != 7 || TextUtils.equals(this.f47840g, fVar.f47840g)) {
                                if (this.f44098a != 8 || TextUtils.equals(this.f47840g, fVar.f47840g)) {
                                    if (this.f44098a != 9 || (TextUtils.equals(this.f47840g, fVar.f47840g) && this.f47841i == fVar.f47841i && this.f47842j == fVar.f47842j)) {
                                        if (this.f44098a != 10 || this.f47849q == fVar.f47849q) {
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
