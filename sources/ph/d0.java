package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.o5;
import org.telegram.messenger.t9;
import org.telegram.messenger.vp;
import org.telegram.messenger.w9;
import org.telegram.messenger.x9;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.st0;
import w7.b6;
import w7.e6;
public final class d0 extends ha implements w9 {
    public static final int Y1 = 0;
    public final long P1;
    public final x Q1;
    public final LinearLayout R1;
    public final y S1;
    public final TextView T1;
    public final a0 U1;
    public t9 V1;
    public p51 W1;
    public int X1;

    public d0(Context context, p6 p6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, p6Var);
        r8 r8Var;
        TLRPC.User user;
        ?? r12;
        Context context2;
        p6 p6Var2;
        p80 p80Var;
        long j11 = starGift.f20021id;
        this.P1 = j11;
        this.B1 = org.telegram.messenger.i0.L(6.0f);
        this.f26672r1 = 0.2f;
        v0(i0.b.f(0.1f, t6.w0(t6.f21019i5, this.I0), t6.w0(t6.f21001h5, this.I0)));
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        x xVar = new x(this, context);
        this.Q1 = xVar;
        linearLayout.addView(xVar);
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.f();
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = d.leftMargin;
        int i11 = this.f21615t0;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.f21586b.addView(dVar, d);
        tk0 tk0Var = this.f26666k1;
        int i12 = this.f21615t0;
        tk0Var.setPadding(i12, 0, i12, org.telegram.messenger.i0.L(64.0f));
        this.W1.O(false);
        int i13 = z10 ? 220 : 208;
        this.V1 = x9.c(this.f21583a).l(j11, this);
        y yVar = new y(this, context, p6Var, new w5(this, 25), new bh.c(22), new bh.c(22), new bh.c(22), new bh.c(22), new bh.c(22), new bh.c(22), i13);
        this.S1 = yVar;
        yVar.d(new f4.d(1, 1));
        yVar.setPreviewingAttributes(arrayList);
        yVar.removeView(yVar.P);
        xVar.addView(yVar, 0, b6.e(-1, i13, 48));
        g9 g9Var = new g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(45.0f));
        xVar.addView(g9Var, b6.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i14 == 0) {
            TLRPC.User Z1 = vp.r1(this.f21583a).Z1(Long.valueOf(d20.i(this.f21583a).e()));
            r8Var = new r8(0, Z1);
            user = Z1;
        } else if (i14 > 0) {
            TLRPC.User Z12 = vp.r1(this.f21583a).Z1(Long.valueOf(j10));
            r8Var = new r8(0, Z12);
            user = Z12;
        } else {
            TLRPC.Chat L0 = vp.r1(this.f21583a).L0(Long.valueOf(-j10));
            r8Var = new r8(L0);
            user = L0;
        }
        g9Var.e(user, r8Var);
        TextView textView = new TextView(context);
        this.T1 = textView;
        z20.n(textView, 1, 21.0f);
        textView.setText(o5.t(i14 != 0 ? j10 : d20.i(this.f21583a).e()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, org.telegram.messenger.i0.L(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        xVar.addView(textView, b6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(cd.L0(2131749817, null));
            context2 = context;
            r12 = 0;
            p6Var2 = p6Var;
        } else {
            textView2.setText(org.telegram.messenger.i0.H2(cd.L0(2131750358, null), false, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
            r12 = 0;
            context2 = context;
            p6Var2 = p6Var;
            textView2.setOnClickListener(new n(context, p6Var, j10, starGift, arrayList));
            e6.b(textView2, 0.02f, 1.5f);
        }
        xVar.addView(textView2, b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        c1 c1Var = new c1(this.f21583a, context2, p6Var2);
        c1Var.f44989c0 = true;
        p6 p6Var3 = p6Var2;
        c1Var.h(starGift, true, false, false, false, false);
        c1Var.setImageSize(org.telegram.messenger.i0.L(84.0f));
        c1Var.setImageLayer(7);
        c1Var.J.setVisibility(8);
        c1Var.e.g(r12);
        c1Var.setRibbonTextOneOf(this.V1.d.availability_total);
        linearLayout2.addView(c1Var, b6.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231241);
        imageView.setScaleX(-1.0f);
        a7.t(imageView, t6.f21095m6, p6Var3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, b6.q(24, 24, 0.0f, 16, 12, 0, 12, 0));
        a0 a0Var = new a0(this, context, this.f21583a, p6Var3);
        this.U1 = a0Var;
        a0Var.d.removeView(a0Var.D);
        a0Var.f44989c0 = true;
        a0Var.h(starGift, true, false, false, false, false);
        a0Var.setImageSize(org.telegram.messenger.i0.L(100.0f));
        a0Var.setImageLayer(7);
        a0Var.J.setVisibility(8);
        a0Var.e.g(r12);
        a0Var.setRibbonTextOneOf(this.V1.d.availability_total);
        a0Var.setRibbonText(cd.L0(2131750328, r12));
        linearLayout2.addView(a0Var, b6.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(cd.L0(2131749840, r12));
        int i15 = t6.f21311y6;
        a7.V(textView3, i15, p6Var3);
        float i16 = Utilities.i(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(14.0f);
        int i17 = t6.f20929d6;
        int w02 = t6.w0(i17, p6Var3);
        int i18 = t6.G6;
        Drawable d02 = t6.d0(L, i0.b.f(0.2f, w02, t6.w0(i18, p6Var3)));
        frameLayout.setBackground(d02);
        v6 p5 = a7.p(frameLayout, true);
        p5.d = d02;
        p5.e = r12;
        p5.f21417f = r12;
        u6 u6Var = new u6();
        p5.e = u6Var;
        u6Var.c(i17, i18, 3, 0.2f, p6Var3);
        u6Var.f21390g = a7.u(d02);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(org.telegram.messenger.i0.o());
        a7.V(textView4, i18, p6Var3);
        textView4.setText(cd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView4, b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        l4.setTextSize(1, 13.0f);
        l4.setGravity(21);
        l4.setTypeface(org.telegram.messenger.i0.o());
        a7.V(l4, i18, p6Var3);
        l4.setText(cd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(l4, b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View b0Var = new b0(context, i16);
        int L2 = org.telegram.messenger.i0.L(14.0f);
        int i19 = t6.Ci;
        Drawable d03 = t6.d0(L2, t6.w0(i19, p6Var3));
        w6 N = a7.N(i19);
        b0Var.setBackground(d03);
        a7.k(b0Var, d03, N, null, p6Var3);
        frameLayout.addView(b0Var, b6.e(-1, -1, 119));
        c0 c0Var = new c0(context, i16);
        c0Var.setWillNotDraw(false);
        frameLayout.addView(c0Var, b6.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(org.telegram.messenger.i0.o());
        textView5.setTextColor(-1);
        textView5.setText(cd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        c0Var.addView(textView5, b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(org.telegram.messenger.i0.o());
        textView6.setTextColor(-1);
        textView6.setText(cd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        c0Var.addView(textView6, b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        t9 t9Var = this.V1;
        if (t9Var == null || t9Var.f18036f == null) {
            p80Var = null;
        } else {
            p80Var = new p80(context, null);
            p80Var.setTextSize(1, 13.0f);
            p80Var.setGravity(17);
            a7.V(p80Var, i15, p6Var3);
            p80Var.setText(org.telegram.messenger.i0.V2(cd.V(null, null, 2131750367, cd.E(starGift.availability_total, ','), Integer.valueOf(this.V1.f18036f.total_rounds), Integer.valueOf(starGift.gifts_per_round), org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750366, null), new q(context, p6Var3, starGift, 1)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)))));
            a7.H(p80Var, t6.J6, p6Var3);
        }
        if (z10) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(org.telegram.messenger.i0.o());
                textView7.setGravity(17);
                textView7.setText(cd.a0(null, null, 2131749818, starGift.title));
                textView7.setTextSize(1, 20.0f);
                a7.V(textView7, i18, p6Var3);
                linearLayout.addView(textView7, b6.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                textView8.setText(cd.L0(2131749816, null));
                textView8.setTextSize(1, 14.0f);
                a7.V(textView8, i18, p6Var3);
                linearLayout.addView(textView8, b6.t(-1, -2, 17, 20, 0, 20, 16));
                st0 st0Var = new st0(context, p6Var3);
                st0Var.f41644a.l(cd.L0(2131749824, null), false);
                st0Var.f41645b.setText(cd.L0(2131749823, null));
                st0Var.d.setVisibility(8);
                ImageView imageView2 = st0Var.f41646c;
                imageView2.setImageResource(2131232120);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                a7.t(imageView2, i18, p6Var3, mode);
                linearLayout.addView(st0Var, b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                st0 st0Var2 = new st0(context, p6Var3);
                st0Var2.f41644a.l(cd.L0(2131749822, null), false);
                st0Var2.f41645b.setText(cd.L0(2131749821, null));
                st0Var2.d.setVisibility(8);
                ImageView imageView3 = st0Var2.f41646c;
                imageView3.setImageResource(2131231799);
                a7.t(imageView3, i18, p6Var3, mode);
                linearLayout.addView(st0Var2, b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                st0 st0Var3 = new st0(context, p6Var3);
                st0Var3.f41644a.l(cd.L0(2131749820, null), false);
                st0Var3.f41645b.setText(cd.L0(2131749819, null));
                st0Var3.d.setVisibility(8);
                ImageView imageView4 = st0Var3.f41646c;
                imageView4.setImageResource(2131231910);
                a7.t(imageView4, i18, p6Var3, mode);
                linearLayout.addView(st0Var3, b6.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.i(rh.e4.g2(cd.L0(2131743913, null)), false, true);
            dVar.setOnClickListener(new ag.g(this, 26));
            return;
        }
        linearLayout.addView(linearLayout2, b6.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, b6.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, b6.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (p80Var != null) {
            linearLayout.addView(p80Var, b6.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.f21583a).getCurrentTime();
        t9 t9Var2 = this.V1;
        if (t9Var2 != null && t9Var2.g(currentTime)) {
            dVar.i(cd.L0(2131750349, null), false, true);
        } else {
            dVar.i(cd.L0(2131750354, null), false, true);
        }
        t9 t9Var3 = this.V1;
        if (t9Var3 != null && t9Var3.f18036f != null) {
            if (t9Var3.g(currentTime)) {
                dVar.g(cd.a0(null, null, 2131750344, cd.c0(this.V1.f18036f.start_date - currentTime)), false);
            } else {
                dVar.g(cd.a0(null, null, 2131750330, cd.c0(this.V1.f18036f.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new n(this, j10, context, p6Var3, runnable, 1));
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.f26666k1, getContext(), this.f21583a, 0, true, new ag.a(this, 24), this.I0);
        this.W1 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return "";
    }

    @Override
    public final void c(t9 t9Var) {
        this.V1 = t9Var;
    }

    @Override
    public final void dismiss() {
        x9.c(this.f21583a).n(this.P1, this);
        super.dismiss();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int f7 = i0.b.f(0.1f, t6.w0(t6.f21019i5, this.I0), t6.w0(t6.f21001h5, this.I0));
            if (f7 != this.X1) {
                this.X1 = f7;
                v0(f7);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
