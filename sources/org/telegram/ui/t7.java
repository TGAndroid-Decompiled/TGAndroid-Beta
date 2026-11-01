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
public abstract class t7 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.ui.Components.rb0 {
    public boolean D;
    public final e7 E;
    public i7 F;
    public final org.telegram.ui.ActionBar.c2 f41556a;
    public final ArrayList f41557b;
    public final FrameLayout f41558c;
    public final org.telegram.ui.Components.w71 d;
    public final y6 e;
    public final ArrayList f41559f;
    public sh.b h;
    public final org.telegram.ui.Components.x71 f41560n;
    public final r7[] f41561r;
    public h7 f41562s;
    public int f41563w;
    public final org.telegram.ui.Components.lu0 f41564x;
    public int f41565y;

    public t7(Context context, y6 y6Var, ei.r rVar, org.telegram.ui.Components.lu0 lu0Var) {
        super(context);
        org.telegram.ui.Components.x71 wk0Var;
        float f7;
        this.f41557b = new ArrayList();
        this.f41559f = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.f41561r = r7VarArr;
        this.E = new e7(this, 0);
        this.e = y6Var;
        this.f41564x = lu0Var;
        if (lu0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        r7VarArr[0] = new r7(org.telegram.messenger.dd.L0(2131750797, null), 0, new j7(this));
        r7VarArr[1] = new r7(org.telegram.messenger.dd.L0(2131748666, null), 1, new o7(this));
        r7VarArr[2] = new r7(org.telegram.messenger.dd.L0(2131745432, null), 2, new l7(this));
        r7VarArr[3] = new r7(org.telegram.messenger.dd.L0(2131748334, null), 3, new q7(this));
        int i10 = 0;
        while (true) {
            r7[] r7VarArr2 = this.f41561r;
            if (i10 >= r7VarArr2.length) {
                break;
            }
            r7 r7Var = r7VarArr2[i10];
            if (r7Var != null) {
                this.f41559f.add(i10, r7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41558c = frameLayout;
        if (lu0Var == null) {
            wk0Var = new org.telegram.ui.Components.x71(getContext(), null);
        } else {
            wk0Var = new org.telegram.ui.Components.wk0(context, y6Var.getResourceProvider(), lu0Var);
        }
        this.f41560n = wk0Var;
        wk0Var.setAllowDisallowInterceptTouch(false);
        if (rVar != null) {
            rVar.c(wk0Var);
        }
        if (rVar == null && lu0Var == null) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        addView(wk0Var, w7.b6.d(-1, -1.0f, 48, 0.0f, f7, 0.0f, 0.0f));
        org.telegram.ui.Components.w71 n10 = wk0Var.n(rVar != null ? -2 : 3, true);
        this.d = n10;
        frameLayout.addView(n10, w7.b6.c(48.0f, -1));
        if (rVar != null) {
            frameLayout.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        }
        addView(frameLayout, w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        wk0Var.setAdapter(new d7(this, context, rVar, y6Var, lu0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.b6.c(48.0f, -1));
        org.telegram.messenger.i0.Y3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(true);
        this.f41556a = c2Var;
        imageView.setImageDrawable(c2Var);
        int i11 = org.telegram.ui.ActionBar.t6.f21314y8;
        c2Var.a(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.t6.f21333z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131752041, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
        this.f41557b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f43834b;

            {
                this.f43834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43834b.F.d();
                        return;
                    default:
                        this.f43834b.F.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, true);
        f6Var.setTextSize(org.telegram.messenger.i0.L(18.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(f6Var, i11, null);
        linearLayout.addView(f6Var, w7.b6.m(1.0f, 0, -1, 18, 0, 0));
        this.f41557b.add(f6Var);
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, org.telegram.ui.ActionBar.t6.x0(null, i12, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false), false, null);
        t0Var.setIcon(2131232091);
        if (t0Var.getBackground() != null) {
            Drawable background = t0Var.getBackground();
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
            t0Var.setBackground(background);
            org.telegram.ui.ActionBar.a7.k(t0Var, background, null, N2, null);
        }
        if (t0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.a7.t(t0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        t0Var.setContentDescription(org.telegram.messenger.dd.L0(2131751599, null));
        t0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(t0Var, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
        this.f41557b.add(t0Var);
        t0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f43834b;

            {
                this.f43834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43834b.F.d();
                        return;
                    default:
                        this.f43834b.F.clear();
                        return;
                }
            }
        });
    }

    public static void a(t7 t7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.uk0 uk0Var) {
        ArrayList arrayList = o7Var.e;
        PhotoViewer.v1().N2(null, t7Var.e, null);
        if (t7Var.f41562s == null) {
            t7Var.f41562s = new h7(t7Var);
        }
        t7Var.f41562s.f37714a = uk0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.v1().j2(o7Var.f40066r, arrayList.indexOf(m7Var), -1, false, t7Var.f41562s, null);
        }
    }

    public static void b(t7 t7Var, sh.a aVar, k7 k7Var) {
        boolean z10;
        y6 y6Var = t7Var.e;
        org.telegram.ui.Components.uk0 listView = t7Var.getListView();
        if (k7Var.e == 2) {
            if (listView.getAdapter() instanceof l7) {
                l7 l7Var = (l7) listView.getAdapter();
                PhotoViewer.v1().N2(null, y6Var, null);
                if (t7Var.f41562s == null) {
                    t7Var.f41562s = new h7(t7Var);
                }
                t7Var.f41562s.f37714a = listView;
                File file = aVar.f48503a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    org.telegram.messenger.i0.t2(file, file.getName(), null, y6Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new org.telegram.messenger.ff(0, path, 0, z10, 0, 0));
                    PhotoViewer.v1().j2(arrayList, 0, -1, false, t7Var.f41562s, null);
                }
            } else {
                return;
            }
        }
        if (k7Var.e == 3) {
            if (MediaController.B().I(aVar.f48506f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(aVar.f48506f, true);
                    return;
                } else {
                    MediaController.B().S(aVar.f48506f);
                    return;
                }
            }
            MediaController.B().S(aVar.f48506f);
        }
    }

    public final org.telegram.ui.Components.uk0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof s7) {
            return ((s7) view).f41271a;
        }
        return (org.telegram.ui.Components.uk0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t7.d():void");
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.x71 x71Var = this.f41560n;
            if (i10 < x71Var.getViewPages().length) {
                org.telegram.ui.Components.uk0 c10 = c(x71Var.getViewPages()[i10]);
                if (c10 != null) {
                    org.telegram.messenger.i0.a4(c10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.uk0 getListView() {
        return c(this.f41560n.getCurrentView());
    }

    public org.telegram.ui.Components.x71 getViewPager() {
        return this.f41560n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.E);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.E);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setCacheModel(sh.b bVar) {
        this.h = bVar;
        d();
    }

    public void setDelegate(i7 i7Var) {
        this.F = i7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.f41565y = i10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f41556a.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21314y8, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
