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
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.fb;
import org.telegram.ui.web.v1;
import org.telegram.ui.yh;
import qh.d4;
public final class r1 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public i61 f49183a;
    public LinearLayout f49184b;
    public v1 f49185c;
    public boolean d;
    public String f49186e;
    public String f49187f;
    public boolean h;
    public String f49188n;

    public static void U(r1 r1Var, j51 j51Var, View view) {
        if (j51Var.d == -1) {
            boolean z4 = r1Var.h;
            r1Var.h = !z4;
            if (!z4) {
                String str = r1Var.f49187f;
                r1Var.f49188n = str;
                v1 v1Var = r1Var.f49185c;
                if (v1Var != null) {
                    v1Var.run(str);
                }
            }
            ((s8) view).setChecked(r1Var.h);
            r1Var.f49183a.V2.N(true);
        } else if (view.isEnabled()) {
            s1 b10 = s1.b(r1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = j51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    r1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(j51Var.d)).f20981id;
                    r1Var.f49188n = str2;
                    v1 v1Var2 = r1Var.f49185c;
                    if (v1Var2 != null) {
                        v1Var2.run(str2);
                    }
                    if (r1Var.d) {
                        r1Var.actionBar.h(true);
                    }
                    r1Var.f49183a.V2.N(true);
                }
            }
        }
    }

    public static void V(r1 r1Var, ArrayList arrayList, x51 x51Var) {
        boolean z4;
        boolean z10;
        if (r1Var.d && !TextUtils.isEmpty(r1Var.f49186e)) {
            z4 = true;
        } else {
            z4 = false;
        }
        s1 b10 = s1.b(r1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z4) {
            x51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            j51 j51Var = new j51(9);
            j51Var.d = -1;
            j51Var.f28014l = string;
            j51Var.K(r1Var.h);
            arrayList.add(j51Var);
            x51Var.T();
            arrayList.add(j51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(r1Var.f49188n, true))));
        }
        x51Var.U();
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
                String lowerCase = AndroidUtilities.translitSafe(r1Var.f49186e).toLowerCase();
                if (y3.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e6 = AndroidUtilities.highlightText(e6, r1Var.f49186e, r1Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f10 = s1.f(tL_timezone);
            j51 j51Var2 = new j51(10);
            j51Var2.d = i10;
            j51Var2.f28014l = e6;
            j51Var2.f28016n = f10;
            j51Var2.K(TextUtils.equals(tL_timezone.f20981id, r1Var.f49188n));
            if (r1Var.h && !z4) {
                z10 = false;
            } else {
                z10 = true;
            }
            j51Var2.f28010g = z10;
            arrayList.add(j51Var2);
            z11 = false;
            i10++;
        }
        x51Var.T();
        if (z11) {
            arrayList.add(j51.l(r1Var.f49184b));
        } else {
            arrayList.add(j51.B(null));
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
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21605a7, false));
        i61 i61Var = new i61(this, new d4(this, 24), new sf.g(this, 9), null);
        this.f49183a = i61Var;
        i61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f49183a);
        frameLayout.addView(this.f49183a, c6.c(-1.0f, -1));
        this.f49183a.setOnScrollListener(new nb0(this, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49184b = linearLayout;
        linearLayout.setOrientation(1);
        this.f49184b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        p9 p9Var = new p9(context);
        p9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(p9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f49184b.addView(p9Var, c6.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        org.telegram.ui.b.l(k6.f22036y6, this.resourceProvider, textView, 1, 15.0f);
        this.f49184b.addView(textView, c6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i61 i61Var;
        x51 x51Var;
        if (i10 == NotificationCenter.timezonesUpdated && (i61Var = this.f49183a) != null && (x51Var = i61Var.V2) != null) {
            x51Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c3 = s1.b(this.currentAccount).c();
        this.f49187f = c3;
        this.h = TextUtils.equals(c3, this.f49188n);
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
        this.f49183a.setPadding(0, 0, 0, i13);
        this.f49183a.setClipToPadding(false);
    }
}
