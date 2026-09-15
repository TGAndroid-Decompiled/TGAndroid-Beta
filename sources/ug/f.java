package ug;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.vy0;
import tg.d1;
public final class f extends og.a {
    public TLRPC.User f43723c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f43724f;
    public CharSequence f43725g;
    public String h;
    public int f43726i;
    public int f43727j;
    public boolean f43728k;
    public int f43729l;
    public vy0 f43730m;
    public vy0 f43731n;
    public d1 f43732o;
    public d1 f43733p;
    public View f43734q;
    public pq f43735r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.f43729l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.f43725g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.f43723c = user;
        fVar.d = null;
        fVar.e = null;
        fVar.f43728k = z10;
        return fVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.f43728k == fVar.f43728k) {
                    if (this.f15533a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if (this.f43730m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fVar.f43730m == null) {
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
                int i10 = this.f15533a;
                if (i10 == fVar.f15533a) {
                    if (i10 != -1 || this.f43729l == fVar.f43729l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f43723c;
                            long j10 = 0;
                            if (user != null) {
                                j3 = user.f18259id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j3 = -chat.f18112id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j3 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j3 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = fVar.f43723c;
                            if (user2 != null) {
                                j10 = user2.f18259id;
                            } else {
                                TLRPC.Chat chat2 = fVar.e;
                                if (chat2 != null) {
                                    j10 = -chat2.f18112id;
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
                        int i11 = this.f15533a;
                        if (i11 != 6 || this.f43724f == fVar.f43724f) {
                            if (i11 != 7 || TextUtils.equals(this.f43725g, fVar.f43725g)) {
                                if (this.f15533a != 8 || TextUtils.equals(this.f43725g, fVar.f43725g)) {
                                    if (this.f15533a != 9 || (TextUtils.equals(this.f43725g, fVar.f43725g) && this.f43726i == fVar.f43726i && this.f43727j == fVar.f43727j)) {
                                        if (this.f15533a != 10 || this.f43734q == fVar.f43734q) {
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
