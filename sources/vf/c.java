package vf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.w51;
import org.telegram.ui.yh;
import qh.c4;
import qh.u9;
public final class c extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public or f49033a;
    public org.telegram.ui.ActionBar.w0 f49034b;
    public h61 f49035c;
    public v d;
    public boolean f49036e;
    public boolean f49037f;
    public int h;
    public TL_account.TL_businessAwayMessage f49038n;
    public int f49039r;
    public boolean f49040s;
    public boolean v;
    public boolean f49041w;
    public int f49042x;
    public int f49043y;

    public static void U(c cVar, ArrayList arrayList, w51 w51Var) {
        boolean z4;
        boolean z10;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        h51 h51Var = new h51(2);
        h51Var.f27375l = string;
        h51Var.f27378o = string2;
        h51Var.f27376m = "RestrictedEmoji";
        h51Var.f27377n = "💤";
        arrayList.add(h51Var);
        h51 i10 = h51.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.f49040s);
        arrayList.add(i10);
        arrayList.add(h51.B(null));
        if (cVar.f49040s) {
            o1 d = p1.f(cVar.currentAccount).d("away");
            if (d != null) {
                h51 h51Var2 = new h51(17);
                h51Var2.G = d;
                arrayList.add(h51Var2);
            } else {
                h51 c3 = h51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c3.f27380q = true;
                arrayList.add(c3);
            }
            arrayList.add(h51.B(null));
            yh.r(R.string.BusinessAwaySchedule, arrayList);
            h51 w10 = h51.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z11 = false;
            if (cVar.f49042x == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            w10.K(z4);
            arrayList.add(w10);
            if (cVar.f49036e) {
                h51 w11 = h51.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (cVar.f49042x == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w11.K(z10);
                arrayList.add(w11);
            }
            h51 w12 = h51.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (cVar.f49042x == 2) {
                z11 = true;
            }
            w12.K(z11);
            arrayList.add(w12);
            if (cVar.f49042x == 2) {
                arrayList.add(h51.B(null));
                yh.r(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.C), 8));
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.D), 9));
            }
            arrayList.add(h51.B(null));
            h51 i11 = h51.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.f49041w);
            arrayList.add(i11);
            yh.A(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            yh.r(R.string.BusinessRecipients, arrayList);
            h51 w13 = h51.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(cVar.v);
            arrayList.add(w13);
            h51 w14 = h51.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!cVar.v);
            arrayList.add(w14);
            arrayList.add(h51.B(null));
            cVar.d.a(arrayList, w51Var, true);
            arrayList.add(h51.B(null));
        }
    }

    public final void V(boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f49034b == null) {
            return;
        }
        boolean W = W();
        this.f49034b.setEnabled(W);
        float f14 = 0.0f;
        if (z4) {
            ViewPropertyAnimator animate = this.f49034b.animate();
            if (W) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (W) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (W) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f49034b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f49034b;
        if (W) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f49034b;
        if (W) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final boolean W() {
        boolean z4;
        v vVar;
        if (this.f49037f) {
            boolean z10 = this.f49040s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f49038n;
            if (tL_businessAwayMessage != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z10 == z4) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((vVar = this.d) == null || !vVar.g())) {
                        int i10 = this.f49039r;
                        int i11 = this.f49042x;
                        if (i10 == i11 && this.f49038n.offline_only == this.f49041w && (i11 != 2 || (this.f49043y == this.C && this.B == this.D))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f49033a.f29874c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            o1 d = p1.f(this.currentAccount).d("away");
            boolean z4 = this.f49040s;
            if (z4 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View x12 = this.f49035c.x1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(x12, i10);
                h61 h61Var = this.f49035c;
                h61Var.x0(h61Var.w1(2));
            } else if (z4 && !this.d.k(this.f49035c)) {
            } else {
                this.f49033a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f49040s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f49041w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f49196a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f49042x;
                    if (i11 == 0) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                    } else if (i11 == 1) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                    } else if (i11 == 2) {
                        TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                        tL_businessAwayMessageScheduleCustom.start_date = this.C;
                        tL_businessAwayMessageScheduleCustom.end_date = this.D;
                        updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                    }
                    updatebusinessawaymessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 8;
                        TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                        userFull.business_away_message = tL_businessAwayMessage;
                        tL_businessAwayMessage.offline_only = this.f49041w;
                        tL_businessAwayMessage.shortcut_id = d.f49196a;
                        tL_businessAwayMessage.recipients = this.d.f();
                        userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -9;
                    userFull.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new gf.a(this, 22));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        h61 h61Var;
        w51 w51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f49037f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f49038n = tL_businessAwayMessage;
        if (userFull.business_work_hours != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f49036e = z4;
        if (tL_businessAwayMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49040s = z10;
        if (tL_businessAwayMessage != null) {
            z11 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.v = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.offline_only;
        } else {
            z12 = true;
        }
        this.f49041w = z12;
        v vVar = this.d;
        if (vVar != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            vVar.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f49038n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f49039r = 2;
                this.f49042x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f49043y = i10;
                this.C = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.B = i11;
                this.D = i11;
                h61Var = this.f49035c;
                if (h61Var != null && (w51Var = h61Var.V2) != null) {
                    w51Var.N(true);
                }
                V(true);
                this.f49037f = true;
            }
        }
        this.C = getConnectionsManager().getCurrentTime();
        this.D = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f49038n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f49039r = 0;
            this.f49042x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f49039r = 1;
            this.f49042x = 1;
        } else {
            this.f49039r = 0;
            this.f49042x = 0;
        }
        h61Var = this.f49035c;
        if (h61Var != null) {
            w51Var.N(true);
        }
        V(true);
        this.f49037f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 6));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.f21983v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f49033a = new or(mutate, new tp(k6.w0(null, i10, false)));
        this.f49034b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f49033a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21607a7, false));
        v vVar = new v(this, new u9(this, 18));
        this.d = vVar;
        vVar.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f49038n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        vVar.j(tL_businessRecipients);
        h61 h61Var = new h61(this, new c4(this, 16), new a(this, 0), null);
        this.f49035c = h61Var;
        h61Var.o1();
        h61 h61Var2 = this.f49035c;
        h61Var2.V2.f32651r = false;
        frameLayout.addView(h61Var2, c6.c(-1.0f, -1));
        this.actionBar.A(this.f49035c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            h61 h61Var = this.f49035c;
            if (h61Var != null && (w51Var = h61Var.V2) != null) {
                w51Var.N(true);
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
    public final boolean onBackPressed(boolean z4) {
        if (W()) {
            if (z4) {
                if (!this.f49040s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f21168a);
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        p1.f(this.currentAccount).h();
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
        this.f49035c.setPadding(0, 0, 0, i13);
        this.f49035c.setClipToPadding(false);
    }
}
