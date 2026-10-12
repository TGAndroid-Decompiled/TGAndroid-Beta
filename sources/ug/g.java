package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hr;
import org.telegram.ui.xy0;
import tg.c1;
public final class g extends og.a {
    public TLRPC.User f49163c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f49164e;
    public TLRPC.TL_help_country f49165f;
    public CharSequence f49166g;
    public String h;
    public int f49167i;
    public int f49168j;
    public boolean f49169k;
    public int f49170l;
    public xy0 f49171m;
    public xy0 f49172n;
    public c1 f49173o;
    public c1 f49174p;
    public View f49175q;
    public hr f49176r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f49170l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f49166g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f49163c = user;
        gVar.d = null;
        gVar.f49164e = null;
        gVar.f49169k = z10;
        return gVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f49169k == gVar.f49169k) {
                    if (this.f16877a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f49171m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f49171m == null) {
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
                int i10 = this.f16877a;
                if (i10 == gVar.f16877a) {
                    if (i10 != -1 || this.f49170l == gVar.f49170l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f49163c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f19950id;
                            } else {
                                TLRPC.Chat chat = this.f49164e;
                                if (chat != null) {
                                    j3 = -chat.f19803id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f49163c;
                            if (user2 != null) {
                                j10 = user2.f19950id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f49164e;
                                if (chat2 != null) {
                                    j10 = -chat2.f19803id;
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
                        int i11 = this.f16877a;
                        if (i11 != 6 || this.f49165f == gVar.f49165f) {
                            if (i11 != 7 || TextUtils.equals(this.f49166g, gVar.f49166g)) {
                                if (this.f16877a != 8 || TextUtils.equals(this.f49166g, gVar.f49166g)) {
                                    if (this.f16877a != 9 || (TextUtils.equals(this.f49166g, gVar.f49166g) && this.f49167i == gVar.f49167i && this.f49168j == gVar.f49168j)) {
                                        if (this.f16877a != 10 || this.f49175q == gVar.f49175q) {
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
