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
public final class ve implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.co, MessagesStorage.BooleanCallback, org.telegram.ui.Components.vj0, ResultCallback, jh.d, wg.a, wg.b, v60, os, org.telegram.ui.Components.jl0, wg.d, org.telegram.ui.Components.xk0, FlagSecureReason.FlagSecureCondition, zu0 {
    public final int f39078a;
    public final zn f39079b;

    public ve(zn znVar, int i10) {
        this.f39078a = i10;
        this.f39079b = znVar;
    }

    @Override
    public void a() {
        zn znVar = this.f39079b;
        if (znVar.f40775v3 == null && znVar.getParentActivity() != null) {
            znVar.Q7();
            znVar.f40775v3.m(znVar.Q5, znVar.f40575f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f39078a) {
            case 2:
                zn.u0(this.f39079b, document);
                return;
            default:
                zn.v0(this.f39079b, document);
                return;
        }
    }

    @Override
    public void c(float[] fArr) {
        zn znVar = this.f39079b;
        fArr[1] = znVar.f40759u0.getBottom() - znVar.f40810xa;
        fArr[0] = (znVar.f40759u0.getTop() + znVar.f40707p9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public boolean d(int i10, View view) {
        zn znVar = this.f39079b;
        boolean z4 = false;
        if (znVar.getParentActivity() != null) {
            tf.u0 adapter = znVar.F1.getAdapter();
            if ((adapter.F != null || adapter.G != null) && i10 != 0) {
                tf.u0 adapter2 = znVar.F1.getAdapter();
                if (adapter2.f44922t0 != null && !adapter2.f44904e0) {
                    return false;
                }
                Object J = znVar.F1.getAdapter().J(i10 - 1);
                if (J instanceof tf.r0) {
                    tf.r0 r0Var = (tf.r0) J;
                    if (znVar.F1.getAdapter().G != null && org.telegram.ui.Components.j51.h) {
                        znVar.V.setFieldText("");
                        lk lkVar = znVar.V;
                        String str = r0Var.f44886a;
                        TLRPC.Chat chat = znVar.e;
                        if (chat != null && chat.megagroup) {
                            z4 = true;
                        }
                        lkVar.a1(null, str, true, z4);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (znVar.F1.getAdapter().G != null) {
                        if (org.telegram.ui.Components.j51.h) {
                            znVar.V.setFieldText("");
                            lk lkVar2 = znVar.V;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = znVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z4 = true;
                            }
                            lkVar2.a1(null, str2, true, z4);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f40534ba);
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ve(znVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        znVar.showDialog(alertDialog$Builder.f19478a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e() {
        zn znVar = this.f39079b;
        znVar.q9(1);
        znVar.r9();
    }

    @Override
    public void f(ArrayList arrayList) {
        switch (this.f39078a) {
            case 9:
                zn znVar = this.f39079b;
                if (znVar.getParentActivity() != null && znVar.getParentActivity() != null) {
                    hi hiVar = new hi(znVar, znVar, znVar.getParentActivity(), znVar.f40534ba, arrayList);
                    hiVar.setCalcMandatoryInsets(znVar.x9());
                    hiVar.setDimBehind(false);
                    znVar.A7(false);
                    znVar.showDialog(hiVar);
                    return;
                }
                return;
            default:
                zn znVar2 = this.f39079b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    ej ejVar = new ej(znVar2, znVar2, znVar2.getParentActivity(), znVar2.f40534ba, arrayList);
                    ejVar.setCalcMandatoryInsets(znVar2.x9());
                    ejVar.setDimBehind(false);
                    znVar2.A7(false);
                    znVar2.showDialog(ejVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void g(boolean z4, boolean z10) {
        zn znVar = this.f39079b;
        znVar.J0.i(znVar.f40547ca.c(), z4, z10);
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        zn znVar = this.f39079b;
        znVar.getMessagesController().addUsersToChat(znVar.e, znVar, arrayList, i10, null, null, null);
        znVar.getMessagesController().hidePeerSettingsBar(znVar.Q5, znVar.f40575f, znVar.e);
        znVar.Qc(true);
        znVar.oc(true);
    }

    @Override
    public void j(int i10) {
        zn znVar = this.f39079b;
        if (i10 == 1) {
            znVar.U9();
        } else if (i10 == 2) {
            znVar.H9();
        } else if (i10 == 3) {
            znVar.A4 = true;
            znVar.getMessagesController().getNextReactionMention(znVar.Q5, znVar.d(), znVar.f40614i1, new lg(znVar, 0));
        } else if (i10 == 4) {
            znVar.A4 = true;
            znVar.getMessagesController().getNextPollVotesMention(znVar.Q5, znVar.d(), znVar.f40626j1, new lg(znVar, 1));
        } else if (i10 == 6) {
            znVar.Y8(true);
        } else if (i10 == 5) {
            znVar.Y8(false);
        } else if (i10 == 0) {
            nh.t2 t2Var = znVar.G1;
            if (t2Var != null) {
                t2Var.I1(null, 0);
            }
            znVar.X9();
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39078a) {
            case 0:
                sk skVar = this.f39079b.f40814y0;
                if (skVar != null) {
                    skVar.callOnClick();
                    return;
                }
                return;
            case 1:
                this.f39079b.finishFragment();
                return;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                zn znVar = this.f39079b;
                MessageObject messageObject = (MessageObject) znVar.G4.get(Integer.valueOf(znVar.I4));
                if (messageObject == null) {
                    messageObject = (MessageObject) znVar.f40655l6[0].get(znVar.I4);
                }
                znVar.cc(messageObject);
                return;
            case 4:
                zn znVar2 = this.f39079b;
                MessagePreviewParams messagePreviewParams = znVar2.f40542c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, znVar2.Q5);
                }
                znVar2.j8();
                return;
            case 5:
                this.f39079b.ca(1);
                return;
            case 6:
                zn znVar3 = this.f39079b;
                znVar3.getMessagesController().unblockPeer(znVar3.f40575f.f19306id);
                return;
            case 8:
                this.f39079b.finishFragment();
                return;
            case 10:
                tf.u0 adapter = this.f39079b.F1.getAdapter();
                adapter.f44925w.c();
                adapter.F.clear();
                adapter.l();
                org.telegram.ui.Components.la0 la0Var = adapter.S;
                if (la0Var != null) {
                    la0Var.a(false);
                    return;
                }
                return;
            case 12:
                zn znVar4 = this.f39079b;
                znVar4.showDialog(new wl(znVar4, znVar4.getParentActivity(), znVar4));
                return;
            case 13:
                zn znVar5 = this.f39079b;
                znVar5.Q7();
                UndoView undoView = znVar5.f40775v3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 15:
                zn znVar6 = this.f39079b;
                MessagePreviewParams messagePreviewParams2 = znVar6.f40542c5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    znVar6.ca(0);
                    return;
                }
                return;
            case 16:
                this.f39079b.e9(true);
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z4;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) obj;
        zn znVar = this.f39079b;
        xn xnVar = znVar.f40534ba;
        TLRPC.WallPaper wallPaper = xnVar.h;
        if (znVar.M5 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        xnVar.i(e4Var, wallPaper, z4, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void run(boolean z4) {
        zn znVar = this.f39079b;
        NotificationCenter notificationCenter = znVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(znVar, i10);
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        znVar.finishFragment();
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(znVar.Q5), znVar.f40575f, znVar.e, Boolean.valueOf(z4));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public boolean run() {
        zn znVar = this.f39079b;
        return znVar.h != null || znVar.y9();
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
