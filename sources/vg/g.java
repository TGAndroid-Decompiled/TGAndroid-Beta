package vg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import qg.n;
import ug.b1;
public final class g extends pg.a {
    public TLRPC.User f48368c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f48369f;
    public CharSequence f48370g;
    public CharSequence h;
    public int f48371i;
    public int f48372j;
    public boolean f48373k;
    public int f48374l;
    public n f48375m;
    public n f48376n;
    public b1 f48377o;
    public b1 f48378p;
    public View f48379q;
    public Drawable f48380r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48374l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48370g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48368c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f48373k = z10;
        return gVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48373k == gVar.f48373k) {
                    if (this.f44296a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48375m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48375m == null) {
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
                int i10 = this.f44296a;
                if (i10 == gVar.f44296a) {
                    if (i10 != -1 || this.f48374l == gVar.f48374l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48368c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f20423id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f20276id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f48368c;
                            if (user2 != null) {
                                j11 = user2.f20423id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f20276id;
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
                        int i11 = this.f44296a;
                        if (i11 != 6 || this.f48369f == gVar.f48369f) {
                            if (i11 != 7 || TextUtils.equals(this.f48370g, gVar.f48370g)) {
                                if (this.f44296a != 8 || TextUtils.equals(this.f48370g, gVar.f48370g)) {
                                    if (this.f44296a != 9 || (TextUtils.equals(this.f48370g, gVar.f48370g) && this.f48371i == gVar.f48371i && this.f48372j == gVar.f48372j)) {
                                        if (this.f44296a != 10 || this.f48379q == gVar.f48379q) {
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
