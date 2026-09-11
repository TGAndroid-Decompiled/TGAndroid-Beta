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
public final class ve implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ho, MessagesStorage.BooleanCallback, org.telegram.ui.Components.mj0, ResultCallback, xh.c, kh.a, kh.b, a70, rs, org.telegram.ui.Components.bl0, kh.d, org.telegram.ui.Components.nk0, FlagSecureReason.FlagSecureCondition, lv0 {
    public final int f41522a;
    public final co f41523b;

    public ve(co coVar, int i10) {
        this.f41522a = i10;
        this.f41523b = coVar;
    }

    @Override
    public boolean a(int i10, View view) {
        co coVar = this.f41523b;
        boolean z10 = false;
        if (coVar.getParentActivity() != null) {
            hg.k1 adapter = coVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.k1 adapter2 = coVar.I1.getAdapter();
                if (adapter2.f11156w0 != null && !adapter2.f11138h0) {
                    return false;
                }
                Object J = coVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof hg.h1) {
                    hg.h1 h1Var = (hg.h1) J;
                    if (coVar.I1.getAdapter().J != null && org.telegram.ui.Components.i51.h) {
                        coVar.Y.setFieldText("");
                        mk mkVar = coVar.Y;
                        String str = h1Var.f11065a;
                        TLRPC.Chat chat = coVar.f35237e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        mkVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (coVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.i51.h) {
                            coVar.Y.setFieldText("");
                            mk mkVar2 = coVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = coVar.f35237e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            mkVar2.a1(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.f35247ea);
                        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ve(coVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        coVar.showDialog(alertDialog$Builder.f20198a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void b() {
        co coVar = this.f41523b;
        coVar.q9(1);
        coVar.r9();
    }

    @Override
    public void c() {
        co coVar = this.f41523b;
        if (coVar.y3 == null && coVar.getParentActivity() != null) {
            coVar.Q7();
            coVar.y3.m(coVar.T5, coVar.f35249f, 8);
        }
    }

    @Override
    public void d(TLRPC.Document document) {
        switch (this.f41522a) {
            case 2:
                co.t0(this.f41523b, document);
                return;
            default:
                co.u0(this.f41523b, document);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f41522a) {
            case 9:
                co coVar = this.f41523b;
                if (coVar.getParentActivity() != null && coVar.getParentActivity() != null) {
                    ji jiVar = new ji(coVar, coVar, coVar.getParentActivity(), coVar.f35247ea, arrayList);
                    jiVar.setCalcMandatoryInsets(coVar.x9());
                    jiVar.setDimBehind(false);
                    coVar.A7(false);
                    coVar.showDialog(jiVar);
                    return;
                }
                return;
            default:
                co coVar2 = this.f41523b;
                if (coVar2.getParentActivity() != null && coVar2.getParentActivity() != null) {
                    gj gjVar = new gj(coVar2, coVar2, coVar2.getParentActivity(), coVar2.f35247ea, arrayList);
                    gjVar.setCalcMandatoryInsets(coVar2.x9());
                    gjVar.setDimBehind(false);
                    coVar2.A7(false);
                    coVar2.showDialog(gjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(boolean z10, boolean z11) {
        co coVar = this.f41523b;
        coVar.M0.i(coVar.f35259fa.c(), z10, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41522a) {
            case 0:
                tk tkVar = this.f41523b.B0;
                if (tkVar != null) {
                    tkVar.callOnClick();
                    return;
                }
                return;
            case 1:
                this.f41523b.finishFragment();
                return;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                co coVar = this.f41523b;
                MessageObject messageObject = (MessageObject) coVar.J4.get(Integer.valueOf(coVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) coVar.f35364o6[0].get(coVar.L4);
                }
                coVar.cc(messageObject);
                return;
            case 4:
                co coVar2 = this.f41523b;
                MessagePreviewParams messagePreviewParams = coVar2.f35255f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, coVar2.T5);
                }
                coVar2.j8();
                return;
            case 5:
                this.f41523b.ca(1);
                return;
            case 6:
                co coVar3 = this.f41523b;
                coVar3.getMessagesController().unblockPeer(coVar3.f35249f.f20016id);
                return;
            case 8:
                this.f41523b.finishFragment();
                return;
            case 10:
                hg.k1 adapter = this.f41523b.I1.getAdapter();
                adapter.f11155w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ja0 ja0Var = adapter.V;
                if (ja0Var != null) {
                    ja0Var.a(false);
                    return;
                }
                return;
            case 12:
                co coVar4 = this.f41523b;
                coVar4.showDialog(new xl(coVar4, coVar4.getParentActivity(), coVar4));
                return;
            case 13:
                co coVar5 = this.f41523b;
                coVar5.Q7();
                UndoView undoView = coVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 15:
                co coVar6 = this.f41523b;
                MessagePreviewParams messagePreviewParams2 = coVar6.f35255f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    coVar6.ca(0);
                    return;
                }
                return;
            case 16:
                this.f41523b.e9(true);
                return;
        }
    }

    @Override
    public void h(float[] fArr) {
        co coVar = this.f41523b;
        fArr[1] = coVar.f35473x0.getBottom() - coVar.Aa;
        fArr[0] = (coVar.f35473x0.getTop() + coVar.f35418s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        co coVar = this.f41523b;
        coVar.getMessagesController().addUsersToChat(coVar.f35237e, coVar, arrayList, i10, null, null, null);
        coVar.getMessagesController().hidePeerSettingsBar(coVar.T5, coVar.f35249f, coVar.f35237e);
        coVar.Qc(true);
        coVar.oc(true);
    }

    @Override
    public void k(int i10) {
        co coVar = this.f41523b;
        if (i10 == 1) {
            coVar.U9();
        } else if (i10 == 2) {
            coVar.H9();
        } else if (i10 == 3) {
            coVar.D4 = true;
            coVar.getMessagesController().getNextReactionMention(coVar.T5, coVar.d(), coVar.l1, new qg(coVar, 0));
        } else if (i10 == 4) {
            coVar.D4 = true;
            coVar.getMessagesController().getNextPollVotesMention(coVar.T5, coVar.d(), coVar.f35334m1, new qg(coVar, 1));
        } else if (i10 == 6) {
            coVar.Y8(true);
        } else if (i10 == 5) {
            coVar.Y8(false);
        } else if (i10 == 0) {
            bi.t3 t3Var = coVar.J1;
            if (t3Var != null) {
                t3Var.I1(null, 0);
            }
            coVar.X9();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) obj;
        co coVar = this.f41523b;
        ao aoVar = coVar.f35247ea;
        TLRPC.WallPaper wallPaper = aoVar.h;
        if (coVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aoVar.i(d4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        co coVar = this.f41523b;
        NotificationCenter notificationCenter = coVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(coVar, i10);
        coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        coVar.finishFragment();
        coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(coVar.T5), coVar.f35249f, coVar.f35237e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public boolean run() {
        co coVar = this.f41523b;
        return coVar.h != null || coVar.y9();
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
