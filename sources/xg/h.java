package xg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ik0;
import wg.a1;
import wg.z0;
public final class h extends rg.a {
    public TLRPC.User f58738c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58739e;
    public TLRPC.TL_help_country f58740f;
    public CharSequence f58741g;
    public CharSequence h;
    public int f58742i;
    public int f58743j;
    public boolean f58744k;
    public int f58745l;
    public ik0 f58746m;
    public a1 f58747n;
    public z0 f58748o;
    public z0 f58749p;
    public View f58750q;
    public Drawable f58751r;

    public h(int i7, boolean z9) {
        super(i7, z9);
        this.f58745l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f58741g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z9) {
        h hVar = new h(3, true);
        hVar.f58738c = user;
        hVar.d = null;
        hVar.f58739e = null;
        hVar.f58744k = z9;
        return hVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z9;
        boolean z10;
        if (this != aVar) {
            if (h.class == aVar.getClass()) {
                h hVar = (h) aVar;
                if (this.f58744k == hVar.f58744k) {
                    if (this.f54543a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f58746m == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (hVar.f58746m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z9 == z10) {
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
            if (obj != null && h.class == obj.getClass()) {
                h hVar = (h) obj;
                int i7 = this.f54543a;
                if (i7 == hVar.f54543a) {
                    if (i7 != -1 || this.f58745l == hVar.f58745l) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f58738c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f27109id;
                            } else {
                                TLRPC.Chat chat = this.f58739e;
                                if (chat != null) {
                                    j3 = -chat.f26960id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = m5.n(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = hVar.f58738c;
                            if (user2 != null) {
                                j10 = user2.f27109id;
                            } else {
                                TLRPC.Chat chat2 = hVar.f58739e;
                                if (chat2 != null) {
                                    j10 = -chat2.f26960id;
                                } else {
                                    TLRPC.InputPeer inputPeer2 = hVar.d;
                                    if (inputPeer2 != null) {
                                        j10 = m5.n(inputPeer2);
                                    }
                                }
                            }
                            if (j3 != j10) {
                                return false;
                            }
                        }
                        int i10 = this.f54543a;
                        if (i10 != 6 || this.f58740f == hVar.f58740f) {
                            if (i10 != 7 || TextUtils.equals(this.f58741g, hVar.f58741g)) {
                                if (this.f54543a != 8 || TextUtils.equals(this.f58741g, hVar.f58741g)) {
                                    if (this.f54543a != 9 || (TextUtils.equals(this.f58741g, hVar.f58741g) && this.f58742i == hVar.f58742i && this.f58743j == hVar.f58743j)) {
                                        if (this.f54543a != 10 || this.f58750q == hVar.f58750q) {
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
