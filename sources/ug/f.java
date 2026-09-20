package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.vy0;
import tg.c1;
public final class f extends og.a {
    public TLRPC.User f44025c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f44026f;
    public CharSequence f44027g;
    public String h;
    public int f44028i;
    public int f44029j;
    public boolean f44030k;
    public int f44031l;
    public vy0 f44032m;
    public vy0 f44033n;
    public c1 f44034o;
    public c1 f44035p;
    public View f44036q;
    public pq f44037r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f44031l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f44027g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f44025c = user;
        fVar.d = null;
        fVar.e = null;
        fVar.f44030k = z10;
        return fVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f44030k == fVar.f44030k) {
                    if (this.f15704a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f44032m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f44032m == null) {
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
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                int i10 = this.f15704a;
                if (i10 == fVar.f15704a) {
                    if (i10 != -1 || this.f44031l == fVar.f44031l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f44025c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18475id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18328id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = fVar.f44025c;
                            if (user2 != null) {
                                j10 = user2.f18475id;
                            } else {
                                TLRPC.Chat chat2 = fVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18328id;
                                } else {
                                    TLRPC.InputPeer inputPeer2 = fVar.d;
                                    if (inputPeer2 != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer2);
                                    }
                                }
                            }
                            if (j3 != j10) {
                                return false;
                            }
                        }
                        int i11 = this.f15704a;
                        if (i11 != 6 || this.f44026f == fVar.f44026f) {
                            if (i11 != 7 || TextUtils.equals(this.f44027g, fVar.f44027g)) {
                                if (this.f15704a != 8 || TextUtils.equals(this.f44027g, fVar.f44027g)) {
                                    if (this.f15704a != 9 || (TextUtils.equals(this.f44027g, fVar.f44027g) && this.f44028i == fVar.f44028i && this.f44029j == fVar.f44029j)) {
                                        if (this.f15704a != 10 || this.f44036q == fVar.f44036q) {
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
