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
public abstract class s7 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.kb0 {
    public boolean E;
    public final d7 F;
    public h7 G;
    public final org.telegram.ui.ActionBar.x1 f51950a;
    public final ArrayList f51951b;
    public final FrameLayout f51952c;
    public final org.telegram.ui.Components.i71 d;
    public final x6 f51953e;
    public final ArrayList f51954f;
    public ei.c h;
    public final org.telegram.ui.Components.j71 f51955n;
    public final q7[] f51956r;
    public g7 f51957s;
    public int f51958w;
    public final org.telegram.ui.Components.tt0 f51959x;
    public int f51960y;

    public s7(Context context, x6 x6Var, ri.q qVar, org.telegram.ui.Components.tt0 tt0Var) {
        super(context);
        org.telegram.ui.Components.j71 gk0Var;
        float f10;
        this.f51951b = new ArrayList();
        this.f51954f = new ArrayList();
        q7[] q7VarArr = new q7[5];
        this.f51956r = q7VarArr;
        this.F = new d7(this, 0);
        this.f51953e = x6Var;
        this.f51959x = tt0Var;
        if (tt0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        q7VarArr[0] = new q7(org.telegram.messenger.hd.N0(2131750784, null), 0, new i7(this));
        q7VarArr[1] = new q7(org.telegram.messenger.hd.N0(2131748458, null), 1, new n7(this));
        q7VarArr[2] = new q7(org.telegram.messenger.hd.N0(2131745218, null), 2, new k7(this));
        q7VarArr[3] = new q7(org.telegram.messenger.hd.N0(2131748126, null), 3, new p7(this));
        int i7 = 0;
        while (true) {
            q7[] q7VarArr2 = this.f51956r;
            if (i7 >= q7VarArr2.length) {
                break;
            }
            q7 q7Var = q7VarArr2[i7];
            if (q7Var != null) {
                this.f51954f.add(i7, q7Var);
            }
            i7++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51952c = frameLayout;
        if (tt0Var == null) {
            gk0Var = new org.telegram.ui.Components.j71(getContext(), null);
        } else {
            gk0Var = new org.telegram.ui.Components.gk0(context, x6Var.getResourceProvider(), tt0Var);
        }
        this.f51955n = gk0Var;
        gk0Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(gk0Var);
        }
        if (qVar == null && tt0Var == null) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        addView(gk0Var, c8.ma.d(-1, -1.0f, 48, 0.0f, f10, 0.0f, 0.0f));
        org.telegram.ui.Components.i71 i10 = gk0Var.i(qVar != null ? -2 : 3, true);
        this.d = i10;
        frameLayout.addView(i10, c8.ma.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        gk0Var.setAdapter(new c7(this, context, qVar, x6Var, tt0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, c8.ma.c(48.0f, -1));
        org.telegram.messenger.g0.X3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(true);
        this.f51950a = x1Var;
        imageView.setImageDrawable(x1Var);
        int i11 = org.telegram.ui.ActionBar.m6.f29775y8;
        x1Var.a(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.m6.f29794z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131752029, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f51951b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final s7 f54066b;

            {
                this.f54066b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54066b.G.k();
                        return;
                    default:
                        this.f54066b.G.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        o6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(o6Var, i11, null);
        linearLayout.addView(o6Var, c8.ma.m(1.0f, 0, -1, 18, 0, 0));
        this.f51951b.add(o6Var);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, org.telegram.ui.ActionBar.m6.x0(null, i12, false), org.telegram.ui.ActionBar.m6.x0(null, i11, false), false, null);
        q0Var.setIcon(2131232094);
        if (q0Var.getBackground() != null) {
            Drawable background = q0Var.getBackground();
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
            q0Var.setBackground(background);
            org.telegram.ui.ActionBar.t6.j(q0Var, background, null, M2, null);
        }
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.t6.s(q0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131751586, null));
        q0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(q0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f51951b.add(q0Var);
        q0Var.setOnClickListener(new View.OnClickListener(this) {
            public final s7 f54066b;

            {
                this.f54066b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54066b.G.k();
                        return;
                    default:
                        this.f54066b.G.clear();
                        return;
                }
            }
        });
    }

    public static void a(s7 s7Var, l7 l7Var, n7 n7Var, org.telegram.ui.Components.ek0 ek0Var) {
        ArrayList arrayList = n7Var.f47154e;
        PhotoViewer.p1().I2(null, s7Var.f51953e, null);
        if (s7Var.f51957s == null) {
            s7Var.f51957s = new g7(s7Var);
        }
        s7Var.f51957s.f47987a = ek0Var;
        if (arrayList.indexOf(l7Var) >= 0) {
            PhotoViewer.p1().f2(n7Var.f50116r, arrayList.indexOf(l7Var), -1, false, s7Var.f51957s, null);
        }
    }

    public static void b(s7 s7Var, ei.b bVar, j7 j7Var) {
        boolean z10;
        x6 x6Var = s7Var.f51953e;
        org.telegram.ui.Components.ek0 listView = s7Var.getListView();
        if (j7Var.f48912e == 2) {
            if (listView.getAdapter() instanceof k7) {
                k7 k7Var = (k7) listView.getAdapter();
                PhotoViewer.p1().I2(null, x6Var, null);
                if (s7Var.f51957s == null) {
                    s7Var.f51957s = new g7(s7Var);
                }
                s7Var.f51957s.f47987a = listView;
                File file = bVar.f10995a;
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
                    arrayList.add(new org.telegram.messenger.ff(0, path, 0, z10, 0, 0));
                    PhotoViewer.p1().f2(arrayList, 0, -1, false, s7Var.f51957s, null);
                }
            } else {
                return;
            }
        }
        if (j7Var.f48912e == 3) {
            if (MediaController.B().I(bVar.f10999f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(bVar.f10999f, true);
                    return;
                } else {
                    MediaController.B().S(bVar.f10999f);
                    return;
                }
            }
            MediaController.B().S(bVar.f10999f);
        }
    }

    public final org.telegram.ui.Components.ek0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof r7) {
            return ((r7) view).f51475a;
        }
        return (org.telegram.ui.Components.ek0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s7.d():void");
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.j71 j71Var = this.f51955n;
            if (i7 < j71Var.getViewPages().length) {
                org.telegram.ui.Components.ek0 c10 = c(j71Var.getViewPages()[i7]);
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
        return c(this.f51955n.getCurrentView());
    }

    public org.telegram.ui.Components.j71 getViewPager() {
        return this.f51955n;
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
        this.f51960y = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f51950a.a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29775y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
