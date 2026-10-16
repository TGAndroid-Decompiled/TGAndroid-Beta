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
public final class xe implements org.telegram.ui.Components.q60, org.telegram.ui.Components.t60, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.vo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.nk0, ResultCallback, xh.c, kh.a, kh.b, e70, vs, org.telegram.ui.Components.cm0, kh.d, org.telegram.ui.Components.ol0 {
    public final int f41547a;
    public final fo f41548b;

    public xe(fo foVar, int i10) {
        this.f41547a = i10;
        this.f41548b = foVar;
    }

    @Override
    public boolean a(int i10, View view) {
        fo foVar = this.f41548b;
        boolean z10 = false;
        if (foVar.getParentActivity() != null) {
            hg.j1 adapter = foVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.j1 adapter2 = foVar.I1.getAdapter();
                if (adapter2.f10642w0 != null && !adapter2.f10624h0) {
                    return false;
                }
                Object J = foVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof hg.g1) {
                    hg.g1 g1Var = (hg.g1) J;
                    if (foVar.I1.getAdapter().J != null && org.telegram.ui.Components.n61.h) {
                        foVar.Y.setFieldText("");
                        sk skVar = foVar.Y;
                        String str = g1Var.f10565a;
                        TLRPC.Chat chat = foVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        skVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (foVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.n61.h) {
                            foVar.Y.setFieldText("");
                            sk skVar2 = foVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = foVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            skVar2.X0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.f35633ea);
                        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new xe(foVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        foVar.showDialog(alertDialog$Builder.f19248a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void b() {
        fo foVar = this.f41548b;
        if (foVar.y3 == null && foVar.getParentActivity() != null) {
            foVar.T7();
            foVar.y3.m(foVar.T5, foVar.f35636f, 8);
        }
    }

    @Override
    public void c() {
        fo foVar = this.f41548b;
        foVar.v9(1);
        foVar.w9();
    }

    @Override
    public void d(TLRPC.Document document) {
        switch (this.f41547a) {
            case 4:
                fo.j0(this.f41548b, document);
                return;
            default:
                fo.D0(this.f41548b, document);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f41547a) {
            case 11:
                fo foVar = this.f41548b;
                if (foVar.getParentActivity() != null && foVar.getParentActivity() != null) {
                    ni niVar = new ni(foVar, foVar, foVar.getParentActivity(), foVar.f35633ea, arrayList);
                    niVar.setCalcMandatoryInsets(foVar.C9());
                    niVar.setDimBehind(false);
                    foVar.D7(false);
                    foVar.showDialog(niVar);
                    return;
                }
                return;
            default:
                fo foVar2 = this.f41548b;
                if (foVar2.getParentActivity() != null && foVar2.getParentActivity() != null) {
                    kj kjVar = new kj(foVar2, foVar2, foVar2.getParentActivity(), foVar2.f35633ea, arrayList);
                    kjVar.setCalcMandatoryInsets(foVar2.C9());
                    kjVar.setDimBehind(false);
                    foVar2.D7(false);
                    foVar2.showDialog(kjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(boolean z10, boolean z11) {
        fo foVar = this.f41548b;
        foVar.M0.i(foVar.f35646fa.c(), z10, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41547a) {
            case 2:
                yk ykVar = this.f41548b.B0;
                if (ykVar != null) {
                    ykVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f41548b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            default:
                fo foVar = this.f41548b;
                MessageObject messageObject = (MessageObject) foVar.J4.get(Integer.valueOf(foVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) foVar.f35753o6[0].get(foVar.L4);
                }
                foVar.gc(messageObject);
                return;
            case 6:
                fo foVar2 = this.f41548b;
                MessagePreviewParams messagePreviewParams = foVar2.f35642f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, foVar2.T5);
                }
                foVar2.m8();
                return;
            case 7:
                this.f41548b.ha(1);
                return;
            case 8:
                fo foVar3 = this.f41548b;
                foVar3.getMessagesController().unblockPeer(foVar3.f35636f.f19063id);
                return;
            case 10:
                this.f41548b.finishFragment();
                return;
            case 12:
                hg.j1 adapter = this.f41548b.I1.getAdapter();
                adapter.f10641w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.jb0 jb0Var = adapter.V;
                if (jb0Var != null) {
                    jb0Var.a(false);
                    return;
                }
                return;
            case 15:
                fo foVar4 = this.f41548b;
                foVar4.showDialog(new bm(foVar4, foVar4.getParentActivity(), foVar4));
                return;
            case 16:
                fo foVar5 = this.f41548b;
                foVar5.T7();
                UndoView undoView = foVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                fo foVar6 = this.f41548b;
                MessagePreviewParams messagePreviewParams2 = foVar6.f35642f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    foVar6.ha(0);
                    return;
                }
                return;
            case 18:
                this.f41548b.j9(true);
                return;
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        fo foVar = this.f41548b;
        foVar.getMessagesController().addUsersToChat(foVar.e, foVar, arrayList, i10, null, null, null);
        foVar.getMessagesController().hidePeerSettingsBar(foVar.T5, foVar.f35636f, foVar.e);
        foVar.Uc(true);
        foVar.sc(true);
    }

    @Override
    public void j(int i10) {
        fo foVar = this.f41548b;
        if (i10 == 1) {
            foVar.Z9();
        } else if (i10 == 2) {
            foVar.M9();
        } else if (i10 == 3) {
            foVar.D4 = true;
            foVar.getMessagesController().getNextReactionMention(foVar.T5, foVar.d(), foVar.l1, new rg(foVar, 0));
        } else if (i10 == 4) {
            foVar.D4 = true;
            foVar.getMessagesController().getNextPollVotesMention(foVar.T5, foVar.d(), foVar.f35721m1, new rg(foVar, 1));
        } else if (i10 == 6) {
            foVar.d9(true);
        } else if (i10 == 5) {
            foVar.d9(false);
        } else if (i10 == 0) {
            bi.w3 w3Var = foVar.J1;
            if (w3Var != null) {
                w3Var.L1(null, 0);
            }
            foVar.ca();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        fo foVar = this.f41548b;
        co coVar = foVar.f35633ea;
        TLRPC.WallPaper wallPaper = coVar.h;
        if (foVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        coVar.i(b4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        fo foVar = this.f41548b;
        NotificationCenter notificationCenter = foVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(foVar, i10);
        foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        foVar.finishFragment();
        foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(foVar.T5), foVar.f35636f, foVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
