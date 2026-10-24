package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yu extends org.telegram.ui.Components.za {
    public final xu X;
    public final v6 Y;
    public final mi.q Z;
    public o6 f43953a0;
    public final org.telegram.ui.Components.yy0[] f43954b0;
    public final org.telegram.ui.Cells.z1[] f43955c0;
    public final LinearLayout f43956d0;
    public final z6 f43957e0;
    public final long f43958f0;
    public final bi.c f43959g0;

    public yu(c7 c7Var, v6 v6Var, bi.c cVar, mi.q qVar) {
        super((org.telegram.ui.ActionBar.o2) c7Var, false, !cVar.h(), (org.telegram.ui.ActionBar.g6) null);
        String string;
        int i10;
        long j10;
        long j11;
        this.f43954b0 = new org.telegram.ui.Components.yy0[8];
        this.f43955c0 = new org.telegram.ui.Cells.z1[8];
        this.Z = qVar;
        this.Y = v6Var;
        this.f43959g0 = cVar;
        this.f43958f0 = v6Var.f42584a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = c7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f43956d0 = linearLayout;
        linearLayout.setOrientation(1);
        xu xuVar = new xu(getContext(), v6Var.f42584a, qVar);
        this.X = xuVar;
        linearLayout.addView(xuVar, w7.z5.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.z1 z1Var = null;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.k6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.k6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.k6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.k6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.k6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.k6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.k6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.k6.pj;
            }
            String str = string;
            int i13 = i10;
            w6 w6Var = (w6) v6Var.d.get(i11);
            if (w6Var != null) {
                j10 = 0;
                j11 = w6Var.f42914a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.yy0[] yy0VarArr = this.f43954b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.e = paint;
                obj.f33088c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                yy0VarArr[i11] = obj;
                org.telegram.ui.Components.yy0 yy0Var = this.f43954b0[i11];
                yy0Var.f33086a = j11;
                yy0Var.f33087b = i13;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                this.f43956d0.addView(z1Var2, w7.z5.n(-1, 50));
                z1Var2.e(str, AndroidUtilities.formatFileSize(j11), true, true, false);
                if (z1Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.r6.W(z1Var2.getTextView(), org.telegram.ui.ActionBar.k6.f21290j5, null);
                } else {
                    z1Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false));
                }
                int i14 = org.telegram.ui.ActionBar.k6.f21312k7;
                org.telegram.ui.Components.vp vpVar = z1Var2.f24016r;
                if (vpVar != null) {
                    vpVar.b(i13, i13, i14);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.c51(10, this, cVar));
                this.f43955c0[i11] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.f43954b0[i11] = null;
                this.f43955c0[i11] = null;
            }
            i11++;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        xu xuVar2 = this.X;
        org.telegram.ui.Components.yy0[] yy0VarArr2 = this.f43954b0;
        xuVar2.f33368b = yy0VarArr2;
        xuVar2.F = cVar;
        xuVar2.invalidate();
        xuVar2.f33369c = new float[yy0VarArr2.length];
        xuVar2.d = new float[yy0VarArr2.length];
        xuVar2.e = new float[yy0VarArr2.length];
        xuVar2.c(false);
        if (xuVar2.f33376y > 1) {
            xuVar2.f33370f = 0.0f;
        } else {
            xuVar2.f33370f = 1.0f;
        }
        z6 z6Var = new z6(this, getContext(), c7Var, 1);
        this.f43957e0 = z6Var;
        z6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        z6Var.setCacheModel(cVar);
        z6Var.setDelegate(new n2.e(this, cVar, false, 8));
        org.telegram.ui.Components.ta taVar = this.f33214s;
        if (taVar != null) {
            taVar.setChildLayout(z6Var);
        } else {
            R();
            this.f43956d0.addView(this.f43953a0, w7.z5.q(-1, 72, 80));
        }
        if (this.f43953a0 != null) {
            this.f43953a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void F(org.telegram.ui.Components.nw0 nw0Var) {
        this.d.j(new j3(this, 9));
        if (this.f33214s != null) {
            R();
            nw0Var.addView(this.f43953a0, w7.z5.e(-1, 72, 80));
        }
    }

    public final void R() {
        o6 o6Var = new o6(getContext());
        this.f43953a0 = o6Var;
        o6Var.f40087a.setOnClickListener(new a(this, 19));
        xu xuVar = this.X;
        if (xuVar != null) {
            this.f43953a0.a(xuVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.km0 w(org.telegram.ui.Components.lm0 lm0Var) {
        return new wu(this);
    }

    @Override
    public final CharSequence z() {
        return this.f33212n.getMessagesController().getFullName(this.f43958f0);
    }
}
