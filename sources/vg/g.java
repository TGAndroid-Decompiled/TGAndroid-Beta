package vg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import qg.n;
import ug.b1;
public final class g extends pg.a {
    public TLRPC.User f48372c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f48373f;
    public CharSequence f48374g;
    public CharSequence h;
    public int f48375i;
    public int f48376j;
    public boolean f48377k;
    public int f48378l;
    public n f48379m;
    public n f48380n;
    public b1 f48381o;
    public b1 f48382p;
    public View f48383q;
    public Drawable f48384r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48378l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48374g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48372c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f48377k = z10;
        return gVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48377k == gVar.f48377k) {
                    if (this.f44300a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48379m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48379m == null) {
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
                int i10 = this.f44300a;
                if (i10 == gVar.f44300a) {
                    if (i10 != -1 || this.f48378l == gVar.f48378l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48372c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f20427id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f20280id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f48372c;
                            if (user2 != null) {
                                j11 = user2.f20427id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f20280id;
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
                        int i11 = this.f44300a;
                        if (i11 != 6 || this.f48373f == gVar.f48373f) {
                            if (i11 != 7 || TextUtils.equals(this.f48374g, gVar.f48374g)) {
                                if (this.f44300a != 8 || TextUtils.equals(this.f48374g, gVar.f48374g)) {
                                    if (this.f44300a != 9 || (TextUtils.equals(this.f48374g, gVar.f48374g) && this.f48375i == gVar.f48375i && this.f48376j == gVar.f48376j)) {
                                        if (this.f44300a != 10 || this.f48383q == gVar.f48383q) {
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
