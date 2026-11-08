package xg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.z0;
public final class h extends rg.a {
    public TLRPC.User f58730c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f58731e;
    public TLRPC.TL_help_country f58732f;
    public CharSequence f58733g;
    public CharSequence h;
    public int f58734i;
    public int f58735j;
    public boolean f58736k;
    public int f58737l;
    public z0 f58738m;
    public z0 f58739n;
    public a1 f58740o;
    public a1 f58741p;
    public View f58742q;
    public Drawable f58743r;

    public h(int i7, boolean z9) {
        super(i7, z9);
        this.f58737l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f58733g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z9) {
        h hVar = new h(3, true);
        hVar.f58730c = user;
        hVar.d = null;
        hVar.f58731e = null;
        hVar.f58736k = z9;
        return hVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z9;
        boolean z10;
        if (this != aVar) {
            if (h.class == aVar.getClass()) {
                h hVar = (h) aVar;
                if (this.f58736k == hVar.f58736k) {
                    if (this.f54531a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f58738m == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (hVar.f58738m == null) {
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
                int i7 = this.f54531a;
                if (i7 == hVar.f54531a) {
                    if (i7 != -1 || this.f58737l == hVar.f58737l) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f58730c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f27105id;
                            } else {
                                TLRPC.Chat chat = this.f58731e;
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
                            TLRPC.User user2 = hVar.f58730c;
                            if (user2 != null) {
                                j10 = user2.f27105id;
                            } else {
                                TLRPC.Chat chat2 = hVar.f58731e;
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
                        int i10 = this.f54531a;
                        if (i10 != 6 || this.f58732f == hVar.f58732f) {
                            if (i10 != 7 || TextUtils.equals(this.f58733g, hVar.f58733g)) {
                                if (this.f54531a != 8 || TextUtils.equals(this.f58733g, hVar.f58733g)) {
                                    if (this.f54531a != 9 || (TextUtils.equals(this.f58733g, hVar.f58733g) && this.f58734i == hVar.f58734i && this.f58735j == hVar.f58735j)) {
                                        if (this.f54531a != 10 || this.f58742q == hVar.f58742q) {
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
