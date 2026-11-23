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
    public final org.telegram.ui.ActionBar.x1 f51919a;
    public final ArrayList f51920b;
    public final FrameLayout f51921c;
    public final org.telegram.ui.Components.i71 d;
    public final x6 f51922e;
    public final ArrayList f51923f;
    public ei.c h;
    public final org.telegram.ui.Components.j71 f51924n;
    public final q7[] f51925r;
    public g7 f51926s;
    public int f51927w;
    public final org.telegram.ui.Components.tt0 f51928x;
    public int f51929y;

    public s7(Context context, x6 x6Var, ri.q qVar, org.telegram.ui.Components.tt0 tt0Var) {
        super(context);
        org.telegram.ui.Components.j71 gk0Var;
        float f10;
        this.f51920b = new ArrayList();
        this.f51923f = new ArrayList();
        q7[] q7VarArr = new q7[5];
        this.f51925r = q7VarArr;
        this.F = new d7(this, 0);
        this.f51922e = x6Var;
        this.f51928x = tt0Var;
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
            q7[] q7VarArr2 = this.f51925r;
            if (i7 >= q7VarArr2.length) {
                break;
            }
            q7 q7Var = q7VarArr2[i7];
            if (q7Var != null) {
                this.f51923f.add(i7, q7Var);
            }
            i7++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51921c = frameLayout;
        if (tt0Var == null) {
            gk0Var = new org.telegram.ui.Components.j71(getContext(), null);
        } else {
            gk0Var = new org.telegram.ui.Components.gk0(context, x6Var.getResourceProvider(), tt0Var);
        }
        this.f51924n = gk0Var;
        gk0Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(gk0Var);
        }
        if (qVar == null && tt0Var == null) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        addView(gk0Var, c8.na.d(-1, -1.0f, 48, 0.0f, f10, 0.0f, 0.0f));
        org.telegram.ui.Components.i71 i10 = gk0Var.i(qVar != null ? -2 : 3, true);
        this.d = i10;
        frameLayout.addView(i10, c8.na.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, c8.na.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        gk0Var.setAdapter(new c7(this, context, qVar, x6Var, tt0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, c8.na.c(48.0f, -1));
        org.telegram.messenger.g0.X3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(true);
        this.f51919a = x1Var;
        imageView.setImageDrawable(x1Var);
        int i11 = org.telegram.ui.ActionBar.m6.f29741y8;
        x1Var.a(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.m6.f29760z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131752029, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f51920b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final s7 f54040b;

            {
                this.f54040b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54040b.G.k();
                        return;
                    default:
                        this.f54040b.G.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        o6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(o6Var, i11, null);
        linearLayout.addView(o6Var, c8.na.m(1.0f, 0, -1, 18, 0, 0));
        this.f51920b.add(o6Var);
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
        this.f51920b.add(q0Var);
        q0Var.setOnClickListener(new View.OnClickListener(this) {
            public final s7 f54040b;

            {
                this.f54040b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54040b.G.k();
                        return;
                    default:
                        this.f54040b.G.clear();
                        return;
                }
            }
        });
    }

    public static void a(s7 s7Var, l7 l7Var, n7 n7Var, org.telegram.ui.Components.ek0 ek0Var) {
        ArrayList arrayList = n7Var.f47119e;
        PhotoViewer.p1().I2(null, s7Var.f51922e, null);
        if (s7Var.f51926s == null) {
            s7Var.f51926s = new g7(s7Var);
        }
        s7Var.f51926s.f47934a = ek0Var;
        if (arrayList.indexOf(l7Var) >= 0) {
            PhotoViewer.p1().f2(n7Var.f50104r, arrayList.indexOf(l7Var), -1, false, s7Var.f51926s, null);
        }
    }

    public static void b(s7 s7Var, ei.b bVar, j7 j7Var) {
        boolean z10;
        x6 x6Var = s7Var.f51922e;
        org.telegram.ui.Components.ek0 listView = s7Var.getListView();
        if (j7Var.f48921e == 2) {
            if (listView.getAdapter() instanceof k7) {
                k7 k7Var = (k7) listView.getAdapter();
                PhotoViewer.p1().I2(null, x6Var, null);
                if (s7Var.f51926s == null) {
                    s7Var.f51926s = new g7(s7Var);
                }
                s7Var.f51926s.f47934a = listView;
                File file = bVar.f10958a;
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
                    PhotoViewer.p1().f2(arrayList, 0, -1, false, s7Var.f51926s, null);
                }
            } else {
                return;
            }
        }
        if (j7Var.f48921e == 3) {
            if (MediaController.B().I(bVar.f10962f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(bVar.f10962f, true);
                    return;
                } else {
                    MediaController.B().S(bVar.f10962f);
                    return;
                }
            }
            MediaController.B().S(bVar.f10962f);
        }
    }

    public final org.telegram.ui.Components.ek0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof r7) {
            return ((r7) view).f51506a;
        }
        return (org.telegram.ui.Components.ek0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s7.d():void");
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.j71 j71Var = this.f51924n;
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
        return c(this.f51924n.getCurrentView());
    }

    public org.telegram.ui.Components.j71 getViewPager() {
        return this.f51924n;
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
        this.f51929y = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f51919a.a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29741y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
