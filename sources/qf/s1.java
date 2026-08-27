package qf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import lh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.xm;
import org.telegram.ui.db;
import org.telegram.ui.ed1;
import org.telegram.ui.ib0;

public final class s1 extends n2 implements NotificationCenter.NotificationCenterDelegate {

    public k51 f46444a;

    public LinearLayout f46445b;

    public ib0 f46446c;
    public boolean d;

    public String f46447e;

    public String f46448f;
    public boolean h;

    public String f46449n;

    public static void U(s1 s1Var, n41 n41Var, View view) {
        if (n41Var.d == -1) {
            boolean z10 = s1Var.h;
            s1Var.h = !z10;
            if (!z10) {
                String str = s1Var.f46448f;
                s1Var.f46449n = str;
                ib0 ib0Var = s1Var.f46446c;
                if (ib0Var != null) {
                    ib0Var.run(str);
                }
            }
            ((p8) view).setChecked(s1Var.h);
            s1Var.f46444a.U2.N(true);
            return;
        }
        if (view.isEnabled()) {
            t1 t1VarB = t1.b(s1Var.currentAccount);
            ArrayList arrayList = t1VarB.d;
            int i10 = n41Var.d;
            if (i10 >= 0) {
                t1VarB.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                t1VarB.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(n41Var.d);
                s1Var.h = false;
                String str2 = tL_timezone.f22518id;
                s1Var.f46449n = str2;
                ib0 ib0Var2 = s1Var.f46446c;
                if (ib0Var2 != null) {
                    ib0Var2.run(str2);
                }
                if (s1Var.d) {
                    s1Var.actionBar.h(true);
                }
                s1Var.f46444a.U2.N(true);
            }
        }
    }

    public static void V(s1 s1Var, ArrayList arrayList, b51 b51Var) {
        boolean z10;
        boolean z11 = s1Var.d && !TextUtils.isEmpty(s1Var.f46447e);
        t1 t1VarB = t1.b(s1Var.currentAccount);
        ArrayList arrayList2 = t1VarB.d;
        if (!z11) {
            b51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            n41 n41Var = new n41(9);
            n41Var.d = -1;
            n41Var.f30844l = string;
            n41Var.K(s1Var.h);
            arrayList.add(n41Var);
            b51Var.T();
            arrayList.add(n41.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, t1VarB.d(s1Var.f46449n, true))));
        }
        b51Var.U();
        if (!z11) {
            pa.o(R.string.TimezoneHeader, arrayList);
        }
        int i10 = 0;
        boolean z12 = true;
        while (true) {
            t1VarB.g();
            if (i10 >= arrayList2.size()) {
                break;
            }
            t1VarB.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i10);
            CharSequence charSequenceE = t1.e(tL_timezone, false);
            if (z11) {
                String strReplace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(s1Var.f46447e).toLowerCase();
                if (y1.x(" ", lowerCase, strReplace) || strReplace.startsWith(lowerCase)) {
                    charSequenceE = AndroidUtilities.highlightText(charSequenceE, s1Var.f46447e, s1Var.resourceProvider);
                    String strF = t1.f(tL_timezone);
                    n41 n41Var2 = new n41(10);
                    n41Var2.d = i10;
                    n41Var2.f30844l = charSequenceE;
                    n41Var2.f30846n = strF;
                    n41Var2.K(TextUtils.equals(tL_timezone.f22518id, s1Var.f46449n));
                    if (s1Var.h || z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n41Var2.f30840g = z10;
                    arrayList.add(n41Var2);
                    z12 = false;
                }
            } else {
                String strF2 = t1.f(tL_timezone);
                n41 n41Var3 = new n41(10);
                n41Var3.d = i10;
                n41Var3.f30844l = charSequenceE;
                n41Var3.f30846n = strF2;
                n41Var3.K(TextUtils.equals(tL_timezone.f22518id, s1Var.f46449n));
                if (s1Var.h) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                n41Var3.f30840g = z10;
                arrayList.add(n41Var3);
                z12 = false;
            }
            i10++;
        }
        b51Var.T();
        if (z12) {
            arrayList.add(n41.l(s1Var.f46445b));
        } else {
            arrayList.add(n41.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ed1(13, this));
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(1, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new db(this, 19);
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        k51 k51Var = new k51(this, new a8(this, 23), new lh.p(this, 19), null);
        this.f46444a = k51Var;
        k51Var.p1();
        this.actionBar.setAdaptiveBackground(this.f46444a);
        frameLayout.addView(this.f46444a, z5.c(-1.0f, -1));
        this.f46444a.setOnScrollListener(new xm(this, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46445b = linearLayout;
        linearLayout.setOrientation(1);
        this.f46445b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        n9 n9Var = new n9(context);
        n9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(n9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f46445b.addView(n9Var, z5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        rl.l(g6.f23423y6, this.resourceProvider, textView, 1, 15.0f);
        this.f46445b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        b51 b51Var;
        if (i10 != NotificationCenter.timezonesUpdated || (k51Var = this.f46444a) == null || (b51Var = k51Var.U2) == null) {
            return;
        }
        b51Var.N(true);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String strC = t1.b(this.currentAccount).c();
        this.f46448f = strC;
        this.h = TextUtils.equals(strC, this.f46449n);
        getNotificationCenter().addObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f46444a.setPadding(0, 0, 0, i13);
        this.f46444a.setClipToPadding(false);
    }
}
