package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.wy0;
import tg.d1;
public final class f extends og.a {
    public TLRPC.User f43719c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f43720f;
    public CharSequence f43721g;
    public String h;
    public int f43722i;
    public int f43723j;
    public boolean f43724k;
    public int f43725l;
    public wy0 f43726m;
    public wy0 f43727n;
    public d1 f43728o;
    public d1 f43729p;
    public View f43730q;
    public pq f43731r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f43725l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f43721g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f43719c = user;
        fVar.d = null;
        fVar.e = null;
        fVar.f43724k = z10;
        return fVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f43724k == fVar.f43724k) {
                    if (this.f15531a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f43726m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f43726m == null) {
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
                int i10 = this.f15531a;
                if (i10 == fVar.f15531a) {
                    if (i10 != -1 || this.f43725l == fVar.f43725l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f43719c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18256id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18109id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = fVar.f43719c;
                            if (user2 != null) {
                                j10 = user2.f18256id;
                            } else {
                                TLRPC.Chat chat2 = fVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18109id;
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
                        int i11 = this.f15531a;
                        if (i11 != 6 || this.f43720f == fVar.f43720f) {
                            if (i11 != 7 || TextUtils.equals(this.f43721g, fVar.f43721g)) {
                                if (this.f15531a != 8 || TextUtils.equals(this.f43721g, fVar.f43721g)) {
                                    if (this.f15531a != 9 || (TextUtils.equals(this.f43721g, fVar.f43721g) && this.f43722i == fVar.f43722i && this.f43723j == fVar.f43723j)) {
                                        if (this.f15531a != 10 || this.f43730q == fVar.f43730q) {
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
