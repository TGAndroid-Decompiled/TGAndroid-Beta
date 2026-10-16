package vg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cr;
import org.telegram.ui.bz0;
import ug.c1;
public final class g extends pg.a {
    public TLRPC.User f46976c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f46977f;
    public CharSequence f46978g;
    public String h;
    public int f46979i;
    public int f46980j;
    public boolean f46981k;
    public int f46982l;
    public bz0 f46983m;
    public bz0 f46984n;
    public c1 f46985o;
    public c1 f46986p;
    public View f46987q;
    public cr f46988r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f46982l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f46978g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f46976c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f46981k = z10;
        return gVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f46981k == gVar.f46981k) {
                    if (this.f42904a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f46983m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f46983m == null) {
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
                int i10 = this.f42904a;
                if (i10 == gVar.f42904a) {
                    if (i10 != -1 || this.f46982l == gVar.f46982l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f46976c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f19063id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f18916id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f46976c;
                            if (user2 != null) {
                                j11 = user2.f19063id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f18916id;
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
                        int i11 = this.f42904a;
                        if (i11 != 6 || this.f46977f == gVar.f46977f) {
                            if (i11 != 7 || TextUtils.equals(this.f46978g, gVar.f46978g)) {
                                if (this.f42904a != 8 || TextUtils.equals(this.f46978g, gVar.f46978g)) {
                                    if (this.f42904a != 9 || (TextUtils.equals(this.f46978g, gVar.f46978g) && this.f46979i == gVar.f46979i && this.f46980j == gVar.f46980j)) {
                                        if (this.f42904a != 10 || this.f46987q == gVar.f46987q) {
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
