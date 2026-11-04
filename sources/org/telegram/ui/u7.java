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
public abstract class u7 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.ui.Components.ta0 {
    public boolean E;
    public final f7 F;
    public j7 G;
    public final org.telegram.ui.ActionBar.w1 f49996a;
    public final ArrayList f49997b;
    public final FrameLayout f49998c;
    public final org.telegram.ui.Components.m61 d;
    public final z6 f49999e;
    public final ArrayList f50000f;
    public di.c h;
    public final org.telegram.ui.Components.n61 f50001n;
    public final s7[] f50002r;
    public i7 f50003s;
    public int f50004w;
    public final org.telegram.ui.Components.gt0 f50005x;
    public int f50006y;

    public u7(Context context, z6 z6Var, pi.q qVar, org.telegram.ui.Components.gt0 gt0Var) {
        super(context);
        org.telegram.ui.Components.n61 vj0Var;
        float f10;
        this.f49997b = new ArrayList();
        this.f50000f = new ArrayList();
        s7[] s7VarArr = new s7[5];
        this.f50002r = s7VarArr;
        this.F = new f7(this, 0);
        this.f49999e = z6Var;
        this.f50005x = gt0Var;
        if (gt0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        s7VarArr[0] = new s7(org.telegram.messenger.bd.M0(2131750797, null), 0, new k7(this));
        s7VarArr[1] = new s7(org.telegram.messenger.bd.M0(2131748659, null), 1, new p7(this));
        s7VarArr[2] = new s7(org.telegram.messenger.bd.M0(2131745424, null), 2, new m7(this));
        s7VarArr[3] = new s7(org.telegram.messenger.bd.M0(2131748327, null), 3, new r7(this));
        int i3 = 0;
        while (true) {
            s7[] s7VarArr2 = this.f50002r;
            if (i3 >= s7VarArr2.length) {
                break;
            }
            s7 s7Var = s7VarArr2[i3];
            if (s7Var != null) {
                this.f50000f.add(i3, s7Var);
            }
            i3++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49998c = frameLayout;
        if (gt0Var == null) {
            vj0Var = new org.telegram.ui.Components.n61(getContext(), null);
        } else {
            vj0Var = new org.telegram.ui.Components.vj0(context, z6Var.getResourceProvider(), gt0Var);
        }
        this.f50001n = vj0Var;
        vj0Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(vj0Var);
        }
        if (qVar == null && gt0Var == null) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        addView(vj0Var, b8.mf.d(-1, -1.0f, 48, 0.0f, f10, 0.0f, 0.0f));
        org.telegram.ui.Components.m61 j10 = vj0Var.j(qVar != null ? -2 : 3, true);
        this.d = j10;
        frameLayout.addView(j10, b8.mf.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, b8.mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        vj0Var.setAdapter(new e7(this, context, qVar, z6Var, gt0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, b8.mf.c(48.0f, -1));
        org.telegram.messenger.g0.Z3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(true);
        this.f49996a = w1Var;
        imageView.setImageDrawable(w1Var);
        int i10 = org.telegram.ui.ActionBar.k6.f28275y8;
        w1Var.a(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.k6.f28292z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131752041, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f49997b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final u7 f43643b;

            {
                this.f43643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43643b.G.d();
                        return;
                    default:
                        this.f43643b.G.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, true);
        h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(h6Var, i10, null);
        linearLayout.addView(h6Var, b8.mf.m(1.0f, 0, -1, 18, 0, 0));
        this.f49997b.add(h6Var);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), false, null);
        q0Var.setIcon(2131232092);
        if (q0Var.getBackground() != null) {
            Drawable background = q0Var.getBackground();
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
            q0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(q0Var, background, null, N2, null);
        }
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(q0Var.getIconView(), i10, null, PorterDuff.Mode.SRC_IN);
        }
        q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131751599, null));
        q0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(q0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.f49997b.add(q0Var);
        q0Var.setOnClickListener(new View.OnClickListener(this) {
            public final u7 f43643b;

            {
                this.f43643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43643b.G.d();
                        return;
                    default:
                        this.f43643b.G.clear();
                        return;
                }
            }
        });
    }

    public static void a(u7 u7Var, n7 n7Var, p7 p7Var, org.telegram.ui.Components.tj0 tj0Var) {
        ArrayList arrayList = p7Var.f45561e;
        PhotoViewer.v1().N2(null, u7Var.f49999e, null);
        if (u7Var.f50003s == null) {
            u7Var.f50003s = new i7(u7Var);
        }
        u7Var.f50003s.f46129a = tj0Var;
        if (arrayList.indexOf(n7Var) >= 0) {
            PhotoViewer.v1().j2(p7Var.f48481r, arrayList.indexOf(n7Var), -1, false, u7Var.f50003s, null);
        }
    }

    public static void b(u7 u7Var, di.b bVar, l7 l7Var) {
        boolean z10;
        z6 z6Var = u7Var.f49999e;
        org.telegram.ui.Components.tj0 listView = u7Var.getListView();
        if (l7Var.f47129e == 2) {
            if (listView.getAdapter() instanceof m7) {
                m7 m7Var = (m7) listView.getAdapter();
                PhotoViewer.v1().N2(null, z6Var, null);
                if (u7Var.f50003s == null) {
                    u7Var.f50003s = new i7(u7Var);
                }
                u7Var.f50003s.f46129a = listView;
                File file = bVar.f9180a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    org.telegram.messenger.g0.t2(file, file.getName(), null, z6Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (bVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new org.telegram.messenger.ye(0, path, 0, z10, 0, 0));
                    PhotoViewer.v1().j2(arrayList, 0, -1, false, u7Var.f50003s, null);
                }
            } else {
                return;
            }
        }
        if (l7Var.f47129e == 3) {
            if (MediaController.B().I(bVar.f9184f)) {
                if (!MediaController.B().H()) {
                    MediaController.B().R(bVar.f9184f, true);
                    return;
                } else {
                    MediaController.B().S(bVar.f9184f);
                    return;
                }
            }
            MediaController.B().S(bVar.f9184f);
        }
    }

    public final org.telegram.ui.Components.tj0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof t7) {
            return ((t7) view).f49722a;
        }
        return (org.telegram.ui.Components.tj0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u7.d():void");
    }

    public final void e() {
        int i3 = 0;
        while (true) {
            org.telegram.ui.Components.n61 n61Var = this.f50001n;
            if (i3 < n61Var.getViewPages().length) {
                org.telegram.ui.Components.tj0 c2 = c(n61Var.getViewPages()[i3]);
                if (c2 != null) {
                    org.telegram.messenger.g0.b4(c2);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.tj0 getListView() {
        return c(this.f50001n.getCurrentView());
    }

    public org.telegram.ui.Components.n61 getViewPager() {
        return this.f50001n;
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
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public void setCacheModel(di.c cVar) {
        this.h = cVar;
        d();
    }

    public void setDelegate(j7 j7Var) {
        this.G = j7Var;
    }

    public void setTargetTabsPosition(int i3) {
        this.f50006y = i3;
    }

    @Override
    public final void updateColors() {
        try {
            this.f49996a.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28275y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
