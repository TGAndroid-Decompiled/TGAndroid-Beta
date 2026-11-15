package xg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc1;
import wg.x0;
public final class h extends rg.a {
    public TLRPC.User f59922c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f59923e;
    public TLRPC.TL_help_country f59924f;
    public CharSequence f59925g;
    public CharSequence h;
    public int f59926i;
    public int f59927j;
    public boolean f59928k;
    public int f59929l;
    public sc1 f59930m;
    public sc1 f59931n;
    public x0 f59932o;
    public x0 f59933p;
    public View f59934q;
    public Drawable f59935r;

    public h(int i7, boolean z10) {
        super(i7, z10);
        this.f59929l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f59925g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z10) {
        h hVar = new h(3, true);
        hVar.f59922c = user;
        hVar.d = null;
        hVar.f59923e = null;
        hVar.f59928k = z10;
        return hVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (h.class == aVar.getClass()) {
                h hVar = (h) aVar;
                if (this.f59928k == hVar.f59928k) {
                    if (this.f56015a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f59930m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (hVar.f59930m == null) {
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
            if (obj != null && h.class == obj.getClass()) {
                h hVar = (h) obj;
                int i7 = this.f56015a;
                if (i7 == hVar.f56015a) {
                    if (i7 != -1 || this.f59929l == hVar.f59929l) {
                        if (i7 == 3) {
                            TLRPC.User user = this.f59922c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f28200id;
                            } else {
                                TLRPC.Chat chat = this.f59923e;
                                if (chat != null) {
                                    j3 = -chat.f28051id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = m5.n(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = hVar.f59922c;
                            if (user2 != null) {
                                j10 = user2.f28200id;
                            } else {
                                TLRPC.Chat chat2 = hVar.f59923e;
                                if (chat2 != null) {
                                    j10 = -chat2.f28051id;
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
                        int i10 = this.f56015a;
                        if (i10 != 6 || this.f59924f == hVar.f59924f) {
                            if (i10 != 7 || TextUtils.equals(this.f59925g, hVar.f59925g)) {
                                if (this.f56015a != 8 || TextUtils.equals(this.f59925g, hVar.f59925g)) {
                                    if (this.f56015a != 9 || (TextUtils.equals(this.f59925g, hVar.f59925g) && this.f59926i == hVar.f59926i && this.f59927j == hVar.f59927j)) {
                                        if (this.f56015a != 10 || this.f59934q == hVar.f59934q) {
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
