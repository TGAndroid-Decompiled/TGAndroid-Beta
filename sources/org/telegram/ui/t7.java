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
public abstract class t7 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.ui.Components.za0 {
    public boolean E;
    public final e7 F;
    public i7 G;
    public final org.telegram.ui.ActionBar.x1 f51397a;
    public final ArrayList f51398b;
    public final FrameLayout f51399c;
    public final org.telegram.ui.Components.v61 d;
    public final y6 f51400e;
    public final ArrayList f51401f;
    public ei.c h;
    public final org.telegram.ui.Components.w61 f51402n;
    public final r7[] f51403r;
    public h7 f51404s;
    public int f51405w;
    public final org.telegram.ui.Components.it0 f51406x;
    public int f51407y;

    public t7(Context context, y6 y6Var, ri.q qVar, org.telegram.ui.Components.it0 it0Var) {
        super(context);
        org.telegram.ui.Components.w61 wj0Var;
        float f10;
        this.f51398b = new ArrayList();
        this.f51401f = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.f51403r = r7VarArr;
        this.F = new e7(this, 0);
        this.f51400e = y6Var;
        this.f51406x = it0Var;
        if (it0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        r7VarArr[0] = new r7(org.telegram.messenger.hd.M0(2131750796, null), 0, new j7(this));
        r7VarArr[1] = new r7(org.telegram.messenger.hd.M0(2131748651, null), 1, new o7(this));
        r7VarArr[2] = new r7(org.telegram.messenger.hd.M0(2131745414, null), 2, new l7(this));
        r7VarArr[3] = new r7(org.telegram.messenger.hd.M0(2131748319, null), 3, new q7(this));
        int i7 = 0;
        while (true) {
            r7[] r7VarArr2 = this.f51403r;
            if (i7 >= r7VarArr2.length) {
                break;
            }
            r7 r7Var = r7VarArr2[i7];
            if (r7Var != null) {
                this.f51401f.add(i7, r7Var);
            }
            i7++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51399c = frameLayout;
        if (it0Var == null) {
            wj0Var = new org.telegram.ui.Components.w61(getContext(), null);
        } else {
            wj0Var = new org.telegram.ui.Components.wj0(context, y6Var.getResourceProvider(), it0Var);
        }
        this.f51402n = wj0Var;
        wj0Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(wj0Var);
        }
        if (qVar == null && it0Var == null) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        addView(wj0Var, c8.ja.d(-1, -1.0f, 48, 0.0f, f10, 0.0f, 0.0f));
        org.telegram.ui.Components.v61 i10 = wj0Var.i(qVar != null ? -2 : 3, true);
        this.d = i10;
        frameLayout.addView(i10, c8.ja.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, c8.ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        wj0Var.setAdapter(new d7(this, context, qVar, y6Var, it0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, c8.ja.c(48.0f, -1));
        org.telegram.messenger.g0.Y3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(true);
        this.f51397a = x1Var;
        imageView.setImageDrawable(x1Var);
        int i11 = org.telegram.ui.ActionBar.j6.f29243y8;
        x1Var.a(org.telegram.ui.ActionBar.j6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.j6.f29262z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, null);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f51398b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f53849b;

            {
                this.f53849b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f53849b.G.y();
                        return;
                    default:
                        this.f53849b.G.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, true);
        h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(h6Var, i11, null);
        linearLayout.addView(h6Var, c8.ja.m(1.0f, 0, -1, 18, 0, 0));
        this.f51398b.add(h6Var);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, org.telegram.ui.ActionBar.j6.x0(null, i12, false), org.telegram.ui.ActionBar.j6.x0(null, i11, false), false, null);
        q0Var.setIcon(2131232093);
        if (q0Var.getBackground() != null) {
            Drawable background = q0Var.getBackground();
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
            q0Var.setBackground(background);
            org.telegram.ui.ActionBar.q6.j(q0Var, background, null, M2, null);
        }
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.q6.s(q0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131751598, null));
        q0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(q0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f51398b.add(q0Var);
        q0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f53849b;

            {
                this.f53849b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f53849b.G.y();
                        return;
                    default:
                        this.f53849b.G.clear();
                        return;
                }
            }
        });
    }

    public static void a(t7 t7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.uj0 uj0Var) {
        ArrayList arrayList = o7Var.f47004e;
        PhotoViewer.p1().I2(null, t7Var.f51400e, null);
        if (t7Var.f51404s == null) {
            t7Var.f51404s = new h7(t7Var);
        }
        t7Var.f51404s.f47614a = uj0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.p1().f2(o7Var.f49823r, arrayList.indexOf(m7Var), -1, false, t7Var.f51404s, null);
        }
    }

    public static void b(t7 t7Var, ei.b bVar, k7 k7Var) {
        boolean z10;
        y6 y6Var = t7Var.f51400e;
        org.telegram.ui.Components.uj0 listView = t7Var.getListView();
        if (k7Var.f48561e == 2) {
            if (listView.getAdapter() instanceof l7) {
                l7 l7Var = (l7) listView.getAdapter();
                PhotoViewer.p1().I2(null, y6Var, null);
                if (t7Var.f51404s == null) {
                    t7Var.f51404s = new h7(t7Var);
                }
                t7Var.f51404s.f47614a = listView;
                File file = bVar.f10646a;
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
                    arrayList.add(new org.telegram.messenger.ff(0, path, 0, z10, 0, 0));
                    PhotoViewer.p1().f2(arrayList, 0, -1, false, t7Var.f51404s, null);
                }
            } else {
                return;
            }
        }
        if (k7Var.f48561e == 3) {
            if (MediaController.B().I(bVar.f10650f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(bVar.f10650f, true);
                    return;
                } else {
                    MediaController.B().S(bVar.f10650f);
                    return;
                }
            }
            MediaController.B().S(bVar.f10650f);
        }
    }

    public final org.telegram.ui.Components.uj0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof s7) {
            return ((s7) view).f51130a;
        }
        return (org.telegram.ui.Components.uj0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t7.d():void");
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.w61 w61Var = this.f51402n;
            if (i7 < w61Var.getViewPages().length) {
                org.telegram.ui.Components.uj0 c10 = c(w61Var.getViewPages()[i7]);
                if (c10 != null) {
                    org.telegram.messenger.g0.a4(c10);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.uj0 getListView() {
        return c(this.f51402n.getCurrentView());
    }

    public org.telegram.ui.Components.w61 getViewPager() {
        return this.f51402n;
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
        this.f51407y = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f51397a.a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29243y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
