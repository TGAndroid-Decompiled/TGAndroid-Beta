package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.hb0;
import org.telegram.ui.yh;
public final class a7 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public w6 U;
    public final org.telegram.ui.Cells.i3 V;
    public final org.telegram.ui.Cells.i3 W;
    public final FrameLayout X;
    public final d Y;
    public boolean Z;
    public boolean f44982a0;
    public org.telegram.ui.web.a2 f44983b0;
    public long f44984c0;
    public TLRPC.WebPage f44985d0;
    public boolean f44986e0;
    public int f44987f0;
    public String f44988g0;
    public final t6 f44989h0;
    public Pattern f44990i0;
    public boolean f44991j0;
    public boolean f44992k0;
    public boolean f44993l0;

    public a7(Context context, p4 p4Var, i5 i5Var, org.telegram.ui.web.a2 a2Var) {
        super(context, null, true, false, false, false, true, 2, p4Var);
        this.f44989h0 = new t6(this, 0);
        this.f44983b0 = a2Var;
        fixNavigationBar();
        J();
        this.F = AndroidUtilities.dp(4.0f);
        this.G = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, p4Var);
        this.V = i3Var;
        t6 t6Var = new t6(this, 1);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f22957b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.t2(t6Var, 2));
        g3Var.setHandlesColor(-12476440);
        g3Var.setCursorColor(-11230757);
        g3Var.setText("https://");
        g3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        yh.p(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.b.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21859o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.k6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, l1, l12, l12));
        k7.e6.b(textView, 0.1f, 1.5f);
        i3Var.addView(textView, k7.c6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        l6 l6Var = new l6(2, this, textView);
        textView.setOnClickListener(new hb0(29, this, l6Var));
        l6Var.run();
        g3Var.addTextChangedListener(new u6(this, l6Var));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, p4Var);
        this.W = i3Var2;
        t6 t6Var2 = new t6(this, 1);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.f22957b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.t2(t6Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        d dVar = new d(context, p4Var, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new s6(this, 1));
        dVar.setEnabled(V(i3Var.getText().toString()));
        frameLayout.addView(dVar, k7.c6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.L = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        v6 v6Var = new v6(this);
        v6Var.f5910m = false;
        v6Var.C = false;
        v6Var.o(pr.h);
        v6Var.n(350L);
        this.d.setItemAnimator(v6Var);
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new oh.d0(this, context, i5Var, 3));
        w6 w6Var = this.U;
        if (w6Var != null) {
            w6Var.N(false);
        }
    }

    public static void P(a7 a7Var, Context context, i5 i5Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.i3 i3Var = a7Var.W;
        org.telegram.ui.Cells.i3 i3Var2 = a7Var.V;
        h51 G = a7Var.U.G(i10 - 1);
        if (G != null) {
            if (G.G(y6.class) && (webPage = a7Var.f44985d0) != null && !W(webPage)) {
                eg.w3 w3Var = new eg.w3(context, a7Var.currentAccount);
                eg.d1 d1Var = new eg.d1();
                d1Var.f5153c = i3Var2.f22957b.getText().toString();
                if (a7Var.f44991j0) {
                    str = i3Var.f22957b.getText().toString();
                } else {
                    str = null;
                }
                d1Var.f5152b = str;
                TLRPC.WebPage webPage2 = a7Var.f44985d0;
                d1Var.d = webPage2;
                d1Var.f5154e = a7Var.f44993l0;
                d1Var.f5155f = a7Var.f44992k0;
                org.telegram.ui.web.d1 d1Var2 = new org.telegram.ui.web.d1(a7Var, 10);
                w3Var.D = d1Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                xb0 xb0Var = w3Var.f5538x;
                xb0Var.setVisibility(i11);
                w3Var.f5533f.b(w3Var.f5529a, d1Var, false);
                w3Var.f5537w.a(!d1Var.f5155f, false);
                xb0Var.a(!d1Var.f5154e, false);
                w3Var.E = d1Var2;
                w3Var.f5532e.setImageDrawable(new eg.i1(i5Var, 1));
                w3Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.s8)) {
                boolean z4 = !a7Var.f44991j0;
                a7Var.f44991j0 = z4;
                ((org.telegram.ui.Cells.s8) view).setChecked(z4);
                a7Var.U.N(true);
                if (a7Var.f44991j0) {
                    i3Var.requestFocus();
                } else {
                    i3Var2.requestFocus();
                }
            }
        }
    }

    public static void Q(a7 a7Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = a7Var.V.f22957b.getText().toString();
        a7Var.f44987f0 = ConnectionsManager.getInstance(a7Var.currentAccount).sendRequest(getwebpagepreview, new gf.a(a7Var, 18));
    }

    public static void R(qh.a7 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: qh.a7.R(qh.a7, org.telegram.tgnet.TLObject):void");
    }

    public static void S(a7 a7Var, String str) {
        t6 t6Var = a7Var.f44989h0;
        if (str == null || TextUtils.equals(str, a7Var.f44988g0)) {
            return;
        }
        a7Var.f44988g0 = str;
        boolean V = a7Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        if (V) {
            if (!a7Var.f44986e0 || a7Var.f44985d0 != null) {
                a7Var.f44986e0 = true;
                a7Var.f44985d0 = null;
                w6 w6Var = a7Var.U;
                if (w6Var != null) {
                    w6Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(t6Var, 700L);
        } else if (a7Var.f44986e0 || a7Var.f44985d0 != null) {
            a7Var.f44986e0 = false;
            a7Var.f44985d0 = null;
            if (a7Var.f44987f0 != 0) {
                ConnectionsManager.getInstance(a7Var.currentAccount).cancelRequest(a7Var.f44987f0, true);
                a7Var.f44987f0 = 0;
            }
            w6 w6Var2 = a7Var.U;
            if (w6Var2 != null) {
                w6Var2.N(true);
            }
        }
        a7Var.Y.setEnabled(V);
    }

    public static boolean W(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void U() {
        this.f44986e0 = false;
        this.f44985d0 = null;
        if (this.f44987f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f44987f0, true);
            this.f44987f0 = 0;
        }
        w6 w6Var = this.U;
        if (w6Var != null) {
            w6Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f44990i0 == null) {
            this.f44990i0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f44990i0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.Y.T) {
            return;
        }
        if (this.f44983b0 != null) {
            eg.d1 d1Var = new eg.d1();
            d1Var.f5153c = this.V.f22957b.getText().toString();
            if (this.f44991j0) {
                str = this.W.f22957b.getText().toString();
            } else {
                str = null;
            }
            d1Var.f5152b = str;
            d1Var.d = this.f44985d0;
            d1Var.f5154e = this.f44993l0;
            d1Var.f5155f = this.f44992k0;
            this.f44983b0.run(d1Var);
            this.f44983b0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f44984c0 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && this.f44984c0 == webPage.f20998id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f44985d0 = webPage;
                    this.f44986e0 = false;
                    this.f44984c0 = 0L;
                    w6 w6Var = this.U;
                    if (w6Var != null) {
                        w6Var.N(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.V.f22957b);
        AndroidUtilities.hideKeyboard(this.W.f22957b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new t6(this, 2), 150L);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        ?? w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new c4(this, 2), this.resourcesProvider);
        this.U = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
