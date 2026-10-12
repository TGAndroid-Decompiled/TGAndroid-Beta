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
public final class ve implements org.telegram.ui.Components.x60, org.telegram.ui.Components.a70, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ap, MessagesStorage.BooleanCallback, org.telegram.ui.Components.uk0, ResultCallback, wh.c, jh.a, jh.b, z60, ss, org.telegram.ui.Components.mm0, jh.d, org.telegram.ui.Components.yl0 {
    public final int f42767a;
    public final eo f42768b;

    public ve(eo eoVar, int i10) {
        this.f42767a = i10;
        this.f42768b = eoVar;
    }

    @Override
    public void a() {
        eo eoVar = this.f42768b;
        eoVar.v9(1);
        eoVar.w9();
    }

    @Override
    public void b() {
        eo eoVar = this.f42768b;
        if (eoVar.y3 == null && eoVar.getParentActivity() != null) {
            eoVar.T7();
            eoVar.y3.m(eoVar.T5, eoVar.f37253f, 8);
        }
    }

    @Override
    public void c(TLRPC.Document document) {
        switch (this.f42767a) {
            case 4:
                eo.j0(this.f42768b, document);
                return;
            default:
                eo.D0(this.f42768b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        eo eoVar = this.f42768b;
        boolean z10 = false;
        if (eoVar.getParentActivity() != null) {
            gg.j1 adapter = eoVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.j1 adapter2 = eoVar.I1.getAdapter();
                if (adapter2.f10692w0 != null && !adapter2.f10674h0) {
                    return false;
                }
                Object J = eoVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.g1) {
                    gg.g1 g1Var = (gg.g1) J;
                    if (eoVar.I1.getAdapter().J != null && org.telegram.ui.Components.v61.h) {
                        eoVar.Y.setFieldText("");
                        sk skVar = eoVar.Y;
                        String str = g1Var.f10610a;
                        TLRPC.Chat chat = eoVar.f37241e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        skVar.c1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (eoVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.v61.h) {
                            eoVar.Y.setFieldText("");
                            sk skVar2 = eoVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = eoVar.f37241e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            skVar2.c1(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f37251ea);
                        alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ve(eoVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        eoVar.showDialog(alertDialog$Builder.f20141a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f42767a) {
            case 11:
                eo eoVar = this.f42768b;
                if (eoVar.getParentActivity() != null && eoVar.getParentActivity() != null) {
                    ni niVar = new ni(eoVar, eoVar, eoVar.getParentActivity(), eoVar.f37251ea, arrayList);
                    niVar.setCalcMandatoryInsets(eoVar.C9());
                    niVar.setDimBehind(false);
                    eoVar.D7(false);
                    eoVar.showDialog(niVar);
                    return;
                }
                return;
            default:
                eo eoVar2 = this.f42768b;
                if (eoVar2.getParentActivity() != null && eoVar2.getParentActivity() != null) {
                    kj kjVar = new kj(eoVar2, eoVar2, eoVar2.getParentActivity(), eoVar2.f37251ea, arrayList);
                    kjVar.setCalcMandatoryInsets(eoVar2.C9());
                    kjVar.setDimBehind(false);
                    eoVar2.D7(false);
                    eoVar2.showDialog(kjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f42767a) {
            case 2:
                yk ykVar = this.f42768b.B0;
                if (ykVar != null) {
                    ykVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f42768b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            default:
                eo eoVar = this.f42768b;
                MessageObject messageObject = (MessageObject) eoVar.J4.get(Integer.valueOf(eoVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) eoVar.f37368o6[0].get(eoVar.L4);
                }
                eoVar.gc(messageObject);
                return;
            case 6:
                eo eoVar2 = this.f42768b;
                MessagePreviewParams messagePreviewParams = eoVar2.f37259f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, eoVar2.T5);
                }
                eoVar2.m8();
                return;
            case 7:
                this.f42768b.ha(1);
                return;
            case 8:
                eo eoVar3 = this.f42768b;
                eoVar3.getMessagesController().unblockPeer(eoVar3.f37253f.f19949id);
                return;
            case 10:
                this.f42768b.finishFragment();
                return;
            case 12:
                gg.j1 adapter = this.f42768b.I1.getAdapter();
                adapter.f10691w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ob0 ob0Var = adapter.V;
                if (ob0Var != null) {
                    ob0Var.a(false);
                    return;
                }
                return;
            case 15:
                eo eoVar4 = this.f42768b;
                eoVar4.showDialog(new bm(eoVar4, eoVar4.getParentActivity(), eoVar4));
                return;
            case 16:
                eo eoVar5 = this.f42768b;
                eoVar5.T7();
                UndoView undoView = eoVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                eo eoVar6 = this.f42768b;
                MessagePreviewParams messagePreviewParams2 = eoVar6.f37259f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    eoVar6.ha(0);
                    return;
                }
                return;
            case 18:
                this.f42768b.j9(true);
                return;
        }
    }

    @Override
    public void g(boolean z10, boolean z11) {
        eo eoVar = this.f42768b;
        eoVar.M0.i(eoVar.f37263fa.c(), z10, z11);
    }

    @Override
    public void h(int i10) {
        eo eoVar = this.f42768b;
        if (i10 == 1) {
            eoVar.Z9();
        } else if (i10 == 2) {
            eoVar.M9();
        } else if (i10 == 3) {
            eoVar.D4 = true;
            eoVar.getMessagesController().getNextReactionMention(eoVar.T5, eoVar.d(), eoVar.l1, new qg(eoVar, 0));
        } else if (i10 == 4) {
            eoVar.D4 = true;
            eoVar.getMessagesController().getNextPollVotesMention(eoVar.T5, eoVar.d(), eoVar.f37338m1, new qg(eoVar, 1));
        } else if (i10 == 6) {
            eoVar.d9(true);
        } else if (i10 == 5) {
            eoVar.d9(false);
        } else if (i10 == 0) {
            ai.h4 h4Var = eoVar.J1;
            if (h4Var != null) {
                h4Var.L1(null, 0);
            }
            eoVar.ca();
        }
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        eo eoVar = this.f42768b;
        eoVar.getMessagesController().addUsersToChat(eoVar.f37241e, eoVar, arrayList, i10, null, null, null);
        eoVar.getMessagesController().hidePeerSettingsBar(eoVar.T5, eoVar.f37253f, eoVar.f37241e);
        eoVar.Uc(true);
        eoVar.sc(true);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        eo eoVar = this.f42768b;
        bo boVar = eoVar.f37251ea;
        TLRPC.WallPaper wallPaper = boVar.h;
        if (eoVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boVar.i(b4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.m.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        eo eoVar = this.f42768b;
        NotificationCenter notificationCenter = eoVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(eoVar, i10);
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        eoVar.finishFragment();
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(eoVar.T5), eoVar.f37253f, eoVar.f37241e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.m.b(this, tL_error);
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
