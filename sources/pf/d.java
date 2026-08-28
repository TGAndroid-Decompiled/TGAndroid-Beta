package pf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import kh.b8;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.xe1;
public final class d extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public fr f45592a;
    public org.telegram.ui.ActionBar.w0 f45593b;
    public i51 f45594c;
    public x d;
    public boolean f45595e;
    public boolean f45596f;
    public int h;
    public TL_account.TL_businessAwayMessage f45597n;
    public int f45598r;
    public boolean f45599s;
    public boolean v;
    public boolean f45600w;
    public int f45601x;
    public int f45602y;

    public static void T(d dVar, ArrayList arrayList, z41 z41Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        l41 l41Var = new l41(2);
        l41Var.f30339l = string;
        l41Var.f30342o = string2;
        l41Var.f30340m = "RestrictedEmoji";
        l41Var.f30341n = "💤";
        arrayList.add(l41Var);
        l41 i9 = l41.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i9.K(dVar.f45599s);
        arrayList.add(i9);
        arrayList.add(l41.B(null));
        if (dVar.f45599s) {
            q1 d = r1.f(dVar.currentAccount).d("away");
            if (d != null) {
                l41 l41Var2 = new l41(17);
                l41Var2.G = d;
                arrayList.add(l41Var2);
            } else {
                l41 c10 = l41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f30344q = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.B(null));
            j2.l(R.string.BusinessAwaySchedule, arrayList);
            l41 w8 = l41.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (dVar.f45601x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w8.K(z10);
            arrayList.add(w8);
            if (dVar.f45595e) {
                l41 w10 = l41.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (dVar.f45601x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w10.K(z11);
                arrayList.add(w10);
            }
            l41 w11 = l41.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (dVar.f45601x == 2) {
                z12 = true;
            }
            w11.K(z12);
            arrayList.add(w11);
            if (dVar.f45601x == 2) {
                arrayList.add(l41.B(null));
                j2.l(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(l41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(dVar.B), 8));
                arrayList.add(l41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(dVar.C), 9));
            }
            arrayList.add(l41.B(null));
            l41 i10 = l41.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i10.K(dVar.f45600w);
            arrayList.add(i10);
            j2.y(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            j2.l(R.string.BusinessRecipients, arrayList);
            l41 w12 = l41.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w12.K(dVar.v);
            arrayList.add(w12);
            l41 w13 = l41.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w13.K(!dVar.v);
            arrayList.add(w13);
            arrayList.add(l41.B(null));
            dVar.d.a(arrayList, z41Var, true);
            arrayList.add(l41.B(null));
        }
    }

    public final void U(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f45593b == null) {
            return;
        }
        boolean V = V();
        this.f45593b.setEnabled(V);
        float f14 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f45593b.animate();
            if (V) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (V) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (V) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f45593b;
        if (V) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f45593b;
        if (V) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f45593b;
        if (V) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final boolean V() {
        boolean z10;
        x xVar;
        if (this.f45596f) {
            boolean z11 = this.f45599s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f45597n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((xVar = this.d) == null || !xVar.g())) {
                        int i9 = this.f45598r;
                        int i10 = this.f45601x;
                        if (i9 == i10 && this.f45597n.offline_only == this.f45600w && (i10 != 2 || (this.f45602y == this.B && this.A == this.C))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void W() {
        if (this.f45592a.f28558c <= 0.0f) {
            if (!V()) {
                finishFragment();
                return;
            }
            q1 d = r1.f(this.currentAccount).d("away");
            boolean z10 = this.f45599s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View y12 = this.f45594c.y1(2);
                int i9 = -this.h;
                this.h = i9;
                AndroidUtilities.shakeViewSpring(y12, i9);
                i51 i51Var = this.f45594c;
                i51Var.x0(i51Var.x1(2));
            } else if (z10 && !this.d.k(this.f45594c)) {
            } else {
                this.f45592a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f45599s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f45600w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f45756a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i10 = this.f45601x;
                    if (i10 == 0) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                    } else if (i10 == 1) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                    } else if (i10 == 2) {
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
                        tL_businessAwayMessage.offline_only = this.f45600w;
                        tL_businessAwayMessage.shortcut_id = d.f45756a;
                        tL_businessAwayMessage.recipients = this.d.f();
                        userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -9;
                    userFull.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new bf.a(this, 22));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void X() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        i51 i51Var;
        z41 z41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f45596f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f45597n = tL_businessAwayMessage;
        if (userFull.business_work_hours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45595e = z10;
        if (tL_businessAwayMessage != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45599s = z11;
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
        this.f45600w = z13;
        x xVar = this.d;
        if (xVar != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            xVar.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f45597n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f45598r = 2;
                this.f45601x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i9 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f45602y = i9;
                this.B = i9;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.A = i10;
                this.C = i10;
                i51Var = this.f45594c;
                if (i51Var != null && (z41Var = i51Var.U2) != null) {
                    z41Var.N(true);
                }
                U(true);
                this.f45596f = true;
            }
        }
        this.B = getConnectionsManager().getCurrentTime();
        this.C = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f45597n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f45598r = 0;
            this.f45601x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f45598r = 1;
            this.f45601x = 1;
        } else {
            this.f45598r = 0;
            this.f45601x = 0;
        }
        i51Var = this.f45594c;
        if (i51Var != null) {
            z41Var.N(true);
        }
        U(true);
        this.f45596f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 5));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.f45592a = new fr(mutate, new jp(f6.w0(null, i9, false)));
        this.f45593b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f45592a);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        x xVar = new x(this, new m2(this, 23));
        this.d = xVar;
        xVar.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f45597n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        xVar.j(tL_businessRecipients);
        i51 i51Var = new i51(this, new b8(this, 15), new b(this, 0), null);
        this.f45594c = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.f45594c;
        i51Var2.U2.f35188r = false;
        frameLayout.addView(i51Var2, e6.c(-1.0f, -1));
        this.actionBar.z(this.f45594c, true);
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if (i9 == NotificationCenter.quickRepliesUpdated) {
            i51 i51Var = this.f45594c;
            if (i51Var != null && (z41Var = i51Var.U2) != null) {
                z41Var.N(true);
            }
            U(true);
        } else if (i9 == NotificationCenter.userInfoDidLoad) {
            X();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (V()) {
            if (z10) {
                if (!this.f45599s) {
                    W();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new b(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new b(this, 2));
                showDialog(alertDialog$Builder.f22702a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        r1.f(this.currentAccount).h();
        X();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f45594c.setPadding(0, 0, 0, i12);
        this.f45594c.setClipToPadding(false);
    }
}
