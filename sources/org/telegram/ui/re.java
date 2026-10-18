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
public final class re implements org.telegram.ui.Components.n60, org.telegram.ui.Components.q60, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.so, MessagesStorage.BooleanCallback, org.telegram.ui.Components.jk0, ResultCallback, xh.c, kh.a, kh.b, i60, gs, org.telegram.ui.Components.yl0, kh.d, org.telegram.ui.Components.kl0 {
    public final int f40733a;
    public final sn f40734b;

    public re(sn snVar, int i10) {
        this.f40733a = i10;
        this.f40734b = snVar;
    }

    @Override
    public boolean a(int i10, View view) {
        sn snVar = this.f40734b;
        boolean z10 = false;
        if (snVar.getParentActivity() != null) {
            hg.j1 adapter = snVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.j1 adapter2 = snVar.I1.getAdapter();
                if (adapter2.f11949w0 != null && !adapter2.f11931h0) {
                    return false;
                }
                Object J = snVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof hg.g1) {
                    hg.g1 g1Var = (hg.g1) J;
                    if (snVar.I1.getAdapter().J != null && org.telegram.ui.Components.g61.h) {
                        snVar.Y.setFieldText("");
                        hk hkVar = snVar.Y;
                        String str = g1Var.f11872a;
                        TLRPC.Chat chat = snVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        hkVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (snVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.g61.h) {
                            snVar.Y.setFieldText("");
                            hk hkVar2 = snVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = snVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            hkVar2.X0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41226ea);
                        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new re(snVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        snVar.showDialog(alertDialog$Builder.f20608a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void b() {
        sn snVar = this.f40734b;
        snVar.v9(1);
        snVar.w9();
    }

    @Override
    public void c() {
        sn snVar = this.f40734b;
        if (snVar.y3 == null && snVar.getParentActivity() != null) {
            snVar.T7();
            snVar.y3.m(snVar.T5, snVar.f41229f, 8);
        }
    }

    @Override
    public void d(TLRPC.Document document) {
        switch (this.f40733a) {
            case 4:
                sn.j0(this.f40734b, document);
                return;
            default:
                sn.D0(this.f40734b, document);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f40733a) {
            case 11:
                sn snVar = this.f40734b;
                if (snVar.getParentActivity() != null && snVar.getParentActivity() != null) {
                    ci ciVar = new ci(snVar, snVar, snVar.getParentActivity(), snVar.f41226ea, arrayList);
                    ciVar.setCalcMandatoryInsets(snVar.C9());
                    ciVar.setDimBehind(false);
                    snVar.D7(false);
                    snVar.showDialog(ciVar);
                    return;
                }
                return;
            default:
                sn snVar2 = this.f40734b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    zi ziVar = new zi(snVar2, snVar2, snVar2.getParentActivity(), snVar2.f41226ea, arrayList);
                    ziVar.setCalcMandatoryInsets(snVar2.C9());
                    ziVar.setDimBehind(false);
                    snVar2.D7(false);
                    snVar2.showDialog(ziVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(boolean z10, boolean z11) {
        sn snVar = this.f40734b;
        snVar.M0.i(snVar.f41239fa.c(), z10, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40733a) {
            case 2:
                nk nkVar = this.f40734b.B0;
                if (nkVar != null) {
                    nkVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f40734b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            default:
                sn snVar = this.f40734b;
                MessageObject messageObject = (MessageObject) snVar.J4.get(Integer.valueOf(snVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) snVar.f41346o6[0].get(snVar.L4);
                }
                snVar.gc(messageObject);
                return;
            case 6:
                sn snVar2 = this.f40734b;
                MessagePreviewParams messagePreviewParams = snVar2.f41235f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, snVar2.T5);
                }
                snVar2.m8();
                return;
            case 7:
                this.f40734b.ha(1);
                return;
            case 8:
                sn snVar3 = this.f40734b;
                snVar3.getMessagesController().unblockPeer(snVar3.f41229f.f20426id);
                return;
            case 10:
                this.f40734b.finishFragment();
                return;
            case 12:
                hg.j1 adapter = this.f40734b.I1.getAdapter();
                adapter.f11948w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.db0 db0Var = adapter.V;
                if (db0Var != null) {
                    db0Var.a(false);
                    return;
                }
                return;
            case 15:
                sn snVar4 = this.f40734b;
                snVar4.showDialog(new ql(snVar4, snVar4.getParentActivity(), snVar4));
                return;
            case 16:
                sn snVar5 = this.f40734b;
                snVar5.T7();
                UndoView undoView = snVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                sn snVar6 = this.f40734b;
                MessagePreviewParams messagePreviewParams2 = snVar6.f41235f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    snVar6.ha(0);
                    return;
                }
                return;
            case 18:
                this.f40734b.j9(true);
                return;
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        sn snVar = this.f40734b;
        snVar.getMessagesController().addUsersToChat(snVar.e, snVar, arrayList, i10, null, null, null);
        snVar.getMessagesController().hidePeerSettingsBar(snVar.T5, snVar.f41229f, snVar.e);
        snVar.Uc(true);
        snVar.sc(true);
    }

    @Override
    public void j(int i10) {
        sn snVar = this.f40734b;
        if (i10 == 1) {
            snVar.Z9();
        } else if (i10 == 2) {
            snVar.M9();
        } else if (i10 == 3) {
            snVar.D4 = true;
            snVar.getMessagesController().getNextReactionMention(snVar.T5, snVar.d(), snVar.l1, new gg(snVar, 0));
        } else if (i10 == 4) {
            snVar.D4 = true;
            snVar.getMessagesController().getNextPollVotesMention(snVar.T5, snVar.d(), snVar.f41314m1, new gg(snVar, 1));
        } else if (i10 == 6) {
            snVar.d9(true);
        } else if (i10 == 5) {
            snVar.d9(false);
        } else if (i10 == 0) {
            ci.b3 b3Var = snVar.J1;
            if (b3Var != null) {
                b3Var.L1(null, 0);
            }
            snVar.ca();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) obj;
        sn snVar = this.f40734b;
        qn qnVar = snVar.f41226ea;
        TLRPC.WallPaper wallPaper = qnVar.h;
        if (snVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.k(c4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        sn snVar = this.f40734b;
        NotificationCenter notificationCenter = snVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(snVar, i10);
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        snVar.finishFragment();
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(snVar.T5), snVar.f41229f, snVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
