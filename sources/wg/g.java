package wg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import vg.c1;
public final class g extends qg.a {
    public TLRPC.User f51185c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f51186f;
    public CharSequence f51187g;
    public CharSequence h;
    public int f51188i;
    public int f51189j;
    public boolean f51190k;
    public int f51191l;
    public org.telegram.ui.web.c f51192m;
    public org.telegram.ui.web.c f51193n;
    public c1 f51194o;
    public c1 f51195p;
    public View f51196q;
    public Drawable f51197r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f51191l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f51187g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f51185c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f51190k = z10;
        return gVar;
    }

    @Override
    public final boolean a(qg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f51190k == gVar.f51190k) {
                    if (this.f47040a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f51192m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f51192m == null) {
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
                int i10 = this.f47040a;
                if (i10 == gVar.f47040a) {
                    if (i10 != -1 || this.f51191l == gVar.f51191l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f51185c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f22176id;
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
                            TLRPC.User user2 = gVar.f51185c;
                            if (user2 != null) {
                                j11 = user2.f22176id;
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
                        int i11 = this.f47040a;
                        if (i11 != 6 || this.f51186f == gVar.f51186f) {
                            if (i11 != 7 || TextUtils.equals(this.f51187g, gVar.f51187g)) {
                                if (this.f47040a != 8 || TextUtils.equals(this.f51187g, gVar.f51187g)) {
                                    if (this.f47040a != 9 || (TextUtils.equals(this.f51187g, gVar.f51187g) && this.f51188i == gVar.f51188i && this.f51189j == gVar.f51189j)) {
                                        if (this.f47040a != 10 || this.f51196q == gVar.f51196q) {
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
