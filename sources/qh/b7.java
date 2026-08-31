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
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.hb0;
import org.telegram.ui.yh;
public final class b7 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public x6 U;
    public final org.telegram.ui.Cells.i3 V;
    public final org.telegram.ui.Cells.i3 W;
    public final FrameLayout X;
    public final d Y;
    public boolean Z;
    public boolean f45005a0;
    public org.telegram.ui.web.v1 f45006b0;
    public long f45007c0;
    public TLRPC.WebPage f45008d0;
    public boolean f45009e0;
    public int f45010f0;
    public String f45011g0;
    public final u6 f45012h0;
    public Pattern f45013i0;
    public boolean f45014j0;
    public boolean f45015k0;
    public boolean f45016l0;

    public b7(Context context, q4 q4Var, j5 j5Var, org.telegram.ui.web.v1 v1Var) {
        super(context, null, true, false, false, false, true, 2, q4Var);
        this.f45012h0 = new u6(this, 0);
        this.f45006b0 = v1Var;
        fixNavigationBar();
        J();
        this.F = AndroidUtilities.dp(4.0f);
        this.G = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, q4Var);
        this.V = i3Var;
        u6 u6Var = new u6(this, 1);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f22955b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.t2(u6Var, 2));
        g3Var.setHandlesColor(-12476440);
        g3Var.setCursorColor(-11230757);
        g3Var.setText("https://");
        g3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        yh.p(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.b.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21857o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.k6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, l1, l12, l12));
        k7.e6.b(textView, 0.1f, 1.5f);
        i3Var.addView(textView, k7.c6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        d6 d6Var = new d6(3, this, textView);
        textView.setOnClickListener(new hb0(29, this, d6Var));
        d6Var.run();
        g3Var.addTextChangedListener(new v6(this, d6Var));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, q4Var);
        this.W = i3Var2;
        u6 u6Var2 = new u6(this, 1);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.f22955b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.t2(u6Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        d dVar = new d(context, q4Var, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new t6(this, 1));
        dVar.setEnabled(V(i3Var.getText().toString()));
        frameLayout.addView(dVar, k7.c6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.L = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        w6 w6Var = new w6(this);
        w6Var.f5910m = false;
        w6Var.C = false;
        w6Var.o(pr.h);
        w6Var.n(350L);
        this.d.setItemAnimator(w6Var);
        tl0 tl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new oh.d0(this, context, j5Var, 3));
        x6 x6Var = this.U;
        if (x6Var != null) {
            x6Var.N(false);
        }
    }

    public static void P(b7 b7Var, Context context, j5 j5Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.i3 i3Var = b7Var.W;
        org.telegram.ui.Cells.i3 i3Var2 = b7Var.V;
        j51 G = b7Var.U.G(i10 - 1);
        if (G != null) {
            if (G.G(z6.class) && (webPage = b7Var.f45008d0) != null && !W(webPage)) {
                eg.w3 w3Var = new eg.w3(context, b7Var.currentAccount);
                eg.d1 d1Var = new eg.d1();
                d1Var.f5153c = i3Var2.f22955b.getText().toString();
                if (b7Var.f45014j0) {
                    str = i3Var.f22955b.getText().toString();
                } else {
                    str = null;
                }
                d1Var.f5152b = str;
                TLRPC.WebPage webPage2 = b7Var.f45008d0;
                d1Var.d = webPage2;
                d1Var.f5154e = b7Var.f45016l0;
                d1Var.f5155f = b7Var.f45015k0;
                org.telegram.ui.web.d1 d1Var2 = new org.telegram.ui.web.d1(b7Var, 10);
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
                w3Var.f5532e.setImageDrawable(new eg.i1(j5Var, 1));
                w3Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.s8)) {
                boolean z4 = !b7Var.f45014j0;
                b7Var.f45014j0 = z4;
                ((org.telegram.ui.Cells.s8) view).setChecked(z4);
                b7Var.U.N(true);
                if (b7Var.f45014j0) {
                    i3Var.requestFocus();
                } else {
                    i3Var2.requestFocus();
                }
            }
        }
    }

    public static void Q(b7 b7Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = b7Var.V.f22955b.getText().toString();
        b7Var.f45010f0 = ConnectionsManager.getInstance(b7Var.currentAccount).sendRequest(getwebpagepreview, new gf.a(b7Var, 18));
    }

    public static void R(qh.b7 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: qh.b7.R(qh.b7, org.telegram.tgnet.TLObject):void");
    }

    public static void S(b7 b7Var, String str) {
        u6 u6Var = b7Var.f45012h0;
        if (str == null || TextUtils.equals(str, b7Var.f45011g0)) {
            return;
        }
        b7Var.f45011g0 = str;
        boolean V = b7Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        if (V) {
            if (!b7Var.f45009e0 || b7Var.f45008d0 != null) {
                b7Var.f45009e0 = true;
                b7Var.f45008d0 = null;
                x6 x6Var = b7Var.U;
                if (x6Var != null) {
                    x6Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(u6Var, 700L);
        } else if (b7Var.f45009e0 || b7Var.f45008d0 != null) {
            b7Var.f45009e0 = false;
            b7Var.f45008d0 = null;
            if (b7Var.f45010f0 != 0) {
                ConnectionsManager.getInstance(b7Var.currentAccount).cancelRequest(b7Var.f45010f0, true);
                b7Var.f45010f0 = 0;
            }
            x6 x6Var2 = b7Var.U;
            if (x6Var2 != null) {
                x6Var2.N(true);
            }
        }
        b7Var.Y.setEnabled(V);
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
        this.f45009e0 = false;
        this.f45008d0 = null;
        if (this.f45010f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45010f0, true);
            this.f45010f0 = 0;
        }
        x6 x6Var = this.U;
        if (x6Var != null) {
            x6Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f45013i0 == null) {
            this.f45013i0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f45013i0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.Y.T) {
            return;
        }
        if (this.f45006b0 != null) {
            eg.d1 d1Var = new eg.d1();
            d1Var.f5153c = this.V.f22955b.getText().toString();
            if (this.f45014j0) {
                str = this.W.f22955b.getText().toString();
            } else {
                str = null;
            }
            d1Var.f5152b = str;
            d1Var.d = this.f45008d0;
            d1Var.f5154e = this.f45016l0;
            d1Var.f5155f = this.f45015k0;
            this.f45006b0.run(d1Var);
            this.f45006b0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f45007c0 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && this.f45007c0 == webPage.f20996id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f45008d0 = webPage;
                    this.f45009e0 = false;
                    this.f45007c0 = 0L;
                    x6 x6Var = this.U;
                    if (x6Var != null) {
                        x6Var.N(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.V.f22955b);
        AndroidUtilities.hideKeyboard(this.W.f22955b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new u6(this, 2), 150L);
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        ?? x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new d4(this, 2), this.resourcesProvider);
        this.U = x51Var;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
