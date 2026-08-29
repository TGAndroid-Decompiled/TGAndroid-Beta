package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yu extends org.telegram.ui.Components.xa {
    public final xu T;
    public final q6 U;
    public final oc.i V;
    public k6 W;
    public final org.telegram.ui.Components.ux0[] X;
    public final org.telegram.ui.Cells.y1[] Y;
    public final LinearLayout Z;
    public final u6 f44968a0;
    public final long f44969b0;
    public final kh.b f44970c0;

    public yu(x6 x6Var, q6 q6Var, kh.b bVar, oc.i iVar) {
        super(x6Var.getParentActivity(), x6Var, false, false, !bVar.h(), 1, null);
        String string;
        int i10;
        long j10;
        long j11;
        ?? r11 = 1;
        int i11 = 8;
        this.X = new org.telegram.ui.Components.ux0[8];
        this.Y = new org.telegram.ui.Cells.y1[8];
        this.V = iVar;
        this.U = q6Var;
        this.f44970c0 = bVar;
        this.f44969b0 = q6Var.f41543a;
        this.allowNestedScroll = false;
        M();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = x6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        xu xuVar = new xu(getContext(), q6Var.f41543a, iVar);
        this.T = xuVar;
        linearLayout.addView(xuVar, i7.f6.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.y1 y1Var = null;
        int i12 = 0;
        while (i12 < i11) {
            if (i12 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.g6.lj;
            } else if (i12 == r11) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.g6.hj;
            } else if (i12 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.g6.ij;
            } else if (i12 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.g6.jj;
            } else if (i12 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.g6.mj;
            } else if (i12 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.g6.nj;
            } else if (i12 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.g6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.g6.pj;
            }
            r6 r6Var = (r6) q6Var.d.get(i12);
            if (r6Var != null) {
                j10 = 0;
                j11 = r6Var.f41978a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.ux0[] ux0VarArr = this.X;
                ?? obj = new Object();
                Paint paint = new Paint((int) r11);
                obj.f33334b = paint;
                obj.f33335c = r11;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ux0VarArr[i12] = obj;
                org.telegram.ui.Components.ux0 ux0Var = this.X[i12];
                ux0Var.f33336e = j11;
                ux0Var.f33333a = i10;
                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, parentActivity, null, false);
                y1Var2.setTag(Integer.valueOf(i12));
                y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                this.Z.addView(y1Var2, i7.f6.n(-1, 50));
                y1Var2.e(string, AndroidUtilities.formatFileSize(j11), true, true, false);
                y1Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
                int i13 = org.telegram.ui.ActionBar.g6.f23190k7;
                org.telegram.ui.Components.hp hpVar = y1Var2.f25988r;
                if (hpVar != null) {
                    hpVar.b(i10, i10, i13);
                }
                y1Var2.setOnClickListener(new org.telegram.ui.Components.fi0(17, this, bVar));
                this.Y[i12] = y1Var2;
                y1Var = y1Var2;
            } else {
                this.X[i12] = null;
                this.Y[i12] = null;
            }
            i12++;
            i11 = 8;
            r11 = 1;
        }
        if (y1Var != null) {
            y1Var.setNeedDivider(false);
        }
        xu xuVar2 = this.T;
        org.telegram.ui.Components.ux0[] ux0VarArr2 = this.X;
        xuVar2.f34217b = ux0VarArr2;
        xuVar2.B = bVar;
        xuVar2.invalidate();
        xuVar2.f34218c = new float[ux0VarArr2.length];
        xuVar2.d = new float[ux0VarArr2.length];
        xuVar2.f34219e = new float[ux0VarArr2.length];
        xuVar2.c(false);
        if (xuVar2.f34226y > 1) {
            xuVar2.f34220f = 0.0f;
        } else {
            xuVar2.f34220f = 1.0f;
        }
        u6 u6Var = new u6(this, getContext(), x6Var, 1);
        this.f44968a0 = u6Var;
        u6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        u6Var.setCacheModel(bVar);
        u6Var.setDelegate(new oc.i(this, bVar, false, 8));
        org.telegram.ui.Components.sa saVar = this.f34664s;
        if (saVar != null) {
            saVar.setChildLayout(u6Var);
        } else {
            R();
            this.Z.addView(this.W, i7.f6.q(-1, 72, 80));
        }
        if (this.W != null) {
            this.W.a(this.T.a(), true);
        }
    }

    @Override
    public final void F(org.telegram.ui.Components.hv0 hv0Var) {
        this.d.j(new m3(this, 9));
        if (this.f34664s != null) {
            R();
            hv0Var.addView(this.W, i7.f6.e(-1, 72, 80));
        }
    }

    public final void R() {
        k6 k6Var = new k6(getContext());
        this.W = k6Var;
        k6Var.f39758a.setOnClickListener(new a(this, 19));
        xu xuVar = this.T;
        if (xuVar != null) {
            this.W.a(xuVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        return new wu(this);
    }

    @Override
    public final CharSequence y() {
        return this.f34662n.getMessagesController().getFullName(this.f44969b0);
    }
}
