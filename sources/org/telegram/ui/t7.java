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
    public final org.telegram.ui.ActionBar.c2 f41747a;
    public final ArrayList f41748b;
    public final FrameLayout f41749c;
    public final org.telegram.ui.Components.v71 d;
    public final y6 e;
    public final ArrayList f41750f;
    public sh.b h;
    public final org.telegram.ui.Components.w71 f41751n;
    public final r7[] f41752r;
    public h7 f41753s;
    public int f41754w;
    public final org.telegram.ui.Components.ku0 f41755x;
    public int f41756y;

    public t7(Context context, y6 y6Var, ei.r rVar, org.telegram.ui.Components.ku0 ku0Var) {
        super(context);
        org.telegram.ui.Components.w71 vk0Var;
        float f7;
        this.f41748b = new ArrayList();
        this.f41750f = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.f41752r = r7VarArr;
        this.E = new e7(this, 0);
        this.e = y6Var;
        this.f41755x = ku0Var;
        if (ku0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        r7VarArr[0] = new r7(org.telegram.messenger.cd.L0(2131750797, null), 0, new j7(this));
        r7VarArr[1] = new r7(org.telegram.messenger.cd.L0(2131748666, null), 1, new o7(this));
        r7VarArr[2] = new r7(org.telegram.messenger.cd.L0(2131745432, null), 2, new l7(this));
        r7VarArr[3] = new r7(org.telegram.messenger.cd.L0(2131748334, null), 3, new q7(this));
        int i10 = 0;
        while (true) {
            r7[] r7VarArr2 = this.f41752r;
            if (i10 >= r7VarArr2.length) {
                break;
            }
            r7 r7Var = r7VarArr2[i10];
            if (r7Var != null) {
                this.f41750f.add(i10, r7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41749c = frameLayout;
        if (ku0Var == null) {
            vk0Var = new org.telegram.ui.Components.w71(getContext(), null);
        } else {
            vk0Var = new org.telegram.ui.Components.vk0(context, y6Var.getResourceProvider(), ku0Var);
        }
        this.f41751n = vk0Var;
        vk0Var.setAllowDisallowInterceptTouch(false);
        if (rVar != null) {
            rVar.c(vk0Var);
        }
        if (rVar == null && ku0Var == null) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        addView(vk0Var, w7.b6.d(-1, -1.0f, 48, 0.0f, f7, 0.0f, 0.0f));
        org.telegram.ui.Components.v71 n10 = vk0Var.n(rVar != null ? -2 : 3, true);
        this.d = n10;
        frameLayout.addView(n10, w7.b6.c(48.0f, -1));
        if (rVar != null) {
            frameLayout.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        }
        addView(frameLayout, w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        vk0Var.setAdapter(new d7(this, context, rVar, y6Var, ku0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.b6.c(48.0f, -1));
        org.telegram.messenger.i0.Y3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(true);
        this.f41747a = c2Var;
        imageView.setImageDrawable(c2Var);
        int i11 = org.telegram.ui.ActionBar.t6.f21313y8;
        c2Var.a(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.t6.f21332z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131752041, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
        this.f41748b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f44034b;

            {
                this.f44034b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44034b.F.d();
                        return;
                    default:
                        this.f44034b.F.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, true);
        f6Var.setTextSize(org.telegram.messenger.i0.L(18.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(f6Var, i11, null);
        linearLayout.addView(f6Var, w7.b6.m(1.0f, 0, -1, 18, 0, 0));
        this.f41748b.add(f6Var);
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
        t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131751599, null));
        t0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(t0Var, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
        this.f41748b.add(t0Var);
        t0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f44034b;

            {
                this.f44034b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44034b.F.d();
                        return;
                    default:
                        this.f44034b.F.clear();
                        return;
                }
            }
        });
    }

    public static void a(t7 t7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.tk0 tk0Var) {
        ArrayList arrayList = o7Var.e;
        PhotoViewer.v1().N2(null, t7Var.e, null);
        if (t7Var.f41753s == null) {
            t7Var.f41753s = new h7(t7Var);
        }
        t7Var.f41753s.f37786a = tk0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.v1().j2(o7Var.f40159r, arrayList.indexOf(m7Var), -1, false, t7Var.f41753s, null);
        }
    }

    public static void b(t7 t7Var, sh.a aVar, k7 k7Var) {
        boolean z10;
        y6 y6Var = t7Var.e;
        org.telegram.ui.Components.tk0 listView = t7Var.getListView();
        if (k7Var.e == 2) {
            if (listView.getAdapter() instanceof l7) {
                l7 l7Var = (l7) listView.getAdapter();
                PhotoViewer.v1().N2(null, y6Var, null);
                if (t7Var.f41753s == null) {
                    t7Var.f41753s = new h7(t7Var);
                }
                t7Var.f41753s.f37786a = listView;
                File file = aVar.f48492a;
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
                    arrayList.add(new org.telegram.messenger.ef(0, path, 0, z10, 0, 0));
                    PhotoViewer.v1().j2(arrayList, 0, -1, false, t7Var.f41753s, null);
                }
            } else {
                return;
            }
        }
        if (k7Var.e == 3) {
            if (MediaController.B().I(aVar.f48495f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(aVar.f48495f, true);
                    return;
                } else {
                    MediaController.B().S(aVar.f48495f);
                    return;
                }
            }
            MediaController.B().S(aVar.f48495f);
        }
    }

    public final org.telegram.ui.Components.tk0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof s7) {
            return ((s7) view).f41396a;
        }
        return (org.telegram.ui.Components.tk0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t7.d():void");
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.w71 w71Var = this.f41751n;
            if (i10 < w71Var.getViewPages().length) {
                org.telegram.ui.Components.tk0 c10 = c(w71Var.getViewPages()[i10]);
                if (c10 != null) {
                    org.telegram.messenger.i0.a4(c10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.tk0 getListView() {
        return c(this.f41751n.getCurrentView());
    }

    public org.telegram.ui.Components.w71 getViewPager() {
        return this.f41751n;
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
        this.f41756y = i10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f41747a.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21313y8, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
