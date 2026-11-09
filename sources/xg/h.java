package xg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.z0;
public final class h extends rg.a {
    public TLRPC.User f58740c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58741e;
    public TLRPC.TL_help_country f58742f;
    public CharSequence f58743g;
    public CharSequence h;
    public int f58744i;
    public int f58745j;
    public boolean f58746k;
    public int f58747l;
    public z0 f58748m;
    public z0 f58749n;
    public a1 f58750o;
    public a1 f58751p;
    public View f58752q;
    public Drawable f58753r;

    public h(int i7, boolean z9) {
        super(i7, z9);
        this.f58747l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f58743g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z9) {
        h hVar = new h(3, true);
        hVar.f58740c = user;
        hVar.d = null;
        hVar.f58741e = null;
        hVar.f58746k = z9;
        return hVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z9;
        boolean z10;
        if (this != aVar) {
            if (h.class == aVar.getClass()) {
                h hVar = (h) aVar;
                if (this.f58746k == hVar.f58746k) {
                    if (this.f54544a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f58748m == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (hVar.f58748m == null) {
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
                int i7 = this.f54544a;
                if (i7 == hVar.f54544a) {
                    if (i7 != -1 || this.f58747l == hVar.f58747l) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f58740c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f27105id;
                            } else {
                                TLRPC.Chat chat = this.f58741e;
                                if (chat != null) {
                                    j3 = -chat.f26956id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = m5.n(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = hVar.f58740c;
                            if (user2 != null) {
                                j10 = user2.f27105id;
                            } else {
                                TLRPC.Chat chat2 = hVar.f58741e;
                                if (chat2 != null) {
                                    j10 = -chat2.f26956id;
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
                        int i10 = this.f54544a;
                        if (i10 != 6 || this.f58742f == hVar.f58742f) {
                            if (i10 != 7 || TextUtils.equals(this.f58743g, hVar.f58743g)) {
                                if (this.f54544a != 8 || TextUtils.equals(this.f58743g, hVar.f58743g)) {
                                    if (this.f54544a != 9 || (TextUtils.equals(this.f58743g, hVar.f58743g) && this.f58744i == hVar.f58744i && this.f58745j == hVar.f58745j)) {
                                        if (this.f54544a != 10 || this.f58752q == hVar.f58752q) {
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
