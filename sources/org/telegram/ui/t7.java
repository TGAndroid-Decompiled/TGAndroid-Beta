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
public abstract class t7 extends FrameLayout implements org.telegram.ui.ActionBar.a6, org.telegram.ui.Components.ya0 {
    public boolean D;
    public final e7 E;
    public i7 F;
    public final org.telegram.ui.ActionBar.y1 f49936a;
    public final ArrayList f49937b;
    public final FrameLayout f49938c;
    public final org.telegram.ui.Components.o61 d;
    public final y6 f49939e;
    public final ArrayList f49940f;
    public ci.c h;
    public final org.telegram.ui.Components.p61 f49941n;
    public final r7[] f49942r;
    public h7 f49943s;
    public int f49944w;
    public final org.telegram.ui.Components.ht0 f49945x;
    public int f49946y;

    public t7(Context context, y6 y6Var, oi.q qVar, org.telegram.ui.Components.ht0 ht0Var) {
        super(context);
        org.telegram.ui.Components.p61 rj0Var;
        float f10;
        this.f49937b = new ArrayList();
        this.f49940f = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.f49942r = r7VarArr;
        this.E = new e7(this, 0);
        this.f49939e = y6Var;
        this.f49945x = ht0Var;
        if (ht0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        r7VarArr[0] = new r7(org.telegram.messenger.hd.M0(2131750797, null), 0, new j7(this));
        r7VarArr[1] = new r7(org.telegram.messenger.hd.M0(2131748650, null), 1, new o7(this));
        r7VarArr[2] = new r7(org.telegram.messenger.hd.M0(2131745415, null), 2, new l7(this));
        r7VarArr[3] = new r7(org.telegram.messenger.hd.M0(2131748318, null), 3, new q7(this));
        int i7 = 0;
        while (true) {
            r7[] r7VarArr2 = this.f49942r;
            if (i7 >= r7VarArr2.length) {
                break;
            }
            r7 r7Var = r7VarArr2[i7];
            if (r7Var != null) {
                this.f49940f.add(i7, r7Var);
            }
            i7++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49938c = frameLayout;
        if (ht0Var == null) {
            rj0Var = new org.telegram.ui.Components.p61(getContext(), null);
        } else {
            rj0Var = new org.telegram.ui.Components.rj0(context, y6Var.getResourceProvider(), ht0Var);
        }
        this.f49941n = rj0Var;
        rj0Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(rj0Var);
        }
        if (qVar == null && ht0Var == null) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        addView(rj0Var, c8.ha.d(-1, -1.0f, 48, 0.0f, f10, 0.0f, 0.0f));
        org.telegram.ui.Components.o61 n10 = rj0Var.n(qVar != null ? -2 : 3, true);
        this.d = n10;
        frameLayout.addView(n10, c8.ha.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        rj0Var.setAdapter(new d7(this, context, qVar, y6Var, ht0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, c8.ha.c(48.0f, -1));
        org.telegram.messenger.g0.Z3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(true);
        this.f49936a = y1Var;
        imageView.setImageDrawable(y1Var);
        int i10 = org.telegram.ui.ActionBar.k6.f28242y8;
        y1Var.a(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.k6.f28260z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f49937b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f52485b;

            {
                this.f52485b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52485b.F.d();
                        return;
                    default:
                        this.f52485b.F.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        j6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(j6Var, i10, null);
        linearLayout.addView(j6Var, c8.ha.m(1.0f, 0, -1, 18, 0, 0));
        this.f49937b.add(j6Var);
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), false, null);
        r0Var.setIcon(2131232092);
        if (r0Var.getBackground() != null) {
            Drawable background = r0Var.getBackground();
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
            r0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(r0Var, background, null, N2, null);
        }
        if (r0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(r0Var.getIconView(), i10, null, PorterDuff.Mode.SRC_IN);
        }
        r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131751599, null));
        r0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(r0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f49937b.add(r0Var);
        r0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f52485b;

            {
                this.f52485b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52485b.F.d();
                        return;
                    default:
                        this.f52485b.F.clear();
                        return;
                }
            }
        });
    }

    public static void a(t7 t7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.pj0 pj0Var) {
        ArrayList arrayList = o7Var.f45504e;
        PhotoViewer.p1().H2(null, t7Var.f49939e, null);
        if (t7Var.f49943s == null) {
            t7Var.f49943s = new h7(t7Var);
        }
        t7Var.f49943s.f46210a = pj0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.p1().e2(o7Var.f48262r, arrayList.indexOf(m7Var), -1, false, t7Var.f49943s, null);
        }
    }

    public static void b(t7 t7Var, ci.b bVar, k7 k7Var) {
        boolean z9;
        y6 y6Var = t7Var.f49939e;
        org.telegram.ui.Components.pj0 listView = t7Var.getListView();
        if (k7Var.f47111e == 2) {
            if (listView.getAdapter() instanceof l7) {
                l7 l7Var = (l7) listView.getAdapter();
                PhotoViewer.p1().H2(null, y6Var, null);
                if (t7Var.f49943s == null) {
                    t7Var.f49943s = new h7(t7Var);
                }
                t7Var.f49943s.f46210a = listView;
                File file = bVar.f6417a;
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
                    PhotoViewer.p1().e2(arrayList, 0, -1, false, t7Var.f49943s, null);
                }
            } else {
                return;
            }
        }
        if (k7Var.f47111e == 3) {
            if (MediaController.B().I(bVar.f6421f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(bVar.f6421f, true);
                    return;
                } else {
                    MediaController.B().S(bVar.f6421f);
                    return;
                }
            }
            MediaController.B().S(bVar.f6421f);
        }
    }

    public final org.telegram.ui.Components.pj0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof s7) {
            return ((s7) view).f49645a;
        }
        return (org.telegram.ui.Components.pj0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t7.d():void");
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.p61 p61Var = this.f49941n;
            if (i7 < p61Var.getViewPages().length) {
                org.telegram.ui.Components.pj0 c10 = c(p61Var.getViewPages()[i7]);
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
        return c(this.f49941n.getCurrentView());
    }

    public org.telegram.ui.Components.p61 getViewPager() {
        return this.f49941n;
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
        this.f49946y = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f49936a.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28242y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
