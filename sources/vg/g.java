package vg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import qg.n;
import ug.b1;
public final class g extends pg.a {
    public TLRPC.User f48363c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f48364f;
    public CharSequence f48365g;
    public CharSequence h;
    public int f48366i;
    public int f48367j;
    public boolean f48368k;
    public int f48369l;
    public n f48370m;
    public n f48371n;
    public b1 f48372o;
    public b1 f48373p;
    public View f48374q;
    public Drawable f48375r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48369l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48365g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48363c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f48368k = z10;
        return gVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48368k == gVar.f48368k) {
                    if (this.f44288a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48370m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48370m == null) {
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
                int i10 = this.f44288a;
                if (i10 == gVar.f44288a) {
                    if (i10 != -1 || this.f48369l == gVar.f48369l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48363c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f20420id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f20273id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f48363c;
                            if (user2 != null) {
                                j11 = user2.f20420id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f20273id;
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
                        int i11 = this.f44288a;
                        if (i11 != 6 || this.f48364f == gVar.f48364f) {
                            if (i11 != 7 || TextUtils.equals(this.f48365g, gVar.f48365g)) {
                                if (this.f44288a != 8 || TextUtils.equals(this.f48365g, gVar.f48365g)) {
                                    if (this.f44288a != 9 || (TextUtils.equals(this.f48365g, gVar.f48365g) && this.f48366i == gVar.f48366i && this.f48367j == gVar.f48367j)) {
                                        if (this.f44288a != 10 || this.f48374q == gVar.f48374q) {
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
