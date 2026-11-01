package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.ff;
import org.telegram.messenger.k20;
import org.telegram.messenger.m20;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.messenger.xe;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.bg0;
import org.telegram.ui.eo0;
import org.telegram.ui.mb0;
import org.telegram.ui.z01;
public abstract class k2 extends FrameLayout implements vs {
    public static final xe f51394j0 = new xe(-1, null, null);
    public final TextView D;
    public final Drawable E;
    public final tl F;
    public final org.telegram.ui.ActionBar.t0 G;
    public final ImageView H;
    public final LinearLayout I;
    public final d J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public int N;
    public final float O;
    public final boolean P;
    public boolean Q;
    public int R;
    public final org.telegram.ui.Components.t5 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public k20 W;
    public final int f51395a;
    public m20 f51396a0;
    public final org.telegram.ui.ActionBar.p6 f51397b;
    public final ArrayList f51398b0;
    public final Paint f51399c;
    public boolean f51400c0;
    public final mb0 d;
    public boolean f51401d0;
    public final oi e;
    public xe f51402e0;
    public final g2 f51403f;
    public ArrayList f51404f0;
    public ArrayList f51405g0;
    public final FrameLayout h;
    public final ArrayList f51406h0;
    public bg0 f51407i0;
    public final uk0 f51408n;
    public final e2 f51409r;
    public final ew0 f51410s;
    public final r2 f51411w;
    public boolean f51412x;
    public final org.telegram.ui.ActionBar.l f51413y;

