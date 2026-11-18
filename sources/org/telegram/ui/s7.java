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
public abstract class s7 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.jb0 {
    public boolean E;
    public final d7 F;
    public h7 G;
    public final org.telegram.ui.ActionBar.y1 f51906a;
    public final ArrayList f51907b;
    public final FrameLayout f51908c;
    public final org.telegram.ui.Components.f71 d;
    public final x6 f51909e;
    public final ArrayList f51910f;
    public ei.c h;
    public final org.telegram.ui.Components.g71 f51911n;
    public final q7[] f51912r;
    public g7 f51913s;
    public int f51914w;
    public final org.telegram.ui.Components.qt0 f51915x;
    public int f51916y;

    public s7(Context context, x6 x6Var, ri.q qVar, org.telegram.ui.Components.qt0 qt0Var) {
        super(context);
        org.telegram.ui.Components.g71 ek0Var;
        float f10;
        this.f51907b = new ArrayList();
        this.f51910f = new ArrayList();
        q7[] q7VarArr = new q7[5];
        this.f51912r = q7VarArr;
        this.F = new d7(this, 0);
        this.f51909e = x6Var;
        this.f51915x = qt0Var;
        if (qt0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        q7VarArr[0] = new q7(org.telegram.messenger.gd.M0(2131750785, null), 0, new i7(this));
        q7VarArr[1] = new q7(org.telegram.messenger.gd.M0(2131748459, null), 1, new n7(this));
        q7VarArr[2] = new q7(org.telegram.messenger.gd.M0(2131745219, null), 2, new k7(this));
        q7VarArr[3] = new q7(org.telegram.messenger.gd.M0(2131748127, null), 3, new p7(this));
        int i7 = 0;
        while (true) {
            q7[] q7VarArr2 = this.f51912r;
            if (i7 >= q7VarArr2.length) {
                break;
            }
            q7 q7Var = q7VarArr2[i7];
            if (q7Var != null) {
                this.f51910f.add(i7, q7Var);
            }
            i7++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51908c = frameLayout;
        if (qt0Var == null) {
            ek0Var = new org.telegram.ui.Components.g71(getContext(), null);
        } else {
            ek0Var = new org.telegram.ui.Components.ek0(context, x6Var.getResourceProvider(), qt0Var);
        }
        this.f51911n = ek0Var;
        ek0Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(ek0Var);
        }
        if (qVar == null && qt0Var == null) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        addView(ek0Var, c8.ma.d(-1, -1.0f, 48, 0.0f, f10, 0.0f, 0.0f));
        org.telegram.ui.Components.f71 i10 = ek0Var.i(qVar != null ? -2 : 3, true);
        this.d = i10;
        frameLayout.addView(i10, c8.ma.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        ek0Var.setAdapter(new c7(this, context, qVar, x6Var, qt0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, c8.ma.c(48.0f, -1));
        org.telegram.messenger.g0.X3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(true);
        this.f51906a = y1Var;
        imageView.setImageDrawable(y1Var);
        int i11 = org.telegram.ui.ActionBar.n6.f29788y8;
        y1Var.a(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.n6.f29807z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, null);
        imageView.setContentDescription(org.telegram.messenger.gd.M0(2131752030, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f51907b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final s7 f54015b;

            {
                this.f54015b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54015b.G.k();
                        return;
                    default:
                        this.f54015b.G.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        n6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.Y(n6Var, i11, null);
        linearLayout.addView(n6Var, c8.ma.m(1.0f, 0, -1, 18, 0, 0));
        this.f51907b.add(n6Var);
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, org.telegram.ui.ActionBar.n6.x0(null, i12, false), org.telegram.ui.ActionBar.n6.x0(null, i11, false), false, null);
        r0Var.setIcon(2131232094);
        if (r0Var.getBackground() != null) {
            Drawable background = r0Var.getBackground();
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
            r0Var.setBackground(background);
            org.telegram.ui.ActionBar.u6.j(r0Var, background, null, M2, null);
        }
        if (r0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.u6.s(r0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        r0Var.setContentDescription(org.telegram.messenger.gd.M0(2131751587, null));
        r0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(r0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f51907b.add(r0Var);
        r0Var.setOnClickListener(new View.OnClickListener(this) {
            public final s7 f54015b;

            {
                this.f54015b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54015b.G.k();
                        return;
                    default:
                        this.f54015b.G.clear();
                        return;
                }
            }
        });
    }

    public static void a(s7 s7Var, l7 l7Var, n7 n7Var, org.telegram.ui.Components.ck0 ck0Var) {
        ArrayList arrayList = n7Var.f47077e;
        PhotoViewer.p1().I2(null, s7Var.f51909e, null);
        if (s7Var.f51913s == null) {
            s7Var.f51913s = new g7(s7Var);
        }
        s7Var.f51913s.f47913a = ck0Var;
        if (arrayList.indexOf(l7Var) >= 0) {
            PhotoViewer.p1().f2(n7Var.f50085r, arrayList.indexOf(l7Var), -1, false, s7Var.f51913s, null);
        }
    }

    public static void b(s7 s7Var, ei.b bVar, j7 j7Var) {
        boolean z10;
        x6 x6Var = s7Var.f51909e;
        org.telegram.ui.Components.ck0 listView = s7Var.getListView();
        if (j7Var.f48892e == 2) {
            if (listView.getAdapter() instanceof k7) {
                k7 k7Var = (k7) listView.getAdapter();
                PhotoViewer.p1().I2(null, x6Var, null);
                if (s7Var.f51913s == null) {
                    s7Var.f51913s = new g7(s7Var);
                }
                s7Var.f51913s.f47913a = listView;
                File file = bVar.f10963a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    org.telegram.messenger.g0.t2(file, file.getName(), null, x6Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (bVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new org.telegram.messenger.ef(0, path, 0, z10, 0, 0));
                    PhotoViewer.p1().f2(arrayList, 0, -1, false, s7Var.f51913s, null);
                }
            } else {
                return;
            }
        }
        if (j7Var.f48892e == 3) {
            if (MediaController.B().I(bVar.f10967f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(bVar.f10967f, true);
                    return;
                } else {
                    MediaController.B().S(bVar.f10967f);
                    return;
                }
            }
            MediaController.B().S(bVar.f10967f);
        }
    }

    public final org.telegram.ui.Components.ck0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof r7) {
            return ((r7) view).f51482a;
        }
        return (org.telegram.ui.Components.ck0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s7.d():void");
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.g71 g71Var = this.f51911n;
            if (i7 < g71Var.getViewPages().length) {
                org.telegram.ui.Components.ck0 c10 = c(g71Var.getViewPages()[i7]);
                if (c10 != null) {
                    org.telegram.messenger.g0.Z3(c10);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.ck0 getListView() {
        return c(this.f51911n.getCurrentView());
    }

    public org.telegram.ui.Components.g71 getViewPager() {
        return this.f51911n;
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

    public void setDelegate(h7 h7Var) {
        this.G = h7Var;
    }

    public void setTargetTabsPosition(int i7) {
        this.f51916y = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f51906a.a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
