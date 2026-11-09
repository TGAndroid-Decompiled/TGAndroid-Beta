package zh;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.ea;
import bi.k7;
import bi.n4;
import c8.ha;
import c8.ka;
import fi.y5;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xe;
import org.telegram.ui.cn;
public final class h0 extends org.telegram.ui.ActionBar.v2 {
    public final long A1;
    public n4 B1;
    public boolean C1;
    public final c4 f60356i1;
    public final jh.l f60357j1;
    public final ri.g f60358k1;
    public final dh.c l1;
    public final jh.f f60359m1;
    public final rh.h n1;
    public final e0 f60360o1;
    public final FrameLayout f60361p1;
    public final wo f60362q1;
    public final TextView f60363r1;
    public final j6 f60364s1;
    public final ImageView f60365t1;
    public final Drawable f60366u1;
    public final int f60367v1;
    public int f60368w1;
    public boolean f60369x1;
    public final g0 f60370y1;
    public final TL_stars.TL_starGiftUnique f60371z1;

    public h0(Context context, g6 g6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (g6) null, true, true);
        boolean z9;
        cn cnVar;
        this.f60357j1 = new jh.l();
        rh.h hVar = new rh.h(new bi.z3(this, 1));
        this.n1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.f60371z1 = tL_starGiftUnique;
        this.A1 = j3;
        this.f60367v1 = qp.s1(this.f28621a).D6;
        ?? obj = new Object();
        this.f60358k1 = obj;
        dh.c cVar = new dh.c(obj, obj, obj);
        this.l1 = cVar;
        d0 d0Var = new d0(this, context);
        this.f28624b = d0Var;
        int i7 = this.f28654t0;
        d0Var.setPadding(i7, 0, i7, 0);
        jh.k kVar = new jh.k(this.f28624b);
        ViewGroup viewGroup = this.f28624b;
        cVar.h = kVar;
        cVar.f8706i = viewGroup;
        rh.d dVar = new rh.d(this.f28627c);
        ViewGroup viewGroup2 = this.f28624b;
        hVar.D = dVar;
        hVar.E = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = y5.e(null, this.f28621a, j3, l6.I.q());
        this.f60366u1 = e10;
        d0Var.U(e10);
        c4 c4Var = new c4(this.f28621a, context, g6Var);
        this.f60356i1 = c4Var;
        c4Var.a(tL_starGiftUnique, p10.i(this.f28621a).e(), null, id.M0(2131749745, null), false);
        c4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        c4Var.setLayoutBackground(new x5(c4Var, this.f28624b, org.telegram.messenger.g0.L(18.0f), J0("paintChatActionBackground")));
        d0Var.addView(c4Var, ha.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.f60359m1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.g0.b(g6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.g0.b(g6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        e0 e0Var = new e0(this, org.telegram.messenger.g0.u0(), d0Var);
        this.f60360o1 = e0Var;
        e0Var.setInAppInsetsController(hVar);
        e0Var.setOverrideHint(id.M0(2131749750, null));
        e0Var.f31165y4 = false;
        this.f28624b.setClipChildren(false);
        this.f28624b.setClipToPadding(false);
        e0Var.f31159x4 = false;
        if (!org.telegram.messenger.g0.E && ((cnVar = e0Var.P2) == null || !cnVar.isInBubbleMode())) {
            z9 = true;
        } else {
            z9 = false;
        }
        e0Var.f31072i2 = z9;
        e0Var.V0(false, false, false);
        e0Var.g1(true, false);
        e0Var.f31167z1.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        e0Var.getSendButton().setAlpha(0.0f);
        e0Var.getEditField().setMaxLines(3);
        e0Var.setCustomWindowView(this.f28627c);
        e0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(e0Var, ha.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.f28624b.addView(fVar.getFadeView(), ha.c(-1.0f, -1));
        this.f28624b.addView(fVar, ha.c(-1.0f, -1));
        e0Var.setDelegate(new f0(this, tL_starGiftUnique));
        xe xeVar = e0Var.E0;
        Object obj2 = new Object();
        InputFilter[] filters = xeVar.getFilters();
        if (filters == null) {
            xeVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            xeVar.setFilters(inputFilterArr);
        }
        j6 j6Var = new j6(context, false, false, false);
        this.f60364s1 = j6Var;
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        j6Var.setVisibility(8);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        s6.Y(j6Var, l6.f28257y6, g6Var);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setGravity(17);
        this.f28624b.addView(j6Var, ha.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? dgVar = new dg(2131232694, context, g6Var, false);
        this.f60370y1 = dgVar;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        dgVar.I = L;
        dgVar.J = L2;
        dgVar.M = org.telegram.messenger.g0.L(6.0f);
        dgVar.N = org.telegram.messenger.g0.L(8.0f);
        dgVar.f32966h0 = true;
        this.f28624b.addView((View) dgVar, ha.e(110, 50, 85));
        dgVar.setScrimViewBackgroundColor(l6.w0(l6.f27865d6, this.I0));
        dgVar.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f60250b;

            {
                this.f60250b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h0 h0Var = this.f60250b;
                        if (h0Var.f60367v1 - h0Var.f60368w1 < 0) {
                            org.telegram.messenger.g0.F3(h0Var.f60364s1);
                            return;
                        }
                        n4 n4Var = h0Var.B1;
                        if (n4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = h0Var.f60360o1.getTextWithEntities();
                            boolean z10 = h0Var.f60369x1;
                            k7 k7Var = (k7) n4Var.f4403c;
                            h0 h0Var2 = (h0) n4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.f4404e;
                            long j10 = n4Var.f4402b;
                            cg.b bVar = (cg.b) n4Var.f4405f;
                            if (!h0Var2.C1) {
                                k7Var.f4168c2.setLoading(true);
                                if (!h0Var2.C1) {
                                    h0Var2.C1 = true;
                                    h0Var2.f60370y1.f(true);
                                }
                                ea.x(k7Var.f28621a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z10, new bi.i2(k7Var, h0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z10));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h0 h0Var3 = this.f60250b;
                        boolean z11 = h0Var3.f60369x1;
                        h0Var3.f60369x1 = !z11;
                        h0Var3.f60362q1.a(z11, true);
                        return;
                    default:
                        this.f60250b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f60363r1 = textView;
        int i10 = l6.Wc;
        k5.n(textView, i10, g6Var, 1, 14.0f);
        textView.setText(id.M0(2131749746, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setBackground(new x5(textView, this.f28624b, org.telegram.messenger.g0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.f28624b.addView(textView, ha.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60361p1 = frameLayout;
        TextView textView2 = new TextView(context);
        s6.U(textView2, i10, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(id.M0(2131749747, null));
        frameLayout.addView(textView2, ha.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        wo woVar = new wo(18, context, g6Var);
        this.f60362q1 = woVar;
        woVar.getCheckBoxBase().j(true);
        woVar.getCheckBoxBase().f31257e = 0.9f;
        woVar.b(i10, i10, l6.f27995k7);
        woVar.setDrawUnchecked(true);
        woVar.a(!this.f60369x1, false);
        c4Var.getLayout().V = new bi.z3(this, 2);
        c4Var.getLayout().U = new bi.z3(this, 3);
        woVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(woVar, ha.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new x5(frameLayout, this.f28624b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f60250b;

            {
                this.f60250b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h0 h0Var = this.f60250b;
                        if (h0Var.f60367v1 - h0Var.f60368w1 < 0) {
                            org.telegram.messenger.g0.F3(h0Var.f60364s1);
                            return;
                        }
                        n4 n4Var = h0Var.B1;
                        if (n4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = h0Var.f60360o1.getTextWithEntities();
                            boolean z10 = h0Var.f60369x1;
                            k7 k7Var = (k7) n4Var.f4403c;
                            h0 h0Var2 = (h0) n4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.f4404e;
                            long j10 = n4Var.f4402b;
                            cg.b bVar = (cg.b) n4Var.f4405f;
                            if (!h0Var2.C1) {
                                k7Var.f4168c2.setLoading(true);
                                if (!h0Var2.C1) {
                                    h0Var2.C1 = true;
                                    h0Var2.f60370y1.f(true);
                                }
                                ea.x(k7Var.f28621a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z10, new bi.i2(k7Var, h0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z10));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h0 h0Var3 = this.f60250b;
                        boolean z11 = h0Var3.f60369x1;
                        h0Var3.f60369x1 = !z11;
                        h0Var3.f60362q1.a(z11, true);
                        return;
                    default:
                        this.f60250b.dismiss();
                        return;
                }
            }
        });
        this.f28624b.addView(frameLayout, ha.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f60365t1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        x5 x5Var = new x5(imageView, this.f28624b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground"));
        int L3 = org.telegram.messenger.g0.L(32.0f);
        int L4 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.f15484a;
        imageView.setBackground(new ih.c(L3, L4, x5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f60250b;

            {
                this.f60250b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h0 h0Var = this.f60250b;
                        if (h0Var.f60367v1 - h0Var.f60368w1 < 0) {
                            org.telegram.messenger.g0.F3(h0Var.f60364s1);
                            return;
                        }
                        n4 n4Var = h0Var.B1;
                        if (n4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = h0Var.f60360o1.getTextWithEntities();
                            boolean z10 = h0Var.f60369x1;
                            k7 k7Var = (k7) n4Var.f4403c;
                            h0 h0Var2 = (h0) n4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.f4404e;
                            long j10 = n4Var.f4402b;
                            cg.b bVar = (cg.b) n4Var.f4405f;
                            if (!h0Var2.C1) {
                                k7Var.f4168c2.setLoading(true);
                                if (!h0Var2.C1) {
                                    h0Var2.C1 = true;
                                    h0Var2.f60370y1.f(true);
                                }
                                ea.x(k7Var.f28621a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z10, new bi.i2(k7Var, h0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z10));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        h0 h0Var3 = this.f60250b;
                        boolean z11 = h0Var3.f60369x1;
                        h0Var3.f60369x1 = !z11;
                        h0Var3.f60362q1.a(z11, true);
                        return;
                    default:
                        this.f60250b.dismiss();
                        return;
                }
            }
        });
        this.f28624b.addView(imageView, ha.e(56, 56, 53));
        ka.b(frameLayout, 0.05f, 1.2f);
        ka.a(imageView);
        ViewGroup viewGroup3 = this.f28624b;
        u5.e eVar = new u5.e(this, 14);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(viewGroup3, eVar);
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void I0() {
        rh.h hVar = this.n1;
        int i7 = hVar.f(647).f15121b;
        float inputBubbleHeight = this.f60359m1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.f28624b.getHeight();
        c4 c4Var = this.f60356i1;
        FrameLayout frameLayout = this.f60361p1;
        c4Var.setTranslationY(Math.min((((org.telegram.messenger.g0.L(36.0f) + i7) - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - c4Var.getHeight()) / 2.0f), ((((this.f28624b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - c4Var.getHeight()));
        c4Var.invalidate();
        float y10 = c4Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.f60363r1;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i7;
        ImageView imageView = this.f60365t1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint J0(String str) {
        Paint paint;
        g6 g6Var = this.I0;
        if (g6Var != null) {
            paint = g6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return l6.V0("paintChatActionBackground");
    }

    @Override
    public final void K() {
        super.K();
        this.f60360o1.B0();
    }

    @Override
    public final void onBackPressed() {
        e0 e0Var = this.f60360o1;
        if (e0Var != null && e0Var.s0()) {
            e0Var.k0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            g0 g0Var = this.f60370y1;
            if (g0Var != null) {
                g0Var.setScrimViewBackgroundColor(l6.w0(l6.f27865d6, this.I0));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        u0(false);
        ch.v vVar = new ch.v(this, 11);
        org.telegram.ui.ActionBar.l2 l2Var = this.f28627c;
        cc.a(l2Var, vVar);
        a30 a30Var = a30.f31694s;
        if (a30Var.c()) {
            a30Var.b();
            TLObject e22 = qp.s1(this.f28621a).e2(this.A1);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f60371z1;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new hc(l2Var, this.I0).V(Arrays.asList(e22), id.M0(2131749749, null), org.telegram.messenger.g0.X2(id.a0(null, null, 2131749751, m5.u(e22), jg.g.m(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }
}
