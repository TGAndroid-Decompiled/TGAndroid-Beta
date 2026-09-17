package vg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.wy0;
import ug.d1;
public final class f extends pg.a {
    public TLRPC.User f47810c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47811e;
    public TLRPC.TL_help_country f47812f;
    public CharSequence f47813g;
    public String h;
    public int f47814i;
    public int f47815j;
    public boolean f47816k;
    public int f47817l;
    public wy0 f47818m;
    public wy0 f47819n;
    public d1 f47820o;
    public d1 f47821p;
    public View f47822q;
    public oq f47823r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f47817l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f47813g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f47810c = user;
        fVar.d = null;
        fVar.f47811e = null;
        fVar.f47816k = z10;
        return fVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f47816k == fVar.f47816k) {
                    if (this.f44072a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f47818m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f47818m == null) {
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
                int i10 = this.f44072a;
                if (i10 == fVar.f44072a) {
                    if (i10 != -1 || this.f47817l == fVar.f47817l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f47810c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20016id;
                            } else {
                                TLRPC.Chat chat = this.f47811e;
                                if (chat != null) {
                                    j3 = -chat.f19869id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = fVar.f47810c;
                            if (user2 != null) {
                                j10 = user2.f20016id;
                            } else {
                                TLRPC.Chat chat2 = fVar.f47811e;
                                if (chat2 != null) {
                                    j10 = -chat2.f19869id;
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
                        int i11 = this.f44072a;
                        if (i11 != 6 || this.f47812f == fVar.f47812f) {
                            if (i11 != 7 || TextUtils.equals(this.f47813g, fVar.f47813g)) {
                                if (this.f44072a != 8 || TextUtils.equals(this.f47813g, fVar.f47813g)) {
                                    if (this.f44072a != 9 || (TextUtils.equals(this.f47813g, fVar.f47813g) && this.f47814i == fVar.f47814i && this.f47815j == fVar.f47815j)) {
                                        if (this.f44072a != 10 || this.f47822q == fVar.f47822q) {
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
