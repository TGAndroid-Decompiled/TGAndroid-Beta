package vg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import ug.a1;
public final class g extends pg.a {
    public TLRPC.User f48810c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f48811f;
    public CharSequence f48812g;
    public CharSequence h;
    public int f48813i;
    public int f48814j;
    public boolean f48815k;
    public int f48816l;
    public org.telegram.ui.web.c f48817m;
    public org.telegram.ui.web.c f48818n;
    public a1 f48819o;
    public a1 f48820p;
    public View f48821q;
    public Drawable f48822r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48816l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48812g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48810c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f48815k = z10;
        return gVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48815k == gVar.f48815k) {
                    if (this.f44713a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48817m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48817m == null) {
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
                int i10 = this.f44713a;
                if (i10 == gVar.f44713a) {
                    if (i10 != -1 || this.f48816l == gVar.f48816l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48810c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f20490id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f20343id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f48810c;
                            if (user2 != null) {
                                j11 = user2.f20490id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f20343id;
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
                        int i11 = this.f44713a;
                        if (i11 != 6 || this.f48811f == gVar.f48811f) {
                            if (i11 != 7 || TextUtils.equals(this.f48812g, gVar.f48812g)) {
                                if (this.f44713a != 8 || TextUtils.equals(this.f48812g, gVar.f48812g)) {
                                    if (this.f44713a != 9 || (TextUtils.equals(this.f48812g, gVar.f48812g) && this.f48813i == gVar.f48813i && this.f48814j == gVar.f48814j)) {
                                        if (this.f44713a != 10 || this.f48821q == gVar.f48821q) {
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
