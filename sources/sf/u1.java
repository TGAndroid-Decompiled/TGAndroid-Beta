package sf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.bb;
import org.telegram.ui.th;
import org.telegram.ui.yu0;
public final class u1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public u51 f47963a;
    public LinearLayout f47964b;
    public yu0 f47965c;
    public boolean d;
    public String f47966e;
    public String f47967f;
    public boolean h;
    public String f47968n;

    public static void U(u1 u1Var, w41 w41Var, View view) {
        if (w41Var.d == -1) {
            boolean z10 = u1Var.h;
            u1Var.h = !z10;
            if (!z10) {
                String str = u1Var.f47967f;
                u1Var.f47968n = str;
                yu0 yu0Var = u1Var.f47965c;
                if (yu0Var != null) {
                    yu0Var.run(str);
                }
            }
            ((q8) view).setChecked(u1Var.h);
            u1Var.f47963a.U2.N(true);
        } else if (view.isEnabled()) {
            v1 b10 = v1.b(u1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = w41Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    u1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(w41Var.d)).f22530id;
                    u1Var.f47968n = str2;
                    yu0 yu0Var2 = u1Var.f47965c;
                    if (yu0Var2 != null) {
                        yu0Var2.run(str2);
                    }
                    if (u1Var.d) {
                        u1Var.actionBar.h(true);
                    }
                    u1Var.f47963a.U2.N(true);
                }
            }
        }
    }

    public static void V(u1 u1Var, ArrayList arrayList, k51 k51Var) {
        boolean z10;
        boolean z11;
        if (u1Var.d && !TextUtils.isEmpty(u1Var.f47966e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        v1 b10 = v1.b(u1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            k51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            w41 w41Var = new w41(9);
            w41Var.d = -1;
            w41Var.f34300l = string;
            w41Var.K(u1Var.h);
            arrayList.add(w41Var);
            k51Var.T();
            arrayList.add(w41.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(u1Var.f47968n, true))));
        }
        k51Var.U();
        if (!z10) {
            th.p(R.string.TimezoneHeader, arrayList);
        }
        int i10 = 0;
        boolean z12 = true;
        while (true) {
            b10.g();
            if (i10 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i10);
            CharSequence e10 = v1.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(u1Var.f47966e).toLowerCase();
                if (x3.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = AndroidUtilities.highlightText(e10, u1Var.f47966e, u1Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f9 = v1.f(tL_timezone);
            w41 w41Var2 = new w41(10);
            w41Var2.d = i10;
            w41Var2.f34300l = e10;
            w41Var2.f34302n = f9;
            w41Var2.K(TextUtils.equals(tL_timezone.f22530id, u1Var.f47968n));
            if (u1Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            w41Var2.f34296g = z11;
            arrayList.add(w41Var2);
            z12 = false;
            i10++;
        }
        k51Var.T();
        if (z12) {
            arrayList.add(w41.l(u1Var.f47964b));
        } else {
            arrayList.add(w41.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 13));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 19);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        u51 u51Var = new u51(this, new t4(this, 24), new f1(this, 1), null);
        this.f47963a = u51Var;
        u51Var.p1();
        this.actionBar.setAdaptiveBackground(this.f47963a);
        frameLayout.addView(this.f47963a, f6.c(-1.0f, -1));
        this.f47963a.setOnScrollListener(new h00(this, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f47964b = linearLayout;
        linearLayout.setOrientation(1);
        this.f47964b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        t9 t9Var = new t9(context);
        t9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(t9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f47964b.addView(t9Var, f6.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        org.telegram.ui.b.m(g6.f23433y6, this.resourceProvider, textView, 1, 15.0f);
        this.f47964b.addView(textView, f6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u51 u51Var;
        k51 k51Var;
        if (i10 == NotificationCenter.timezonesUpdated && (u51Var = this.f47963a) != null && (k51Var = u51Var.U2) != null) {
            k51Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c3 = v1.b(this.currentAccount).c();
        this.f47967f = c3;
        this.h = TextUtils.equals(c3, this.f47968n);
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
        this.f47963a.setPadding(0, 0, 0, i13);
        this.f47963a.setClipToPadding(false);
    }
}
