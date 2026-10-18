package vg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import ug.b1;
public final class g extends pg.a {
    public TLRPC.User f48361c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f48362f;
    public CharSequence f48363g;
    public CharSequence h;
    public int f48364i;
    public int f48365j;
    public boolean f48366k;
    public int f48367l;
    public org.telegram.ui.web.c f48368m;
    public org.telegram.ui.web.c f48369n;
    public b1 f48370o;
    public b1 f48371p;
    public View f48372q;
    public Drawable f48373r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48367l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48363g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48361c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f48366k = z10;
        return gVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48366k == gVar.f48366k) {
                    if (this.f44291a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48368m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48368m == null) {
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
                int i10 = this.f44291a;
                if (i10 == gVar.f44291a) {
                    if (i10 != -1 || this.f48367l == gVar.f48367l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48361c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f20419id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f20272id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f48361c;
                            if (user2 != null) {
                                j11 = user2.f20419id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f20272id;
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
                        int i11 = this.f44291a;
                        if (i11 != 6 || this.f48362f == gVar.f48362f) {
                            if (i11 != 7 || TextUtils.equals(this.f48363g, gVar.f48363g)) {
                                if (this.f44291a != 8 || TextUtils.equals(this.f48363g, gVar.f48363g)) {
                                    if (this.f44291a != 9 || (TextUtils.equals(this.f48363g, gVar.f48363g) && this.f48364i == gVar.f48364i && this.f48365j == gVar.f48365j)) {
                                        if (this.f44291a != 10 || this.f48372q == gVar.f48372q) {
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
