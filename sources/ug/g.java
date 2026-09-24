package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qq;
import org.telegram.ui.ny0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f43995c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f43996f;
    public CharSequence f43997g;
    public String h;
    public int f43998i;
    public int f43999j;
    public boolean f44000k;
    public int f44001l;
    public ny0 f44002m;
    public ny0 f44003n;
    public c1 f44004o;
    public c1 f44005p;
    public View f44006q;
    public qq f44007r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f44001l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f43997g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f43995c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f44000k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f44000k == gVar.f44000k) {
                    if (this.f15700a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f44002m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f44002m == null) {
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
        long j3;
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                int i10 = this.f15700a;
                if (i10 == gVar.f15700a) {
                    if (i10 != -1 || this.f44001l == gVar.f44001l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f43995c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18468id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18321id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f43995c;
                            if (user2 != null) {
                                j10 = user2.f18468id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18321id;
                                } else {
                                    TLRPC.InputPeer inputPeer2 = gVar.d;
                                    if (inputPeer2 != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer2);
                                    }
                                }
                            }
                            if (j3 != j10) {
                                return false;
                            }
                        }
                        int i11 = this.f15700a;
                        if (i11 != 6 || this.f43996f == gVar.f43996f) {
                            if (i11 != 7 || TextUtils.equals(this.f43997g, gVar.f43997g)) {
                                if (this.f15700a != 8 || TextUtils.equals(this.f43997g, gVar.f43997g)) {
                                    if (this.f15700a != 9 || (TextUtils.equals(this.f43997g, gVar.f43997g) && this.f43998i == gVar.f43998i && this.f43999j == gVar.f43999j)) {
                                        if (this.f15700a != 10 || this.f44006q == gVar.f44006q) {
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
