package uf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ai;
import org.telegram.ui.hb;
import ph.d4;
import ph.z8;
public final class r1 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public g61 f45493a;
    public LinearLayout f45494b;
    public ph.s1 f45495c;
    public boolean d;
    public String e;
    public String f45496f;
    public boolean h;
    public String f45497n;

    public static void U(r1 r1Var, i51 i51Var, View view) {
        if (i51Var.d == -1) {
            boolean z4 = r1Var.h;
            r1Var.h = !z4;
            if (!z4) {
                String str = r1Var.f45496f;
                r1Var.f45497n = str;
                ph.s1 s1Var = r1Var.f45495c;
                if (s1Var != null) {
                    s1Var.run(str);
                }
            }
            ((r8) view).setChecked(r1Var.h);
            r1Var.f45493a.V2.N(true);
        } else if (view.isEnabled()) {
            s1 b10 = s1.b(r1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = i51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    r1Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(i51Var.d)).f19297id;
                    r1Var.f45497n = str2;
                    ph.s1 s1Var2 = r1Var.f45495c;
                    if (s1Var2 != null) {
                        s1Var2.run(str2);
                    }
                    if (r1Var.d) {
                        r1Var.actionBar.h(true);
                    }
                    r1Var.f45493a.V2.N(true);
                }
            }
        }
    }

    public static void V(r1 r1Var, ArrayList arrayList, w51 w51Var) {
        boolean z4;
        boolean z10;
        if (r1Var.d && !TextUtils.isEmpty(r1Var.e)) {
            z4 = true;
        } else {
            z4 = false;
        }
        s1 b10 = s1.b(r1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z4) {
            w51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            i51 i51Var = new i51(9);
            i51Var.d = -1;
            i51Var.f25585l = string;
            i51Var.K(r1Var.h);
            arrayList.add(i51Var);
            w51Var.T();
            arrayList.add(i51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(r1Var.f45497n, true))));
        }
        w51Var.U();
        if (!z4) {
            ai.q(R.string.TimezoneHeader, arrayList);
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
            CharSequence e = s1.e(tL_timezone, false);
            if (z4) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(r1Var.e).toLowerCase();
                if (y3.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, r1Var.e, r1Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f10 = s1.f(tL_timezone);
            i51 i51Var2 = new i51(10);
            i51Var2.d = i10;
            i51Var2.f25585l = e;
            i51Var2.f25587n = f10;
            i51Var2.K(TextUtils.equals(tL_timezone.f19297id, r1Var.f45497n));
            if (r1Var.h && !z4) {
                z10 = false;
            } else {
                z10 = true;
            }
            i51Var2.f25581g = z10;
            arrayList.add(i51Var2);
            z11 = false;
            i10++;
        }
        w51Var.T();
        if (z11) {
            arrayList.add(i51.l(r1Var.f45494b));
        } else {
            arrayList.add(i51.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new sh.e(this, 13));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.E = new hb(this, 19);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19827a7, false));
        g61 g61Var = new g61(this, new d4(this, 24), new z8(this, 10), null);
        this.f45493a = g61Var;
        g61Var.o1();
        this.actionBar.setAdaptiveBackground(this.f45493a);
        frameLayout.addView(this.f45493a, b6.c(-1.0f, -1));
        this.f45493a.setOnScrollListener(new mb0(this, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f45494b = linearLayout;
        linearLayout.setOrientation(1);
        this.f45494b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        p9 p9Var = new p9(context);
        p9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(p9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f45494b.addView(p9Var, b6.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        org.telegram.ui.b.l(j6.f20256y6, this.resourceProvider, textView, 1, 15.0f);
        this.f45494b.addView(textView, b6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g61 g61Var;
        w51 w51Var;
        if (i10 == NotificationCenter.timezonesUpdated && (g61Var = this.f45493a) != null && (w51Var = g61Var.V2) != null) {
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
        this.f45496f = c3;
        this.h = TextUtils.equals(c3, this.f45497n);
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
        this.f45493a.setPadding(0, 0, 0, i13);
        this.f45493a.setClipToPadding(false);
    }
}
