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
public abstract class t7 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.ya0 {
    public boolean D;
    public final e7 E;
    public i7 F;
    public final org.telegram.ui.ActionBar.y1 f50151a;
    public final ArrayList f50152b;
    public final FrameLayout f50153c;
    public final org.telegram.ui.Components.u61 d;
    public final y6 f50154e;
    public final ArrayList f50155f;
    public ci.c h;
    public final org.telegram.ui.Components.v61 f50156n;
    public final r7[] f50157r;
    public h7 f50158s;
    public int f50159w;
    public final org.telegram.ui.Components.it0 f50160x;
    public int f50161y;

    public t7(Context context, y6 y6Var, oi.q qVar, org.telegram.ui.Components.it0 it0Var) {
        super(context);
        org.telegram.ui.Components.v61 rj0Var;
        float f10;
        this.f50152b = new ArrayList();
        this.f50155f = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.f50157r = r7VarArr;
        this.E = new e7(this, 0);
        this.f50154e = y6Var;
        this.f50160x = it0Var;
        if (it0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        r7VarArr[0] = new r7(org.telegram.messenger.id.M0(2131750796, null), 0, new j7(this));
        r7VarArr[1] = new r7(org.telegram.messenger.id.M0(2131748651, null), 1, new o7(this));
        r7VarArr[2] = new r7(org.telegram.messenger.id.M0(2131745414, null), 2, new l7(this));
        r7VarArr[3] = new r7(org.telegram.messenger.id.M0(2131748319, null), 3, new q7(this));
        int i7 = 0;
        while (true) {
            r7[] r7VarArr2 = this.f50157r;
            if (i7 >= r7VarArr2.length) {
                break;
            }
            r7 r7Var = r7VarArr2[i7];
            if (r7Var != null) {
                this.f50155f.add(i7, r7Var);
            }
            i7++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50153c = frameLayout;
        if (it0Var == null) {
            rj0Var = new org.telegram.ui.Components.v61(getContext(), null);
        } else {
            rj0Var = new org.telegram.ui.Components.rj0(context, y6Var.getResourceProvider(), it0Var);
        }
        this.f50156n = rj0Var;
        rj0Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(rj0Var);
        }
        if (qVar == null && it0Var == null) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        addView(rj0Var, c8.ha.d(-1, -1.0f, 48, 0.0f, f10, 0.0f, 0.0f));
        org.telegram.ui.Components.u61 n10 = rj0Var.n(qVar != null ? -2 : 3, true);
        this.d = n10;
        frameLayout.addView(n10, c8.ha.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        rj0Var.setAdapter(new d7(this, context, qVar, y6Var, it0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, c8.ha.c(48.0f, -1));
        org.telegram.messenger.g0.Z3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(true);
        this.f50151a = y1Var;
        imageView.setImageDrawable(y1Var);
        int i10 = org.telegram.ui.ActionBar.m6.f28284y8;
        y1Var.a(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.m6.f28302z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131752041, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f50152b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f52272b;

            {
                this.f52272b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52272b.F.d();
                        return;
                    default:
                        this.f52272b.F.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, true, true);
        i6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(i6Var, i10, null);
        linearLayout.addView(i6Var, c8.ha.m(1.0f, 0, -1, 18, 0, 0));
        this.f50152b.add(i6Var);
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, org.telegram.ui.ActionBar.m6.x0(null, i11, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false), false, null);
        r0Var.setIcon(2131232092);
        if (r0Var.getBackground() != null) {
            Drawable background = r0Var.getBackground();
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
            r0Var.setBackground(background);
            org.telegram.ui.ActionBar.t6.j(r0Var, background, null, M2, null);
        }
        if (r0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.t6.s(r0Var.getIconView(), i10, null, PorterDuff.Mode.SRC_IN);
        }
        r0Var.setContentDescription(org.telegram.messenger.id.M0(2131751598, null));
        r0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(r0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f50152b.add(r0Var);
        r0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f52272b;

            {
                this.f52272b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52272b.F.d();
                        return;
                    default:
                        this.f52272b.F.clear();
                        return;
                }
            }
        });
    }

    public static void a(t7 t7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.pj0 pj0Var) {
        ArrayList arrayList = o7Var.f45631e;
        PhotoViewer.p1().H2(null, t7Var.f50154e, null);
        if (t7Var.f50158s == null) {
            t7Var.f50158s = new h7(t7Var);
        }
        t7Var.f50158s.f46234a = pj0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.p1().e2(o7Var.f48451r, arrayList.indexOf(m7Var), -1, false, t7Var.f50158s, null);
        }
    }

    public static void b(t7 t7Var, ci.b bVar, k7 k7Var) {
        boolean z9;
        y6 y6Var = t7Var.f50154e;
        org.telegram.ui.Components.pj0 listView = t7Var.getListView();
        if (k7Var.f47185e == 2) {
            if (listView.getAdapter() instanceof l7) {
                l7 l7Var = (l7) listView.getAdapter();
                PhotoViewer.p1().H2(null, y6Var, null);
                if (t7Var.f50158s == null) {
                    t7Var.f50158s = new h7(t7Var);
                }
                t7Var.f50158s.f46234a = listView;
                File file = bVar.f6420a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    org.telegram.messenger.g0.t2(file, file.getName(), null, y6Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (bVar.d == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    arrayList.add(new org.telegram.messenger.gf(0, path, 0, z9, 0, 0));
                    PhotoViewer.p1().e2(arrayList, 0, -1, false, t7Var.f50158s, null);
                }
            } else {
                return;
            }
        }
        if (k7Var.f47185e == 3) {
            if (MediaController.B().I(bVar.f6424f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(bVar.f6424f, true);
                    return;
                } else {
                    MediaController.B().S(bVar.f6424f);
                    return;
                }
            }
            MediaController.B().S(bVar.f6424f);
        }
    }

    public final org.telegram.ui.Components.pj0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof s7) {
            return ((s7) view).f49702a;
        }
        return (org.telegram.ui.Components.pj0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t7.d():void");
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.v61 v61Var = this.f50156n;
            if (i7 < v61Var.getViewPages().length) {
                org.telegram.ui.Components.pj0 c10 = c(v61Var.getViewPages()[i7]);
                if (c10 != null) {
                    org.telegram.messenger.g0.b4(c10);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.pj0 getListView() {
        return c(this.f50156n.getCurrentView());
    }

    public org.telegram.ui.Components.v61 getViewPager() {
        return this.f50156n;
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
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public void setCacheModel(ci.c cVar) {
        this.h = cVar;
        d();
    }

    public void setDelegate(i7 i7Var) {
        this.F = i7Var;
    }

    public void setTargetTabsPosition(int i7) {
        this.f50161y = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f50151a.a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28284y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
