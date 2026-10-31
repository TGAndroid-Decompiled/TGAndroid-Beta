package vh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
public final class t5 extends ha implements us {
    public rh.t P1;
    public final org.telegram.ui.Cells.m3 Q1;
    public final org.telegram.ui.Cells.m3 R1;
    public final FrameLayout S1;
    public final d T1;
    public boolean U1;
    public boolean V1;
    public rh.e3 W1;
    public long X1;
    public TLRPC.WebPage Y1;
    public boolean Z1;
    public int a2;
    public String f51965b2;
    public final p5 f51966c2;
    public Pattern f51967d2;
    public boolean f51968e2;
    public boolean f51969f2;
    public boolean f51970g2;

    public t5(Context context, org.telegram.ui.ActionBar.x4 x4Var, k4 k4Var, rh.e3 e3Var) {
        super(context, null, true, true, 2, x4Var);
        this.f51966c2 = new p5(this, 0);
        this.W1 = e3Var;
        O();
        Y0();
        this.f26680z1 = org.telegram.messenger.i0.L(4.0f);
        this.A1 = org.telegram.messenger.i0.L(-15.0f);
        org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, cd.L0(2131744651, null), true, false, -1, x4Var);
        this.Q1 = m3Var;
        p5 p5Var = new p5(this, 1);
        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
        k3Var.setImeOptions(6);
        k3Var.setOnEditorActionListener(new m.s2(p5Var, 2));
        k3Var.setHandlesColor(-12476440);
        k3Var.setCursorColor(-11230757);
        k3Var.setText("https://");
        k3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(cd.L0(2131747451, null));
        textView.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.t6.f21134o6;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, this.I0);
        org.telegram.ui.ActionBar.a7.V(textView, i10, x4Var);
        int L = org.telegram.messenger.i0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.t6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i10);
        org.telegram.ui.ActionBar.w6 L3 = org.telegram.ui.ActionBar.a7.L(0.15f, i10);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView, k02, L2, L3, x4Var);
        w7.e6.b(textView, 0.1f, 1.5f);
        m3Var.addView(textView, w7.b6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        d1 d1Var = new d1(14, this, textView);
        textView.setOnClickListener(new rh.u1(9, this, d1Var));
        d1Var.run();
        k3Var.addTextChangedListener(new ag.u2(this, d1Var, false, 17));
        org.telegram.ui.Cells.m3 m3Var2 = new org.telegram.ui.Cells.m3(context, cd.L0(2131744655, null), true, false, -1, x4Var);
        this.R1 = m3Var2;
        p5 p5Var2 = new p5(this, 1);
        org.telegram.ui.Cells.k3 k3Var2 = m3Var2.d;
        k3Var2.setImeOptions(6);
        k3Var2.setOnEditorActionListener(new m.s2(p5Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        d dVar = new d(context, x4Var, true);
        this.T1 = dVar;
        dVar.i(cd.L0(2131744664, null), false, true);
        dVar.setOnClickListener(new o5(this, 1));
        dVar.setEnabled(f1(m3Var.getText().toString()));
        frameLayout.addView(dVar, w7.b6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.f26672r1 = 0.2f;
        this.F1 = true;
        this.P0 = true;
        this.Q0 = true;
        q5 q5Var = new q5(this);
        q5Var.f47927m = false;
        q5Var.C = false;
        q5Var.o(gr.h);
        q5Var.n(350L);
        this.f26666k1.setItemAnimator(q5Var);
        tk0 tk0Var = this.f26666k1;
        int i11 = this.f21615t0;
        tk0Var.setPadding(i11, 0, i11, 0);
        this.f26666k1.setOnItemClickListener(new org.telegram.ui.Cells.o(this, context, k4Var));
        rh.t tVar = this.P1;
        if (tVar != null) {
            tVar.O(false);
        }
    }

    public static void d1(t5 t5Var, String str) {
        p5 p5Var = t5Var.f51966c2;
        if (str == null || TextUtils.equals(str, t5Var.f51965b2)) {
            return;
        }
        t5Var.f51965b2 = str;
        boolean f12 = t5Var.f1(str);
        org.telegram.messenger.i0.r(p5Var);
        if (f12) {
            if (!t5Var.Z1 || t5Var.Y1 != null) {
                t5Var.Z1 = true;
                t5Var.Y1 = null;
                rh.t tVar = t5Var.P1;
                if (tVar != null) {
                    tVar.O(true);
                }
            }
            org.telegram.messenger.i0.h3(p5Var, 700L);
        } else if (t5Var.Z1 || t5Var.Y1 != null) {
            t5Var.Z1 = false;
            t5Var.Y1 = null;
            if (t5Var.a2 != 0) {
                ConnectionsManager.getInstance(t5Var.f21583a).cancelRequest(t5Var.a2, true);
                t5Var.a2 = 0;
            }
            rh.t tVar2 = t5Var.P1;
            if (tVar2 != null) {
                tVar2.O(true);
            }
        }
        t5Var.T1.setEnabled(f12);
    }

    public static boolean g1(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        rh.t tVar = new rh.t(this.f26666k1, getContext(), this.f21583a, 0, true, new qh.d(this, 21), this.I0, 1);
        this.P1 = tVar;
        return tVar;
    }

    @Override
    public final CharSequence O0() {
        return cd.L0(2131744661, null);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19711w0 && this.X1 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && this.X1 == webPage.f19948id) {
                    if (g1(webPage)) {
                        webPage = null;
                    }
                    this.Y1 = webPage;
                    this.Z1 = false;
                    this.X1 = 0L;
                    rh.t tVar = this.P1;
                    if (tVar != null) {
                        tVar.O(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.i0.v1(this.Q1.d);
        org.telegram.messenger.i0.v1(this.R1.d);
        super.dismiss();
        zs.f(this.f21583a).n(this, zs.f19711w0);
    }

    public final void e1() {
        this.Z1 = false;
        this.Y1 = null;
        if (this.a2 != 0) {
            ConnectionsManager.getInstance(this.f21583a).cancelRequest(this.a2, true);
            this.a2 = 0;
        }
        rh.t tVar = this.P1;
        if (tVar != null) {
            tVar.O(true);
        }
    }

    public final boolean f1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f51967d2 == null) {
            this.f51967d2 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f51967d2.matcher(str).find();
    }

    public final void h1() {
        String str;
        if (!this.T1.f51052c0) {
            return;
        }
        if (this.W1 != null) {
            jg.s0 s0Var = new jg.s0();
            s0Var.f10208c = this.Q1.d.getText().toString();
            if (this.f51968e2) {
                str = this.R1.d.getText().toString();
            } else {
                str = null;
            }
            s0Var.f10207b = str;
            s0Var.d = this.Y1;
            s0Var.e = this.f51970g2;
            s0Var.f10209f = this.f51969f2;
            this.W1.a(s0Var);
            this.W1 = null;
        }
        dismiss();
    }

    @Override
    public final void show() {
        super.show();
        zs.f(this.f21583a).c(this, zs.f19711w0);
        org.telegram.messenger.i0.h3(new p5(this, 2), 150L);
    }
}
