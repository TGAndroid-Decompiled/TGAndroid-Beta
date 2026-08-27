package qf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import lh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.ed1;

public final class e extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;

    public dr f46267a;

    public org.telegram.ui.ActionBar.v0 f46268b;

    public k51 f46269c;
    public x d;

    public boolean f46270e;

    public boolean f46271f;
    public int h;

    public TL_account.TL_businessAwayMessage f46272n;

    public int f46273r;

    public boolean f46274s;
    public boolean v;

    public boolean f46275w;

    public int f46276x;

    public int f46277y;

    public static void U(e eVar, ArrayList arrayList, b51 b51Var) {
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        n41 n41Var = new n41(2);
        n41Var.f30844l = string;
        n41Var.f30847o = string2;
        n41Var.f30845m = "RestrictedEmoji";
        n41Var.f30846n = "💤";
        arrayList.add(n41Var);
        n41 n41VarI = n41.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        n41VarI.K(eVar.f46274s);
        arrayList.add(n41VarI);
        arrayList.add(n41.B(null));
        if (eVar.f46274s) {
            p1 p1VarD = q1.f(eVar.currentAccount).d("away");
            if (p1VarD != null) {
                n41 n41Var2 = new n41(17);
                n41Var2.G = p1VarD;
                arrayList.add(n41Var2);
            } else {
                n41 n41VarC = n41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                n41VarC.f30849q = true;
                arrayList.add(n41VarC);
            }
            arrayList.add(n41.B(null));
            pa.o(R.string.BusinessAwaySchedule, arrayList);
            n41 n41VarW = n41.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            n41VarW.K(eVar.f46276x == 0);
            arrayList.add(n41VarW);
            if (eVar.f46270e) {
                n41 n41VarW2 = n41.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                n41VarW2.K(eVar.f46276x == 1);
                arrayList.add(n41VarW2);
            }
            n41 n41VarW3 = n41.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            n41VarW3.K(eVar.f46276x == 2);
            arrayList.add(n41VarW3);
            if (eVar.f46276x == 2) {
                arrayList.add(n41.B(null));
                pa.o(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(n41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(eVar.B), 8));
                arrayList.add(n41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(eVar.C), 9));
            }
            arrayList.add(n41.B(null));
            n41 n41VarI2 = n41.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            n41VarI2.K(eVar.f46275w);
            arrayList.add(n41VarI2);
            pa.A(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            pa.o(R.string.BusinessRecipients, arrayList);
            n41 n41VarW4 = n41.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            n41VarW4.K(eVar.v);
            arrayList.add(n41VarW4);
            n41 n41VarW5 = n41.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            n41VarW5.K(!eVar.v);
            arrayList.add(n41VarW5);
            arrayList.add(n41.B(null));
            eVar.d.a(arrayList, b51Var, true);
            arrayList.add(n41.B(null));
        }
    }

    public final void V(boolean z10) {
        if (this.f46268b == null) {
            return;
        }
        boolean zW = W();
        this.f46268b.setEnabled(zW);
        if (z10) {
            this.f46268b.animate().alpha(zW ? 1.0f : 0.0f).scaleX(zW ? 1.0f : 0.0f).scaleY(zW ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.f46268b.setAlpha(zW ? 1.0f : 0.0f);
        this.f46268b.setScaleX(zW ? 1.0f : 0.0f);
        this.f46268b.setScaleY(zW ? 1.0f : 0.0f);
    }

    public final boolean W() {
        x xVar;
        if (this.f46271f) {
            boolean z10 = this.f46274s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f46272n;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((xVar = this.d) == null || !xVar.g())) {
                        int i10 = this.f46273r;
                        int i11 = this.f46276x;
                        if (i10 == i11 && this.f46272n.offline_only == this.f46275w && (i11 != 2 || (this.f46277y == this.B && this.A == this.C))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f46267a.f27834c > 0.0f) {
            return;
        }
        if (!W()) {
            finishFragment();
            return;
        }
        p1 p1VarD = q1.f(this.currentAccount).d("away");
        boolean z10 = this.f46274s;
        if (z10 && p1VarD == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View viewY1 = this.f46269c.y1(2);
            int i10 = -this.h;
            this.h = i10;
            AndroidUtilities.shakeViewSpring(viewY1, i10);
            k51 k51Var = this.f46269c;
            k51Var.x0(k51Var.x1(2));
            return;
        }
        if (!z10 || this.d.k(this.f46269c)) {
            this.f46267a.a(1.0f);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
            if (this.f46274s) {
                TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                tL_inputBusinessAwayMessage.offline_only = this.f46275w;
                tL_inputBusinessAwayMessage.shortcut_id = p1VarD.f46418a;
                tL_inputBusinessAwayMessage.recipients = this.d.e();
                int i11 = this.f46276x;
                if (i11 == 0) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                } else if (i11 == 1) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (i11 == 2) {
                    TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                    tL_businessAwayMessageScheduleCustom.start_date = this.B;
                    tL_businessAwayMessageScheduleCustom.end_date = this.C;
                    updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                }
                updatebusinessawaymessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    userFull.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.f46275w;
                    tL_businessAwayMessage.shortcut_id = p1VarD.f46418a;
                    tL_businessAwayMessage.recipients = this.d.f();
                    userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -9;
                userFull.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new cf.a(this, 22));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        TL_account.TL_businessAwayMessage tL_businessAwayMessage;
        b51 b51Var;
        if (this.f46271f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = userFull.business_away_message;
        this.f46272n = tL_businessAwayMessage2;
        this.f46270e = userFull.business_work_hours != null;
        this.f46274s = tL_businessAwayMessage2 != null;
        this.v = tL_businessAwayMessage2 != null ? tL_businessAwayMessage2.recipients.exclude_selected : true;
        this.f46275w = tL_businessAwayMessage2 != null ? tL_businessAwayMessage2.offline_only : true;
        x xVar = this.d;
        if (xVar != null) {
            xVar.j(tL_businessAwayMessage2 == null ? null : tL_businessAwayMessage2.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f46272n;
        if (tL_businessAwayMessage3 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage3.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f46273r = 2;
                this.f46276x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f46277y = i10;
                this.B = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.A = i11;
                this.C = i11;
            } else {
                this.B = getConnectionsManager().getCurrentTime();
                this.C = getConnectionsManager().getCurrentTime() + 86400;
                tL_businessAwayMessage = this.f46272n;
                if ((tL_businessAwayMessage == null && (tL_businessAwayMessage.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) || tL_businessAwayMessage == null || !(tL_businessAwayMessage.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
                    this.f46273r = 0;
                    this.f46276x = 0;
                } else {
                    this.f46273r = 1;
                    this.f46276x = 1;
                }
            }
        } else {
            this.B = getConnectionsManager().getCurrentTime();
            this.C = getConnectionsManager().getCurrentTime() + 86400;
            tL_businessAwayMessage = this.f46272n;
            if (tL_businessAwayMessage == null) {
                this.f46273r = 1;
                this.f46276x = 1;
            } else {
                this.f46273r = 1;
                this.f46276x = 1;
            }
        }
        k51 k51Var = this.f46269c;
        if (k51Var != null && (b51Var = k51Var.U2) != null) {
            b51Var.N(true);
        }
        V(true);
        this.f46271f = true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ed1(6, this));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f23375v8;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f46267a = new dr(drawableMutate, new hp(g6.w0(null, i10, false)));
        this.f46268b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f46267a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        x xVar = new x(this, new b(this, 0));
        this.d = xVar;
        xVar.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f46272n;
        xVar.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        k51 k51Var = new k51(this, new a8(this, 15), new c(this, 0), null);
        this.f46269c = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.f46269c;
        k51Var2.U2.f26942r = false;
        frameLayout.addView(k51Var2, z5.c(-1.0f, -1));
        this.actionBar.B(this.f46269c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b51 b51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                Y();
            }
        } else {
            k51 k51Var = this.f46269c;
            if (k51Var != null && (b51Var = k51Var.U2) != null) {
                b51Var.N(true);
            }
            V(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!W()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            if (!this.f46274s) {
                X();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new c(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new c(this, 2));
            showDialog(alertDialog$Builder.f22702a);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        q1.f(this.currentAccount).h();
        Y();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f46269c.setPadding(0, 0, 0, i13);
        this.f46269c.setClipToPadding(false);
    }
}
