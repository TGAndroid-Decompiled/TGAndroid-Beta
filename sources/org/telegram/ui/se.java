package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class se implements org.telegram.ui.Components.f60, org.telegram.ui.Components.i60, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ko, MessagesStorage.BooleanCallback, org.telegram.ui.Components.zj0, ResultCallback, wh.c, jh.a, jh.b, x60, os, org.telegram.ui.Components.ol0, jh.d, org.telegram.ui.Components.al0 {
    public final int f37406a;
    public final xn f37407b;

    public se(xn xnVar, int i10) {
        this.f37406a = i10;
        this.f37407b = xnVar;
    }

    @Override
    public void a() {
        xn xnVar = this.f37407b;
        if (xnVar.y3 == null && xnVar.getParentActivity() != null) {
            xnVar.Q7();
            xnVar.y3.m(xnVar.T5, xnVar.f39752f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f37406a) {
            case 4:
                xn.b1(this.f37407b, document);
                return;
            default:
                xn.e1(this.f37407b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        xn xnVar = this.f37407b;
        boolean z10 = false;
        if (xnVar.getParentActivity() != null) {
            gg.k1 adapter = xnVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = xnVar.I1.getAdapter();
                if (adapter2.f9829w0 != null && !adapter2.f9811h0) {
                    return false;
                }
                Object J = xnVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (xnVar.I1.getAdapter().J != null && org.telegram.ui.Components.y51.h) {
                        xnVar.Y.setFieldText("");
                        lk lkVar = xnVar.Y;
                        String str = h1Var.f9744a;
                        TLRPC.Chat chat = xnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        lkVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (xnVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.y51.h) {
                            xnVar.Y.setFieldText("");
                            lk lkVar2 = xnVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = xnVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            lkVar2.Z0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f39750ea);
                        alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new se(xnVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        xnVar.showDialog(alertDialog$Builder.f18655a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e() {
        xn xnVar = this.f37407b;
        xnVar.q9(1);
        xnVar.r9();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37406a) {
            case 2:
                sk skVar = this.f37407b.B0;
                if (skVar != null) {
                    skVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f37407b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                this.f37407b.e9(true);
                return;
            case 6:
                xn xnVar = this.f37407b;
                MessagePreviewParams messagePreviewParams = xnVar.f39758f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, xnVar.T5);
                }
                xnVar.j8();
                return;
            case 7:
                this.f37407b.ca(1);
                return;
            case 8:
                xn xnVar2 = this.f37407b;
                xnVar2.getMessagesController().unblockPeer(xnVar2.f39752f.f18476id);
                return;
            case 10:
                this.f37407b.finishFragment();
                return;
            case 12:
                gg.k1 adapter = this.f37407b.I1.getAdapter();
                adapter.f9828w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.va0 va0Var = adapter.V;
                if (va0Var != null) {
                    va0Var.a(false);
                    return;
                }
                return;
            case 15:
                xn xnVar3 = this.f37407b;
                xnVar3.showDialog(new ul(xnVar3, xnVar3.getParentActivity(), xnVar3));
                return;
            case 16:
                xn xnVar4 = this.f37407b;
                xnVar4.Q7();
                UndoView undoView = xnVar4.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                xn xnVar5 = this.f37407b;
                MessageObject messageObject = (MessageObject) xnVar5.J4.get(Integer.valueOf(xnVar5.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) xnVar5.f39868o6[0].get(xnVar5.L4);
                }
                xnVar5.cc(messageObject);
                return;
            case 19:
                xn xnVar6 = this.f37407b;
                MessagePreviewParams messagePreviewParams2 = xnVar6.f39758f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    xnVar6.ca(0);
                    return;
                }
                return;
        }
    }

    @Override
    public void g(ArrayList arrayList) {
        switch (this.f37406a) {
            case 11:
                xn xnVar = this.f37407b;
                if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
                    ii iiVar = new ii(xnVar, xnVar, xnVar.getParentActivity(), xnVar.f39750ea, arrayList);
                    iiVar.setCalcMandatoryInsets(xnVar.x9());
                    iiVar.setDimBehind(false);
                    xnVar.A7(false);
                    xnVar.showDialog(iiVar);
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f37407b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    fj fjVar = new fj(xnVar2, xnVar2, xnVar2.getParentActivity(), xnVar2.f39750ea, arrayList);
                    fjVar.setCalcMandatoryInsets(xnVar2.x9());
                    fjVar.setDimBehind(false);
                    xnVar2.A7(false);
                    xnVar2.showDialog(fjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(boolean z10, boolean z11) {
        xn xnVar = this.f37407b;
        xnVar.M0.i(xnVar.f39762fa.c(), z10, z11);
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        xn xnVar = this.f37407b;
        xnVar.getMessagesController().addUsersToChat(xnVar.e, xnVar, arrayList, i10, null, null, null);
        xnVar.getMessagesController().hidePeerSettingsBar(xnVar.T5, xnVar.f39752f, xnVar.e);
        xnVar.Qc(true);
        xnVar.oc(true);
    }

    @Override
    public void j(int i10) {
        xn xnVar = this.f37407b;
        if (i10 == 1) {
            xnVar.U9();
        } else if (i10 == 2) {
            xnVar.H9();
        } else if (i10 == 3) {
            xnVar.D4 = true;
            xnVar.getMessagesController().getNextReactionMention(xnVar.T5, xnVar.d(), xnVar.l1, new qg(xnVar, 0));
        } else if (i10 == 4) {
            xnVar.D4 = true;
            xnVar.getMessagesController().getNextPollVotesMention(xnVar.T5, xnVar.d(), xnVar.f39838m1, new qg(xnVar, 1));
        } else if (i10 == 6) {
            xnVar.Y8(true);
        } else if (i10 == 5) {
            xnVar.Y8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = xnVar.J1;
            if (g4Var != null) {
                g4Var.F1(null, 0);
            }
            xnVar.X9();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) obj;
        xn xnVar = this.f37407b;
        vn vnVar = xnVar.f39750ea;
        TLRPC.WallPaper wallPaper = vnVar.h;
        if (xnVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vnVar.i(d4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        xn xnVar = this.f37407b;
        NotificationCenter notificationCenter = xnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(xnVar, i10);
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        xnVar.finishFragment();
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xnVar.T5), xnVar.f39752f, xnVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void c(TLRPC.User user) {
    }
}
