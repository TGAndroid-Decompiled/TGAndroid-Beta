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
public final class n0 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public or f49139a;
    public org.telegram.ui.ActionBar.w0 f49140b;
    public i61 f49141c;
    public v d;
    public final int[] f49142e;
    public final String[] f49143f;
    public boolean h;
    public int f49144n;
    public TL_account.TL_businessGreetingMessage f49145r;
    public boolean f49146s;
    public boolean v;
    public int f49147w;

    public n0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f49142e = iArr;
        this.f49144n = -4;
        this.f49147w = 7;
        this.f49143f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f49142e;
            if (i10 < iArr2.length) {
                this.f49143f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(n0 n0Var, ArrayList arrayList, x51 x51Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        j51 j51Var = new j51(2);
        j51Var.f28014l = string;
        j51Var.f28017o = string2;
        j51Var.f28015m = "RestrictedEmoji";
        j51Var.f28016n = "👋";
        arrayList.add(j51Var);
        j51 i10 = j51.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(n0Var.f49146s);
        arrayList.add(i10);
        arrayList.add(j51.B(null));
        if (n0Var.f49146s) {
            o1 d = p1.f(n0Var.currentAccount).d("hello");
            if (d != null) {
                j51 j51Var2 = new j51(17);
                j51Var2.G = d;
                arrayList.add(j51Var2);
            } else {
                j51 c3 = j51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c3.f28019q = true;
                arrayList.add(c3);
            }
            arrayList.add(j51.B(null));
            yh.r(R.string.BusinessRecipients, arrayList);
            j51 w10 = j51.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(n0Var.v);
            arrayList.add(w10);
            j51 w11 = j51.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!n0Var.v);
            arrayList.add(w11);
            arrayList.add(j51.B(null));
            n0Var.d.a(arrayList, x51Var, true);
            yh.A(R.string.BusinessGreetRecipientsInfo, arrayList);
            yh.r(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = n0Var.f49142e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == n0Var.f49147w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = n0Var.f49143f;
            org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(n0Var, 20);
            j51 j51Var3 = new j51(14);
            j51Var3.f28018p = strArr;
            j51Var3.f28027z = i11;
            j51Var3.C = d1Var;
            j51Var3.B = -1L;
            arrayList.add(j51Var3);
            yh.A(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f49140b == null) {
            return;
        }
        boolean W = W();
        this.f49140b.setEnabled(W);
        float f14 = 0.0f;
        if (z4) {
            ViewPropertyAnimator animate = this.f49140b.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f49140b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f49140b;
        if (W) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f49140b;
        if (W) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final boolean W() {
        boolean z4;
        v vVar;
        if (this.h) {
            boolean z10 = this.f49146s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f49145r;
            if (tL_businessGreetingMessage != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z10 != z4 || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f49147w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((vVar = this.d) != null && vVar.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f49139a.f29840c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            o1 d = p1.f(this.currentAccount).d("hello");
            boolean z4 = this.f49146s;
            if (z4 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View y12 = this.f49141c.y1(2);
                int i10 = -this.f49144n;
                this.f49144n = i10;
                AndroidUtilities.shakeViewSpring(y12, i10);
            } else if (z4 && !this.d.k(this.f49141c)) {
            } else {
                this.f49139a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f49146s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f49159a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f49147w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f49159a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f49147w;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new gf.a(this, 25));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z4;
        int i10;
        boolean z10;
        x51 x51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.h) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.f49145r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f49146s = z4;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f49147w = i10;
        if (tL_businessGreetingMessage != null) {
            z10 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z10 = true;
        }
        this.v = z10;
        v vVar = this.d;
        if (vVar != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            vVar.j(tL_businessRecipients);
        }
        i61 i61Var = this.f49141c;
        if (i61Var != null && (x51Var = i61Var.V2) != null) {
            x51Var.N(true);
        }
        V(true);
        this.h = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.f21981v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f49139a = new or(mutate, new tp(k6.w0(null, i10, false)));
        this.f49140b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f49139a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21605a7, false));
        v vVar = new v(this, new v9(this, 22));
        this.d = vVar;
        vVar.f49217n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f49145r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        vVar.j(tL_businessRecipients);
        i61 i61Var = new i61(this, new d4(this, 20), new m0(this, 2), null);
        this.f49141c = i61Var;
        i61Var.p1();
        i61 i61Var2 = this.f49141c;
        i61Var2.V2.f32957r = false;
        frameLayout.addView(i61Var2, c6.c(-1.0f, -1));
        this.actionBar.A(this.f49141c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x51 x51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            i61 i61Var = this.f49141c;
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
                if (!this.f49146s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new m0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new m0(this, 1));
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
        this.f49141c.setPadding(0, 0, 0, i13);
        this.f49141c.setClipToPadding(false);
    }
}
