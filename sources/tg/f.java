package tg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vq;
import org.telegram.ui.w71;
import sg.f1;
public final class f extends ng.a {
    public TLRPC.User f42158c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f42159f;
    public CharSequence f42160g;
    public String h;
    public int f42161i;
    public int f42162j;
    public boolean f42163k;
    public int f42164l;
    public w71 f42165m;
    public w71 f42166n;
    public f1 f42167o;
    public f1 f42168p;
    public View f42169q;
    public vq f42170r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f42164l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f42160g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f42158c = user;
        fVar.d = null;
        fVar.e = null;
        fVar.f42163k = z10;
        return fVar;
    }

    @Override
    public final boolean a(ng.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f42163k == fVar.f42163k) {
                    if (this.f14046a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f42165m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f42165m == null) {
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
                int i10 = this.f14046a;
                if (i10 == fVar.f14046a) {
                    if (i10 != -1 || this.f42164l == fVar.f42164l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f42158c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f17342id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f17195id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = fVar.f42158c;
                            if (user2 != null) {
                                j10 = user2.f17342id;
                            } else {
                                TLRPC.Chat chat2 = fVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f17195id;
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
                        int i11 = this.f14046a;
                        if (i11 != 6 || this.f42159f == fVar.f42159f) {
                            if (i11 != 7 || TextUtils.equals(this.f42160g, fVar.f42160g)) {
                                if (this.f14046a != 8 || TextUtils.equals(this.f42160g, fVar.f42160g)) {
                                    if (this.f14046a != 9 || (TextUtils.equals(this.f42160g, fVar.f42160g) && this.f42161i == fVar.f42161i && this.f42162j == fVar.f42162j)) {
                                        if (this.f14046a != 10 || this.f42169q == fVar.f42169q) {
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
