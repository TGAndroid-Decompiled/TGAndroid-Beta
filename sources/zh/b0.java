package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.g6;
import bi.k7;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.s9;
import org.telegram.messenger.v9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ls0;
public final class b0 extends ma implements v9 {
    public static final int f60216b2 = 0;
    public final long S1;
    public final v T1;
    public final LinearLayout U1;
    public final w V1;
    public final TextView W1;
    public final y X1;
    public s9 Y1;
    public m41 Z1;
    public int f60217a2;

    public b0(Context context, h6 h6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z9) {
        super(context, null, false, false, 1, h6Var);
        v8 v8Var;
        TLRPC.User user;
        ?? r12;
        Context context2;
        h6 h6Var2;
        w70 w70Var;
        long j10 = starGift.f27189id;
        this.S1 = j10;
        this.E1 = org.telegram.messenger.g0.L(6.0f);
        this.f35908u1 = 0.2f;
        v0(i0.a.f(0.1f, m6.w0(m6.f27981i5, this.I0), m6.w0(m6.f27963h5, this.I0)));
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        v vVar = new v(this, context);
        this.T1 = vVar;
        linearLayout.addView(vVar);
        fi.d dVar = new fi.d(context, h6Var, true);
        dVar.f();
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f28705t0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f28672b.addView(dVar, d);
        pj0 pj0Var = this.n1;
        int i11 = this.f28705t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.Z1.O(false);
        int i12 = z9 ? 220 : 208;
        this.Y1 = w9.c(this.f28669a).l(j10, this);
        w wVar = new w(this, context, h6Var, new wg.a0(this, 4), new bi.l1(25), new bi.l1(25), new bi.l1(25), new bi.l1(25), new bi.l1(25), new bi.l1(25), i12);
        this.V1 = wVar;
        wVar.d(new g6(1, 1));
        wVar.setPreviewingAttributes(arrayList);
        wVar.removeView(wVar.P);
        vVar.addView(wVar, 0, ha.e(-1, i12, 48));
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        vVar.addView(k9Var, ha.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 == 0) {
            TLRPC.User a22 = qp.s1(this.f28669a).a2(Long.valueOf(p10.i(this.f28669a).e()));
            v8Var = new v8(0, a22);
            user = a22;
        } else if (i13 > 0) {
            TLRPC.User a23 = qp.s1(this.f28669a).a2(Long.valueOf(j3));
            v8Var = new v8(0, a23);
            user = a23;
        } else {
            TLRPC.Chat M0 = qp.s1(this.f28669a).M0(Long.valueOf(-j3));
            v8Var = new v8(M0);
            user = M0;
        }
        k9Var.e(user, v8Var);
        TextView textView = new TextView(context);
        this.W1 = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 21.0f);
        textView.setText(m5.t(i13 != 0 ? j3 : p10.i(this.f28669a).e()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        vVar.addView(textView, ha.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z9) {
            textView2.setText(id.M0(2131749808, null));
            context2 = context;
            r12 = 0;
            h6Var2 = h6Var;
        } else {
            textView2.setText(org.telegram.messenger.g0.I2(id.M0(2131750349, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            r12 = 0;
            context2 = context;
            h6Var2 = h6Var;
            textView2.setOnClickListener(new m(context, h6Var, j3, starGift, arrayList));
            ka.b(textView2, 0.02f, 1.5f);
        }
        vVar.addView(textView2, ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        y0 y0Var = new y0(this.f28669a, context2, h6Var2);
        y0Var.f60618c0 = true;
        h6 h6Var3 = h6Var2;
        y0Var.h(starGift, true, false, false, false, false);
        y0Var.setImageSize(org.telegram.messenger.g0.L(84.0f));
        y0Var.setImageLayer(7);
        y0Var.J.setVisibility(8);
        y0Var.f60620e.g(r12);
        y0Var.setRibbonTextOneOf(this.Y1.d.availability_total);
        linearLayout2.addView(y0Var, ha.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231240);
        imageView.setScaleX(-1.0f);
        t6.s(imageView, m6.f28055m6, h6Var3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, ha.q(24, 24, 0.0f, 16, 12, 0, 12, 0));
        y yVar = new y(this, context, this.f28669a, h6Var3);
        this.X1 = yVar;
        yVar.d.removeView(yVar.D);
        yVar.f60618c0 = true;
        yVar.h(starGift, true, false, false, false, false);
        yVar.setImageSize(org.telegram.messenger.g0.L(100.0f));
        yVar.setImageLayer(7);
        yVar.J.setVisibility(8);
        yVar.f60620e.g(r12);
        yVar.setRibbonTextOneOf(this.Y1.d.availability_total);
        yVar.setRibbonText(id.M0(2131750319, r12));
        linearLayout2.addView(yVar, ha.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(id.M0(2131749831, r12));
        int i14 = m6.f28282y6;
        t6.U(textView3, i14, h6Var3);
        float i15 = Utilities.i(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i16 = m6.f27890d6;
        int w02 = m6.w0(i16, h6Var3);
        int i17 = m6.G6;
        Drawable d02 = m6.d0(L, i0.a.f(0.2f, w02, m6.w0(i17, h6Var3)));
        frameLayout.setBackground(d02);
        o6 o4 = t6.o(frameLayout, true);
        o4.d = d02;
        o4.f28353e = r12;
        o4.f28354f = r12;
        n6 n6Var = new n6();
        o4.f28353e = n6Var;
        n6Var.c(i16, i17, 3, 0.2f, h6Var3);
        n6Var.f28329g = t6.t(d02);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        t6.U(textView4, i17, h6Var3);
        textView4.setText(id.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        TextView i18 = org.telegram.ui.Cells.f1.i(frameLayout, textView4, ha.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        i18.setTextSize(1, 13.0f);
        i18.setGravity(21);
        i18.setTypeface(org.telegram.messenger.g0.o());
        t6.U(i18, i17, h6Var3);
        i18.setText(id.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(i18, ha.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View zVar = new z(context, i15);
        int L2 = org.telegram.messenger.g0.L(14.0f);
        int i19 = m6.Ci;
        Drawable d03 = m6.d0(L2, m6.w0(i19, h6Var3));
        p6 M = t6.M(i19);
        zVar.setBackground(d03);
        t6.j(zVar, d03, M, null, h6Var3);
        frameLayout.addView(zVar, ha.e(-1, -1, 119));
        a0 a0Var = new a0(context, i15);
        a0Var.setWillNotDraw(false);
        frameLayout.addView(a0Var, ha.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setTextColor(-1);
        textView5.setText(id.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        a0Var.addView(textView5, ha.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(org.telegram.messenger.g0.o());
        textView6.setTextColor(-1);
        textView6.setText(id.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        a0Var.addView(textView6, ha.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        s9 s9Var = this.Y1;
        if (s9Var == null || s9Var.f25442f == null) {
            w70Var = null;
        } else {
            w70Var = new w70(context, null);
            w70Var.setTextSize(1, 13.0f);
            w70Var.setGravity(17);
            t6.U(w70Var, i14, h6Var3);
            w70Var.setText(org.telegram.messenger.g0.W2(id.V(null, null, 2131750358, id.E(starGift.availability_total, ','), Integer.valueOf(this.Y1.f25442f.total_rounds), Integer.valueOf(starGift.gifts_per_round), org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(id.M0(2131750357, null), new o(context, h6Var3, starGift, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
            t6.G(w70Var, m6.J6, h6Var3);
        }
        if (z9) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(org.telegram.messenger.g0.o());
                textView7.setGravity(17);
                textView7.setText(id.a0(null, null, 2131749809, starGift.title));
                textView7.setTextSize(1, 20.0f);
                t6.U(textView7, i17, h6Var3);
                linearLayout.addView(textView7, ha.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                textView8.setText(id.M0(2131749807, null));
                textView8.setTextSize(1, 14.0f);
                t6.U(textView8, i17, h6Var3);
                linearLayout.addView(textView8, ha.t(-1, -2, 17, 20, 0, 20, 16));
                ls0 ls0Var = new ls0(context, h6Var3);
                ls0Var.f47682a.l(id.M0(2131749815, null), false);
                ls0Var.f47683b.setText(id.M0(2131749814, null));
                ls0Var.d.setVisibility(8);
                ImageView imageView2 = ls0Var.f47684c;
                imageView2.setImageResource(2131232121);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                t6.s(imageView2, i17, h6Var3, mode);
                linearLayout.addView(ls0Var, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                ls0 ls0Var2 = new ls0(context, h6Var3);
                ls0Var2.f47682a.l(id.M0(2131749813, null), false);
                ls0Var2.f47683b.setText(id.M0(2131749812, null));
                ls0Var2.d.setVisibility(8);
                ImageView imageView3 = ls0Var2.f47684c;
                imageView3.setImageResource(2131231800);
                t6.s(imageView3, i17, h6Var3, mode);
                linearLayout.addView(ls0Var2, ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                ls0 ls0Var3 = new ls0(context, h6Var3);
                ls0Var3.f47682a.l(id.M0(2131749811, null), false);
                ls0Var3.f47683b.setText(id.M0(2131749810, null));
                ls0Var3.d.setVisibility(8);
                ImageView imageView4 = ls0Var3.f47684c;
                imageView4.setImageResource(2131231911);
                t6.s(imageView4, i17, h6Var3, mode);
                linearLayout.addView(ls0Var3, ha.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.i(k7.f2(id.M0(2131743888, null)), false, true);
            dVar.setOnClickListener(new a(this, 1));
            return;
        }
        linearLayout.addView(linearLayout2, ha.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, ha.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, ha.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (w70Var != null) {
            linearLayout.addView(w70Var, ha.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.f28669a).getCurrentTime();
        s9 s9Var2 = this.Y1;
        if (s9Var2 != null && s9Var2.g(currentTime)) {
            dVar.i(id.M0(2131750340, null), false, true);
        } else {
            dVar.i(id.M0(2131750345, null), false, true);
        }
        s9 s9Var3 = this.Y1;
        if (s9Var3 != null && s9Var3.f25442f != null) {
            if (s9Var3.g(currentTime)) {
                dVar.g(id.a0(null, null, 2131750335, id.c0(this.Y1.f25442f.start_date - currentTime)), false);
            } else {
                dVar.g(id.a0(null, null, 2131750321, id.c0(this.Y1.f25442f.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new m(this, j3, context, h6Var3, runnable, 1));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.f28669a, 0, true, new hi.u1(this, 29), this.I0);
        this.Z1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return "";
    }

    @Override
    public final void c(s9 s9Var) {
        this.Y1 = s9Var;
    }

    @Override
    public final void dismiss() {
        w9.c(this.f28669a).n(this.S1, this);
        super.dismiss();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int f10 = i0.a.f(0.1f, m6.w0(m6.f27981i5, this.I0), m6.w0(m6.f27963h5, this.I0));
            if (f10 != this.f60217a2) {
                this.f60217a2 = f10;
                v0(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
