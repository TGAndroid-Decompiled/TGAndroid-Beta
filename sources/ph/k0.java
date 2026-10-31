package ph;

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
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.zf;
import org.telegram.ui.lh;
import org.telegram.ui.un;
import rh.e6;
import vh.k4;
import w7.b6;
import w7.b9;
public final class k0 extends org.telegram.ui.ActionBar.z2 {
    public final long A1;
    public lh B1;
    public boolean C1;
    public final h4 f45144i1;
    public final zg.i f45145j1;
    public final hi.g f45146k1;
    public final tg.b l1;
    public final zg.e f45147m1;
    public final hh.i f45148n1;
    public final h0 f45149o1;
    public final FrameLayout f45150p1;
    public final ep f45151q1;
    public final TextView f45152r1;
    public final f6 f45153s1;
    public final ImageView f45154t1;
    public final Drawable f45155u1;
    public final int f45156v1;
    public int f45157w1;
    public boolean f45158x1;
    public final j0 f45159y1;
    public final TL_stars.TL_starGiftUnique f45160z1;

    public k0(Context context, p6 p6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (p6) null, true, true);
        boolean z10;
        un unVar;
        this.f45145j1 = new zg.i();
        hh.i iVar = new hh.i(new e0(this, 0));
        this.f45148n1 = iVar;
        org.telegram.messenger.i0.S(getWindow());
        this.f45160z1 = tL_starGiftUnique;
        this.A1 = j10;
        this.f45156v1 = vp.r1(this.f21583a).E6;
        ?? obj = new Object();
        this.f45146k1 = obj;
        tg.b bVar = new tg.b(obj);
        this.l1 = bVar;
        g0 g0Var = new g0(this, context);
        this.f21586b = g0Var;
        int i10 = this.f21615t0;
        g0Var.setPadding(i10, 0, i10, 0);
        zg.h hVar = new zg.h(this.f21586b);
        ViewGroup viewGroup = this.f21586b;
        bVar.f48700f = hVar;
        bVar.f48701g = viewGroup;
        hh.e eVar = new hh.e(this.f21589c);
        ViewGroup viewGroup2 = this.f21586b;
        iVar.D = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = k4.e(null, this.f21583a, j10, t6.I.q());
        this.f45155u1 = e;
        g0Var.U(e);
        h4 h4Var = new h4(this.f21583a, context, p6Var);
        this.f45144i1 = h4Var;
        h4Var.a(tL_starGiftUnique, d20.i(this.f21583a).e(), null, cd.L0(2131749754, null), false);
        h4Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        h4Var.setLayoutBackground(new g6(h4Var, this.f21586b, org.telegram.messenger.i0.L(18.0f), J0("paintChatActionBackground")));
        g0Var.addView(h4Var, b6.e(-2, -2, 48));
        zg.e eVar2 = new zg.e(context);
        this.f45147m1 = eVar2;
        eVar2.setClipChildren(false);
        eVar2.setWindowInsetsProvider(iVar);
        eVar2.setInputIslandBubbleDrawable(bVar.c(eVar2, b9.b(p6Var), false));
        eVar2.setUnderKeyboardBackgroundDrawable(bVar.c(eVar2, b9.b(p6Var), false));
        FrameLayout inputIslandBubbleContainer = eVar2.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = eVar2.getInAppKeyboardBubbleContainer();
        h0 h0Var = new h0(this, org.telegram.messenger.i0.u0(), g0Var);
        this.f45149o1 = h0Var;
        h0Var.setInAppInsetsController(iVar);
        h0Var.setOverrideHint(cd.L0(2131749759, null));
        h0Var.f23819y4 = false;
        this.f21586b.setClipChildren(false);
        this.f21586b.setClipToPadding(false);
        h0Var.f23814x4 = false;
        if (!org.telegram.messenger.i0.E && ((unVar = h0Var.P2) == null || !unVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0Var.f23726i2 = z10;
        h0Var.T0(false, false, false);
        h0Var.e1(true, false);
        h0Var.f23821z1.setPadding(0, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(20.0f), 0);
        h0Var.getSendButton().setAlpha(0.0f);
        h0Var.getEditField().setMaxLines(3);
        h0Var.setCustomWindowView(this.f21589c);
        h0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(h0Var, b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.f21586b.addView(eVar2.getFadeView(), b6.c(-1.0f, -1));
        this.f21586b.addView(eVar2, b6.c(-1.0f, -1));
        h0Var.setDelegate(new i0(this, tL_starGiftUnique));
        se seVar = h0Var.E0;
        Object obj2 = new Object();
        InputFilter[] filters = seVar.getFilters();
        if (filters == null) {
            seVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            seVar.setFilters(inputFilterArr);
        }
        f6 f6Var = new f6(context, false, false, false);
        this.f45153s1 = f6Var;
        f6Var.setAllowCancel(true);
        f6Var.setScaleProperty(0.6f);
        f6Var.setVisibility(8);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        a7.Z(f6Var, t6.f21311y6, p6Var);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setGravity(17);
        this.f21586b.addView(f6Var, b6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? zfVar = new zf(2131232691, context, p6Var, false);
        this.f45159y1 = zfVar;
        int L = org.telegram.messenger.i0.L(38.0f);
        int L2 = org.telegram.messenger.i0.L(38.0f);
        zfVar.I = L;
        zfVar.J = L2;
        zfVar.M = org.telegram.messenger.i0.L(6.0f);
        zfVar.N = org.telegram.messenger.i0.L(8.0f);
        zfVar.f33040h0 = true;
        this.f21586b.addView((View) zfVar, b6.e(110, 50, 85));
        zfVar.setScrimViewBackgroundColor(t6.w0(t6.f20929d6, this.I0));
        zfVar.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f45033b;

            {
                this.f45033b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f45033b;
                        if (k0Var.f45156v1 - k0Var.f45157w1 < 0) {
                            org.telegram.messenger.i0.E3(k0Var.f45153s1);
                            return;
                        }
                        lh lhVar = k0Var.B1;
                        if (lhVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = k0Var.f45149o1.getTextWithEntities();
                            boolean z11 = k0Var.f45158x1;
                            rh.e4 e4Var = (rh.e4) lhVar.f39238c;
                            k0 k0Var2 = (k0) lhVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) lhVar.e;
                            long j11 = lhVar.f39237b;
                            sf.b bVar2 = (sf.b) lhVar.f39239f;
                            if (!k0Var2.C1) {
                                e4Var.f46801c2.setLoading(true);
                                if (!k0Var2.C1) {
                                    k0Var2.C1 = true;
                                    k0Var2.f45159y1.h(true);
                                }
                                e6.x(e4Var.f21583a, bVar2).H(tL_starGiftUnique2, j11, textWithEntities, z11, new rh.c1(e4Var, k0Var2, bVar2, tL_starGiftUnique2, j11, textWithEntities, z11));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var3 = this.f45033b;
                        boolean z12 = k0Var3.f45158x1;
                        k0Var3.f45158x1 = !z12;
                        k0Var3.f45151q1.a(z12, true);
                        return;
                    default:
                        this.f45033b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f45152r1 = textView;
        int i11 = t6.Wc;
        m5.m(textView, i11, p6Var, 1, 14.0f);
        textView.setText(cd.L0(2131749755, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        textView.setBackground(new g6(textView, this.f21586b, org.telegram.messenger.i0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.f21586b.addView(textView, b6.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45150p1 = frameLayout;
        TextView textView2 = new TextView(context);
        a7.V(textView2, i11, p6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(cd.L0(2131749756, null));
        frameLayout.addView(textView2, b6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        ep epVar = new ep(18, context, p6Var);
        this.f45151q1 = epVar;
        epVar.getCheckBoxBase().j(true);
        epVar.getCheckBoxBase().e = 0.9f;
        epVar.b(i11, i11, t6.f21059k7);
        epVar.setDrawUnchecked(true);
        epVar.a(!this.f45158x1, false);
        h4Var.getLayout().V = new e0(this, 1);
        h4Var.getLayout().U = new e0(this, 2);
        epVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(epVar, b6.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new g6(frameLayout, this.f21586b, org.telegram.messenger.i0.L(16.0f), J0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f45033b;

            {
                this.f45033b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f45033b;
                        if (k0Var.f45156v1 - k0Var.f45157w1 < 0) {
                            org.telegram.messenger.i0.E3(k0Var.f45153s1);
                            return;
                        }
                        lh lhVar = k0Var.B1;
                        if (lhVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = k0Var.f45149o1.getTextWithEntities();
                            boolean z11 = k0Var.f45158x1;
                            rh.e4 e4Var = (rh.e4) lhVar.f39238c;
                            k0 k0Var2 = (k0) lhVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) lhVar.e;
                            long j11 = lhVar.f39237b;
                            sf.b bVar2 = (sf.b) lhVar.f39239f;
                            if (!k0Var2.C1) {
                                e4Var.f46801c2.setLoading(true);
                                if (!k0Var2.C1) {
                                    k0Var2.C1 = true;
                                    k0Var2.f45159y1.h(true);
                                }
                                e6.x(e4Var.f21583a, bVar2).H(tL_starGiftUnique2, j11, textWithEntities, z11, new rh.c1(e4Var, k0Var2, bVar2, tL_starGiftUnique2, j11, textWithEntities, z11));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var3 = this.f45033b;
                        boolean z12 = k0Var3.f45158x1;
                        k0Var3.f45158x1 = !z12;
                        k0Var3.f45151q1.a(z12, true);
                        return;
                    default:
                        this.f45033b.dismiss();
                        return;
                }
            }
        });
        this.f21586b.addView(frameLayout, b6.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f45154t1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231270);
        g6 g6Var = new g6(imageView, this.f21586b, org.telegram.messenger.i0.L(16.0f), J0("paintChatActionBackground"));
        int L3 = org.telegram.messenger.i0.L(32.0f);
        int L4 = org.telegram.messenger.i0.L(32.0f);
        Matrix matrix = yg.d.f54436a;
        imageView.setBackground(new yg.c(L3, L4, g6Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f45033b;

            {
                this.f45033b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f45033b;
                        if (k0Var.f45156v1 - k0Var.f45157w1 < 0) {
                            org.telegram.messenger.i0.E3(k0Var.f45153s1);
                            return;
                        }
                        lh lhVar = k0Var.B1;
                        if (lhVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = k0Var.f45149o1.getTextWithEntities();
                            boolean z11 = k0Var.f45158x1;
                            rh.e4 e4Var = (rh.e4) lhVar.f39238c;
                            k0 k0Var2 = (k0) lhVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) lhVar.e;
                            long j11 = lhVar.f39237b;
                            sf.b bVar2 = (sf.b) lhVar.f39239f;
                            if (!k0Var2.C1) {
                                e4Var.f46801c2.setLoading(true);
                                if (!k0Var2.C1) {
                                    k0Var2.C1 = true;
                                    k0Var2.f45159y1.h(true);
                                }
                                e6.x(e4Var.f21583a, bVar2).H(tL_starGiftUnique2, j11, textWithEntities, z11, new rh.c1(e4Var, k0Var2, bVar2, tL_starGiftUnique2, j11, textWithEntities, z11));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var3 = this.f45033b;
                        boolean z12 = k0Var3.f45158x1;
                        k0Var3.f45158x1 = !z12;
                        k0Var3.f45151q1.a(z12, true);
                        return;
                    default:
                        this.f45033b.dismiss();
                        return;
                }
            }
        });
        this.f21586b.addView(imageView, b6.e(56, 56, 53));
        w7.e6.b(frameLayout, 0.05f, 1.2f);
        w7.e6.a(imageView);
        ViewGroup viewGroup3 = this.f21586b;
        mg.l lVar = new mg.l(this, 21);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(viewGroup3, lVar);
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void I0() {
        hh.i iVar = this.f45148n1;
        int i10 = iVar.f(647).f7766b;
        float inputBubbleHeight = this.f45147m1.getInputBubbleHeight() + iVar.d() + org.telegram.messenger.i0.L(9.0f);
        int height = this.f21586b.getHeight();
        h4 h4Var = this.f45144i1;
        FrameLayout frameLayout = this.f45150p1;
        h4Var.setTranslationY(Math.min((((org.telegram.messenger.i0.L(36.0f) + i10) - (org.telegram.messenger.i0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - h4Var.getHeight()) / 2.0f), ((((this.f21586b.getHeight() - inputBubbleHeight) - org.telegram.messenger.i0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.i0.L(10.0f)) - h4Var.getHeight()));
        h4Var.invalidate();
        float y3 = h4Var.getY() - org.telegram.messenger.i0.L(33.0f);
        TextView textView = this.f45152r1;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.i0.L(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f45154t1;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    public final Paint J0(String str) {
        Paint paint;
        p6 p6Var = this.I0;
        if (p6Var != null) {
            paint = p6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return t6.V0("paintChatActionBackground");
    }

    @Override
    public final void L() {
        super.L();
        this.f45149o1.z0();
    }

    @Override
    public final void onBackPressed() {
        h0 h0Var = this.f45149o1;
        if (h0Var != null && h0Var.q0()) {
            h0Var.i0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            j0 j0Var = this.f45159y1;
            if (j0Var != null) {
                j0Var.setScrimViewBackgroundColor(t6.w0(t6.f20929d6, this.I0));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void w() {
        u0(false);
        k7 k7Var = new k7(this, 6);
        org.telegram.ui.ActionBar.p2 p2Var = this.f21589c;
        wb.a(p2Var, k7Var);
        r30 r30Var = r30.f29813s;
        if (r30Var.c()) {
            r30Var.b();
            TLObject d22 = vp.r1(this.f21583a).d2(this.A1);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f45160z1;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new cc(p2Var, this.I0).V(Arrays.asList(d22), cd.L0(2131749758, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749760, o5.u(d22), i0.a.k(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }
}
