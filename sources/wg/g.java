package wg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import vg.c1;
public final class g extends qg.a {
    public TLRPC.User f51182c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f51183f;
    public CharSequence f51184g;
    public CharSequence h;
    public int f51185i;
    public int f51186j;
    public boolean f51187k;
    public int f51188l;
    public org.telegram.ui.web.c f51189m;
    public org.telegram.ui.web.c f51190n;
    public c1 f51191o;
    public c1 f51192p;
    public View f51193q;
    public Drawable f51194r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f51188l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f51184g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f51182c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f51187k = z10;
        return gVar;
    }

    @Override
    public final boolean a(qg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f51187k == gVar.f51187k) {
                    if (this.f47037a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f51189m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f51189m == null) {
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
        long j10;
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                int i10 = this.f47037a;
                if (i10 == gVar.f47037a) {
                    if (i10 != -1 || this.f51188l == gVar.f51188l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f51182c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f22174id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f22027id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f51182c;
                            if (user2 != null) {
                                j11 = user2.f22174id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f22027id;
                                } else {
                                    TLRPC.InputPeer inputPeer2 = gVar.d;
                                    if (inputPeer2 != null) {
                                        j11 = DialogObject.getPeerDialogId(inputPeer2);
                                    }
                                }
                            }
                            if (j10 != j11) {
                                return false;
                            }
                        }
                        int i11 = this.f47037a;
                        if (i11 != 6 || this.f51183f == gVar.f51183f) {
                            if (i11 != 7 || TextUtils.equals(this.f51184g, gVar.f51184g)) {
                                if (this.f47037a != 8 || TextUtils.equals(this.f51184g, gVar.f51184g)) {
                                    if (this.f47037a != 9 || (TextUtils.equals(this.f51184g, gVar.f51184g) && this.f51185i == gVar.f51185i && this.f51186j == gVar.f51186j)) {
                                        if (this.f47037a != 10 || this.f51193q == gVar.f51193q) {
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
