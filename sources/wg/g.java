package wg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import vg.c1;
public final class g extends qg.a {
    public TLRPC.User f51243c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f51244f;
    public CharSequence f51245g;
    public CharSequence h;
    public int f51246i;
    public int f51247j;
    public boolean f51248k;
    public int f51249l;
    public org.telegram.ui.web.c f51250m;
    public org.telegram.ui.web.c f51251n;
    public c1 f51252o;
    public c1 f51253p;
    public View f51254q;
    public Drawable f51255r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f51249l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f51245g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f51243c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f51248k = z10;
        return gVar;
    }

    @Override
    public final boolean a(qg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f51248k == gVar.f51248k) {
                    if (this.f47075a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f51250m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f51250m == null) {
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
                int i10 = this.f47075a;
                if (i10 == gVar.f47075a) {
                    if (i10 != -1 || this.f51249l == gVar.f51249l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f51243c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f22177id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f22028id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f51243c;
                            if (user2 != null) {
                                j11 = user2.f22177id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f22028id;
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
                        int i11 = this.f47075a;
                        if (i11 != 6 || this.f51244f == gVar.f51244f) {
                            if (i11 != 7 || TextUtils.equals(this.f51245g, gVar.f51245g)) {
                                if (this.f47075a != 8 || TextUtils.equals(this.f51245g, gVar.f51245g)) {
                                    if (this.f47075a != 9 || (TextUtils.equals(this.f51245g, gVar.f51245g) && this.f51246i == gVar.f51246i && this.f51247j == gVar.f51247j)) {
                                        if (this.f47075a != 10 || this.f51254q == gVar.f51254q) {
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
