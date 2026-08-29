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
public final class rg1 extends org.telegram.ui.Components.tk0 {
    public final Context f42098c;
    public final rf.k1 f42100f;
    public Runnable h;
    public boolean f42101n;
    public final int f42103s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList f42099e = new ArrayList();
    public final ArrayList f42102r = new ArrayList();

    public rg1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.v = usersSelectActivity;
        this.f42098c = context;
        if (usersSelectActivity.B) {
            this.f42103s = 0;
        } else {
            int i10 = usersSelectActivity.f36359x;
            if (i10 == 2) {
                this.f42103s = (!usersSelectActivity.D ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.E) {
                    this.f42103s = 7;
                } else {
                    this.f42103s = 5;
                }
            } else {
                this.f42103s = 0;
            }
        }
        int i11 = usersSelectActivity.f36359x;
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
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Dialog dialog = allDialogs.get(i12);
            if (!DialogObject.isEncryptedDialog(dialog.f22396id)) {
                if (DialogObject.isUserDialog(dialog.f22396id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f22396id));
                    if (user != null && ((usersSelectActivity.C || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.f42102r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f22396id));
                    if (z11 && chat != null) {
                        this.f42102r.add(chat);
                    }
                }
            }
        }
        if (!z12 && usersSelectActivity.C) {
            this.f42102r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        rf.k1 k1Var = new rf.k1(false);
        this.f42100f = k1Var;
        k1Var.f47290p = false;
        k1Var.f47277a = new zk0(this, 25);
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.e4) {
            ((org.telegram.ui.Cells.e4) view).f24277a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = (int) (h() * f9);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        boolean z11;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        int i10 = this.v.f36359x;
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
            this.f42099e.clear();
            this.f42100f.f(null, null);
            this.f42100f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        qg1 qg1Var = new qg1(this, str, z11, z10, 0);
        this.h = qg1Var;
        dispatchQueue.postRunnable(qg1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f42101n) {
            int size = this.d.size();
            rf.k1 k1Var = this.f42100f;
            return k1Var.f47280e.size() + k1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.B) {
            int i11 = usersSelectActivity.f36359x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.D ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.E ? 7 : 5;
            }
        }
        return this.f42102r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f42101n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.B ? !((i11 = usersSelectActivity.f36359x) != 2 ? i11 != 0 || (!usersSelectActivity.E ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.D ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rg1.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View e4Var;
        Context context = this.f42098c;
        if (i10 != 1) {
            e4Var = new org.telegram.ui.Cells.s3(context, null);
        } else {
            e4Var = new org.telegram.ui.Cells.e4(context, 1, 0, true);
        }
        return new f2.n1(e4Var);
    }
}
