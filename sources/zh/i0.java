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
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.z20;
import org.telegram.ui.an;
public final class i0 extends org.telegram.ui.ActionBar.v2 {
    public final long A1;
    public n4 B1;
    public boolean C1;
    public final c4 f60269i1;
    public final jh.l f60270j1;
    public final ri.g f60271k1;
    public final dh.c l1;
    public final jh.f f60272m1;
    public final rh.h n1;
    public final f0 f60273o1;
    public final FrameLayout f60274p1;
    public final wo f60275q1;
    public final TextView f60276r1;
    public final j6 f60277s1;
    public final ImageView f60278t1;
    public final Drawable f60279u1;
    public final int f60280v1;
    public int f60281w1;
    public boolean f60282x1;
    public final h0 f60283y1;
    public final TL_stars.TL_starGiftUnique f60284z1;

    public i0(Context context, f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (f6) null, true, true);
        boolean z9;
        an anVar;
        this.f60270j1 = new jh.l();
        rh.h hVar = new rh.h(new bi.z3(this, 1));
        this.n1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.f60284z1 = tL_starGiftUnique;
        this.A1 = j3;
        this.f60280v1 = qp.s1(this.f28613a).D6;
        ?? obj = new Object();
        this.f60271k1 = obj;
        dh.c cVar = new dh.c(obj, obj, obj);
        this.l1 = cVar;
        e0 e0Var = new e0(this, context);
        this.f28616b = e0Var;
        int i7 = this.f28646t0;
        e0Var.setPadding(i7, 0, i7, 0);
        jh.k kVar = new jh.k(this.f28616b);
        ViewGroup viewGroup = this.f28616b;
        cVar.h = kVar;
        cVar.f8708i = viewGroup;
        rh.d dVar = new rh.d(this.f28619c);
        ViewGroup viewGroup2 = this.f28616b;
        hVar.D = dVar;
        hVar.E = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = y5.e(null, this.f28613a, j3, k6.I.q());
        this.f60279u1 = e10;
        e0Var.U(e10);
        c4 c4Var = new c4(this.f28613a, context, f6Var);
        this.f60269i1 = c4Var;
        c4Var.a(tL_starGiftUnique, p10.i(this.f28613a).e(), null, hd.M0(2131749744, null), false);
        c4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        c4Var.setLayoutBackground(new w5(c4Var, this.f28616b, org.telegram.messenger.g0.L(18.0f), J0("paintChatActionBackground")));
        e0Var.addView(c4Var, ha.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.f60272m1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.g0.b(f6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.g0.b(f6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        f0 f0Var = new f0(this, org.telegram.messenger.g0.u0(), e0Var);
        this.f60273o1 = f0Var;
        f0Var.setInAppInsetsController(hVar);
        f0Var.setOverrideHint(hd.M0(2131749749, null));
        f0Var.f31156y4 = false;
        this.f28616b.setClipChildren(false);
        this.f28616b.setClipToPadding(false);
        f0Var.f31150x4 = false;
        if (!org.telegram.messenger.g0.E && ((anVar = f0Var.P2) == null || !anVar.isInBubbleMode())) {
            z9 = true;
        } else {
            z9 = false;
        }
        f0Var.f31063i2 = z9;
        f0Var.U0(false, false, false);
        f0Var.f1(true, false);
        f0Var.f31158z1.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        f0Var.getSendButton().setAlpha(0.0f);
        f0Var.getEditField().setMaxLines(3);
        f0Var.setCustomWindowView(this.f28619c);
        f0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(f0Var, ha.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.f28616b.addView(fVar.getFadeView(), ha.c(-1.0f, -1));
        this.f28616b.addView(fVar, ha.c(-1.0f, -1));
        f0Var.setDelegate(new g0(this, tL_starGiftUnique));
        xe xeVar = f0Var.E0;
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
        this.f60277s1 = j6Var;
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        j6Var.setVisibility(8);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        r6.Z(j6Var, k6.f28241y6, f6Var);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setGravity(17);
        this.f28616b.addView(j6Var, ha.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? dgVar = new dg(2131232694, context, f6Var, false);
        this.f60283y1 = dgVar;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        dgVar.I = L;
        dgVar.J = L2;
        dgVar.M = org.telegram.messenger.g0.L(6.0f);
        dgVar.N = org.telegram.messenger.g0.L(8.0f);
        dgVar.f32888h0 = true;
        this.f28616b.addView((View) dgVar, ha.e(110, 50, 85));
        dgVar.setScrimViewBackgroundColor(k6.w0(k6.f27849d6, this.I0));
        dgVar.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f60168b;

            {
                this.f60168b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0 i0Var = this.f60168b;
                        if (i0Var.f60280v1 - i0Var.f60281w1 < 0) {
                            org.telegram.messenger.g0.F3(i0Var.f60277s1);
                            return;
                        }
                        n4 n4Var = i0Var.B1;
                        if (n4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i0Var.f60273o1.getTextWithEntities();
                            boolean z10 = i0Var.f60282x1;
                            k7 k7Var = (k7) n4Var.f4403c;
                            i0 i0Var2 = (i0) n4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.f4404e;
                            long j10 = n4Var.f4402b;
                            cg.b bVar = (cg.b) n4Var.f4405f;
                            if (!i0Var2.C1) {
                                k7Var.f4168c2.setLoading(true);
                                if (!i0Var2.C1) {
                                    i0Var2.C1 = true;
                                    i0Var2.f60283y1.f(true);
                                }
                                ea.x(k7Var.f28613a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z10, new bi.i2(k7Var, i0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z10));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i0 i0Var3 = this.f60168b;
                        boolean z11 = i0Var3.f60282x1;
                        i0Var3.f60282x1 = !z11;
                        i0Var3.f60275q1.a(z11, true);
                        return;
                    default:
                        this.f60168b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f60276r1 = textView;
        int i10 = k6.Wc;
        k5.n(textView, i10, f6Var, 1, 14.0f);
        textView.setText(hd.M0(2131749745, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setBackground(new w5(textView, this.f28616b, org.telegram.messenger.g0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.f28616b.addView(textView, ha.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60274p1 = frameLayout;
        TextView textView2 = new TextView(context);
        r6.V(textView2, i10, f6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(hd.M0(2131749746, null));
        frameLayout.addView(textView2, ha.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        wo woVar = new wo(18, context, f6Var);
        this.f60275q1 = woVar;
        woVar.getCheckBoxBase().j(true);
        woVar.getCheckBoxBase().f31248e = 0.9f;
        woVar.b(i10, i10, k6.f27979k7);
        woVar.setDrawUnchecked(true);
        woVar.a(!this.f60282x1, false);
        c4Var.getLayout().V = new bi.z3(this, 2);
        c4Var.getLayout().U = new bi.z3(this, 3);
        woVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(woVar, ha.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new w5(frameLayout, this.f28616b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f60168b;

            {
                this.f60168b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0 i0Var = this.f60168b;
                        if (i0Var.f60280v1 - i0Var.f60281w1 < 0) {
                            org.telegram.messenger.g0.F3(i0Var.f60277s1);
                            return;
                        }
                        n4 n4Var = i0Var.B1;
                        if (n4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i0Var.f60273o1.getTextWithEntities();
                            boolean z10 = i0Var.f60282x1;
                            k7 k7Var = (k7) n4Var.f4403c;
                            i0 i0Var2 = (i0) n4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.f4404e;
                            long j10 = n4Var.f4402b;
                            cg.b bVar = (cg.b) n4Var.f4405f;
                            if (!i0Var2.C1) {
                                k7Var.f4168c2.setLoading(true);
                                if (!i0Var2.C1) {
                                    i0Var2.C1 = true;
                                    i0Var2.f60283y1.f(true);
                                }
                                ea.x(k7Var.f28613a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z10, new bi.i2(k7Var, i0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z10));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i0 i0Var3 = this.f60168b;
                        boolean z11 = i0Var3.f60282x1;
                        i0Var3.f60282x1 = !z11;
                        i0Var3.f60275q1.a(z11, true);
                        return;
                    default:
                        this.f60168b.dismiss();
                        return;
                }
            }
        });
        this.f28616b.addView(frameLayout, ha.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f60278t1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        w5 w5Var = new w5(imageView, this.f28616b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground"));
        int L3 = org.telegram.messenger.g0.L(32.0f);
        int L4 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.f15481a;
        imageView.setBackground(new ih.c(L3, L4, w5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f60168b;

            {
                this.f60168b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0 i0Var = this.f60168b;
                        if (i0Var.f60280v1 - i0Var.f60281w1 < 0) {
                            org.telegram.messenger.g0.F3(i0Var.f60277s1);
                            return;
                        }
                        n4 n4Var = i0Var.B1;
                        if (n4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i0Var.f60273o1.getTextWithEntities();
                            boolean z10 = i0Var.f60282x1;
                            k7 k7Var = (k7) n4Var.f4403c;
                            i0 i0Var2 = (i0) n4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.f4404e;
                            long j10 = n4Var.f4402b;
                            cg.b bVar = (cg.b) n4Var.f4405f;
                            if (!i0Var2.C1) {
                                k7Var.f4168c2.setLoading(true);
                                if (!i0Var2.C1) {
                                    i0Var2.C1 = true;
                                    i0Var2.f60283y1.f(true);
                                }
                                ea.x(k7Var.f28613a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z10, new bi.i2(k7Var, i0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z10));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i0 i0Var3 = this.f60168b;
                        boolean z11 = i0Var3.f60282x1;
                        i0Var3.f60282x1 = !z11;
                        i0Var3.f60275q1.a(z11, true);
                        return;
                    default:
                        this.f60168b.dismiss();
                        return;
                }
            }
        });
        this.f28616b.addView(imageView, ha.e(56, 56, 53));
        ka.b(frameLayout, 0.05f, 1.2f);
        ka.a(imageView);
        ViewGroup viewGroup3 = this.f28616b;
        u5.e eVar = new u5.e(this, 14);
        WeakHashMap weakHashMap = r0.i0.f54097a;
        r0.a0.i(viewGroup3, eVar);
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void I0() {
        rh.h hVar = this.n1;
        int i7 = hVar.f(647).f15118b;
        float inputBubbleHeight = this.f60272m1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.f28616b.getHeight();
        c4 c4Var = this.f60269i1;
        FrameLayout frameLayout = this.f60274p1;
        c4Var.setTranslationY(Math.min((((org.telegram.messenger.g0.L(36.0f) + i7) - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - c4Var.getHeight()) / 2.0f), ((((this.f28616b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - c4Var.getHeight()));
        c4Var.invalidate();
        float y10 = c4Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.f60276r1;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i7;
        ImageView imageView = this.f60278t1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint J0(String str) {
        Paint paint;
        f6 f6Var = this.I0;
        if (f6Var != null) {
            paint = f6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return k6.V0("paintChatActionBackground");
    }

    @Override
    public final void K() {
        super.K();
        this.f60273o1.B0();
    }

    @Override
    public final void onBackPressed() {
        f0 f0Var = this.f60273o1;
        if (f0Var != null && f0Var.s0()) {
            f0Var.k0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            h0 h0Var = this.f60283y1;
            if (h0Var != null) {
                h0Var.setScrimViewBackgroundColor(k6.w0(k6.f27849d6, this.I0));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        u0(false);
        ch.v vVar = new ch.v(this, 11);
        org.telegram.ui.ActionBar.l2 l2Var = this.f28619c;
        cc.a(l2Var, vVar);
        z20 z20Var = z20.f40848s;
        if (z20Var.c()) {
            z20Var.b();
            TLObject e22 = qp.s1(this.f28613a).e2(this.A1);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f60284z1;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new hc(l2Var, this.I0).V(Arrays.asList(e22), hd.M0(2131749748, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749750, m5.u(e22), jg.g.m(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }
}
