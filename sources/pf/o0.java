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
import kh.i9;
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
public final class o0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public fr f45730a;
    public org.telegram.ui.ActionBar.w0 f45731b;
    public i51 f45732c;
    public x d;
    public final int[] f45733e;
    public final String[] f45734f;
    public boolean h;
    public int f45735n;
    public TL_account.TL_businessGreetingMessage f45736r;
    public boolean f45737s;
    public boolean v;
    public int f45738w;

    public o0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f45733e = iArr;
        this.f45735n = -4;
        this.f45738w = 7;
        this.f45734f = new String[iArr.length];
        int i9 = 0;
        while (true) {
            int[] iArr2 = this.f45733e;
            if (i9 < iArr2.length) {
                this.f45734f[i9] = LocaleController.formatPluralString("DaysSchedule", iArr2[i9], new Object[0]);
                i9++;
            } else {
                return;
            }
        }
    }

    public static void T(o0 o0Var, ArrayList arrayList, z41 z41Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        l41 l41Var = new l41(2);
        l41Var.f30339l = string;
        l41Var.f30342o = string2;
        l41Var.f30340m = "RestrictedEmoji";
        l41Var.f30341n = "👋";
        arrayList.add(l41Var);
        l41 i9 = l41.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i9.K(o0Var.f45737s);
        arrayList.add(i9);
        arrayList.add(l41.B(null));
        if (o0Var.f45737s) {
            q1 d = r1.f(o0Var.currentAccount).d("hello");
            if (d != null) {
                l41 l41Var2 = new l41(17);
                l41Var2.G = d;
                arrayList.add(l41Var2);
            } else {
                l41 c10 = l41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f30344q = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.B(null));
            j2.l(R.string.BusinessRecipients, arrayList);
            l41 w8 = l41.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w8.K(o0Var.v);
            arrayList.add(w8);
            l41 w10 = l41.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w10.K(!o0Var.v);
            arrayList.add(w10);
            arrayList.add(l41.B(null));
            o0Var.d.a(arrayList, z41Var, true);
            j2.y(R.string.BusinessGreetRecipientsInfo, arrayList);
            j2.l(R.string.BusinessGreetPeriod, arrayList);
            int i10 = 0;
            while (true) {
                int[] iArr = o0Var.f45733e;
                if (i10 < iArr.length) {
                    if (iArr[i10] == o0Var.f45738w) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            String[] strArr = o0Var.f45734f;
            i9 i9Var = new i9(o0Var, 13);
            l41 l41Var3 = new l41(14);
            l41Var3.f30343p = strArr;
            l41Var3.f30352z = i10;
            l41Var3.C = i9Var;
            l41Var3.B = -1L;
            arrayList.add(l41Var3);
            j2.y(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void U(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f45731b == null) {
            return;
        }
        boolean V = V();
        this.f45731b.setEnabled(V);
        float f14 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f45731b.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f45731b;
        if (V) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f45731b;
        if (V) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f45731b;
        if (V) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final boolean V() {
        boolean z10;
        x xVar;
        if (this.h) {
            boolean z11 = this.f45737s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f45736r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f45738w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((xVar = this.d) != null && xVar.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        if (this.f45730a.f28558c <= 0.0f) {
            if (!V()) {
                finishFragment();
                return;
            }
            q1 d = r1.f(this.currentAccount).d("hello");
            boolean z10 = this.f45737s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View y12 = this.f45732c.y1(2);
                int i9 = -this.f45735n;
                this.f45735n = i9;
                AndroidUtilities.shakeViewSpring(y12, i9);
            } else if (z10 && !this.d.k(this.f45732c)) {
            } else {
                this.f45730a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f45737s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f45756a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f45738w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f45756a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f45738w;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new bf.a(this, 25));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void X() {
        boolean z10;
        int i9;
        boolean z11;
        z41 z41Var;
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
        this.f45736r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45737s = z10;
        if (tL_businessGreetingMessage != null) {
            i9 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i9 = 7;
        }
        this.f45738w = i9;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.v = z11;
        x xVar = this.d;
        if (xVar != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            xVar.j(tL_businessRecipients);
        }
        i51 i51Var = this.f45732c;
        if (i51Var != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(true);
        }
        U(true);
        this.h = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 8));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.f45730a = new fr(mutate, new jp(f6.w0(null, i9, false)));
        this.f45731b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f45730a);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        x xVar = new x(this, new m2(this, 27));
        this.d = xVar;
        xVar.f45824n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f45736r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        xVar.j(tL_businessRecipients);
        i51 i51Var = new i51(this, new b8(this, 19), new n0(this, 2), null);
        this.f45732c = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.f45732c;
        i51Var2.U2.f35188r = false;
        frameLayout.addView(i51Var2, e6.c(-1.0f, -1));
        this.actionBar.z(this.f45732c, true);
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if (i9 == NotificationCenter.quickRepliesUpdated) {
            i51 i51Var = this.f45732c;
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
                if (!this.f45737s) {
                    W();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new n0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new n0(this, 1));
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
        this.f45732c.setPadding(0, 0, 0, i12);
        this.f45732c.setClipToPadding(false);
    }
}
