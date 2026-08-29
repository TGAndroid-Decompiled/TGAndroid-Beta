package sf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;
public final class d extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public ir f47763a;
    public org.telegram.ui.ActionBar.w0 f47764b;
    public u51 f47765c;
    public w d;
    public boolean f47766e;
    public boolean f47767f;
    public int h;
    public TL_account.TL_businessAwayMessage f47768n;
    public int f47769r;
    public boolean f47770s;
    public boolean v;
    public boolean f47771w;
    public int f47772x;
    public int f47773y;

    public static void U(d dVar, ArrayList arrayList, k51 k51Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        w41 w41Var = new w41(2);
        w41Var.f34300l = string;
        w41Var.f34303o = string2;
        w41Var.f34301m = "RestrictedEmoji";
        w41Var.f34302n = "💤";
        arrayList.add(w41Var);
        w41 i10 = w41.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(dVar.f47770s);
        arrayList.add(i10);
        arrayList.add(w41.B(null));
        if (dVar.f47770s) {
            r1 d = s1.f(dVar.currentAccount).d("away");
            if (d != null) {
                w41 w41Var2 = new w41(17);
                w41Var2.G = d;
                arrayList.add(w41Var2);
            } else {
                w41 c3 = w41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c3.f34305q = true;
                arrayList.add(c3);
            }
            arrayList.add(w41.B(null));
            th.p(R.string.BusinessAwaySchedule, arrayList);
            w41 w10 = w41.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (dVar.f47772x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w10.K(z10);
            arrayList.add(w10);
            if (dVar.f47766e) {
                w41 w11 = w41.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (dVar.f47772x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w11.K(z11);
                arrayList.add(w11);
            }
            w41 w12 = w41.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (dVar.f47772x == 2) {
                z12 = true;
            }
            w12.K(z12);
            arrayList.add(w12);
            if (dVar.f47772x == 2) {
                arrayList.add(w41.B(null));
                th.p(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(w41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(dVar.B), 8));
                arrayList.add(w41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(dVar.C), 9));
            }
            arrayList.add(w41.B(null));
            w41 i11 = w41.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(dVar.f47771w);
            arrayList.add(i11);
            th.A(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            th.p(R.string.BusinessRecipients, arrayList);
            w41 w13 = w41.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(dVar.v);
            arrayList.add(w13);
            w41 w14 = w41.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!dVar.v);
            arrayList.add(w14);
            arrayList.add(w41.B(null));
            dVar.d.a(arrayList, k51Var, true);
            arrayList.add(w41.B(null));
        }
    }

    public final void V(boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        if (this.f47764b == null) {
            return;
        }
        boolean W = W();
        this.f47764b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f47764b.animate();
            if (W) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (W) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (W) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f47764b;
        if (W) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        w0Var.setAlpha(f9);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f47764b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f47764b;
        if (W) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        w wVar;
        if (this.f47767f) {
            boolean z11 = this.f47770s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f47768n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((wVar = this.d) == null || !wVar.g())) {
                        int i10 = this.f47769r;
                        int i11 = this.f47772x;
                        if (i10 == i11 && this.f47768n.offline_only == this.f47771w && (i11 != 2 || (this.f47773y == this.B && this.A == this.C))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f47763a.f29455c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            r1 d = s1.f(this.currentAccount).d("away");
            boolean z10 = this.f47770s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View y12 = this.f47765c.y1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(y12, i10);
                u51 u51Var = this.f47765c;
                u51Var.x0(u51Var.x1(2));
            } else if (z10 && !this.d.k(this.f47765c)) {
            } else {
                this.f47763a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f47770s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f47771w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f47935a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f47772x;
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
                        tL_businessAwayMessage.offline_only = this.f47771w;
                        tL_businessAwayMessage.shortcut_id = d.f47935a;
                        tL_businessAwayMessage.recipients = this.d.f();
                        userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -9;
                    userFull.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new ef.a(this, 22));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        u51 u51Var;
        k51 k51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f47767f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f47768n = tL_businessAwayMessage;
        if (userFull.business_work_hours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47766e = z10;
        if (tL_businessAwayMessage != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47770s = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z12 = true;
        }
        this.v = z12;
        if (tL_businessAwayMessage != null) {
            z13 = tL_businessAwayMessage.offline_only;
        } else {
            z13 = true;
        }
        this.f47771w = z13;
        w wVar = this.d;
        if (wVar != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            wVar.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f47768n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f47769r = 2;
                this.f47772x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f47773y = i10;
                this.B = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.A = i11;
                this.C = i11;
                u51Var = this.f47765c;
                if (u51Var != null && (k51Var = u51Var.U2) != null) {
                    k51Var.N(true);
                }
                V(true);
                this.f47767f = true;
            }
        }
        this.B = getConnectionsManager().getCurrentTime();
        this.C = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f47768n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f47769r = 0;
            this.f47772x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f47769r = 1;
            this.f47772x = 1;
        } else {
            this.f47769r = 0;
            this.f47772x = 0;
        }
        u51Var = this.f47765c;
        if (u51Var != null) {
            k51Var.N(true);
        }
        V(true);
        this.f47767f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 6));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f47763a = new ir(mutate, new np(g6.w0(null, i10, false)));
        this.f47764b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f47763a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        w wVar = new w(this, new org.telegram.ui.web.t1(this, 14));
        this.d = wVar;
        wVar.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f47768n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        wVar.j(tL_businessRecipients);
        u51 u51Var = new u51(this, new t4(this, 16), new b(this, 0), null);
        this.f47765c = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.f47765c;
        u51Var2.U2.f29939r = false;
        frameLayout.addView(u51Var2, f6.c(-1.0f, -1));
        this.actionBar.A(this.f47765c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            u51 u51Var = this.f47765c;
            if (u51Var != null && (k51Var = u51Var.U2) != null) {
                k51Var.N(true);
            }
            V(true);
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Y();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (W()) {
            if (z10) {
                if (!this.f47770s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new b(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new b(this, 2));
                showDialog(alertDialog$Builder.f22714a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        s1.f(this.currentAccount).h();
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
        this.f47765c.setPadding(0, 0, 0, i13);
        this.f47765c.setClipToPadding(false);
    }
}
