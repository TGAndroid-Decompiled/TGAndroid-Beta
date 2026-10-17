package vg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import qg.n;
import ug.a1;
public final class g extends pg.a {
    public TLRPC.User f48383c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f48384f;
    public CharSequence f48385g;
    public CharSequence h;
    public int f48386i;
    public int f48387j;
    public boolean f48388k;
    public int f48389l;
    public n f48390m;
    public n f48391n;
    public a1 f48392o;
    public a1 f48393p;
    public View f48394q;
    public Drawable f48395r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f48389l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f48385g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f48383c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f48388k = z10;
        return gVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f48388k == gVar.f48388k) {
                    if (this.f44314a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f48390m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f48390m == null) {
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
                int i10 = this.f44314a;
                if (i10 == gVar.f44314a) {
                    if (i10 != -1 || this.f48389l == gVar.f48389l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f48383c;
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
                            TLRPC.User user2 = gVar.f48383c;
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
                        int i11 = this.f44314a;
                        if (i11 != 6 || this.f48384f == gVar.f48384f) {
                            if (i11 != 7 || TextUtils.equals(this.f48385g, gVar.f48385g)) {
                                if (this.f44314a != 8 || TextUtils.equals(this.f48385g, gVar.f48385g)) {
                                    if (this.f44314a != 9 || (TextUtils.equals(this.f48385g, gVar.f48385g) && this.f48386i == gVar.f48386i && this.f48387j == gVar.f48387j)) {
                                        if (this.f44314a != 10 || this.f48394q == gVar.f48394q) {
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
