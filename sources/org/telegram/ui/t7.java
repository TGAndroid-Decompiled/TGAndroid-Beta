package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
public abstract class t7 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.hb0 {
    public boolean E;
    public final e7 F;
    public i7 G;
    public final org.telegram.ui.ActionBar.x1 f52274a;
    public final ArrayList f52275b;
    public final FrameLayout f52276c;
    public final org.telegram.ui.Components.j71 d;
    public final y6 f52277e;
    public final ArrayList f52278f;
    public ei.c h;
    public final org.telegram.ui.Components.k71 f52279n;
    public final r7[] f52280r;
    public h7 f52281s;
    public int f52282w;
    public final org.telegram.ui.Components.st0 f52283x;
    public int f52284y;

    public t7(Context context, y6 y6Var, ri.q qVar, org.telegram.ui.Components.st0 st0Var) {
        super(context);
        org.telegram.ui.Components.k71 gk0Var;
        float f10;
        this.f52275b = new ArrayList();
        this.f52278f = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.f52280r = r7VarArr;
        this.F = new e7(this, 0);
        this.f52277e = y6Var;
        this.f52283x = st0Var;
        if (st0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        r7VarArr[0] = new r7(org.telegram.messenger.gd.N0(2131750784, null), 0, new j7(this));
        r7VarArr[1] = new r7(org.telegram.messenger.gd.N0(2131748458, null), 1, new o7(this));
        r7VarArr[2] = new r7(org.telegram.messenger.gd.N0(2131745218, null), 2, new l7(this));
        r7VarArr[3] = new r7(org.telegram.messenger.gd.N0(2131748126, null), 3, new q7(this));
        int i7 = 0;
        while (true) {
            r7[] r7VarArr2 = this.f52280r;
            if (i7 >= r7VarArr2.length) {
                break;
            }
            r7 r7Var = r7VarArr2[i7];
            if (r7Var != null) {
                this.f52278f.add(i7, r7Var);
            }
            i7++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f52276c = frameLayout;
        if (st0Var == null) {
            gk0Var = new org.telegram.ui.Components.k71(getContext(), null);
        } else {
            gk0Var = new org.telegram.ui.Components.gk0(context, y6Var.getResourceProvider(), st0Var);
        }
        this.f52279n = gk0Var;
        gk0Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(gk0Var);
        }
        if (qVar == null && st0Var == null) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        addView(gk0Var, c8.na.d(-1, -1.0f, 48, 0.0f, f10, 0.0f, 0.0f));
        org.telegram.ui.Components.j71 k10 = gk0Var.k(qVar != null ? -2 : 3, true);
        this.d = k10;
        frameLayout.addView(k10, c8.na.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, c8.na.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        gk0Var.setAdapter(new d7(this, context, qVar, y6Var, st0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, c8.na.c(48.0f, -1));
        org.telegram.messenger.g0.X3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(true);
        this.f52274a = x1Var;
        imageView.setImageDrawable(x1Var);
        int i10 = org.telegram.ui.ActionBar.n6.f29845y8;
        x1Var.a(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.n6.f29864z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, null);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131752029, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f52275b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f54537b;

            {
                this.f54537b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54537b.G.B();
                        return;
                    default:
                        this.f54537b.G.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        n6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.Y(n6Var, i10, null);
        linearLayout.addView(n6Var, c8.na.m(1.0f, 0, -1, 18, 0, 0));
        this.f52275b.add(n6Var);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, org.telegram.ui.ActionBar.n6.x0(null, i11, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false), false, null);
        q0Var.setIcon(2131232097);
        if (q0Var.getBackground() != null) {
            Drawable background = q0Var.getBackground();
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
            q0Var.setBackground(background);
            org.telegram.ui.ActionBar.u6.j(q0Var, background, null, M2, null);
        }
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.u6.s(q0Var.getIconView(), i10, null, PorterDuff.Mode.SRC_IN);
        }
        q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131751586, null));
        q0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(q0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f52275b.add(q0Var);
        q0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f54537b;

            {
                this.f54537b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54537b.G.B();
                        return;
                    default:
                        this.f54537b.G.clear();
                        return;
                }
            }
        });
    }

    public static void a(t7 t7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.ek0 ek0Var) {
        ArrayList arrayList = o7Var.f47709e;
        PhotoViewer.p1().J2(null, t7Var.f52277e, null);
        if (t7Var.f52281s == null) {
            t7Var.f52281s = new h7(t7Var);
        }
        t7Var.f52281s.f48440a = ek0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.p1().g2(o7Var.f50563r, arrayList.indexOf(m7Var), -1, false, t7Var.f52281s, null);
        }
    }

    public static void b(t7 t7Var, ei.b bVar, k7 k7Var) {
        boolean z10;
        y6 y6Var = t7Var.f52277e;
        org.telegram.ui.Components.ek0 listView = t7Var.getListView();
        if (k7Var.f49357e == 2) {
            if (listView.getAdapter() instanceof l7) {
                l7 l7Var = (l7) listView.getAdapter();
                PhotoViewer.p1().J2(null, y6Var, null);
                if (t7Var.f52281s == null) {
                    t7Var.f52281s = new h7(t7Var);
                }
                t7Var.f52281s.f48440a = listView;
                File file = bVar.f10956a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    org.telegram.messenger.g0.t2(file, file.getName(), null, y6Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (bVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new org.telegram.messenger.ef(0, path, 0, z10, 0, 0));
                    PhotoViewer.p1().g2(arrayList, 0, -1, false, t7Var.f52281s, null);
                }
            } else {
                return;
            }
        }
        if (k7Var.f49357e == 3) {
            if (MediaController.B().I(bVar.f10960f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(bVar.f10960f, true);
                    return;
                } else {
                    MediaController.B().S(bVar.f10960f);
                    return;
                }
            }
            MediaController.B().S(bVar.f10960f);
        }
    }

    public final org.telegram.ui.Components.ek0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof s7) {
            return ((s7) view).f51988a;
        }
        return (org.telegram.ui.Components.ek0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t7.d():void");
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.k71 k71Var = this.f52279n;
            if (i7 < k71Var.getViewPages().length) {
                org.telegram.ui.Components.ek0 c10 = c(k71Var.getViewPages()[i7]);
                if (c10 != null) {
                    org.telegram.messenger.g0.Z3(c10);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.ek0 getListView() {
        return c(this.f52279n.getCurrentView());
    }

    public org.telegram.ui.Components.k71 getViewPager() {
        return this.f52279n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.F);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public void setCacheModel(ei.c cVar) {
        this.h = cVar;
        d();
    }

    public void setDelegate(i7 i7Var) {
        this.G = i7Var;
    }

    public void setTargetTabsPosition(int i7) {
        this.f52284y = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f52274a.a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29845y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
