package pf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import kh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z41;
import org.telegram.ui.cb;
import org.telegram.ui.eb0;
import org.telegram.ui.xe1;
public final class t1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public i51 f45781a;
    public LinearLayout f45782b;
    public eb0 f45783c;
    public boolean d;
    public String f45784e;
    public String f45785f;
    public boolean h;
    public String f45786n;

    public static void T(t1 t1Var, l41 l41Var, View view) {
        if (l41Var.d == -1) {
            boolean z10 = t1Var.h;
            t1Var.h = !z10;
            if (!z10) {
                String str = t1Var.f45785f;
                t1Var.f45786n = str;
                eb0 eb0Var = t1Var.f45783c;
                if (eb0Var != null) {
                    eb0Var.run(str);
                }
            }
            ((t8) view).setChecked(t1Var.h);
            t1Var.f45781a.U2.N(true);
        } else if (view.isEnabled()) {
            u1 b10 = u1.b(t1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i9 = l41Var.d;
            if (i9 >= 0) {
                b10.g();
                if (i9 < arrayList.size()) {
                    b10.g();
                    t1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(l41Var.d)).f22518id;
                    t1Var.f45786n = str2;
                    eb0 eb0Var2 = t1Var.f45783c;
                    if (eb0Var2 != null) {
                        eb0Var2.run(str2);
                    }
                    if (t1Var.d) {
                        t1Var.actionBar.h(true);
                    }
                    t1Var.f45781a.U2.N(true);
                }
            }
        }
    }

    public static void U(t1 t1Var, ArrayList arrayList, z41 z41Var) {
        boolean z10;
        boolean z11;
        if (t1Var.d && !TextUtils.isEmpty(t1Var.f45784e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1 b10 = u1.b(t1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            z41Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            l41 l41Var = new l41(9);
            l41Var.d = -1;
            l41Var.f30339l = string;
            l41Var.K(t1Var.h);
            arrayList.add(l41Var);
            z41Var.T();
            arrayList.add(l41.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(t1Var.f45786n, true))));
        }
        z41Var.U();
        if (!z10) {
            j2.l(R.string.TimezoneHeader, arrayList);
        }
        int i9 = 0;
        boolean z12 = true;
        while (true) {
            b10.g();
            if (i9 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i9);
            CharSequence e10 = u1.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(t1Var.f45784e).toLowerCase();
                if (org.telegram.messenger.l0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = AndroidUtilities.highlightText(e10, t1Var.f45784e, t1Var.resourceProvider);
                } else {
                    i9++;
                }
            }
            String f10 = u1.f(tL_timezone);
            l41 l41Var2 = new l41(10);
            l41Var2.d = i9;
            l41Var2.f30339l = e10;
            l41Var2.f30341n = f10;
            l41Var2.K(TextUtils.equals(tL_timezone.f22518id, t1Var.f45786n));
            if (t1Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            l41Var2.f30335g = z11;
            arrayList.add(l41Var2);
            z12 = false;
            i9++;
        }
        z41Var.T();
        if (z12) {
            arrayList.add(l41.l(t1Var.f45782b));
        } else {
            arrayList.add(l41.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 12));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 19);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        i51 i51Var = new i51(this, new b8(this, 23), new kh.p(this, 19), null);
        this.f45781a = i51Var;
        i51Var.p1();
        this.actionBar.setAdaptiveBackground(this.f45781a);
        frameLayout.addView(this.f45781a, e6.c(-1.0f, -1));
        this.f45781a.setOnScrollListener(new kn(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f45782b = linearLayout;
        linearLayout.setOrientation(1);
        this.f45782b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        o9 o9Var = new o9(context);
        o9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(o9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f45782b.addView(o9Var, e6.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        ll.n(f6.f23369y6, this.resourceProvider, textView, 1, 15.0f);
        this.f45782b.addView(textView, e6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        i51 i51Var;
        z41 z41Var;
        if (i9 == NotificationCenter.timezonesUpdated && (i51Var = this.f45781a) != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = u1.b(this.currentAccount).c();
        this.f45785f = c10;
        this.h = TextUtils.equals(c10, this.f45786n);
        getNotificationCenter().addObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f45781a.setPadding(0, 0, 0, i12);
        this.f45781a.setClipToPadding(false);
    }
}
