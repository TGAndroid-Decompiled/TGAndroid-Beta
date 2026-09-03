package vf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w51;
import org.telegram.ui.fb;
import org.telegram.ui.web.a2;
import org.telegram.ui.yh;
import qh.c4;
public final class r1 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public h61 f49220a;
    public LinearLayout f49221b;
    public a2 f49222c;
    public boolean d;
    public String f49223e;
    public String f49224f;
    public boolean h;
    public String f49225n;

    public static void U(r1 r1Var, h51 h51Var, View view) {
        if (h51Var.d == -1) {
            boolean z4 = r1Var.h;
            r1Var.h = !z4;
            if (!z4) {
                String str = r1Var.f49224f;
                r1Var.f49225n = str;
                a2 a2Var = r1Var.f49222c;
                if (a2Var != null) {
                    a2Var.run(str);
                }
            }
            ((s8) view).setChecked(r1Var.h);
            r1Var.f49220a.V2.N(true);
        } else if (view.isEnabled()) {
            s1 b10 = s1.b(r1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = h51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    r1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(h51Var.d)).f20983id;
                    r1Var.f49225n = str2;
                    a2 a2Var2 = r1Var.f49222c;
                    if (a2Var2 != null) {
                        a2Var2.run(str2);
                    }
                    if (r1Var.d) {
                        r1Var.actionBar.h(true);
                    }
                    r1Var.f49220a.V2.N(true);
                }
            }
        }
    }

    public static void V(r1 r1Var, ArrayList arrayList, w51 w51Var) {
        boolean z4;
        boolean z10;
        if (r1Var.d && !TextUtils.isEmpty(r1Var.f49223e)) {
            z4 = true;
        } else {
            z4 = false;
        }
        s1 b10 = s1.b(r1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z4) {
            w51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            h51 h51Var = new h51(9);
            h51Var.d = -1;
            h51Var.f27375l = string;
            h51Var.K(r1Var.h);
            arrayList.add(h51Var);
            w51Var.T();
            arrayList.add(h51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(r1Var.f49225n, true))));
        }
        w51Var.U();
        if (!z4) {
            yh.r(R.string.TimezoneHeader, arrayList);
        }
        int i10 = 0;
        boolean z11 = true;
        while (true) {
            b10.g();
            if (i10 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i10);
            CharSequence e6 = s1.e(tL_timezone, false);
            if (z4) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(r1Var.f49223e).toLowerCase();
                if (y3.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e6 = AndroidUtilities.highlightText(e6, r1Var.f49223e, r1Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f10 = s1.f(tL_timezone);
            h51 h51Var2 = new h51(10);
            h51Var2.d = i10;
            h51Var2.f27375l = e6;
            h51Var2.f27377n = f10;
            h51Var2.K(TextUtils.equals(tL_timezone.f20983id, r1Var.f49225n));
            if (r1Var.h && !z4) {
                z10 = false;
            } else {
                z10 = true;
            }
            h51Var2.f27371g = z10;
            arrayList.add(h51Var2);
            z11 = false;
            i10++;
        }
        w51Var.T();
        if (z11) {
            arrayList.add(h51.l(r1Var.f49221b));
        } else {
            arrayList.add(h51.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 13));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 19);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21607a7, false));
        h61 h61Var = new h61(this, new c4(this, 24), new sf.h(this, 9), null);
        this.f49220a = h61Var;
        h61Var.o1();
        this.actionBar.setAdaptiveBackground(this.f49220a);
        frameLayout.addView(this.f49220a, c6.c(-1.0f, -1));
        this.f49220a.setOnScrollListener(new nb0(this, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49221b = linearLayout;
        linearLayout.setOrientation(1);
        this.f49221b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        p9 p9Var = new p9(context);
        p9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(p9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f49221b.addView(p9Var, c6.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        org.telegram.ui.b.l(k6.f22038y6, this.resourceProvider, textView, 1, 15.0f);
        this.f49221b.addView(textView, c6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h61 h61Var;
        w51 w51Var;
        if (i10 == NotificationCenter.timezonesUpdated && (h61Var = this.f49220a) != null && (w51Var = h61Var.V2) != null) {
            w51Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c3 = s1.b(this.currentAccount).c();
        this.f49224f = c3;
        this.h = TextUtils.equals(c3, this.f49225n);
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
        this.f49220a.setPadding(0, 0, 0, i13);
        this.f49220a.setClipToPadding(false);
    }
}
