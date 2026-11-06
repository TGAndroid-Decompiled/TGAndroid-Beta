package xg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.z0;
public final class h extends rg.a {
    public TLRPC.User f58611c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58612e;
    public TLRPC.TL_help_country f58613f;
    public CharSequence f58614g;
    public CharSequence h;
    public int f58615i;
    public int f58616j;
    public boolean f58617k;
    public int f58618l;
    public z0 f58619m;
    public z0 f58620n;
    public a1 f58621o;
    public a1 f58622p;
    public View f58623q;
    public Drawable f58624r;

    public h(int i7, boolean z9) {
        super(i7, z9);
        this.f58618l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f58614g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z9) {
        h hVar = new h(3, true);
        hVar.f58611c = user;
        hVar.d = null;
        hVar.f58612e = null;
        hVar.f58617k = z9;
        return hVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z9;
        boolean z10;
        if (this != aVar) {
            if (h.class == aVar.getClass()) {
                h hVar = (h) aVar;
                if (this.f58617k == hVar.f58617k) {
                    if (this.f54415a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f58619m == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (hVar.f58619m == null) {
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
                int i7 = this.f54415a;
                if (i7 == hVar.f54415a) {
                    if (i7 != -1 || this.f58618l == hVar.f58618l) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f58611c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f27101id;
                            } else {
                                TLRPC.Chat chat = this.f58612e;
                                if (chat != null) {
                                    j3 = -chat.f26952id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = m5.n(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = hVar.f58611c;
                            if (user2 != null) {
                                j10 = user2.f27101id;
                            } else {
                                TLRPC.Chat chat2 = hVar.f58612e;
                                if (chat2 != null) {
                                    j10 = -chat2.f26952id;
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
                        int i10 = this.f54415a;
                        if (i10 != 6 || this.f58613f == hVar.f58613f) {
                            if (i10 != 7 || TextUtils.equals(this.f58614g, hVar.f58614g)) {
                                if (this.f54415a != 8 || TextUtils.equals(this.f58614g, hVar.f58614g)) {
                                    if (this.f54415a != 9 || (TextUtils.equals(this.f58614g, hVar.f58614g) && this.f58615i == hVar.f58615i && this.f58616j == hVar.f58616j)) {
                                        if (this.f54415a != 10 || this.f58623q == hVar.f58623q) {
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
