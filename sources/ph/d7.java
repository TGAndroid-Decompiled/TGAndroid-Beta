package ph;

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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.gb0;
import org.telegram.ui.yh;
public final class d7 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public z6 U;
    public final org.telegram.ui.Cells.i3 V;
    public final org.telegram.ui.Cells.i3 W;
    public final FrameLayout X;
    public final d Y;
    public boolean Z;
    public boolean f41454a0;
    public org.telegram.ui.web.u1 f41455b0;
    public long f41456c0;
    public TLRPC.WebPage f41457d0;
    public boolean f41458e0;
    public int f41459f0;
    public String f41460g0;
    public final w6 f41461h0;
    public Pattern f41462i0;
    public boolean f41463j0;
    public boolean f41464k0;
    public boolean f41465l0;

    public d7(Context context, q4 q4Var, l5 l5Var, org.telegram.ui.web.u1 u1Var) {
        super(context, null, true, false, false, false, true, 2, q4Var);
        this.f41461h0 = new w6(this, 0);
        this.f41455b0 = u1Var;
        fixNavigationBar();
        J();
        this.F = AndroidUtilities.dp(4.0f);
        this.G = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, q4Var);
        this.V = i3Var;
        w6 w6Var = new w6(this, 1);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f21199b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.u2(w6Var, 2));
        g3Var.setHandlesColor(-12476440);
        g3Var.setCursorColor(-11230757);
        g3Var.setText("https://");
        g3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        yh.p(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.b.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20103o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
        k7.d6.b(textView, 0.1f, 1.5f);
        i3Var.addView(textView, k7.b6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        f6 f6Var = new f6(3, this, textView);
        textView.setOnClickListener(new gb0(29, this, f6Var));
        f6Var.run();
        g3Var.addTextChangedListener(new x6(this, f6Var));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, q4Var);
        this.W = i3Var2;
        w6 w6Var2 = new w6(this, 1);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.f21199b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.u2(w6Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        d dVar = new d(context, q4Var, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new v6(this, 1));
        dVar.setEnabled(V(i3Var.getText().toString()));
        frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.L = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        y6 y6Var = new y6(this);
        y6Var.f5818m = false;
        y6Var.C = false;
        y6Var.o(nr.h);
        y6Var.n(350L);
        this.d.setItemAnimator(y6Var);
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new nh.e0(this, context, l5Var, 3));
        z6 z6Var = this.U;
        if (z6Var != null) {
            z6Var.N(false);
        }
    }

    public static void P(d7 d7Var, Context context, l5 l5Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.i3 i3Var = d7Var.W;
        org.telegram.ui.Cells.i3 i3Var2 = d7Var.V;
        i51 G = d7Var.U.G(i10 - 1);
        if (G != null) {
            if (G.G(b7.class) && (webPage = d7Var.f41457d0) != null && !W(webPage)) {
                dg.y3 y3Var = new dg.y3(context, d7Var.currentAccount);
                dg.f1 f1Var = new dg.f1();
                f1Var.f4507c = i3Var2.f21199b.getText().toString();
                if (d7Var.f41463j0) {
                    str = i3Var.f21199b.getText().toString();
                } else {
                    str = null;
                }
                f1Var.f4506b = str;
                TLRPC.WebPage webPage2 = d7Var.f41457d0;
                f1Var.d = webPage2;
                f1Var.e = d7Var.f41465l0;
                f1Var.f4508f = d7Var.f41464k0;
                org.telegram.ui.web.y0 y0Var = new org.telegram.ui.web.y0(d7Var, 10);
                y3Var.D = f1Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                vb0 vb0Var = y3Var.f4870x;
                vb0Var.setVisibility(i11);
                y3Var.f4865f.b(y3Var.f4862a, f1Var, false);
                y3Var.f4869w.a(!f1Var.f4508f, false);
                vb0Var.a(!f1Var.e, false);
                y3Var.E = y0Var;
                y3Var.e.setImageDrawable(new dg.k1(l5Var, 1));
                y3Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.s8)) {
                boolean z4 = !d7Var.f41463j0;
                d7Var.f41463j0 = z4;
                ((org.telegram.ui.Cells.s8) view).setChecked(z4);
                d7Var.U.N(true);
                if (d7Var.f41463j0) {
                    i3Var.requestFocus();
                } else {
                    i3Var2.requestFocus();
                }
            }
        }
    }

    public static void Q(d7 d7Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = d7Var.V.f21199b.getText().toString();
        d7Var.f41459f0 = ConnectionsManager.getInstance(d7Var.currentAccount).sendRequest(getwebpagepreview, new gf.a(d7Var, 18));
    }

    public static void R(ph.d7 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: ph.d7.R(ph.d7, org.telegram.tgnet.TLObject):void");
    }

    public static void S(d7 d7Var, String str) {
        w6 w6Var = d7Var.f41461h0;
        if (str == null || TextUtils.equals(str, d7Var.f41460g0)) {
            return;
        }
        d7Var.f41460g0 = str;
        boolean V = d7Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(w6Var);
        if (V) {
            if (!d7Var.f41458e0 || d7Var.f41457d0 != null) {
                d7Var.f41458e0 = true;
                d7Var.f41457d0 = null;
                z6 z6Var = d7Var.U;
                if (z6Var != null) {
                    z6Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(w6Var, 700L);
        } else if (d7Var.f41458e0 || d7Var.f41457d0 != null) {
            d7Var.f41458e0 = false;
            d7Var.f41457d0 = null;
            if (d7Var.f41459f0 != 0) {
                ConnectionsManager.getInstance(d7Var.currentAccount).cancelRequest(d7Var.f41459f0, true);
                d7Var.f41459f0 = 0;
            }
            z6 z6Var2 = d7Var.U;
            if (z6Var2 != null) {
                z6Var2.N(true);
            }
        }
        d7Var.Y.setEnabled(V);
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
        this.f41458e0 = false;
        this.f41457d0 = null;
        if (this.f41459f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f41459f0, true);
            this.f41459f0 = 0;
        }
        z6 z6Var = this.U;
        if (z6Var != null) {
            z6Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f41462i0 == null) {
            this.f41462i0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f41462i0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.Y.T) {
            return;
        }
        if (this.f41455b0 != null) {
            dg.f1 f1Var = new dg.f1();
            f1Var.f4507c = this.V.f21199b.getText().toString();
            if (this.f41463j0) {
                str = this.W.f21199b.getText().toString();
            } else {
                str = null;
            }
            f1Var.f4506b = str;
            f1Var.d = this.f41457d0;
            f1Var.e = this.f41465l0;
            f1Var.f4508f = this.f41464k0;
            this.f41455b0.run(f1Var);
            this.f41455b0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f41456c0 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && this.f41456c0 == webPage.f19337id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f41457d0 = webPage;
                    this.f41458e0 = false;
                    this.f41456c0 = 0L;
                    z6 z6Var = this.U;
                    if (z6Var != null) {
                        z6Var.N(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.V.f21199b);
        AndroidUtilities.hideKeyboard(this.W.f21199b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new w6(this, 2), 150L);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        ?? w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new d4(this, 2), this.resourcesProvider);
        this.U = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
