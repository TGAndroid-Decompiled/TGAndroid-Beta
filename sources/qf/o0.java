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
import lh.n6;
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

public final class o0 extends n2 implements NotificationCenter.NotificationCenterDelegate {

    public dr f46400a;

    public org.telegram.ui.ActionBar.v0 f46401b;

    public k51 f46402c;
    public x d;

    public final int[] f46403e;

    public final String[] f46404f;
    public boolean h;

    public int f46405n;

    public TL_account.TL_businessGreetingMessage f46406r;

    public boolean f46407s;
    public boolean v;

    public int f46408w;

    public o0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f46403e = iArr;
        this.f46405n = -4;
        this.f46408w = 7;
        this.f46404f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f46403e;
            if (i10 >= iArr2.length) {
                return;
            }
            this.f46404f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
            i10++;
        }
    }

    public static void U(o0 o0Var, ArrayList arrayList, b51 b51Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        n41 n41Var = new n41(2);
        n41Var.f30844l = string;
        n41Var.f30847o = string2;
        n41Var.f30845m = "RestrictedEmoji";
        n41Var.f30846n = "👋";
        arrayList.add(n41Var);
        n41 n41VarI = n41.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        n41VarI.K(o0Var.f46407s);
        arrayList.add(n41VarI);
        arrayList.add(n41.B(null));
        if (o0Var.f46407s) {
            p1 p1VarD = q1.f(o0Var.currentAccount).d("hello");
            if (p1VarD != null) {
                n41 n41Var2 = new n41(17);
                n41Var2.G = p1VarD;
                arrayList.add(n41Var2);
            } else {
                n41 n41VarC = n41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                n41VarC.f30849q = true;
                arrayList.add(n41VarC);
            }
            arrayList.add(n41.B(null));
            pa.o(R.string.BusinessRecipients, arrayList);
            n41 n41VarW = n41.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            n41VarW.K(o0Var.v);
            arrayList.add(n41VarW);
            n41 n41VarW2 = n41.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            n41VarW2.K(!o0Var.v);
            arrayList.add(n41VarW2);
            arrayList.add(n41.B(null));
            o0Var.d.a(arrayList, b51Var, true);
            pa.A(R.string.BusinessGreetRecipientsInfo, arrayList);
            pa.o(R.string.BusinessGreetPeriod, arrayList);
            int i10 = 0;
            while (true) {
                int[] iArr = o0Var.f46403e;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                } else if (iArr[i10] == o0Var.f46408w) {
                    break;
                } else {
                    i10++;
                }
            }
            String[] strArr = o0Var.f46404f;
            n6 n6Var = new n6(o0Var, 15);
            n41 n41Var3 = new n41(14);
            n41Var3.f30848p = strArr;
            n41Var3.f30857z = i10;
            n41Var3.C = n6Var;
            n41Var3.B = -1L;
            arrayList.add(n41Var3);
            pa.A(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        if (this.f46401b == null) {
            return;
        }
        boolean zW = W();
        this.f46401b.setEnabled(zW);
        if (z10) {
            this.f46401b.animate().alpha(zW ? 1.0f : 0.0f).scaleX(zW ? 1.0f : 0.0f).scaleY(zW ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.f46401b.setAlpha(zW ? 1.0f : 0.0f);
        this.f46401b.setScaleX(zW ? 1.0f : 0.0f);
        this.f46401b.setScaleY(zW ? 1.0f : 0.0f);
    }

    public final boolean W() {
        x xVar;
        if (this.h) {
            boolean z10 = this.f46407s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f46406r;
            if (z10 != (tL_businessGreetingMessage != null) || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f46408w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((xVar = this.d) != null && xVar.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f46400a.f27834c > 0.0f) {
            return;
        }
        if (!W()) {
            finishFragment();
            return;
        }
        p1 p1VarD = q1.f(this.currentAccount).d("hello");
        boolean z10 = this.f46407s;
        if (z10 && p1VarD == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View viewY1 = this.f46402c.y1(2);
            int i10 = -this.f46405n;
            this.f46405n = i10;
            AndroidUtilities.shakeViewSpring(viewY1, i10);
            return;
        }
        if (!z10 || this.d.k(this.f46402c)) {
            this.f46400a.a(1.0f);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.f46407s) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = p1VarD.f46418a;
                tL_inputBusinessGreetingMessage.recipients = this.d.e();
                updatebusinessgreetingmessage.message.no_activity_days = this.f46408w;
                updatebusinessgreetingmessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    userFull.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = p1VarD.f46418a;
                    tL_businessGreetingMessage.recipients = this.d.f();
                    userFull.business_greeting_message.no_activity_days = this.f46408w;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -5;
                userFull.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new cf.a(this, 25));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        b51 b51Var;
        if (this.h) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.f46406r = tL_businessGreetingMessage;
        this.f46407s = tL_businessGreetingMessage != null;
        this.f46408w = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.no_activity_days : 7;
        this.v = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.recipients.exclude_selected : true;
        x xVar = this.d;
        if (xVar != null) {
            xVar.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        k51 k51Var = this.f46402c;
        if (k51Var != null && (b51Var = k51Var.U2) != null) {
            b51Var.N(true);
        }
        V(true);
        this.h = true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new ed1(9, this));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f23375v8;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f46400a = new dr(drawableMutate, new hp(g6.w0(null, i10, false)));
        this.f46401b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f46400a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        x xVar = new x(this, new b(this, 4));
        this.d = xVar;
        xVar.f46492n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f46406r;
        xVar.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        k51 k51Var = new k51(this, new a8(this, 19), new n0(this, 2), null);
        this.f46402c = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.f46402c;
        k51Var2.U2.f26942r = false;
        frameLayout.addView(k51Var2, z5.c(-1.0f, -1));
        this.actionBar.B(this.f46402c, true);
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
            k51 k51Var = this.f46402c;
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
            if (!this.f46407s) {
                X();
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
        this.f46402c.setPadding(0, 0, 0, i13);
        this.f46402c.setClipToPadding(false);
    }
}
