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
public final class te implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.eo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.vj0, ResultCallback, jh.d, wg.a, wg.b, t60, ms, org.telegram.ui.Components.kl0, wg.d, org.telegram.ui.Components.yk0, FlagSecureReason.FlagSecureCondition, su0 {
    public final int f38642a;
    public final xn f38643b;

    public te(xn xnVar, int i10) {
        this.f38642a = i10;
        this.f38643b = xnVar;
    }

    @Override
    public void a() {
        xn xnVar = this.f38643b;
        if (xnVar.f40209v3 == null && xnVar.getParentActivity() != null) {
            xnVar.Q7();
            xnVar.f40209v3.m(xnVar.Q5, xnVar.f40009f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f38642a) {
            case 2:
                xn.u0(this.f38643b, document);
                return;
            default:
                xn.v0(this.f38643b, document);
                return;
        }
    }

    @Override
    public void c(float[] fArr) {
        xn xnVar = this.f38643b;
        fArr[1] = xnVar.f40193u0.getBottom() - xnVar.f40244xa;
        fArr[0] = (xnVar.f40193u0.getTop() + xnVar.f40141p9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void d() {
        xn xnVar = this.f38643b;
        xnVar.q9(1);
        xnVar.r9();
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f38642a) {
            case 9:
                xn xnVar = this.f38643b;
                if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
                    fi fiVar = new fi(xnVar, xnVar, xnVar.getParentActivity(), xnVar.f39968ba, arrayList);
                    fiVar.setCalcMandatoryInsets(xnVar.x9());
                    fiVar.setDimBehind(false);
                    xnVar.A7(false);
                    xnVar.showDialog(fiVar);
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f38643b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    cj cjVar = new cj(xnVar2, xnVar2, xnVar2.getParentActivity(), xnVar2.f39968ba, arrayList);
                    cjVar.setCalcMandatoryInsets(xnVar2.x9());
                    cjVar.setDimBehind(false);
                    xnVar2.A7(false);
                    xnVar2.showDialog(cjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        xn xnVar = this.f38643b;
        boolean z4 = false;
        if (xnVar.getParentActivity() != null) {
            tf.u0 adapter = xnVar.F1.getAdapter();
            if ((adapter.F != null || adapter.G != null) && i10 != 0) {
                tf.u0 adapter2 = xnVar.F1.getAdapter();
                if (adapter2.f44860t0 != null && !adapter2.f44842e0) {
                    return false;
                }
                Object J = xnVar.F1.getAdapter().J(i10 - 1);
                if (J instanceof tf.r0) {
                    tf.r0 r0Var = (tf.r0) J;
                    if (xnVar.F1.getAdapter().G != null && org.telegram.ui.Components.j51.h) {
                        xnVar.V.setFieldText("");
                        jk jkVar = xnVar.V;
                        String str = r0Var.f44824a;
                        TLRPC.Chat chat = xnVar.e;
                        if (chat != null && chat.megagroup) {
                            z4 = true;
                        }
                        jkVar.a1(null, str, true, z4);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (xnVar.F1.getAdapter().G != null) {
                        if (org.telegram.ui.Components.j51.h) {
                            xnVar.V.setFieldText("");
                            jk jkVar2 = xnVar.V;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = xnVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z4 = true;
                            }
                            jkVar2.a1(null, str2, true, z4);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f39968ba);
                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new te(xnVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        xnVar.showDialog(alertDialog$Builder.f19503a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void g(boolean z4, boolean z10) {
        xn xnVar = this.f38643b;
        xnVar.J0.i(xnVar.f39981ca.c(), z4, z10);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38642a) {
            case 0:
                qk qkVar = this.f38643b.f40248y0;
                if (qkVar != null) {
                    qkVar.callOnClick();
                    return;
                }
                return;
            case 1:
                this.f38643b.finishFragment();
                return;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                xn xnVar = this.f38643b;
                MessageObject messageObject = (MessageObject) xnVar.G4.get(Integer.valueOf(xnVar.I4));
                if (messageObject == null) {
                    messageObject = (MessageObject) xnVar.f40089l6[0].get(xnVar.I4);
                }
                xnVar.cc(messageObject);
                return;
            case 4:
                xn xnVar2 = this.f38643b;
                MessagePreviewParams messagePreviewParams = xnVar2.f39976c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, xnVar2.Q5);
                }
                xnVar2.j8();
                return;
            case 5:
                this.f38643b.ca(1);
                return;
            case 6:
                xn xnVar3 = this.f38643b;
                xnVar3.getMessagesController().unblockPeer(xnVar3.f40009f.f19331id);
                return;
            case 8:
                this.f38643b.finishFragment();
                return;
            case 10:
                tf.u0 adapter = this.f38643b.F1.getAdapter();
                adapter.f44863w.c();
                adapter.F.clear();
                adapter.l();
                org.telegram.ui.Components.ka0 ka0Var = adapter.S;
                if (ka0Var != null) {
                    ka0Var.a(false);
                    return;
                }
                return;
            case 12:
                xn xnVar4 = this.f38643b;
                xnVar4.showDialog(new ul(xnVar4, xnVar4.getParentActivity(), xnVar4));
                return;
            case 13:
                xn xnVar5 = this.f38643b;
                xnVar5.Q7();
                UndoView undoView = xnVar5.f40209v3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 15:
                xn xnVar6 = this.f38643b;
                MessagePreviewParams messagePreviewParams2 = xnVar6.f39976c5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    xnVar6.ca(0);
                    return;
                }
                return;
            case 16:
                this.f38643b.e9(true);
                return;
        }
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        xn xnVar = this.f38643b;
        xnVar.getMessagesController().addUsersToChat(xnVar.e, xnVar, arrayList, i10, null, null, null);
        xnVar.getMessagesController().hidePeerSettingsBar(xnVar.Q5, xnVar.f40009f, xnVar.e);
        xnVar.Qc(true);
        xnVar.oc(true);
    }

    @Override
    public void k(int i10) {
        xn xnVar = this.f38643b;
        if (i10 == 1) {
            xnVar.U9();
        } else if (i10 == 2) {
            xnVar.H9();
        } else if (i10 == 3) {
            xnVar.A4 = true;
            xnVar.getMessagesController().getNextReactionMention(xnVar.Q5, xnVar.b(), xnVar.f40048i1, new jg(xnVar, 0));
        } else if (i10 == 4) {
            xnVar.A4 = true;
            xnVar.getMessagesController().getNextPollVotesMention(xnVar.Q5, xnVar.b(), xnVar.f40060j1, new jg(xnVar, 1));
        } else if (i10 == 6) {
            xnVar.Y8(true);
        } else if (i10 == 5) {
            xnVar.Y8(false);
        } else if (i10 == 0) {
            nh.t2 t2Var = xnVar.G1;
            if (t2Var != null) {
                t2Var.I1(null, 0);
            }
            xnVar.X9();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z4;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) obj;
        xn xnVar = this.f38643b;
        vn vnVar = xnVar.f39968ba;
        TLRPC.WallPaper wallPaper = vnVar.h;
        if (xnVar.M5 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        vnVar.i(e4Var, wallPaper, z4, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void run(boolean z4) {
        xn xnVar = this.f38643b;
        NotificationCenter notificationCenter = xnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(xnVar, i10);
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        xnVar.finishFragment();
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xnVar.Q5), xnVar.f40009f, xnVar.e, Boolean.valueOf(z4));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public boolean run() {
        xn xnVar = this.f38643b;
        return xnVar.h != null || xnVar.y9();
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
