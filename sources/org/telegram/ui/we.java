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
public final class we implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.io, MessagesStorage.BooleanCallback, org.telegram.ui.Components.nj0, ResultCallback, wh.c, jh.a, jh.b, b70, ts, org.telegram.ui.Components.cl0, jh.d, org.telegram.ui.Components.ok0, FlagSecureReason.FlagSecureCondition, ov0 {
    public final int f38692a;
    public final bo f38693b;

    public we(bo boVar, int i10) {
        this.f38692a = i10;
        this.f38693b = boVar;
    }

    @Override
    public void a() {
        bo boVar = this.f38693b;
        boVar.q9(1);
        boVar.r9();
    }

    @Override
    public void b() {
        bo boVar = this.f38693b;
        if (boVar.y3 == null && boVar.getParentActivity() != null) {
            boVar.Q7();
            boVar.y3.m(boVar.T5, boVar.f32277f, 8);
        }
    }

    @Override
    public void c(TLRPC.Document document) {
        switch (this.f38692a) {
            case 2:
                bo.t0(this.f38693b, document);
                return;
            default:
                bo.u0(this.f38693b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        bo boVar = this.f38693b;
        boolean z10 = false;
        if (boVar.getParentActivity() != null) {
            gg.k1 adapter = boVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = boVar.I1.getAdapter();
                if (adapter2.f9842w0 != null && !adapter2.f9824h0) {
                    return false;
                }
                Object J = boVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (boVar.I1.getAdapter().J != null && org.telegram.ui.Components.k51.h) {
                        boVar.Y.setFieldText("");
                        nk nkVar = boVar.Y;
                        String str = h1Var.f9757a;
                        TLRPC.Chat chat = boVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        nkVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (boVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.k51.h) {
                            boVar.Y.setFieldText("");
                            nk nkVar2 = boVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = boVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            nkVar2.Z0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32275ea);
                        alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new we(boVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        boVar.showDialog(alertDialog$Builder.f18446a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f38692a) {
            case 9:
                bo boVar = this.f38693b;
                if (boVar.getParentActivity() != null && boVar.getParentActivity() != null) {
                    ki kiVar = new ki(boVar, boVar, boVar.getParentActivity(), boVar.f32275ea, arrayList);
                    kiVar.setCalcMandatoryInsets(boVar.x9());
                    kiVar.setDimBehind(false);
                    boVar.A7(false);
                    boVar.showDialog(kiVar);
                    return;
                }
                return;
            default:
                bo boVar2 = this.f38693b;
                if (boVar2.getParentActivity() != null && boVar2.getParentActivity() != null) {
                    hj hjVar = new hj(boVar2, boVar2, boVar2.getParentActivity(), boVar2.f32275ea, arrayList);
                    hjVar.setCalcMandatoryInsets(boVar2.x9());
                    hjVar.setDimBehind(false);
                    boVar2.A7(false);
                    boVar2.showDialog(hjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38692a) {
            case 0:
                uk ukVar = this.f38693b.B0;
                if (ukVar != null) {
                    ukVar.callOnClick();
                    return;
                }
                return;
            case 1:
                this.f38693b.finishFragment();
                return;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                bo boVar = this.f38693b;
                MessageObject messageObject = (MessageObject) boVar.J4.get(Integer.valueOf(boVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) boVar.f32393o6[0].get(boVar.L4);
                }
                boVar.cc(messageObject);
                return;
            case 4:
                bo boVar2 = this.f38693b;
                MessagePreviewParams messagePreviewParams = boVar2.f32283f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, boVar2.T5);
                }
                boVar2.j8();
                return;
            case 5:
                this.f38693b.ca(1);
                return;
            case 6:
                bo boVar3 = this.f38693b;
                boVar3.getMessagesController().unblockPeer(boVar3.f32277f.f18268id);
                return;
            case 8:
                this.f38693b.finishFragment();
                return;
            case 10:
                gg.k1 adapter = this.f38693b.I1.getAdapter();
                adapter.f9841w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ia0 ia0Var = adapter.V;
                if (ia0Var != null) {
                    ia0Var.a(false);
                    return;
                }
                return;
            case 12:
                bo boVar4 = this.f38693b;
                boVar4.showDialog(new xl(boVar4, boVar4.getParentActivity(), boVar4));
                return;
            case 13:
                bo boVar5 = this.f38693b;
                boVar5.Q7();
                UndoView undoView = boVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 15:
                bo boVar6 = this.f38693b;
                MessagePreviewParams messagePreviewParams2 = boVar6.f32283f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    boVar6.ca(0);
                    return;
                }
                return;
            case 16:
                this.f38693b.e9(true);
                return;
        }
    }

    @Override
    public void g(float[] fArr) {
        bo boVar = this.f38693b;
        fArr[1] = boVar.f32502x0.getBottom() - boVar.Aa;
        fArr[0] = (boVar.f32502x0.getTop() + boVar.f32447s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void h(boolean z10, boolean z11) {
        bo boVar = this.f38693b;
        boVar.M0.i(boVar.f32287fa.c(), z10, z11);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        bo boVar = this.f38693b;
        boVar.getMessagesController().addUsersToChat(boVar.e, boVar, arrayList, i10, null, null, null);
        boVar.getMessagesController().hidePeerSettingsBar(boVar.T5, boVar.f32277f, boVar.e);
        boVar.Qc(true);
        boVar.oc(true);
    }

    @Override
    public void k(int i10) {
        bo boVar = this.f38693b;
        if (i10 == 1) {
            boVar.U9();
        } else if (i10 == 2) {
            boVar.H9();
        } else if (i10 == 3) {
            boVar.D4 = true;
            boVar.getMessagesController().getNextReactionMention(boVar.T5, boVar.d(), boVar.l1, new sg(boVar, 0));
        } else if (i10 == 4) {
            boVar.D4 = true;
            boVar.getMessagesController().getNextPollVotesMention(boVar.T5, boVar.d(), boVar.f32363m1, new sg(boVar, 1));
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
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) obj;
        bo boVar = this.f38693b;
        zn znVar = boVar.f32275ea;
        TLRPC.WallPaper wallPaper = znVar.h;
        if (boVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.i(e4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        bo boVar = this.f38693b;
        NotificationCenter notificationCenter = boVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(boVar, i10);
        boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        boVar.finishFragment();
        boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(boVar.T5), boVar.f32277f, boVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public boolean run() {
        bo boVar = this.f38693b;
        return boVar.h != null || boVar.y9();
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
