package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yh1 extends org.telegram.ui.Components.yl0 {
    public final Context f44348c;
    public final gg.b2 f44350f;
    public Runnable h;
    public boolean f44351n;
    public final int f44353s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList f44349e = new ArrayList();
    public final ArrayList f44352r = new ArrayList();

    public yh1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.v = usersSelectActivity;
        this.f44348c = context;
        if (usersSelectActivity.F) {
            this.f44353s = 0;
        } else {
            int i10 = usersSelectActivity.f34601x;
            if (i10 == 2) {
                this.f44353s = (!usersSelectActivity.H ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.I) {
                    this.f44353s = 7;
                } else {
                    this.f44353s = 5;
                }
            } else {
                this.f44353s = 0;
            }
        }
        int i11 = usersSelectActivity.f34601x;
        if (i11 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList<TLRPC.Dialog> allDialogs = usersSelectActivity.getMessagesController().getAllDialogs();
        int size = allDialogs.size();
        int i12 = 0;
        boolean z12 = false;
        while (i12 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i12);
            if (!DialogObject.isEncryptedDialog(dialog.f20042id)) {
                if (DialogObject.isUserDialog(dialog.f20042id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f20042id));
                    if (user != null && ((usersSelectActivity.G || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.f44352r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f20042id));
                    if (z11 && chat != null) {
                        this.f44352r.add(chat);
                    }
                }
            }
            i12++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.G) {
            this.f44352r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        gg.b2 b2Var = new gg.b2(false);
        this.f44350f = b2Var;
        b2Var.f10545p = false;
        b2Var.f10532a = new hq0(this, 24);
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47658a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f22122a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47662f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.qm0 qm0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        boolean z11;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        int i10 = this.v.f34601x;
        if (i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (str == null) {
            this.d.clear();
            this.f44349e.clear();
            this.f44350f.f(null, null);
            this.f44350f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        xh1 xh1Var = new xh1(this, str, z11, z10, 0);
        this.h = xh1Var;
        dispatchQueue.postRunnable(xh1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f44351n) {
            int size = this.d.size();
            gg.b2 b2Var = this.f44350f;
            return b2Var.f10535e.size() + b2Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.F) {
            int i11 = usersSelectActivity.f34601x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.H ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.I ? 7 : 5;
            }
        }
        return this.f44352r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f44351n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.F ? !((i11 = usersSelectActivity.f34601x) != 2 ? i11 != 0 || (!usersSelectActivity.I ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.H ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yh1.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        Context context = this.f44348c;
        if (i10 != 1) {
            g4Var = new org.telegram.ui.Cells.v3(context, null);
        } else {
            g4Var = new org.telegram.ui.Cells.g4(1, 0, context, true);
        }
        return new s4.d1(g4Var);
    }
}
