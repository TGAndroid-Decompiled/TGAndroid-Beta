package xg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.z0;
public final class h extends rg.a {
    public TLRPC.User f58636c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58637e;
    public TLRPC.TL_help_country f58638f;
    public CharSequence f58639g;
    public CharSequence h;
    public int f58640i;
    public int f58641j;
    public boolean f58642k;
    public int f58643l;
    public z0 f58644m;
    public z0 f58645n;
    public a1 f58646o;
    public a1 f58647p;
    public View f58648q;
    public Drawable f58649r;

    public h(int i7, boolean z9) {
        super(i7, z9);
        this.f58643l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f58639g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z9) {
        h hVar = new h(3, true);
        hVar.f58636c = user;
        hVar.d = null;
        hVar.f58637e = null;
        hVar.f58642k = z9;
        return hVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z9;
        boolean z10;
        if (this != aVar) {
            if (h.class == aVar.getClass()) {
                h hVar = (h) aVar;
                if (this.f58642k == hVar.f58642k) {
                    if (this.f54440a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f58644m == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (hVar.f58644m == null) {
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
                int i7 = this.f54440a;
                if (i7 == hVar.f54440a) {
                    if (i7 != -1 || this.f58643l == hVar.f58643l) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f58636c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f27101id;
                            } else {
                                TLRPC.Chat chat = this.f58637e;
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
                            TLRPC.User user2 = hVar.f58636c;
                            if (user2 != null) {
                                j10 = user2.f27101id;
                            } else {
                                TLRPC.Chat chat2 = hVar.f58637e;
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
                        int i10 = this.f54440a;
                        if (i10 != 6 || this.f58638f == hVar.f58638f) {
                            if (i10 != 7 || TextUtils.equals(this.f58639g, hVar.f58639g)) {
                                if (this.f54440a != 8 || TextUtils.equals(this.f58639g, hVar.f58639g)) {
                                    if (this.f54440a != 9 || (TextUtils.equals(this.f58639g, hVar.f58639g) && this.f58640i == hVar.f58640i && this.f58641j == hVar.f58641j)) {
                                        if (this.f54440a != 10 || this.f58648q == hVar.f58648q) {
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
