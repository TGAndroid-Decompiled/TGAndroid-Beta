package vg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import ug.a1;
public final class g extends pg.a {
    public TLRPC.User f48809c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f48810f;
    public CharSequence f48811g;
    public CharSequence h;
    public int f48812i;
    public int f48813j;
    public boolean f48814k;
    public int f48815l;
    public org.telegram.ui.web.c f48816m;
    public org.telegram.ui.web.c f48817n;
    public a1 f48818o;
    public a1 f48819p;
    public View f48820q;
    public Drawable f48821r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48815l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48811g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48809c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f48814k = z10;
        return gVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48814k == gVar.f48814k) {
                    if (this.f44712a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48816m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48816m == null) {
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
                int i10 = this.f44712a;
                if (i10 == gVar.f44712a) {
                    if (i10 != -1 || this.f48815l == gVar.f48815l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48809c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f20491id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f20344id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f48809c;
                            if (user2 != null) {
                                j11 = user2.f20491id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f20344id;
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
                        int i11 = this.f44712a;
                        if (i11 != 6 || this.f48810f == gVar.f48810f) {
                            if (i11 != 7 || TextUtils.equals(this.f48811g, gVar.f48811g)) {
                                if (this.f44712a != 8 || TextUtils.equals(this.f48811g, gVar.f48811g)) {
                                    if (this.f44712a != 9 || (TextUtils.equals(this.f48811g, gVar.f48811g) && this.f48812i == gVar.f48812i && this.f48813j == gVar.f48813j)) {
                                        if (this.f44712a != 10 || this.f48820q == gVar.f48820q) {
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
