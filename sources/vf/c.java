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
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.x51;
import org.telegram.ui.yh;
import qh.d4;
import qh.v9;
public final class c extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public or f48997a;
    public org.telegram.ui.ActionBar.w0 f48998b;
    public i61 f48999c;
    public v d;
    public boolean f49000e;
    public boolean f49001f;
    public int h;
    public TL_account.TL_businessAwayMessage f49002n;
    public int f49003r;
    public boolean f49004s;
    public boolean v;
    public boolean f49005w;
    public int f49006x;
    public int f49007y;

    public static void U(c cVar, ArrayList arrayList, x51 x51Var) {
        boolean z4;
        boolean z10;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        j51 j51Var = new j51(2);
        j51Var.f28014l = string;
        j51Var.f28017o = string2;
        j51Var.f28015m = "RestrictedEmoji";
        j51Var.f28016n = "💤";
        arrayList.add(j51Var);
        j51 i10 = j51.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.f49004s);
        arrayList.add(i10);
        arrayList.add(j51.B(null));
        if (cVar.f49004s) {
            o1 d = p1.f(cVar.currentAccount).d("away");
            if (d != null) {
                j51 j51Var2 = new j51(17);
                j51Var2.G = d;
                arrayList.add(j51Var2);
            } else {
                j51 c3 = j51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c3.f28019q = true;
                arrayList.add(c3);
            }
            arrayList.add(j51.B(null));
            yh.r(R.string.BusinessAwaySchedule, arrayList);
            j51 w10 = j51.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z11 = false;
            if (cVar.f49006x == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            w10.K(z4);
            arrayList.add(w10);
            if (cVar.f49000e) {
                j51 w11 = j51.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (cVar.f49006x == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w11.K(z10);
                arrayList.add(w11);
            }
            j51 w12 = j51.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (cVar.f49006x == 2) {
                z11 = true;
            }
            w12.K(z11);
            arrayList.add(w12);
            if (cVar.f49006x == 2) {
                arrayList.add(j51.B(null));
                yh.r(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(j51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.C), 8));
                arrayList.add(j51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.D), 9));
            }
            arrayList.add(j51.B(null));
            j51 i11 = j51.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.f49005w);
            arrayList.add(i11);
            yh.A(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            yh.r(R.string.BusinessRecipients, arrayList);
            j51 w13 = j51.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(cVar.v);
            arrayList.add(w13);
            j51 w14 = j51.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!cVar.v);
            arrayList.add(w14);
            arrayList.add(j51.B(null));
            cVar.d.a(arrayList, x51Var, true);
            arrayList.add(j51.B(null));
        }
    }

    public final void V(boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f48998b == null) {
            return;
        }
        boolean W = W();
        this.f48998b.setEnabled(W);
        float f14 = 0.0f;
        if (z4) {
            ViewPropertyAnimator animate = this.f48998b.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f48998b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f48998b;
        if (W) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f48998b;
        if (W) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final boolean W() {
        boolean z4;
        v vVar;
        if (this.f49001f) {
            boolean z10 = this.f49004s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f49002n;
            if (tL_businessAwayMessage != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z10 == z4) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((vVar = this.d) == null || !vVar.g())) {
                        int i10 = this.f49003r;
                        int i11 = this.f49006x;
                        if (i10 == i11 && this.f49002n.offline_only == this.f49005w && (i11 != 2 || (this.f49007y == this.C && this.B == this.D))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f48997a.f29840c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            o1 d = p1.f(this.currentAccount).d("away");
            boolean z4 = this.f49004s;
            if (z4 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View y12 = this.f48999c.y1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(y12, i10);
                i61 i61Var = this.f48999c;
                i61Var.x0(i61Var.x1(2));
            } else if (z4 && !this.d.k(this.f48999c)) {
            } else {
                this.f48997a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f49004s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f49005w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f49160a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f49006x;
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
                        tL_businessAwayMessage.offline_only = this.f49005w;
                        tL_businessAwayMessage.shortcut_id = d.f49160a;
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
        i61 i61Var;
        x51 x51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f49001f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f49002n = tL_businessAwayMessage;
        if (userFull.business_work_hours != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f49000e = z4;
        if (tL_businessAwayMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49004s = z10;
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
        this.f49005w = z12;
        v vVar = this.d;
        if (vVar != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            vVar.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f49002n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f49003r = 2;
                this.f49006x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f49007y = i10;
                this.C = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.B = i11;
                this.D = i11;
                i61Var = this.f48999c;
                if (i61Var != null && (x51Var = i61Var.V2) != null) {
                    x51Var.N(true);
                }
                V(true);
                this.f49001f = true;
            }
        }
        this.C = getConnectionsManager().getCurrentTime();
        this.D = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f49002n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f49003r = 0;
            this.f49006x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f49003r = 1;
            this.f49006x = 1;
        } else {
            this.f49003r = 0;
            this.f49006x = 0;
        }
        i61Var = this.f48999c;
        if (i61Var != null) {
            x51Var.N(true);
        }
        V(true);
        this.f49001f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 6));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.f21981v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f48997a = new or(mutate, new tp(k6.w0(null, i10, false)));
        this.f48998b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f48997a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21605a7, false));
        v vVar = new v(this, new v9(this, 18));
        this.d = vVar;
        vVar.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f49002n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        vVar.j(tL_businessRecipients);
        i61 i61Var = new i61(this, new d4(this, 16), new a(this, 0), null);
        this.f48999c = i61Var;
        i61Var.p1();
        i61 i61Var2 = this.f48999c;
        i61Var2.V2.f32957r = false;
        frameLayout.addView(i61Var2, c6.c(-1.0f, -1));
        this.actionBar.A(this.f48999c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x51 x51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            i61 i61Var = this.f48999c;
            if (i61Var != null && (x51Var = i61Var.V2) != null) {
                x51Var.N(true);
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
                if (!this.f49004s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f21166a);
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
        this.f48999c.setPadding(0, 0, 0, i13);
        this.f48999c.setClipToPadding(false);
    }
}
