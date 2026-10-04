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
public final class re implements org.telegram.ui.Components.g60, org.telegram.ui.Components.j60, org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, org.telegram.ui.Components.lo, org.telegram.ui.Components.zj0, ResultCallback, li.i, wh.c, jh.a, jh.b, org.telegram.ui.Components.ol0, y60, ps, jh.d {
    public final int f40102a;
    public final yn f40103b;

    public re(yn ynVar, int i10) {
        this.f40102a = i10;
        this.f40103b = ynVar;
    }

    @Override
    public void a() {
        yn ynVar = this.f40103b;
        if (ynVar.f43542w3 == null && ynVar.getParentActivity() != null) {
            ynVar.Q7();
            ynVar.f43542w3.m(ynVar.R5, ynVar.f43327f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f40102a) {
            case 6:
                yn.u0(this.f40103b, document);
                return;
            default:
                yn.v0(this.f40103b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        yn ynVar = this.f40103b;
        boolean z10 = false;
        if (ynVar.getParentActivity() != null) {
            gg.k1 adapter = ynVar.G1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = ynVar.G1.getAdapter();
                if (adapter2.f10695w0 != null && !adapter2.f10677h0) {
                    return false;
                }
                Object J = ynVar.G1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (ynVar.G1.getAdapter().J != null && org.telegram.ui.Components.h61.h) {
                        ynVar.W.setFieldText("");
                        jk jkVar = ynVar.W;
                        String str = h1Var.f10604a;
                        TLRPC.Chat chat = ynVar.f43315e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        jkVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (ynVar.G1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.h61.h) {
                            ynVar.W.setFieldText("");
                            jk jkVar2 = ynVar.W;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = ynVar.f43315e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            jkVar2.Z0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43300ca);
                        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new re(ynVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        ynVar.showDialog(alertDialog$Builder.f20368a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e(boolean z10, boolean z11) {
        yn ynVar = this.f40103b;
        ynVar.K0.i(ynVar.f43312da.c(), z10, z11);
    }

    @Override
    public void f(ArrayList arrayList) {
        switch (this.f40102a) {
            case 12:
                yn ynVar = this.f40103b;
                if (ynVar.getParentActivity() != null && ynVar.getParentActivity() != null) {
                    hi hiVar = new hi(ynVar, ynVar, ynVar.getParentActivity(), ynVar.f43300ca, arrayList);
                    hiVar.setCalcMandatoryInsets(ynVar.w9());
                    hiVar.setDimBehind(false);
                    ynVar.A7(false);
                    ynVar.showDialog(hiVar);
                    return;
                }
                return;
            default:
                yn ynVar2 = this.f40103b;
                if (ynVar2.getParentActivity() != null && ynVar2.getParentActivity() != null) {
                    ej ejVar = new ej(ynVar2, ynVar2, ynVar2.getParentActivity(), ynVar2.f43300ca, arrayList);
                    ejVar.setCalcMandatoryInsets(ynVar2.w9());
                    ejVar.setDimBehind(false);
                    ynVar2.A7(false);
                    ynVar2.showDialog(ejVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40102a) {
            case 2:
                qk qkVar = this.f40103b.f43577z0;
                if (qkVar != null) {
                    qkVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f40103b.finishFragment();
                return;
            case 4:
                yn ynVar = this.f40103b;
                ynVar.getMessagesController().unblockPeer(ynVar.f43327f.f20185id);
                return;
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            default:
                yn ynVar2 = this.f40103b;
                MessageObject messageObject = (MessageObject) ynVar2.H4.get(Integer.valueOf(ynVar2.J4));
                if (messageObject == null) {
                    messageObject = (MessageObject) ynVar2.f43418m6[0].get(ynVar2.J4);
                }
                ynVar2.bc(messageObject);
                return;
            case 8:
                yn ynVar3 = this.f40103b;
                MessagePreviewParams messagePreviewParams = ynVar3.f43307d5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, ynVar3.R5);
                }
                ynVar3.j8();
                return;
            case 9:
                this.f40103b.ba(1);
                return;
            case 10:
                gg.k1 adapter = this.f40103b.G1.getAdapter();
                adapter.f10694w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.wa0 wa0Var = adapter.V;
                if (wa0Var != null) {
                    wa0Var.a(false);
                    return;
                }
                return;
            case 11:
                this.f40103b.finishFragment();
                return;
            case 14:
                yn ynVar4 = this.f40103b;
                ynVar4.showDialog(new tl(ynVar4, ynVar4.getParentActivity(), ynVar4));
                return;
            case 15:
                yn ynVar5 = this.f40103b;
                ynVar5.Q7();
                UndoView undoView = ynVar5.f43542w3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 19:
                yn ynVar6 = this.f40103b;
                MessagePreviewParams messagePreviewParams2 = ynVar6.f43307d5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    ynVar6.ba(0);
                    return;
                }
                return;
            case 20:
                this.f40103b.f9(true);
                return;
        }
    }

    @Override
    public void h(int i10) {
        yn ynVar = this.f40103b;
        if (i10 == 1) {
            ynVar.T9();
        } else if (i10 == 2) {
            ynVar.G9();
        } else if (i10 == 3) {
            ynVar.B4 = true;
            ynVar.getMessagesController().getNextReactionMention(ynVar.R5, ynVar.d(), ynVar.f43378j1, new og(ynVar, 0));
        } else if (i10 == 4) {
            ynVar.B4 = true;
            ynVar.getMessagesController().getNextPollVotesMention(ynVar.R5, ynVar.d(), ynVar.f43390k1, new og(ynVar, 1));
        } else if (i10 == 6) {
            ynVar.Z8(true);
        } else if (i10 == 5) {
            ynVar.Z8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = ynVar.H1;
            if (g4Var != null) {
                g4Var.F1(null, 0);
            }
            ynVar.W9();
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        yn ynVar = this.f40103b;
        ynVar.getMessagesController().addUsersToChat(ynVar.f43315e, ynVar, arrayList, i10, null, null, null);
        ynVar.getMessagesController().hidePeerSettingsBar(ynVar.R5, ynVar.f43327f, ynVar.f43315e);
        ynVar.Pc(true);
        ynVar.nc(true);
    }

    @Override
    public void k(int i10) {
        yn.T0(this.f40103b, i10);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) obj;
        yn ynVar = this.f40103b;
        wn wnVar = ynVar.f43300ca;
        TLRPC.WallPaper wallPaper = wnVar.h;
        if (ynVar.N5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wnVar.i(c4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        yn ynVar = this.f40103b;
        NotificationCenter notificationCenter = ynVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(ynVar, i10);
        ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        ynVar.finishFragment();
        ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(ynVar.R5), ynVar.f43327f, ynVar.f43315e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void c(TLRPC.User user) {
    }
}
