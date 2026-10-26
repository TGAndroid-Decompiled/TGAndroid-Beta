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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public abstract class x7 extends FrameLayout implements org.telegram.ui.ActionBar.p6, org.telegram.ui.Components.dd0 {
    public final i7 E;
    public m7 F;
    public final org.telegram.ui.ActionBar.j2 f45678a;
    public final ArrayList f45679b;
    public final FrameLayout f45680c;
    public final org.telegram.ui.Components.t91 d;
    public final c7 e;
    public final ArrayList f45681f;
    public ci.b h;
    public final org.telegram.ui.Components.u91 f45682n;
    public final v7[] f45683r;
    public l7 f45684s;
    public int v;
    public final org.telegram.ui.Components.lw0 f45685w;
    public int f45686x;
    public boolean f45687y;

    public x7(Context context, c7 c7Var, oi.q qVar, org.telegram.ui.Components.lw0 lw0Var) {
        super(context);
        org.telegram.ui.Components.u91 om0Var;
        float f7;
        this.f45679b = new ArrayList();
        this.f45681f = new ArrayList();
        v7[] v7VarArr = new v7[5];
        this.f45683r = v7VarArr;
        this.E = new i7(this, 0);
        this.e = c7Var;
        this.f45685w = lw0Var;
        if (lw0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        v7VarArr[0] = new v7(LocaleController.getString(R.string.FilterChats), 0, new n7(this));
        v7VarArr[1] = new v7(LocaleController.getString(R.string.MediaTab), 1, new s7(this));
        v7VarArr[2] = new v7(LocaleController.getString(R.string.SharedFilesTab2), 2, new p7(this));
        v7VarArr[3] = new v7(LocaleController.getString(R.string.Music), 3, new u7(this));
        int i10 = 0;
        while (true) {
            v7[] v7VarArr2 = this.f45683r;
            if (i10 >= v7VarArr2.length) {
                break;
            }
            v7 v7Var = v7VarArr2[i10];
            if (v7Var != null) {
                this.f45681f.add(i10, v7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45680c = frameLayout;
        if (lw0Var == null) {
            om0Var = new org.telegram.ui.Components.u91(getContext(), null);
        } else {
            om0Var = new org.telegram.ui.Components.om0(context, c7Var.getResourceProvider(), lw0Var);
        }
        this.f45682n = om0Var;
        om0Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(om0Var);
        }
        if (qVar == null && lw0Var == null) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        addView(om0Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 48, 0.0f, f7, 0.0f, 0.0f));
        org.telegram.ui.Components.t91 n10 = om0Var.n(qVar != null ? -2 : 3, true);
        this.d = n10;
        frameLayout.addView(n10, org.telegram.ui.Components.gb1.g(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        om0Var.setAdapter(new h7(this, context, qVar, c7Var, lw0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, org.telegram.ui.Components.gb1.g(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(true);
        this.f45678a = j2Var;
        imageView.setImageDrawable(j2Var);
        int i11 = org.telegram.ui.ActionBar.y6.f23750y8;
        j2Var.a(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.y6.f23769z8;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, null);
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f45679b.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x7 f38745b;

            {
                this.f38745b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38745b.F.p();
                        return;
                    default:
                        this.f38745b.F.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, true);
        s6Var.setTextSize(AndroidUtilities.dp(18.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Z(s6Var, i11, null);
        linearLayout.addView(s6Var, org.telegram.ui.Components.gb1.q(1.0f, 0, -1, 18, 0, 0));
        this.f45679b.add(s6Var);
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.y6.x0(null, i12, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false), false, null);
        w0Var.setIcon(R.drawable.msg_clear);
        if (w0Var.getBackground() != null) {
            Drawable background = w0Var.getBackground();
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
            w0Var.setBackground(background);
            org.telegram.ui.ActionBar.f7.k(w0Var, background, null, N2, null);
        }
        if (w0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.f7.t(w0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        w0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f45679b.add(w0Var);
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final x7 f38745b;

            {
                this.f38745b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38745b.F.p();
                        return;
                    default:
                        this.f38745b.F.clear();
                        return;
                }
            }
        });
    }

    public static void a(x7 x7Var, q7 q7Var, s7 s7Var, org.telegram.ui.Components.mm0 mm0Var) {
        ArrayList arrayList = s7Var.e;
        PhotoViewer.u1().M2(null, x7Var.e, null);
        if (x7Var.f45684s == null) {
            x7Var.f45684s = new l7(x7Var);
        }
        x7Var.f45684s.f41158a = mm0Var;
        if (arrayList.indexOf(q7Var) >= 0) {
            PhotoViewer.u1().i2(s7Var.f43375r, arrayList.indexOf(q7Var), -1, false, x7Var.f45684s, null);
        }
    }

    public static void b(x7 x7Var, ci.a aVar, o7 o7Var) {
        c7 c7Var = x7Var.e;
        org.telegram.ui.Components.mm0 listView = x7Var.getListView();
        if (o7Var.e == 2) {
            if (listView.getAdapter() instanceof p7) {
                p7 p7Var = (p7) listView.getAdapter();
                PhotoViewer.u1().M2(null, c7Var, null);
                if (x7Var.f45684s == null) {
                    x7Var.f45684s = new l7(x7Var);
                }
                x7Var.f45684s.f41158a = listView;
                File file = aVar.f6364a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, c7Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    boolean z10 = true;
                    if (aVar.d != 1) {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.u1().i2(arrayList, 0, -1, false, x7Var.f45684s, null);
                }
            } else {
                return;
            }
        }
        if (o7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f6367f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f6367f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f6367f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f6367f);
        }
    }

    public final org.telegram.ui.Components.mm0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof w7) {
            return ((w7) view).f44992a;
        }
        return (org.telegram.ui.Components.mm0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x7.d():void");
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.u91 u91Var = this.f45682n;
            if (i10 < u91Var.getViewPages().length) {
                org.telegram.ui.Components.mm0 c10 = c(u91Var.getViewPages()[i10]);
                if (c10 != null) {
                    AndroidUtilities.updateVisibleRows(c10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.mm0 getListView() {
        return c(this.f45682n.getCurrentView());
    }

    public org.telegram.ui.Components.u91 getViewPager() {
        return this.f45682n;
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

    public void setCacheModel(ci.b bVar) {
        this.h = bVar;
        d();
    }

    public void setDelegate(m7 m7Var) {
        this.F = m7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.f45686x = i10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f45678a.a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23750y8, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
