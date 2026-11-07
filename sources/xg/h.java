package xg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.z0;
public final class h extends rg.a {
    public TLRPC.User f58641c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58642e;
    public TLRPC.TL_help_country f58643f;
    public CharSequence f58644g;
    public CharSequence h;
    public int f58645i;
    public int f58646j;
    public boolean f58647k;
    public int f58648l;
    public z0 f58649m;
    public z0 f58650n;
    public a1 f58651o;
    public a1 f58652p;
    public View f58653q;
    public Drawable f58654r;

    public h(int i7, boolean z9) {
        super(i7, z9);
        this.f58648l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f58644g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z9) {
        h hVar = new h(3, true);
        hVar.f58641c = user;
        hVar.d = null;
        hVar.f58642e = null;
        hVar.f58647k = z9;
        return hVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z9;
        boolean z10;
        if (this != aVar) {
            if (h.class == aVar.getClass()) {
                h hVar = (h) aVar;
                if (this.f58647k == hVar.f58647k) {
                    if (this.f54439a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f58649m == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (hVar.f58649m == null) {
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
                    if (i7 != -1 || this.f58648l == hVar.f58648l) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f58641c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f27102id;
                            } else {
                                TLRPC.Chat chat = this.f58642e;
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
                            TLRPC.User user2 = hVar.f58641c;
                            if (user2 != null) {
                                j10 = user2.f27102id;
                            } else {
                                TLRPC.Chat chat2 = hVar.f58642e;
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
                        if (i10 != 6 || this.f58643f == hVar.f58643f) {
                            if (i10 != 7 || TextUtils.equals(this.f58644g, hVar.f58644g)) {
                                if (this.f54439a != 8 || TextUtils.equals(this.f58644g, hVar.f58644g)) {
                                    if (this.f54439a != 9 || (TextUtils.equals(this.f58644g, hVar.f58644g) && this.f58645i == hVar.f58645i && this.f58646j == hVar.f58646j)) {
                                        if (this.f54439a != 10 || this.f58653q == hVar.f58653q) {
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