    public k2(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, xe xeVar, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f51399c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.f51398b0 = arrayList;
        this.f51406h0 = new ArrayList();
        this.O = f7;
        this.f51395a = i10;
        this.f51397b = p6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.33f), 0.0f, org.telegram.messenger.i0.L(-0.4f), 134217728);
        mb0 mb0Var = new mb0(this, context, p6Var, 6);
        this.d = mb0Var;
        mb0Var.setItemSelectorColorProvider(new th.m1(13));
        g2 g2Var = new g2(this);
        this.f51403f = g2Var;
        mb0Var.setAdapter(g2Var);
        oi oiVar = new oi(4, this);
        this.e = oiVar;
        mb0Var.setLayoutManager(oiVar);
        mb0Var.setFastScrollEnabled(1);
        mb0Var.setFastScrollVisible(true);
        mb0Var.getFastScroll().setAlpha(0.0f);
        oiVar.O = new jg.h1(this, 18);
        mb0Var.i(new dh.g(15));
        mb0Var.setClipToPadding(false);
        addView(mb0Var, w7.b6.e(-1, -1, 119));
        mb0Var.setOnItemClickListener(new hk0(this) {
            public final k2 f50913b;

            {
                this.f50913b = this;
            }

            @Override
            public final void f(int i11, View view) {
                k20 k20Var;
                switch (r2) {
                    case 0:
                        k2 k2Var = this.f50913b;
                        ArrayList arrayList2 = k2Var.f51398b0;
                        ArrayList arrayList3 = k2Var.f51406h0;
                        if (i11 >= 2 && k2Var.W != null && (view instanceof h2)) {
                            h2 h2Var = (h2) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (k2Var.f51400c0) {
                                if (i12 == 0) {
                                    k2Var.e(k2.f51394j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (k2Var.f51401d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    n5 n5Var = (n5) arrayList2.get(i12);
                                    k20 k20Var2 = k2Var.W;
                                    if (n5Var.K) {
                                        bitmap = k2.d(h2Var);
                                    }
                                    k20Var2.a(n5Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < k2Var.f51404f0.size()) {
                                ff ffVar = (ff) k2Var.f51404f0.get(i12);
                                if (arrayList3.isEmpty() && !k2Var.Q) {
                                    k20 k20Var3 = k2Var.W;
                                    if (ffVar.f14603b && !ffVar.d()) {
                                        bitmap = k2.d(h2Var);
                                    }
                                    k20Var3.a(ffVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(ffVar)) {
                                    arrayList3.remove(ffVar);
                                } else if (arrayList3.size() + 1 > k2Var.R) {
                                    int i13 = -k2Var.N;
                                    k2Var.N = i13;
                                    org.telegram.messenger.i0.F3(i13, h2Var, null);
                                    org.telegram.messenger.t2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(ffVar);
                                }
                                org.telegram.messenger.i0.a4(k2Var.d);
                                k2Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        k2 k2Var2 = this.f50913b;
                        e2 e2Var = k2Var2.f51409r;
                        org.telegram.ui.ActionBar.t0 t0Var = k2Var2.G;
                        if (t0Var != null) {
                            org.telegram.messenger.i0.v1(t0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < e2Var.f51319c.size() && (k20Var = k2Var2.W) != null) {
                            k20Var.a(e2Var.f51319c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        mb0Var.setOnItemLongClickListener(new rh.d0(this, 25));
        mb0Var.setOnScrollListener(new d2(this, 0));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, p6Var);
        this.f51413y = lVar;
        lVar.setBackgroundColor(-14737633);
        lVar.setTitleColor(-1);
        lVar.setAlpha(0.0f);
        lVar.setVisibility(8);
        lVar.setBackButtonImage(2131231241);
        lVar.C(436207615, false);
        lVar.D(-1, false);
        lVar.D(-1, true);
        addView(lVar, w7.b6.e(-1, -2, 55));
        lVar.setActionBarMenuOnItemClick(new z01(this, 17));
        org.telegram.ui.ActionBar.y p5 = lVar.p();
        tl tlVar = new tl(this, context, p5, p6Var, 3);
        this.F = tlVar;
        tlVar.setSubMenuOpenSide(1);
        if (org.telegram.messenger.i0.Q1()) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        lVar.addView(tlVar, 0, w7.b6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        tlVar.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f50956b;

            {
                this.f50956b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f50956b.F.U(null, null);
                        return;
                    case 1:
                        k2 k2Var = this.f50956b;
                        if (k2Var.I.getAlpha() >= 0.25f) {
                            k2Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        k2 k2Var2 = this.f50956b;
                        if (k2Var2.I.getAlpha() >= 0.25f) {
                            k2Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f50956b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        Drawable mutate = context.getResources().getDrawable(2131231254).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
        textView.setPadding(0, org.telegram.messenger.i0.f16166m, org.telegram.messenger.i0.L(10.0f), 0);
        tlVar.addView(textView, w7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, w7.b6.e(-1, -1, 119));
        uk0 uk0Var = new uk0(context, p6Var);
        this.f51408n = uk0Var;
        uk0Var.setLayoutManager(new s4.r(3));
        e2 e2Var = new e2(this);
        this.f51409r = e2Var;
        uk0Var.setAdapter(e2Var);
        uk0Var.setOnScrollListener(new d2(this, 1));
        uk0Var.setClipToPadding(true);
        uk0Var.i(new dh.g(14));
        frameLayout.addView(uk0Var, w7.b6.e(-1, -1, 119));
        float f11 = 10.0f;
        oh.i iVar = new oh.i(2, context, p6Var);
        iVar.setViewType(2);
        iVar.setAlpha(0.0f);
        iVar.setVisibility(8);
        frameLayout.addView(iVar, w7.b6.e(-1, -1, 119));
        ew0 ew0Var = new ew0(context, iVar, 11, p6Var);
        this.f51410s = ew0Var;
        nh.p pVar = ew0Var.d;
        pVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(pVar, org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
        pVar.setTypeface(null);
        pVar.setText(dd.L0(2131745777, null));
        this.f51411w = new r2(this, false, new ph.h1(this, 23));
        frameLayout.addView(ew0Var, w7.b6.e(-1, -1, 119));
        uk0Var.setEmptyView(ew0Var);
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, 2131232485);
        a2.N();
        a2.H = new eo0(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(dd.L0(2131745778, null));
        uk0Var.setOnItemClickListener(new hk0(this) {
            public final k2 f50913b;

            {
                this.f50913b = this;
            }

            @Override
            public final void f(int i11, View view) {
                k20 k20Var;
                switch (r2) {
                    case 0:
                        k2 k2Var = this.f50913b;
                        ArrayList arrayList2 = k2Var.f51398b0;
                        ArrayList arrayList3 = k2Var.f51406h0;
                        if (i11 >= 2 && k2Var.W != null && (view instanceof h2)) {
                            h2 h2Var = (h2) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (k2Var.f51400c0) {
                                if (i12 == 0) {
                                    k2Var.e(k2.f51394j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (k2Var.f51401d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    n5 n5Var = (n5) arrayList2.get(i12);
                                    k20 k20Var2 = k2Var.W;
                                    if (n5Var.K) {
                                        bitmap = k2.d(h2Var);
                                    }
                                    k20Var2.a(n5Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < k2Var.f51404f0.size()) {
                                ff ffVar = (ff) k2Var.f51404f0.get(i12);
                                if (arrayList3.isEmpty() && !k2Var.Q) {
                                    k20 k20Var3 = k2Var.W;
                                    if (ffVar.f14603b && !ffVar.d()) {
                                        bitmap = k2.d(h2Var);
                                    }
                                    k20Var3.a(ffVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(ffVar)) {
                                    arrayList3.remove(ffVar);
                                } else if (arrayList3.size() + 1 > k2Var.R) {
                                    int i13 = -k2Var.N;
                                    k2Var.N = i13;
                                    org.telegram.messenger.i0.F3(i13, h2Var, null);
                                    org.telegram.messenger.t2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(ffVar);
                                }
                                org.telegram.messenger.i0.a4(k2Var.d);
                                k2Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        k2 k2Var2 = this.f50913b;
                        e2 e2Var2 = k2Var2.f51409r;
                        org.telegram.ui.ActionBar.t0 t0Var = k2Var2.G;
                        if (t0Var != null) {
                            org.telegram.messenger.i0.v1(t0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < e2Var2.f51319c.size() && (k20Var = k2Var2.W) != null) {
                            k20Var.a(e2Var2.f51319c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = wp.r1(i10).O1().f48936w.f51963b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                n5 n5Var = (n5) obj;
                if (!n5Var.f51544g && !n5Var.f51573w) {
                    this.f51398b0.add(n5Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, linearLayout, p6Var);
            linearLayout.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(org.telegram.messenger.i0.f16167n > 0 ? 0.0f : f11) + org.telegram.messenger.i0.f16167n);
            addView(linearLayout, w7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.i0.L(32.0f));
            linearLayout.setVisibility(8);
            d i12 = a30.i(24, context, p6Var, true);
            this.J = i12;
            i12.i(dd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(i12, w7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                i12.setOnClickListener(new View.OnClickListener(this) {
                    public final k2 f50956b;

                    {
                        this.f50956b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f50956b.F.U(null, null);
                                return;
                            case 1:
                                k2 k2Var = this.f50956b;
                                if (k2Var.I.getAlpha() >= 0.25f) {
                                    k2Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                k2 k2Var2 = this.f50956b;
                                if (k2Var2.I.getAlpha() >= 0.25f) {
                                    k2Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f50956b.f(false);
                                return;
                        }
                    }
                });
            }
            d i13 = a30.i(24, context, p6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            dq dqVar = new dq(2131231940, 0);
            dqVar.f25568r = -org.telegram.messenger.i0.L(1.33f);
            dqVar.f25569s = org.telegram.messenger.i0.L(0.66f);
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) dd.L0(2131744797, null));
            i13.i(spannableStringBuilder, false, true);
            linearLayout.addView(i13, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            i13.setOnClickListener(new View.OnClickListener(this) {
                public final k2 f50956b;

                {
                    this.f50956b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f50956b.F.U(null, null);
                            return;
                        case 1:
                            k2 k2Var = this.f50956b;
                            if (k2Var.I.getAlpha() >= 0.25f) {
                                k2Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            k2 k2Var2 = this.f50956b;
                            if (k2Var2.I.getAlpha() >= 0.25f) {
                                k2Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f50956b.f(false);
                            return;
                    }
                }
            });
        } else {
            this.I = null;
            this.J = null;
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231195);
            int L = org.telegram.messenger.i0.L(56.0f);
            int i14 = org.telegram.ui.ActionBar.t6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i14, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.a7.k(imageView, L2, N, null, p6Var);
            w7.e6.b(imageView, 0.1f, 1.5f);
            addView(imageView, w7.b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final k2 f50956b;

                {
                    this.f50956b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f50956b.F.U(null, null);
                            return;
                        case 1:
                            k2 k2Var = this.f50956b;
                            if (k2Var.I.getAlpha() >= 0.25f) {
                                k2Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            k2 k2Var2 = this.f50956b;
                            if (k2Var2.I.getAlpha() >= 0.25f) {
                                k2Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f50956b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        xe xeVar2 = f51394j0;
        if (xeVar != null && (xeVar != xeVar2 || this.f51398b0.size() > 0)) {
            this.f51402e0 = xeVar;
        } else {
            ArrayList arrayList3 = this.f51405g0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f51402e0 = (xe) this.f51405g0.get(0);
            } else {
                this.f51402e0 = MediaController.Y1;
            }
        }
        this.f51404f0 = b(this.f51402e0);
        i();
        xe xeVar3 = this.f51402e0;
        if (xeVar3 == MediaController.Y1) {
            this.D.setText(dd.L0(2131752238, null));
        } else if (xeVar3 == xeVar2) {
            this.D.setText(dd.L0(2131744697, null));
        } else {
            this.D.setText(xeVar3.f19430c);
        }
    }

    public static Bitmap d(h2 h2Var) {
        Bitmap bitmap;
        if (h2Var != null && (bitmap = h2Var.f51245a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(xe xeVar) {
        if (xeVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = xeVar.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ff ffVar = (ff) arrayList.get(i10);
            if (!this.L || !ffVar.f14603b) {
                arrayList2.add(ffVar);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.f14775r2;
        g2 g2Var = this.f51403f;
        int i13 = 0;
        if (i10 == i12) {
            h();
            if (this.f51402e0 != null) {
                while (true) {
                    if (i13 >= MediaController.a2.size()) {
                        break;
                    }
                    xe xeVar = (xe) MediaController.a2.get(i13);
                    int i14 = xeVar.f19428a;
                    xe xeVar2 = this.f51402e0;
                    if (i14 == xeVar2.f19428a && xeVar.f19429b == xeVar2.f19429b) {
                        this.f51402e0 = xeVar;
                        break;
                    }
                    i13++;
                }
            } else {
                ArrayList arrayList = this.f51405g0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f51402e0 = (xe) this.f51405g0.get(0);
                } else {
                    this.f51402e0 = MediaController.Y1;
                }
            }
            this.f51404f0 = b(this.f51402e0);
            this.f51406h0.clear();
            i();
            if (g2Var != null) {
                g2Var.f();
            }
        } else if (i10 == at.f14825y5) {
            ArrayList arrayList2 = this.f51398b0;
            arrayList2.clear();
            if (!this.L) {
                ArrayList arrayList3 = wp.r1(this.f51395a).O1().f48936w.f51963b;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    n5 n5Var = (n5) obj;
                    if (!n5Var.f51544g && !n5Var.f51573w) {
                        arrayList2.add(n5Var);
                    }
                }
            }
            h();
            i();
            if (g2Var != null) {
                g2Var.f();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float g10 = g();
        int i10 = 0;
        if (g10 <= i0.a.d(32.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.S.d(z10);
        float T1 = org.telegram.messenger.i0.T1(g10, 0.0f, d);
        if (z10 != this.f51412x) {
            this.f51412x = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f51412x) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).start();
        }
        org.telegram.ui.ActionBar.l lVar = this.f51413y;
        if (lVar != null) {
            lVar.setAlpha(d);
            if (d <= 0.0f) {
                i10 = 8;
            }
            if (lVar.getVisibility() != i10) {
                lVar.setVisibility(i10);
            }
        }
        bg0 bg0Var = this.f51407i0;
        if (bg0Var != null) {
            bg0Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.i0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.f51399c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(xe xeVar, boolean z10) {
        this.f51402e0 = xeVar;
        this.f51404f0 = b(xeVar);
        this.f51406h0.clear();
        i();
        xe xeVar2 = this.f51402e0;
        xe xeVar3 = MediaController.Y1;
        TextView textView = this.D;
        if (xeVar2 == xeVar3) {
            textView.setText(dd.L0(2131752238, null));
        } else if (xeVar2 == f51394j0) {
            textView.setText(dd.L0(2131744697, null));
        } else {
            textView.setText(xeVar2.f19430c);
        }
        this.f51403f.f();
        oi oiVar = this.e;
        if (z10) {
            ci.p pVar = new ci.p(getContext(), 2);
            pVar.f48056a = 1;
            pVar.f4253p = org.telegram.messenger.i0.L(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            oiVar.w0(pVar);
            return;
        }
        oiVar.h1(1, org.telegram.messenger.i0.L(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        h2 h2Var;
        if (this.f51396a0 != null) {
            ArrayList arrayList = this.f51406h0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.W.a((ff) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    mb0 mb0Var = this.d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ff ffVar = (ff) obj;
                        if (ffVar.f14603b && !ffVar.d()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < mb0Var.getChildCount()) {
                                    View childAt = mb0Var.getChildAt(i11);
                                    if (childAt instanceof h2) {
                                        h2Var = (h2) childAt;
                                        if (h2Var.S == ffVar) {
                                            break;
                                        }
                                    }
                                    i11++;
                                } else {
                                    h2Var = null;
                                    break;
                                }
                            }
                            bitmap = d(h2Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f51396a0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        org.telegram.messenger.i0.a4(mb0Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        mb0 mb0Var = this.d;
        if (mb0Var != null && mb0Var.getChildCount() > 0) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < mb0Var.getChildCount(); i11++) {
                View childAt = mb0Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        } else {
            padding = getPadding();
        }
        if (mb0Var == null) {
            return padding;
        }
        return org.telegram.messenger.i0.W1(mb0Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.i0.f16172q.y * 0.35f);
    }

    public xe getSelectedAlbum() {
        return this.f51402e0;
    }

    public String getTitle() {
        int i10;
        if (this.L) {
            i10 = 2131754428;
        } else {
            i10 = 2131752121;
        }
        return dd.L0(i10, null);
    }

    public final void h() {
        a aVar;
        tl tlVar = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = tlVar.f20827b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.a2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f51405g0 = arrayList2;
        Collections.sort(arrayList2, new bi.v6(arrayList, 6));
        ArrayList arrayList3 = this.f51398b0;
        boolean isEmpty = arrayList3.isEmpty();
        xe xeVar = f51394j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f51405g0;
            arrayList4.add(!arrayList4.isEmpty(), xeVar);
        }
        boolean isEmpty2 = this.f51405g0.isEmpty();
        TextView textView = this.D;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.f51405g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            xe xeVar2 = (xe) this.f51405g0.get(i10);
            if (xeVar2 == xeVar) {
                aVar = new a(getContext(), xeVar2.d, dd.M0("StoryDraftsAlbum"), arrayList3.size(), this.f51397b);
            } else {
                ArrayList b10 = b(xeVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), xeVar2.d, xeVar2.f19430c, b10.size(), this.f51397b);
                }
            }
            tlVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new rh.u1(8, this, xeVar2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f51405g0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f51405g0.get(0) == this.f51402e0 && this.f51398b0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51400c0 = z10;
        if (z10 || (this.f51402e0 != f51394j0 && ((arrayList = this.f51405g0) == null || arrayList.isEmpty() || this.f51405g0.get(0) != this.f51402e0))) {
            z11 = false;
        }
        this.f51401d0 = z11;
    }

    public final void j() {
        float f7;
        float f10;
        int L;
        ArrayList arrayList = this.f51406h0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        float f11 = 0.0f;
        float f12 = 1.0f;
        ImageView imageView = this.H;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            if (!isEmpty) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            float f13 = 0.7f;
            if (!isEmpty) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!isEmpty) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
            if (!isEmpty) {
                L = -org.telegram.messenger.i0.f16167n;
            } else {
                L = org.telegram.messenger.i0.L(8.0f);
            }
            a30.m(scaleY.translationY(L), gr.h, 320L);
        }
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            d dVar = this.J;
            if (dVar != null) {
                dVar.i(dd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f14 = 10.0f;
            int L2 = org.telegram.messenger.i0.L(10.0f);
            int L3 = org.telegram.messenger.i0.L(10.0f);
            int L4 = org.telegram.messenger.i0.L(10.0f);
            if (org.telegram.messenger.i0.f16167n > 0) {
                f14 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, org.telegram.messenger.i0.L(f14) + org.telegram.messenger.i0.f16167n);
            if (this.T != z10) {
                this.T = z10;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f12);
                if (isEmpty) {
                    f11 = org.telegram.messenger.i0.L(32.0f);
                }
                alpha2.translationY(f11).setInterpolator(gr.h).setDuration(320L).setListener(new sg.y(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        at.e().c(this, at.f14775r2);
        at.f(this.f51395a).c(this, at.f14825y5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.e().n(this, at.f14775r2);
        at.f(this.f51395a).n(this, at.f14825y5);
        h2.f51243e0.clear();
        h2.f51244f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = h2.f51241c0;
            if (i10 < arrayList.size()) {
                ((org.telegram.messenger.s5) arrayList.get(i10)).cleanupQueue();
                ((org.telegram.messenger.s5) arrayList.get(i10)).recycle();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int L;
        float f7;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m;
        mb0 mb0Var = this.d;
        mb0Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m;
        int L3 = org.telegram.messenger.i0.L(1.0f);
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (org.telegram.messenger.i0.f16167n > 0) {
                i12 = 0;
            } else {
                i12 = 10;
            }
            L = org.telegram.messenger.i0.L(i12 + 114);
        }
        mb0Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.i0.f16167n);
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setTranslationY(-org.telegram.messenger.i0.f16167n);
        }
        if (linearLayout != null) {
            int L4 = org.telegram.messenger.i0.L(10.0f);
            int L5 = org.telegram.messenger.i0.L(10.0f);
            int L6 = org.telegram.messenger.i0.L(10.0f);
            if (org.telegram.messenger.i0.f16167n > 0) {
                f10 = 0.0f;
            } else {
                f10 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, org.telegram.messenger.i0.L(f10) + org.telegram.messenger.i0.f16167n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = org.telegram.messenger.i0.f16167n;
        int i13 = org.telegram.messenger.i0.f16166m;
        int L7 = org.telegram.messenger.i0.L(10.0f);
        TextView textView = this.D;
        textView.setPadding(0, i13, L7, 0);
        if (!org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x > point.y) {
                f7 = 18.0f;
                textView.setTextSize(f7);
                super.onMeasure(i10, i11);
            }
        }
        f7 = 20.0f;
        textView.setTextSize(f7);
        super.onMeasure(i10, i11);
    }

    public void setMaxCount(int i10) {
        this.R = i10;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            org.telegram.messenger.i0.a4(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.V = runnable;
    }

    public void setOnSelectListener(k20 k20Var) {
        this.W = k20Var;
    }

    public void setOnSelectMultipleListener(m20 m20Var) {
        this.f51396a0 = m20Var;
    }

    public void c(boolean z10) {
    }

    public void a() {
    }
}
