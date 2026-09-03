package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.pb1;
public final class w3 extends FrameLayout {
    public final ImageView B;
    public final pp0 C;
    public final pb1 D;
    public final FrameLayout E;
    public final jj0 F;
    public final LinearLayout G;
    public int H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final LinearLayout K;
    public final u1 L;
    public final u1 M;
    public final u1 N;
    public final u1 O;
    public final u1 P;
    public final ArrayList Q;
    public final ArrayList R;
    public final ArrayList S;
    public boolean T;
    public int U;
    public int V;
    public boolean W;
    public final l f46328a;
    public final f6 f46329b;
    public final View f46330c;
    public final View d;
    public final FrameLayout e;
    public final ImageView f46331f;
    public final LinearLayout h;
    public final ImageView f46332n;
    public final ImageView f46333r;
    public final FrameLayout f46334s;
    public final FrameLayout v;
    public final LinearLayout f46335w;
    public final qg f46336x;
    public final LinearLayout f46337y;

    public w3(Context context, final l lVar) {
        super(context);
        int i10;
        int i11;
        this.H = Integer.MAX_VALUE;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.U = -1;
        this.V = 0;
        this.f46328a = lVar;
        f6 f6Var = lVar.f46058a.f24281a;
        this.f46329b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.f46330c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = j6.f19881d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{j6.v0(i12, f6Var), j6.l1(0.0f, j6.v0(i12, f6Var))}));
        addView(view, b6.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{j6.l1(0.0f, j6.v0(i12, f6Var)), j6.v0(i12, f6Var)}));
        addView(view2, b6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, b6.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f46331f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i13 = j6.Yk;
        int v02 = j6.v0(i13, f6Var);
        int v03 = j6.v0(i13, f6Var);
        int i14 = j6.f19971i6;
        imageView.setBackground(new x1(j6.Z(v02, j6.v(v03, j6.v0(i14, f6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i15 = j6.G6;
        int v04 = j6.v0(i15, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        d6.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new dg.m(lVar, 27));
        frameLayout.addView(imageView, b6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(i13, f6Var))));
        frameLayout.addView(linearLayout, b6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f46332n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(j6.f0(j6.v0(i14, f6Var), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
        d6.a(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView2, b6.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.f46333r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(j6.f0(j6.v0(i14, f6Var), 1, -1));
        imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
        d6.a(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout.addView(imageView3, b6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f46334s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, b6.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, b6.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f46335w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, b6.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.j0(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
        imageView4.setBackground(new x1(j6.Z(j6.v0(i13, f6Var), j6.v(j6.v0(i13, f6Var), j6.v0(i14, f6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, b6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        d6.a(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(i12, f6Var))));
        frameLayout4.addView(frameLayout5, b6.e(-2, 44, 81));
        s1 s1Var = new s1(context, 1);
        s1Var.setClipToOutline(true);
        s1Var.setOutlineProvider(new gg.j1(21));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f46337y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        s1Var.addView(linearLayout3);
        frameLayout5.addView(s1Var, b6.c(-1.0f, -1));
        qg qgVar = new qg(context, 24);
        this.f46336x = qgVar;
        qgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        qgVar.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
        qgVar.setBackground(j6.Z(j6.v0(i12, f6Var), j6.v0(i14, f6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        qgVar.j(og.e, false);
        linearLayout3.addView(qgVar, b6.q(38, 38, 16));
        d6.a(qgVar);
        qgVar.setContentDescription("Emoji");
        qgVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        a(R.drawable.iv_text, 1, false);
        a(R.drawable.iv_lists, 2, true);
        a(R.drawable.iv_table, 4, true);
        a(R.drawable.iv_math, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.B = imageView5;
        imageView5.setImageResource(R.drawable.outline_poll_attach_24);
        imageView5.setScaleType(scaleType);
        imageView5.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
        imageView5.setBackground(j6.Z(j6.v0(i12, f6Var), j6.v0(i14, f6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        linearLayout3.addView(imageView5, b6.t(38, 38, 16, 2, 0, 0, 0));
        d6.a(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout2.addView(frameLayout4, b6.l(1.0f, 0, 44));
        pb1 pb1Var = new pb1(this, context, 20);
        this.D = pb1Var;
        pb1Var.setOrientation(0);
        pb1Var.setClipToPadding(false);
        pb1Var.setClipChildren(false);
        pb1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(pb1Var, b6.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.E = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, b6.e(80, 60, 81));
        ?? imageView6 = new ImageView(context);
        this.F = imageView6;
        imageView6.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        gj0 animatedDrawable = imageView6.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
        imageView6.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(i13, f6Var))));
        frameLayout6.addView((View) imageView6, b6.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(i13, f6Var))));
        pb1Var.addView(frameLayout7, b6.c(44.0f, -2));
        org.telegram.ui.i2 i2Var = new org.telegram.ui.i2(this, context, 1);
        i2Var.setHorizontalScrollBarEnabled(false);
        i2Var.setClipToOutline(true);
        i2Var.setOutlineProvider(new gg.j1(22));
        frameLayout7.addView(i2Var, b6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        i2Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, 16384, true);
        b(R.drawable.iv_super, 32768, true);
        u1 u1Var = new u1(context, R.drawable.iv_quote, f6Var);
        this.P = u1Var;
        u1Var.c(i13);
        u1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        u1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        linearLayout4.addView(u1Var, b6.t(38, 38, 16, i10, 0, 0, 0));
        u1 u1Var2 = new u1(context, R.drawable.iv_button, f6Var);
        this.M = u1Var2;
        u1Var2.c(i13);
        u1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        u1Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        if (linearLayout4.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout4.addView(u1Var2, b6.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.J = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout5.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(i13, f6Var))));
        pb1Var.addView(linearLayout5, b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        u1 u1Var3 = new u1(context, R.drawable.media_link_24, f6Var);
        this.L = u1Var3;
        u1Var3.c(i13);
        u1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        u1Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(u1Var3, b6.q(38, 38, 16));
        u1 u1Var4 = new u1(context, R.drawable.msg_calendar2, f6Var);
        this.N = u1Var4;
        u1Var4.c(i13);
        u1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        u1Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout5.addView(u1Var4, b6.q(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.K = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout6.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(i13, f6Var))));
        pb1Var.addView(linearLayout6, b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        u1 u1Var5 = new u1(context, R.drawable.iv_math, f6Var);
        this.O = u1Var5;
        u1Var5.c(i13);
        u1Var5.d();
        arrayList.add(u1Var5);
        u1Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        u1Var5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout6.addView(u1Var5, b6.q(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.I = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout7.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(i13, f6Var))));
        pb1Var.addView(linearLayout7, 0, b6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        u1 u1Var6 = new u1(context, R.drawable.input_ai, f6Var);
        u1Var6.setImageDrawable(new org.telegram.ui.Components.j0(context));
        u1Var6.c(i13);
        u1Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        u1Var6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        linearLayout7.addView(u1Var6, b6.q(38, 38, 16));
        pp0 pp0Var = new pp0(this, context, R.drawable.send_plane_24, f6Var, 4);
        this.C = pp0Var;
        pp0Var.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(j6.Yd, f6Var))));
        d6.a(pp0Var);
        linearLayout2.addView(pp0Var, b6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        pp0Var.setContentDescription("Send");
        pp0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        q qVar = lVar.f46058a;
                        qVar.f46156r.P4();
                        qVar.W();
                        return;
                    case 1:
                        lVar.f46058a.f46156r.Y3(view3);
                        return;
                    case 2:
                        lVar.f46058a.f46156r.Z3();
                        return;
                    case 3:
                        lVar.f46058a.f46156r.W3();
                        return;
                    case 4:
                        lVar.f46058a.f46156r.a4();
                        return;
                    case 5:
                        q qVar2 = lVar.f46058a;
                        j3 g22 = qVar2.f46156r.g2();
                        if (g22 != null) {
                            TL_iv.RichMessage a2 = g22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(qVar2.getContext(), qVar2.f24281a);
                                f0Var.n0(a2);
                                f0Var.f24736h0 = new org.telegram.ui.web.a1(g22, 23);
                                f0Var.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        lVar.f46058a.H(0, true, 0, false, 0L);
                        return;
                    case 7:
                        d2 d2Var = lVar.f46058a.f46156r.G3;
                        if (d2Var != null) {
                            d2Var.k();
                            return;
                        }
                        return;
                    case 8:
                        d2 d2Var2 = lVar.f46058a.f46156r.G3;
                        if (d2Var2 != null) {
                            d2Var2.i();
                            return;
                        }
                        return;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.f46058a;
                        Context context2 = qVar3.getContext();
                        new w(qVar3.f46155n, context2, new org.telegram.ui.web.a1(lVar2, 24), qVar3.f24281a).show();
                        return;
                    case 10:
                        q.K(lVar.f46058a);
                        return;
                    default:
                        q qVar4 = lVar.f46058a;
                        qVar4.f46156r.Y3 = null;
                        q.O(qVar4, 90, 0);
                        return;
                }
            }
        });
        pp0Var.setOnLongClickListener(new dg.f0(lVar, 5));
        f(0, false);
    }

    public final void a(int i10, int i11, boolean z4) {
        int i12;
        LinearLayout linearLayout = this.f46337y;
        u1 u1Var = new u1(linearLayout.getContext(), i10, this.f46329b);
        u1Var.c(j6.f19881d6);
        if (z4) {
            u1Var.d();
            this.S.add(u1Var);
        }
        u1Var.setTag(Integer.valueOf(i11));
        u1Var.setContentDescription(y1.g0(i11));
        u1Var.setOnClickListener(new v3(this, i11, 1));
        this.Q.add(u1Var);
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(u1Var, b6.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z4) {
        int i12;
        u1 u1Var = new u1(getContext(), i10, this.f46329b);
        u1Var.c(j6.Yk);
        if (z4) {
            u1Var.d();
            this.S.add(u1Var);
        }
        u1Var.setTag(Integer.valueOf(i11));
        u1Var.setContentDescription(y1.i0(i11));
        u1Var.setOnClickListener(new v3(this, i11, 0));
        this.R.add(u1Var);
        LinearLayout linearLayout = this.G;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(u1Var, b6.t(38, 38, 16, i12, 0, 0, 0));
    }

    public final void c(int i10, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            u1 u1Var = (u1) obj;
            int intValue = ((Integer) u1Var.getTag()).intValue();
            if ((i10 & intValue) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            u1Var.setSelected(z14);
            if (intValue == 1 || intValue == 2) {
                u1Var.setEnabled(z13);
            }
        }
        u1 u1Var2 = this.L;
        u1Var2.setSelected(z4);
        u1 u1Var3 = this.N;
        u1Var3.setSelected(z10);
        u1Var2.setEnabled(z11);
        this.M.setEnabled(z12);
        u1Var3.setEnabled(z11);
        this.O.setEnabled(z11);
    }

    public final void d(int i10, int i11) {
        boolean z4;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            u1 u1Var = (u1) obj;
            if (i10 == ((Integer) u1Var.getTag()).intValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            u1Var.setSelected(z4);
            if (z4 && i11 != 0) {
                u1Var.f(i11);
            } else {
                u1Var.a();
            }
        }
    }

    public final void e(boolean z4, boolean z10) {
        float f10;
        int i10;
        if (this.W != z4 || !z10) {
            this.W = z4;
            if (z4) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            jj0 jj0Var = this.F;
            if (z10) {
                jj0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(mr.h).start();
            } else {
                jj0Var.animate().cancel();
                jj0Var.setScaleX(f10);
                jj0Var.setScaleY(f10);
            }
            if (z4) {
                i10 = j6.f20116q7;
            } else {
                i10 = j6.G6;
            }
            jj0Var.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, this.f46329b), PorterDuff.Mode.SRC_IN));
            gj0 animatedDrawable = jj0Var.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z4) {
                    if (animatedDrawable.Y > 34) {
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

    public final void f(int i10, boolean z4) {
        int i11;
        float f10;
        float f11;
        float f12;
        float dp;
        int i12;
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
        if (this.U == i10) {
            return;
        }
        this.U = i10;
        FrameLayout frameLayout = this.E;
        int i13 = 0;
        pb1 pb1Var = this.D;
        LinearLayout linearLayout = this.f46335w;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z4) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = linearLayout.animate();
            if (i10 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f17);
            if (i10 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f18);
            if (i10 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (i10 == 0) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(dp3).setDuration(420L);
            mr mrVar = mr.h;
            duration.setInterpolator(mrVar).withEndAction(new Runnable(this) {
                public final w3 f46287b;

                {
                    this.f46287b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            w3 w3Var = this.f46287b;
                            if (w3Var.U != 0) {
                                w3Var.f46335w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            w3 w3Var2 = this.f46287b;
                            if (w3Var2.U != 1) {
                                w3Var2.D.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            w3 w3Var3 = this.f46287b;
                            if (w3Var3.U != 2) {
                                w3Var3.E.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            pb1Var.setVisibility(0);
            ViewPropertyAnimator animate2 = pb1Var.animate();
            if (i10 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f20);
            if (i10 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f21);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (i10 == 1) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(30.0f);
            }
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(mrVar).withEndAction(new Runnable(this) {
                public final w3 f46287b;

                {
                    this.f46287b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            w3 w3Var = this.f46287b;
                            if (w3Var.U != 0) {
                                w3Var.f46335w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            w3 w3Var2 = this.f46287b;
                            if (w3Var2.U != 1) {
                                w3Var2.D.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            w3 w3Var3 = this.f46287b;
                            if (w3Var3.U != 2) {
                                w3Var3.E.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate3 = frameLayout.animate();
            if (i10 == 2) {
                f24 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f24);
            if (i10 == 2) {
                f23 = 1.0f;
            } else {
                f23 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f23);
            if (i10 == 2) {
                f25 = 1.0f;
            }
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(mrVar).withEndAction(new Runnable(this) {
                public final w3 f46287b;

                {
                    this.f46287b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            w3 w3Var = this.f46287b;
                            if (w3Var.U != 0) {
                                w3Var.f46335w.setVisibility(8);
                                return;
                            }
                            return;
                        case 1:
                            w3 w3Var2 = this.f46287b;
                            if (w3Var2.U != 1) {
                                w3Var2.D.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            w3 w3Var3 = this.f46287b;
                            if (w3Var3.U != 2) {
                                w3Var3.E.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout.setAlpha(f10);
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout.setScaleX(f11);
        if (i10 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout.setScaleY(f12);
        if (i10 == 0) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout.setTranslationY(dp);
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        pb1Var.setVisibility(i12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        pb1Var.setAlpha(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        pb1Var.setScaleX(f14);
        if (i10 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        pb1Var.setScaleY(f15);
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        pb1Var.setTranslationY(dp2);
        if (i10 != 2) {
            i13 = 8;
        }
        frameLayout.setVisibility(i13);
        if (i10 == 2) {
            f24 = 1.0f;
        }
        frameLayout.setAlpha(f24);
        if (i10 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout.setScaleX(f16);
        if (i10 == 2) {
            f25 = 1.0f;
        }
        frameLayout.setScaleY(f25);
    }

    public ImageView getAddButton() {
        return this.B;
    }

    public FrameLayout getBottomContainer() {
        return this.f46334s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.f46335w;
    }

    public View getEmojiButton() {
        return this.f46336x;
    }

    public lg getSendButton() {
        return this.C;
    }

    public void setBackVisible(boolean z4) {
        int i10;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f46331f.setVisibility(i10);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z4) {
        og ogVar;
        String str;
        if (z4) {
            ogVar = og.d;
        } else {
            ogVar = og.e;
        }
        qg qgVar = this.f46336x;
        qgVar.j(ogVar, true);
        if (z4) {
            str = "Keyboard";
        } else {
            str = "Emoji";
        }
        qgVar.setContentDescription(str);
    }

    public void setPremiumLocked(boolean z4) {
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u1) obj).setPremiumLocked(z4);
        }
    }

    public void setQuoteState(boolean z4) {
        this.P.setSelected(z4);
    }

    public void setSelectedBlockType(int i10) {
        d(i10, 0);
    }

    public void setSendEditing(boolean z4) {
        int i10;
        if (z4) {
            i10 = R.drawable.input_done;
        } else {
            i10 = R.drawable.send_plane_24;
        }
        this.C.setResourceId(i10);
    }

    public void setSendEnabled(boolean z4) {
        float f10;
        pp0 pp0Var = this.C;
        if (pp0Var.isEnabled() == z4) {
            return;
        }
        pp0Var.setEnabled(z4);
        ViewPropertyAnimator animate = pp0Var.animate();
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(150L).start();
    }

    public void setSendLoading(boolean z4) {
        if (this.T == z4) {
            return;
        }
        this.T = z4;
        this.C.invalidate();
    }

    public void setTopButtonsOffset(int i10) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i10) {
            layoutParams.topMargin = i10;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f46331f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i10) {
            layoutParams2.topMargin = i10;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z4) {
        int i10;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f46330c.setVisibility(i10);
    }

    public void setTopPanelVisible(boolean z4) {
        int i10;
        int i11 = 8;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.e.setVisibility(i10);
        if (z4) {
            i11 = 0;
        }
        this.f46330c.setVisibility(i11);
    }
}
