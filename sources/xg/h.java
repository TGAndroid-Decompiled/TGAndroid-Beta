package xg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.z0;
public final class h extends rg.a {
    public TLRPC.User f58635c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58636e;
    public TLRPC.TL_help_country f58637f;
    public CharSequence f58638g;
    public CharSequence h;
    public int f58639i;
    public int f58640j;
    public boolean f58641k;
    public int f58642l;
    public z0 f58643m;
    public z0 f58644n;
    public a1 f58645o;
    public a1 f58646p;
    public View f58647q;
    public Drawable f58648r;

    public h(int i7, boolean z9) {
        super(i7, z9);
        this.f58642l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f58638g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z9) {
        h hVar = new h(3, true);
        hVar.f58635c = user;
        hVar.d = null;
        hVar.f58636e = null;
        hVar.f58641k = z9;
        return hVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z9;
        boolean z10;
        if (this != aVar) {
            if (h.class == aVar.getClass()) {
                h hVar = (h) aVar;
                if (this.f58641k == hVar.f58641k) {
                    if (this.f54439a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f58643m == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (hVar.f58643m == null) {
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
                int i7 = this.f54439a;
                if (i7 == hVar.f54439a) {
                    if (i7 != -1 || this.f58642l == hVar.f58642l) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f58635c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f27102id;
                            } else {
                                TLRPC.Chat chat = this.f58636e;
                                if (chat != null) {
                                    j3 = -chat.f26953id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = m5.n(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = hVar.f58635c;
                            if (user2 != null) {
                                j10 = user2.f27102id;
                            } else {
                                TLRPC.Chat chat2 = hVar.f58636e;
                                if (chat2 != null) {
                                    j10 = -chat2.f26953id;
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
                        int i10 = this.f54439a;
                        if (i10 != 6 || this.f58637f == hVar.f58637f) {
                            if (i10 != 7 || TextUtils.equals(this.f58638g, hVar.f58638g)) {
                                if (this.f54439a != 8 || TextUtils.equals(this.f58638g, hVar.f58638g)) {
                                    if (this.f54439a != 9 || (TextUtils.equals(this.f58638g, hVar.f58638g) && this.f58639i == hVar.f58639i && this.f58640j == hVar.f58640j)) {
                                        if (this.f54439a != 10 || this.f58647q == hVar.f58647q) {
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
