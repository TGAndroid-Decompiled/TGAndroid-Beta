package vg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import qg.n;
import ug.b1;
public final class g extends pg.a {
    public TLRPC.User f48408c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f48409f;
    public CharSequence f48410g;
    public CharSequence h;
    public int f48411i;
    public int f48412j;
    public boolean f48413k;
    public int f48414l;
    public n f48415m;
    public n f48416n;
    public b1 f48417o;
    public b1 f48418p;
    public View f48419q;
    public Drawable f48420r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48414l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48410g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48408c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f48413k = z10;
        return gVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48413k == gVar.f48413k) {
                    if (this.f44334a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48415m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48415m == null) {
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
                int i10 = this.f44334a;
                if (i10 == gVar.f44334a) {
                    if (i10 != -1 || this.f48414l == gVar.f48414l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48408c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f20426id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f20279id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f48408c;
                            if (user2 != null) {
                                j11 = user2.f20426id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f20279id;
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
                        int i11 = this.f44334a;
                        if (i11 != 6 || this.f48409f == gVar.f48409f) {
                            if (i11 != 7 || TextUtils.equals(this.f48410g, gVar.f48410g)) {
                                if (this.f44334a != 8 || TextUtils.equals(this.f48410g, gVar.f48410g)) {
                                    if (this.f44334a != 9 || (TextUtils.equals(this.f48410g, gVar.f48410g) && this.f48411i == gVar.f48411i && this.f48412j == gVar.f48412j)) {
                                        if (this.f44334a != 10 || this.f48419q == gVar.f48419q) {
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
