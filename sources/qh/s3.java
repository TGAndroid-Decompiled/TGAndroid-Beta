package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import g7.e6;
import g7.g6;
import java.util.ArrayList;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.ta1;
public final class s3 extends FrameLayout {
    public final ImageView A;
    public final wo0 B;
    public final ta1 C;
    public final FrameLayout D;
    public final pi0 E;
    public final LinearLayout F;
    public int G;
    public final LinearLayout H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final t1 K;
    public final t1 L;
    public final t1 M;
    public final t1 N;
    public final t1 O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public final k f46689a;
    public final b6 f46690b;
    public final View f46691c;
    public final View d;
    public final FrameLayout f46692e;
    public final ImageView f46693f;
    public final LinearLayout h;
    public final ImageView f46694n;
    public final ImageView f46695r;
    public final FrameLayout f46696s;
    public final FrameLayout v;
    public final LinearLayout f46697w;
    public final qg f46698x;
    public final LinearLayout f46699y;

    public s3(Context context, final k kVar) {
        super(context);
        this.G = Integer.MAX_VALUE;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.T = -1;
        this.U = 0;
        this.f46689a = kVar;
        b6 b6Var = kVar.f46471a.f27492a;
        this.f46690b = b6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f46691c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i9 = f6.f23001d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{f6.v0(i9, b6Var), f6.l1(0.0f, f6.v0(i9, b6Var))}));
        addView(view, e6.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{f6.l1(0.0f, f6.v0(i9, b6Var)), f6.v0(i9, b6Var)}));
        addView(view2, e6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46692e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, e6.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f46693f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = f6.Yk;
        int v02 = f6.v0(i10, b6Var);
        int v03 = f6.v0(i10, b6Var);
        int i11 = f6.f23092i6;
        imageView.setBackground(new w1(f6.Z(v02, f6.v(v03, f6.v0(i11, b6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i12 = f6.G6;
        int v04 = f6.v0(i12, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        g6.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new fh.n(kVar, 25));
        frameLayout.addView(imageView, e6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        frameLayout.addView(linearLayout, e6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f46694n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(f6.f0(f6.v0(i11, b6Var), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        g6.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, e6.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f46695r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(f6.f0(f6.v0(i11, b6Var), 1, -1));
        imageView3.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        g6.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, e6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f46696s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, e6.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, e6.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f46697w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, e6.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.i0(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        imageView4.setBackground(new w1(f6.Z(f6.v0(i10, b6Var), f6.v(f6.v0(i10, b6Var), f6.v0(i11, b6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, e6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        g6.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i9, b6Var))));
        frameLayout4.addView(frameLayout5, e6.e(-2, 44, 81));
        r1 r1Var = new r1(context, 1);
        r1Var.setClipToOutline(true);
        r1Var.setOutlineProvider(new bg.q1(21));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f46699y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        r1Var.addView(linearLayout3);
        frameLayout5.addView(r1Var, e6.c(-1.0f, -1));
        qg qgVar = new qg(context, 24);
        this.f46698x = qgVar;
        qgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        qgVar.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        qgVar.setBackground(f6.Z(f6.v0(i9, b6Var), f6.v0(i11, b6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        qgVar.j(og.f31383e, false);
        linearLayout3.addView(qgVar, e6.q(38, 38, 16));
        g6.a(qgVar);
        qgVar.setContentDescription("Emoji");
        qgVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        a(R.drawable.iv_text, 1, false);
        a(R.drawable.iv_lists, 2, true);
        a(R.drawable.iv_table, 4, true);
        a(R.drawable.iv_math, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.A = imageView5;
        imageView5.setImageResource(R.drawable.outline_poll_attach_24);
        imageView5.setScaleType(scaleType);
        imageView5.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        imageView5.setBackground(f6.Z(f6.v0(i9, b6Var), f6.v0(i11, b6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        linearLayout3.addView(imageView5, e6.t(38, 38, 16, 2, 0, 0, 0));
        g6.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, e6.l(1.0f, 0, 44));
        ta1 ta1Var = new ta1(this, context, 19);
        this.C = ta1Var;
        ta1Var.setOrientation(0);
        ta1Var.setClipToPadding(false);
        ta1Var.setClipChildren(false);
        ta1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(ta1Var, e6.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.D = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, e6.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.E = imageView6;
        imageView6.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        mi0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        imageView6.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        frameLayout6.addView((View) imageView6, e6.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        ta1Var.addView(frameLayout7, e6.c(44.0f, -2));
        org.telegram.ui.h2 h2Var = new org.telegram.ui.h2(this, context, 1);
        h2Var.setHorizontalScrollBarEnabled(false);
        h2Var.setClipToOutline(true);
        h2Var.setOutlineProvider(new bg.q1(22));
        frameLayout7.addView(h2Var, e6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        h2Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, 16384, true);
        b(R.drawable.iv_super, 32768, true);
        t1 t1Var = new t1(context, R.drawable.iv_quote, b6Var);
        this.O = t1Var;
        t1Var.c(i10);
        t1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        t1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout4.addView(t1Var, e6.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        t1 t1Var2 = new t1(context, R.drawable.iv_button, b6Var);
        this.L = t1Var2;
        t1Var2.c(i10);
        t1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        t1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout4.addView(t1Var2, e6.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.I = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout5.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        ta1Var.addView(linearLayout5, e6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var3 = new t1(context, R.drawable.media_link_24, b6Var);
        this.K = t1Var3;
        t1Var3.c(i10);
        t1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        t1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(t1Var3, e6.q(38, 38, 16));
        t1 t1Var4 = new t1(context, R.drawable.msg_calendar2, b6Var);
        this.M = t1Var4;
        t1Var4.c(i10);
        t1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        t1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(t1Var4, e6.q(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.J = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout6.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        ta1Var.addView(linearLayout6, e6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var5 = new t1(context, R.drawable.iv_math, b6Var);
        this.N = t1Var5;
        t1Var5.c(i10);
        t1Var5.e();
        arrayList.add(t1Var5);
        t1Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        t1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(t1Var5, e6.q(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.H = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout7.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        ta1Var.addView(linearLayout7, 0, e6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        t1 t1Var6 = new t1(context, R.drawable.input_ai, b6Var);
        t1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        t1Var6.c(i10);
        t1Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        t1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(t1Var6, e6.q(38, 38, 16));
        wo0 wo0Var = new wo0(this, context, R.drawable.send_plane_24, b6Var, 4);
        this.B = wo0Var;
        wo0Var.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(f6.Yd, b6Var))));
        g6.a(wo0Var);
        linearLayout2.addView(wo0Var, e6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        wo0Var.setContentDescription("Send");
        wo0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        p pVar = kVar.f46471a;
                        pVar.f46606r.Q4();
                        pVar.V();
                        return;
                    case 1:
                        kVar.f46471a.f46606r.Z3(view3);
                        return;
                    case 2:
                        kVar.f46471a.f46606r.a4();
                        return;
                    case 3:
                        kVar.f46471a.f46606r.X3();
                        return;
                    case 4:
                        kVar.f46471a.f46606r.b4();
                        return;
                    case 5:
                        p pVar2 = kVar.f46471a;
                        f3 h22 = pVar2.f46606r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.f27492a);
                                e0Var.m0(a2);
                                e0Var.f27858g0 = new i9(h22, 16);
                                e0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        kVar.f46471a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        b2 b2Var = kVar.f46471a.f46606r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        b2 b2Var2 = kVar.f46471a.f46606r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.f46471a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.f46605n, context2, new i9(kVar2, 17), pVar3.f27492a).show();
                        return;
                    case 10:
                        p.K(kVar.f46471a);
                        return;
                    default:
                        p pVar4 = kVar.f46471a;
                        pVar4.f46606r.X3 = null;
                        p.N(pVar4, 90, 0);
                        return;
                }
            }
        });
        wo0Var.setOnLongClickListener(new kh.d5(kVar, 4));
        f(0, false);
    }

    public final void a(int i9, int i10, boolean z10) {
        int i11;
        LinearLayout linearLayout = this.f46699y;
        t1 t1Var = new t1(linearLayout.getContext(), i9, this.f46690b);
        t1Var.c(f6.f23001d6);
        if (z10) {
            t1Var.e();
            this.R.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i10));
        t1Var.setContentDescription(x1.f0(i10));
        t1Var.setOnClickListener(new r3(this, i10, 1));
        this.P.add(t1Var);
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(t1Var, e6.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void b(int i9, int i10, boolean z10) {
        int i11;
        t1 t1Var = new t1(getContext(), i9, this.f46690b);
        t1Var.c(f6.Yk);
        if (z10) {
            t1Var.e();
            this.R.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i10));
        t1Var.setContentDescription(x1.h0(i10));
        t1Var.setOnClickListener(new r3(this, i10, 0));
        this.Q.add(t1Var);
        LinearLayout linearLayout = this.F;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(t1Var, e6.t(38, 38, 16, i11, 0, 0, 0));
    }

    public final void c(int i9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t1 t1Var = (t1) obj;
            int intValue = ((Integer) t1Var.getTag()).intValue();
            if ((i9 & intValue) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            t1Var.setSelected(z15);
            if (intValue == 1 || intValue == 2) {
                t1Var.setEnabled(z14);
            }
        }
        t1 t1Var2 = this.K;
        t1Var2.setSelected(z10);
        t1 t1Var3 = this.M;
        t1Var3.setSelected(z11);
        t1Var2.setEnabled(z12);
        this.L.setEnabled(z13);
        t1Var3.setEnabled(z12);
        this.N.setEnabled(z12);
    }

    public final void d(int i9, int i10) {
        boolean z10;
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t1 t1Var = (t1) obj;
            if (i9 == ((Integer) t1Var.getTag()).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            t1Var.setSelected(z10);
            if (z10 && i10 != 0) {
                t1Var.f(i10);
            } else {
                t1Var.a();
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        int i9;
        if (this.V != z10 || !z11) {
            this.V = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            pi0 pi0Var = this.E;
            if (z11) {
                pi0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(gr.h).start();
            } else {
                pi0Var.animate().cancel();
                pi0Var.setScaleX(f10);
                pi0Var.setScaleY(f10);
            }
            if (z10) {
                i9 = f6.f23230q7;
            } else {
                i9 = f6.G6;
            }
            pi0Var.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, this.f46690b), PorterDuff.Mode.SRC_IN));
            mi0 animatedDrawable = pi0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.X > 34) {
                        animatedDrawable.L(0, false, false);
                    }
                    animatedDrawable.N(33);
                } else {
                    animatedDrawable.N(0);
                }
                animatedDrawable.start();
            }
        }
    }

    public final void f(int i9, boolean z10) {
        int i10;
        float f10;
        float f11;
        float f12;
        float dp;
        int i11;
        float f13;
        float f14;
        float f15;
        float dp2;
        float f16;
        float f17;
        float f18;
        float f19;
        float dp3;
        float f20;
        float f21;
        float f22;
        float dp4;
        float f23;
        if (this.T == i9) {
            return;
        }
        this.T = i9;
        FrameLayout frameLayout = this.D;
        int i12 = 0;
        ta1 ta1Var = this.C;
        LinearLayout linearLayout = this.f46697w;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = linearLayout.animate();
            if (i9 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f17);
            if (i9 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f18);
            if (i9 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (i9 == 0) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(dp3).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final s3 f46638b;

                {
                    this.f46638b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            s3 s3Var = this.f46638b;
                            if (s3Var.T != 0) {
                                s3Var.f46697w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            s3 s3Var2 = this.f46638b;
                            if (s3Var2.T != 1) {
                                s3Var2.C.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            s3 s3Var3 = this.f46638b;
                            if (s3Var3.T != 2) {
                                s3Var3.D.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ta1Var.setVisibility(0);
            ViewPropertyAnimator animate2 = ta1Var.animate();
            if (i9 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f20);
            if (i9 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f21);
            if (i9 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (i9 == 1) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(30.0f);
            }
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final s3 f46638b;

                {
                    this.f46638b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            s3 s3Var = this.f46638b;
                            if (s3Var.T != 0) {
                                s3Var.f46697w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            s3 s3Var2 = this.f46638b;
                            if (s3Var2.T != 1) {
                                s3Var2.C.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            s3 s3Var3 = this.f46638b;
                            if (s3Var3.T != 2) {
                                s3Var3.D.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate3 = frameLayout.animate();
            if (i9 == 2) {
                f24 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f24);
            if (i9 == 2) {
                f23 = 1.0f;
            } else {
                f23 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f23);
            if (i9 == 2) {
                f25 = 1.0f;
            }
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final s3 f46638b;

                {
                    this.f46638b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            s3 s3Var = this.f46638b;
                            if (s3Var.T != 0) {
                                s3Var.f46697w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            s3 s3Var2 = this.f46638b;
                            if (s3Var2.T != 1) {
                                s3Var2.C.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            s3 s3Var3 = this.f46638b;
                            if (s3Var3.T != 2) {
                                s3Var3.D.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        if (i9 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        if (i9 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout.setAlpha(f10);
        if (i9 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout.setScaleX(f11);
        if (i9 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout.setScaleY(f12);
        if (i9 == 0) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout.setTranslationY(dp);
        if (i9 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        ta1Var.setVisibility(i11);
        if (i9 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ta1Var.setAlpha(f13);
        if (i9 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        ta1Var.setScaleX(f14);
        if (i9 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        ta1Var.setScaleY(f15);
        if (i9 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        ta1Var.setTranslationY(dp2);
        if (i9 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        if (i9 == 2) {
            f24 = 1.0f;
        }
        frameLayout.setAlpha(f24);
        if (i9 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout.setScaleX(f16);
        if (i9 == 2) {
            f25 = 1.0f;
        }
        frameLayout.setScaleY(f25);
    }

    public ImageView getAddButton() {
        return this.A;
    }

    public FrameLayout getBottomContainer() {
        return this.f46696s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.f46697w;
    }

    public View getEmojiButton() {
        return this.f46698x;
    }

    public lg getSendButton() {
        return this.B;
    }

    public void setBackVisible(boolean z10) {
        int i9;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f46693f.setVisibility(i9);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z10) {
        og ogVar;
        String str;
        if (z10) {
            ogVar = og.d;
        } else {
            ogVar = og.f31383e;
        }
        qg qgVar = this.f46698x;
        qgVar.j(ogVar, true);
        if (z10) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        qgVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((t1) obj).setPremiumLocked(z10);
        }
    }

    public void setQuoteState(boolean z10) {
        this.O.setSelected(z10);
    }

    public void setSelectedBlockType(int i9) {
        d(i9, 0);
    }

    public void setSendEditing(boolean z10) {
        int i9;
        if (z10) {
            i9 = R.drawable.input_done;
        } else {
            i9 = R.drawable.send_plane_24;
        }
        this.B.setResourceId(i9);
    }

    public void setSendEnabled(boolean z10) {
        float f10;
        wo0 wo0Var = this.B;
        if (wo0Var.isEnabled() == z10) {
            return;
        }
        wo0Var.setEnabled(z10);
        ViewPropertyAnimator animate = wo0Var.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(150L).start();
    }

    public void setSendLoading(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        this.B.invalidate();
    }

    public void setTopButtonsOffset(int i9) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i9) {
            layoutParams.topMargin = i9;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f46693f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i9) {
            layoutParams2.topMargin = i9;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z10) {
        int i9;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f46691c.setVisibility(i9);
    }

    public void setTopPanelVisible(boolean z10) {
        int i9;
        int i10 = 8;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f46692e.setVisibility(i9);
        if (z10) {
            i10 = 0;
        }
        this.f46691c.setVisibility(i10);
    }
}
