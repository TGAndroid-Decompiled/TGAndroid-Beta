package ph;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.om0;
import org.telegram.ui.op0;
import org.telegram.ui.rh;
import org.telegram.ui.th;
import org.telegram.ui.z10;
public final class j extends z10 implements NotificationCenter.NotificationCenterDelegate {
    public final long L;
    public FrameLayout M;
    public dg.i N;
    public LinearLayout O;
    public jh.n P;
    public y80 Q;
    public boolean S;
    public TL_payments.starRefProgram T;
    public TL_payments.starRefProgram U;
    public boolean X;
    public e Y;
    public final d R = new d(this, 0);
    public String[] V = null;
    public final List W = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public j(long j10) {
        this.L = j10;
        this.I = true;
        this.H = AndroidUtilities.dp(60.0f);
    }

    public static void A0(j jVar, int i10) {
        e eVar = jVar.Y;
        if (eVar != null) {
            int i11 = eVar.G(i10).d;
            if (i11 == 4) {
                LinearLayout linearLayout = new LinearLayout(jVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                TextView textView = new TextView(jVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i12 = g6.G6;
                textView.setTextColor(g6.v0(i12, jVar.resourceProvider));
                org.telegram.messenger.x3.r(R.string.AffiliateProgramStopText, textView);
                linearLayout.addView(textView, f6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                om0 om0Var = new om0(jVar.getParentActivity(), 2);
                om0Var.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                om0Var.setTextSize(1, 16.0f);
                om0Var.setTextColor(g6.v0(i12, jVar.resourceProvider));
                om0Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
                linearLayout.addView(om0Var, f6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                om0 om0Var2 = new om0(jVar.getParentActivity(), 2);
                om0Var2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                om0Var2.setTextSize(1, 16.0f);
                om0Var2.setTextColor(g6.v0(i12, jVar.resourceProvider));
                om0Var2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
                linearLayout.addView(om0Var2, f6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                om0 om0Var3 = new om0(jVar.getParentActivity(), 2);
                om0Var3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                om0Var3.setTextSize(1, 16.0f);
                om0Var3.setTextColor(g6.v0(i12, jVar.resourceProvider));
                om0Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
                linearLayout.addView(om0Var3, f6.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jVar.getParentActivity(), 0, jVar.resourceProvider);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AffiliateProgramAlert);
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new l4.s0(jVar, 25));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
            } else if (i11 == 2) {
                jVar.presentFragment(new x3(jVar.L));
            }
        }
    }

    public static org.telegram.ui.ActionBar.l B0(j jVar) {
        return jVar.actionBar;
    }

    public static String G0(int i10) {
        float f9 = i10 / 10.0f;
        if (((int) f9) == f9) {
            Locale locale = Locale.US;
            return u3.c.d(i10 / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f9));
    }

    public static void x0(j jVar, Context context) {
        String formatPluralString;
        int i10;
        int i11;
        if (!jVar.P.S) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        hz0 hz0Var = new hz0(context, jVar.resourceProvider);
        d dVar = new d(jVar, 1);
        hz0Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), G0(jVar.U.commission_permille), null, null);
        String string = LocaleController.getString(R.string.AffiliateProgramDuration);
        int i12 = jVar.U.duration_months;
        if (i12 <= 0) {
            formatPluralString = LocaleController.getString(R.string.Infinity);
        } else if (i12 >= 12 && i12 % 12 == 0) {
            formatPluralString = LocaleController.formatPluralString("Years", i12 / 12, new Object[0]);
        } else {
            formatPluralString = LocaleController.formatPluralString("Months", i12, new Object[0]);
        }
        hz0Var.c(string, formatPluralString, null, null);
        frameLayout.addView(hz0Var, f6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, jVar.resourceProvider);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AffiliateProgramAlert);
        if (jVar.S) {
            i10 = R.string.AffiliateProgramStartAlertText;
        } else {
            i10 = R.string.AffiliateProgramUpdateAlertText;
        }
        alertDialog$Builder.f22714a.P = LocaleController.getString(i10);
        alertDialog$Builder.n(frameLayout);
        if (jVar.S) {
            i11 = R.string.AffiliateProgramStartAlertButton;
        } else {
            i11 = R.string.AffiliateProgramUpdateAlertButton;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new l4.s0(dVar, 24));
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void y0(j jVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = jVar.L;
        c2Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull userFull = jVar.getMessagesController().getUserFull(j10);
            if (userFull != null) {
                userFull.starref_program = starrefprogram;
                jVar.getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(jVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
            }
            jVar.D0(false);
        } else if (tL_error != null) {
            tc.b0(tL_error);
        }
    }

    public static void z0(j jVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        long j10 = jVar.L;
        c2Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull userFull = jVar.getMessagesController().getUserFull(j10);
            if (userFull != null) {
                TL_payments.starRefProgram starrefprogram2 = jVar.U;
                starrefprogram2.flags |= 2;
                int currentTime = jVar.getConnectionsManager().getCurrentTime();
                if (jVar.getConnectionsManager().isTestBackend()) {
                    i10 = 300;
                } else {
                    i10 = 86400;
                }
                starrefprogram2.end_date = currentTime + i10;
                userFull.starref_program = starrefprogram;
                jVar.getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(jVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
            }
            jVar.D0(true);
        } else if (tL_error != null) {
            tc.b0(tL_error);
        }
    }

    public final void D0(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var = null;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            b5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                    if ((o2Var2 instanceof ProfileActivity) && ((ProfileActivity) o2Var2).a() == this.L) {
                        o2Var = o2Var2;
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (o2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.o2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                o2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
        }
        if (o2Var != null) {
            if (z10) {
                tc.a0(o2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
                return;
            }
            tc.a0(o2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
        }
    }

    public final void E0(ArrayList arrayList, k51 k51Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        w41 w41Var = new w41(-2);
        w41Var.f34293c = (cg.h0) super.r0(getParentActivity());
        arrayList.add(w41Var);
        arrayList.add(h.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(h.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(h.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(w41.A(1, null));
        arrayList.add(w41.t(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i11 = getMessagesController().starrefMinCommissionPermille;
        int i12 = this.U.commission_permille;
        int i13 = getMessagesController().starrefMaxCommissionPermille;
        rh rhVar = new rh(6);
        a aVar = new a(this, 1);
        w41 w41Var2 = new w41(15);
        w41Var2.f34313z = i12;
        w41Var2.C = aVar;
        u7 u7Var = new u7();
        u7Var.f25739a = i11;
        u7Var.f25740b = i13;
        u7Var.f25742e = new fa(rhVar, 7);
        w41Var2.G = u7Var;
        w41Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.T;
        if (starrefprogram == null) {
            i10 = -1;
        } else {
            i10 = starrefprogram.commission_permille;
        }
        w41Var2.B = i10;
        arrayList.add(w41Var2);
        th.A(R.string.AffiliateProgramCommissionInfo, arrayList);
        th.p(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.V;
        List list = this.W;
        if (strArr == null) {
            this.V = new String[list.size()];
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                if (intValue == 0) {
                    this.V[i14] = LocaleController.getString(R.string.Infinity);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.V[i14] = LocaleController.formatPluralString("YearsShort", intValue / 12, new Object[0]);
                } else {
                    this.V[i14] = LocaleController.formatPluralString("MonthsShort", intValue, new Object[0]);
                }
            }
        }
        String[] strArr2 = this.V;
        int indexOf = list.indexOf(Integer.valueOf(this.U.duration_months));
        a aVar2 = new a(this, 2);
        w41 w41Var3 = new w41(14);
        w41Var3.f34304p = strArr2;
        w41Var3.f34313z = indexOf;
        w41Var3.C = aVar2;
        w41Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.T;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                w41Var3.B = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.T.duration_months) {
                        w41Var3.B = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(w41Var3);
        th.A(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(f.a(2, getThemedColor(g6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(w41.A(3, null));
        if (!this.S && this.U.end_date == 0) {
            w41 e10 = w41.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e10.f34306r = true;
            arrayList.add(e10);
            arrayList.add(w41.A(5, null));
        }
        arrayList.add(w41.A(6, null));
        arrayList.add(w41.A(7, null));
    }

    public final TL_payments.starRefProgram F0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void H0(boolean z10) {
        int i10;
        int i11;
        jh.n nVar = this.P;
        if (!this.S && this.U.end_date == 0) {
            i10 = R.string.AffiliateProgramUpdate;
        } else {
            i10 = R.string.AffiliateProgramStart;
        }
        nVar.g(LocaleController.getString(i10), z10, true);
        d dVar = this.R;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
        y80 y80Var = this.Q;
        if (!this.S && this.U.end_date == 0) {
            i11 = R.string.AffiliateProgramUpdateInfo;
        } else {
            i11 = R.string.AffiliateProgramStartInfo;
        }
        y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), new d(this, 2)));
        I0();
        e eVar = this.Y;
        if (eVar != null) {
            eVar.N(z10);
        }
    }

    public final void I0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        jh.n nVar = this.P;
        TL_payments.starRefProgram starrefprogram2 = this.U;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.T) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z10 = true;
        } else {
            z10 = false;
        }
        nVar.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        new op0(this, context, 8).setBackgroundColor(g6.w0(null, g6.f23151i5, false));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        frameLayout.setClickable(true);
        dg.i iVar = new dg.i(context, 1, 3);
        this.N = iVar;
        dg.a aVar = iVar.f5590b;
        aVar.f5568w = g6.fk;
        aVar.f5569x = g6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.f45016e);
        this.M.addView(this.N, f6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.M, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        this.O.setBackgroundColor(getThemedColor(g6.f23062d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(g6.f23063d7));
        this.O.addView(view, new LinearLayout.LayoutParams(f6.z(-1.0f), f6.z(1.0f / AndroidUtilities.density)));
        jh.n nVar = new jh.n(2, context, this.resourceProvider, true);
        nVar.setRoundRadius(24);
        this.P = nVar;
        nVar.g(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.P.setOnClickListener(new org.telegram.ui.web.c(1, this, context));
        this.O.addView(this.P, f6.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        y80 y80Var = new y80(context, this.resourceProvider);
        this.Q = y80Var;
        y80Var.setTextColor(getThemedColor(g6.f23450z6));
        this.Q.setLinkTextColor(getThemedColor(g6.gc));
        this.Q.setTextSize(1, 12.0f);
        this.Q.setGravity(17);
        this.O.addView(this.Q, f6.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        H0(false);
        ((FrameLayout) this.fragmentView).addView(this.O, f6.e(-1, -2, 87));
        this.f45015c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.f45015c.setOnItemClickListener(new bg.o(this, 19));
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.f45015c.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(g6.f23062d6);
    }

    @Override
    public final f2.p0 n0() {
        e eVar = new e(this, this.f45015c, getParentActivity(), this.currentAccount, this.classGuid, new t4(this, 7), getResourceProvider());
        this.Y = eVar;
        return eVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.X = true;
        this.S = true;
        this.U = F0();
        this.T = null;
        MessagesController messagesController = getMessagesController();
        long j10 = this.L;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        if (userFull != null) {
            this.S = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.U = starrefprogram;
            if (starrefprogram == null) {
                this.S = true;
                this.U = F0();
                this.T = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.T = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.U;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                getMessagesController().loadFullUser(user, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.X = false;
        AndroidUtilities.cancelRunOnUIThread(this.R);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f45015c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.f45015c.setClipToPadding(false);
        this.O.setPadding(0, 0, 0, i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        dg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        dg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override
    public final cg.s2 p0() {
        cg.h hVar = new cg.h(getParentActivity(), 4);
        hVar.b();
        return hVar;
    }

    @Override
    public final View r0(Context context) {
        throw null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
