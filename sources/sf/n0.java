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
public final class n0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public ir f47893a;
    public org.telegram.ui.ActionBar.w0 f47894b;
    public u51 f47895c;
    public w d;
    public final int[] f47896e;
    public final String[] f47897f;
    public boolean h;
    public int f47898n;
    public TL_account.TL_businessGreetingMessage f47899r;
    public boolean f47900s;
    public boolean v;
    public int f47901w;

    public n0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f47896e = iArr;
        this.f47898n = -4;
        this.f47901w = 7;
        this.f47897f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f47896e;
            if (i10 < iArr2.length) {
                this.f47897f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(n0 n0Var, ArrayList arrayList, k51 k51Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        w41 w41Var = new w41(2);
        w41Var.f34300l = string;
        w41Var.f34303o = string2;
        w41Var.f34301m = "RestrictedEmoji";
        w41Var.f34302n = "👋";
        arrayList.add(w41Var);
        w41 i10 = w41.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(n0Var.f47900s);
        arrayList.add(i10);
        arrayList.add(w41.B(null));
        if (n0Var.f47900s) {
            r1 d = s1.f(n0Var.currentAccount).d("hello");
            if (d != null) {
                w41 w41Var2 = new w41(17);
                w41Var2.G = d;
                arrayList.add(w41Var2);
            } else {
                w41 c3 = w41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c3.f34305q = true;
                arrayList.add(c3);
            }
            arrayList.add(w41.B(null));
            th.p(R.string.BusinessRecipients, arrayList);
            w41 w10 = w41.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(n0Var.v);
            arrayList.add(w10);
            w41 w11 = w41.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!n0Var.v);
            arrayList.add(w11);
            arrayList.add(w41.B(null));
            n0Var.d.a(arrayList, k51Var, true);
            th.A(R.string.BusinessGreetRecipientsInfo, arrayList);
            th.p(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = n0Var.f47896e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == n0Var.f47901w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = n0Var.f47897f;
            nh.b0 b0Var = new nh.b0(n0Var, 20);
            w41 w41Var3 = new w41(14);
            w41Var3.f34304p = strArr;
            w41Var3.f34313z = i11;
            w41Var3.C = b0Var;
            w41Var3.B = -1L;
            arrayList.add(w41Var3);
            th.A(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        if (this.f47894b == null) {
            return;
        }
        boolean W = W();
        this.f47894b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f47894b.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f47894b;
        if (W) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        w0Var.setAlpha(f9);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f47894b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f47894b;
        if (W) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        w wVar;
        if (this.h) {
            boolean z11 = this.f47900s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f47899r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f47901w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((wVar = this.d) != null && wVar.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f47893a.f29455c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            r1 d = s1.f(this.currentAccount).d("hello");
            boolean z10 = this.f47900s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View y12 = this.f47895c.y1(2);
                int i10 = -this.f47898n;
                this.f47898n = i10;
                AndroidUtilities.shakeViewSpring(y12, i10);
            } else if (z10 && !this.d.k(this.f47895c)) {
            } else {
                this.f47893a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f47900s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f47935a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f47901w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f47935a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f47901w;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ef.a(this, 25));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        boolean z11;
        k51 k51Var;
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
        this.f47899r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47900s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f47901w = i10;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.v = z11;
        w wVar = this.d;
        if (wVar != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            wVar.j(tL_businessRecipients);
        }
        u51 u51Var = this.f47895c;
        if (u51Var != null && (k51Var = u51Var.U2) != null) {
            k51Var.N(true);
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
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f47893a = new ir(mutate, new np(g6.w0(null, i10, false)));
        this.f47894b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f47893a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        w wVar = new w(this, new org.telegram.ui.web.t1(this, 18));
        this.d = wVar;
        wVar.f47996n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f47899r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        wVar.j(tL_businessRecipients);
        u51 u51Var = new u51(this, new t4(this, 20), new m0(this, 2), null);
        this.f47895c = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.f47895c;
        u51Var2.U2.f29939r = false;
        frameLayout.addView(u51Var2, f6.c(-1.0f, -1));
        this.actionBar.A(this.f47895c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            u51 u51Var = this.f47895c;
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
                if (!this.f47900s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new m0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new m0(this, 1));
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
        this.f47895c.setPadding(0, 0, 0, i13);
        this.f47895c.setClipToPadding(false);
    }
}
