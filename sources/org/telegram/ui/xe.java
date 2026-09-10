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
public final class xe implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.no, MessagesStorage.BooleanCallback, org.telegram.ui.Components.wj0, ResultCallback, vh.d, ih.a, ih.b, z60, ss, org.telegram.ui.Components.ll0, ih.d, org.telegram.ui.Components.xk0, FlagSecureReason.FlagSecureCondition, ov0 {
    public final int f38681a;
    public final eo f38682b;

    public xe(eo eoVar, int i10) {
        this.f38681a = i10;
        this.f38682b = eoVar;
    }

    @Override
    public void a() {
        eo eoVar = this.f38682b;
        eoVar.q9(1);
        eoVar.r9();
    }

    @Override
    public void b() {
        eo eoVar = this.f38682b;
        if (eoVar.y3 == null && eoVar.getParentActivity() != null) {
            eoVar.Q7();
            eoVar.y3.m(eoVar.T5, eoVar.f32318f, 8);
        }
    }

    @Override
    public void c(TLRPC.Document document) {
        switch (this.f38681a) {
            case 2:
                eo.t0(this.f38682b, document);
                return;
            default:
                eo.u0(this.f38682b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        eo eoVar = this.f38682b;
        boolean z10 = false;
        if (eoVar.getParentActivity() != null) {
            fg.l1 adapter = eoVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                fg.l1 adapter2 = eoVar.I1.getAdapter();
                if (adapter2.f8129w0 != null && !adapter2.f8111h0) {
                    return false;
                }
                Object J = eoVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof fg.i1) {
                    fg.i1 i1Var = (fg.i1) J;
                    if (eoVar.I1.getAdapter().J != null && org.telegram.ui.Components.w51.h) {
                        eoVar.Y.setFieldText("");
                        ok okVar = eoVar.Y;
                        String str = i1Var.f8077a;
                        TLRPC.Chat chat = eoVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        okVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (eoVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.w51.h) {
                            eoVar.Y.setFieldText("");
                            ok okVar2 = eoVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = eoVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            okVar2.a1(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f32316ea);
                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new xe(eoVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        eoVar.showDialog(alertDialog$Builder.f17528a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f38681a) {
            case 9:
                eo eoVar = this.f38682b;
                if (eoVar.getParentActivity() != null && eoVar.getParentActivity() != null) {
                    li liVar = new li(eoVar, eoVar, eoVar.getParentActivity(), eoVar.f32316ea, arrayList);
                    liVar.setCalcMandatoryInsets(eoVar.x9());
                    liVar.setDimBehind(false);
                    eoVar.A7(false);
                    eoVar.showDialog(liVar);
                    return;
                }
                return;
            default:
                eo eoVar2 = this.f38682b;
                if (eoVar2.getParentActivity() != null && eoVar2.getParentActivity() != null) {
                    ij ijVar = new ij(eoVar2, eoVar2, eoVar2.getParentActivity(), eoVar2.f32316ea, arrayList);
                    ijVar.setCalcMandatoryInsets(eoVar2.x9());
                    ijVar.setDimBehind(false);
                    eoVar2.A7(false);
                    eoVar2.showDialog(ijVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38681a) {
            case 0:
                vk vkVar = this.f38682b.B0;
                if (vkVar != null) {
                    vkVar.callOnClick();
                    return;
                }
                return;
            case 1:
                this.f38682b.finishFragment();
                return;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                eo eoVar = this.f38682b;
                MessageObject messageObject = (MessageObject) eoVar.J4.get(Integer.valueOf(eoVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) eoVar.f32433o6[0].get(eoVar.L4);
                }
                eoVar.cc(messageObject);
                return;
            case 4:
                eo eoVar2 = this.f38682b;
                MessagePreviewParams messagePreviewParams = eoVar2.f32324f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, eoVar2.T5);
                }
                eoVar2.j8();
                return;
            case 5:
                this.f38682b.ca(1);
                return;
            case 6:
                eo eoVar3 = this.f38682b;
                eoVar3.getMessagesController().unblockPeer(eoVar3.f32318f.f17342id);
                return;
            case 8:
                this.f38682b.finishFragment();
                return;
            case 10:
                fg.l1 adapter = this.f38682b.I1.getAdapter();
                adapter.f8128w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.sa0 sa0Var = adapter.V;
                if (sa0Var != null) {
                    sa0Var.a(false);
                    return;
                }
                return;
            case 12:
                eo eoVar4 = this.f38682b;
                eoVar4.showDialog(new zl(eoVar4, eoVar4.getParentActivity(), eoVar4));
                return;
            case 13:
                eo eoVar5 = this.f38682b;
                eoVar5.Q7();
                UndoView undoView = eoVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 15:
                eo eoVar6 = this.f38682b;
                MessagePreviewParams messagePreviewParams2 = eoVar6.f32324f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    eoVar6.ca(0);
                    return;
                }
                return;
            case 16:
                this.f38682b.e9(true);
                return;
        }
    }

    @Override
    public void g(boolean z10, boolean z11) {
        eo eoVar = this.f38682b;
        eoVar.M0.i(eoVar.f32328fa.c(), z10, z11);
    }

    @Override
    public void h(float[] fArr) {
        eo eoVar = this.f38682b;
        fArr[1] = eoVar.f32542x0.getBottom() - eoVar.Aa;
        fArr[0] = (eoVar.f32542x0.getTop() + eoVar.f32487s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void i(int i10) {
        eo eoVar = this.f38682b;
        if (i10 == 1) {
            eoVar.U9();
        } else if (i10 == 2) {
            eoVar.H9();
        } else if (i10 == 3) {
            eoVar.D4 = true;
            eoVar.getMessagesController().getNextReactionMention(eoVar.T5, eoVar.d(), eoVar.l1, new rg(eoVar, 0));
        } else if (i10 == 4) {
            eoVar.D4 = true;
            eoVar.getMessagesController().getNextPollVotesMention(eoVar.T5, eoVar.d(), eoVar.f32403m1, new rg(eoVar, 1));
        } else if (i10 == 6) {
            eoVar.Y8(true);
        } else if (i10 == 5) {
            eoVar.Y8(false);
        } else if (i10 == 0) {
            gg.m mVar = eoVar.J1;
            if (mVar != null) {
                mVar.I1(null, 0);
            }
            eoVar.X9();
        }
    }

    @Override
    public void k(int i10, ArrayList arrayList) {
        eo eoVar = this.f38682b;
        eoVar.getMessagesController().addUsersToChat(eoVar.e, eoVar, arrayList, i10, null, null, null);
        eoVar.getMessagesController().hidePeerSettingsBar(eoVar.T5, eoVar.f32318f, eoVar.e);
        eoVar.Qc(true);
        eoVar.oc(true);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) obj;
        eo eoVar = this.f38682b;
        bo boVar = eoVar.f32316ea;
        TLRPC.WallPaper wallPaper = boVar.h;
        if (eoVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boVar.i(f4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        eo eoVar = this.f38682b;
        NotificationCenter notificationCenter = eoVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(eoVar, i10);
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        eoVar.finishFragment();
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(eoVar.T5), eoVar.f32318f, eoVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.o.b(this, tL_error);
    }

    @Override
    public boolean run() {
        eo eoVar = this.f38682b;
        return eoVar.h != null || eoVar.y9();
    }

    @Override
    public void j(TLRPC.User user) {
    }
}
