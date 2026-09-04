package vg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.wy0;
import ug.d1;
public final class f extends pg.a {
    public TLRPC.User f47809c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f47810e;
    public TLRPC.TL_help_country f47811f;
    public CharSequence f47812g;
    public String h;
    public int f47813i;
    public int f47814j;
    public boolean f47815k;
    public int f47816l;
    public wy0 f47817m;
    public wy0 f47818n;
    public d1 f47819o;
    public d1 f47820p;
    public View f47821q;
    public oq f47822r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f47816l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f47812g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f47809c = user;
        fVar.d = null;
        fVar.f47810e = null;
        fVar.f47815k = z10;
        return fVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f47815k == fVar.f47815k) {
                    if (this.f44071a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f47817m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f47817m == null) {
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
                int i10 = this.f44071a;
                if (i10 == fVar.f44071a) {
                    if (i10 != -1 || this.f47816l == fVar.f47816l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f47809c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f20016id;
                            } else {
                                TLRPC.Chat chat = this.f47810e;
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
                            TLRPC.User user2 = fVar.f47809c;
                            if (user2 != null) {
                                j10 = user2.f20016id;
                            } else {
                                TLRPC.Chat chat2 = fVar.f47810e;
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
                        int i11 = this.f44071a;
                        if (i11 != 6 || this.f47811f == fVar.f47811f) {
                            if (i11 != 7 || TextUtils.equals(this.f47812g, fVar.f47812g)) {
                                if (this.f44071a != 8 || TextUtils.equals(this.f47812g, fVar.f47812g)) {
                                    if (this.f44071a != 9 || (TextUtils.equals(this.f47812g, fVar.f47812g) && this.f47813i == fVar.f47813i && this.f47814j == fVar.f47814j)) {
                                        if (this.f44071a != 10 || this.f47821q == fVar.f47821q) {
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
