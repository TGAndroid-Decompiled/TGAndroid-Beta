package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
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
public final class ue implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.io, MessagesStorage.BooleanCallback, org.telegram.ui.Components.mj0, ResultCallback, wh.c, jh.a, jh.b, z60, rs, org.telegram.ui.Components.bl0, jh.d, org.telegram.ui.Components.nk0, FlagSecureReason.FlagSecureCondition, mv0 {
    public final int f37985a;
    public final bo f37986b;

    public ue(bo boVar, int i10) {
        this.f37985a = i10;
        this.f37986b = boVar;
    }

    @Override
    public void a() {
        bo boVar = this.f37986b;
        boVar.q9(1);
        boVar.r9();
    }

    @Override
    public void b() {
        bo boVar = this.f37986b;
        if (boVar.y3 == null && boVar.getParentActivity() != null) {
            boVar.Q7();
            boVar.y3.m(boVar.T5, boVar.f32299f, 8);
        }
    }

    @Override
    public void c(TLRPC.Document document) {
        switch (this.f37985a) {
            case 2:
                bo.t0(this.f37986b, document);
                return;
            default:
                bo.u0(this.f37986b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        bo boVar = this.f37986b;
        boolean z10 = false;
        if (boVar.getParentActivity() != null) {
            gg.k1 adapter = boVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = boVar.I1.getAdapter();
                if (adapter2.f9837w0 != null && !adapter2.f9819h0) {
                    return false;
                }
                Object J = boVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (boVar.I1.getAdapter().J != null && org.telegram.ui.Components.j51.h) {
                        boVar.Y.setFieldText("");
                        mk mkVar = boVar.Y;
                        String str = h1Var.f9752a;
                        TLRPC.Chat chat = boVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        mkVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (boVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.j51.h) {
                            boVar.Y.setFieldText("");
                            mk mkVar2 = boVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = boVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            mkVar2.Z0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32297ea);
                        alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ue(boVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        boVar.showDialog(alertDialog$Builder.f18437a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f37985a) {
            case 9:
                bo boVar = this.f37986b;
                if (boVar.getParentActivity() != null && boVar.getParentActivity() != null) {
                    ji jiVar = new ji(boVar, boVar, boVar.getParentActivity(), boVar.f32297ea, arrayList);
                    jiVar.setCalcMandatoryInsets(boVar.x9());
                    jiVar.setDimBehind(false);
                    boVar.A7(false);
                    boVar.showDialog(jiVar);
                    return;
                }
                return;
            default:
                bo boVar2 = this.f37986b;
                if (boVar2.getParentActivity() != null && boVar2.getParentActivity() != null) {
                    gj gjVar = new gj(boVar2, boVar2, boVar2.getParentActivity(), boVar2.f32297ea, arrayList);
                    gjVar.setCalcMandatoryInsets(boVar2.x9());
                    gjVar.setDimBehind(false);
                    boVar2.A7(false);
                    boVar2.showDialog(gjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37985a) {
            case 0:
                tk tkVar = this.f37986b.B0;
                if (tkVar != null) {
                    tkVar.callOnClick();
                    return;
                }
                return;
            case 1:
                this.f37986b.finishFragment();
                return;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                bo boVar = this.f37986b;
                MessageObject messageObject = (MessageObject) boVar.J4.get(Integer.valueOf(boVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) boVar.f32415o6[0].get(boVar.L4);
                }
                boVar.cc(messageObject);
                return;
            case 4:
                bo boVar2 = this.f37986b;
                MessagePreviewParams messagePreviewParams = boVar2.f32305f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, boVar2.T5);
                }
                boVar2.j8();
                return;
            case 5:
                this.f37986b.ca(1);
                return;
            case 6:
                bo boVar3 = this.f37986b;
                boVar3.getMessagesController().unblockPeer(boVar3.f32299f.f18259id);
                return;
            case 8:
                this.f37986b.finishFragment();
                return;
            case 10:
                gg.k1 adapter = this.f37986b.I1.getAdapter();
                adapter.f9836w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ia0 ia0Var = adapter.V;
                if (ia0Var != null) {
                    ia0Var.a(false);
                    return;
                }
                return;
            case 12:
                bo boVar4 = this.f37986b;
                boVar4.showDialog(new xl(boVar4, boVar4.getParentActivity(), boVar4));
                return;
            case 13:
                bo boVar5 = this.f37986b;
                boVar5.Q7();
                UndoView undoView = boVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 15:
                bo boVar6 = this.f37986b;
                MessagePreviewParams messagePreviewParams2 = boVar6.f32305f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    boVar6.ca(0);
                    return;
                }
                return;
            case 16:
                this.f37986b.e9(true);
                return;
        }
    }

    @Override
    public void g(float[] fArr) {
        bo boVar = this.f37986b;
        fArr[1] = boVar.f32524x0.getBottom() - boVar.Aa;
        fArr[0] = (boVar.f32524x0.getTop() + boVar.f32469s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void h(boolean z10, boolean z11) {
        bo boVar = this.f37986b;
        boVar.M0.i(boVar.f32309fa.c(), z10, z11);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        bo boVar = this.f37986b;
        boVar.getMessagesController().addUsersToChat(boVar.e, boVar, arrayList, i10, null, null, null);
        boVar.getMessagesController().hidePeerSettingsBar(boVar.T5, boVar.f32299f, boVar.e);
        boVar.Qc(true);
        boVar.oc(true);
    }

    @Override
    public void k(int i10) {
        bo boVar = this.f37986b;
        if (i10 == 1) {
            boVar.U9();
        } else if (i10 == 2) {
            boVar.H9();
        } else if (i10 == 3) {
            boVar.D4 = true;
            boVar.getMessagesController().getNextReactionMention(boVar.T5, boVar.d(), boVar.l1, new qg(boVar, 0));
        } else if (i10 == 4) {
            boVar.D4 = true;
            boVar.getMessagesController().getNextPollVotesMention(boVar.T5, boVar.d(), boVar.f32385m1, new qg(boVar, 1));
        } else if (i10 == 6) {
            boVar.Y8(true);
        } else if (i10 == 5) {
            boVar.Y8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = boVar.J1;
            if (g4Var != null) {
                g4Var.I1(null, 0);
            }
            boVar.X9();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) obj;
        bo boVar = this.f37986b;
        zn znVar = boVar.f32297ea;
        TLRPC.WallPaper wallPaper = znVar.h;
        if (boVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.i(d4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        bo boVar = this.f37986b;
        NotificationCenter notificationCenter = boVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(boVar, i10);
        boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        boVar.finishFragment();
        boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(boVar.T5), boVar.f32299f, boVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public boolean run() {
        bo boVar = this.f37986b;
        return boVar.h != null || boVar.y9();
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
