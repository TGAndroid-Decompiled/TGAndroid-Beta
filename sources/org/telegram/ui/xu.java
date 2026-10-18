package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xu extends org.telegram.ui.Components.bb {
    public final wu X;
    public final v6 Y;
    public final n2.e Z;
    public o6 f43235a0;
    public final org.telegram.ui.Components.uy0[] f43236b0;
    public final org.telegram.ui.Cells.a2[] f43237c0;
    public final LinearLayout f43238d0;
    public final z6 f43239e0;
    public final long f43240f0;
    public final bi.c f43241g0;

    public xu(c7 c7Var, v6 v6Var, bi.c cVar, n2.e eVar) {
        super((org.telegram.ui.ActionBar.n2) c7Var, false, !cVar.h(), (org.telegram.ui.ActionBar.d6) null);
        String string;
        int i10;
        long j10;
        long j11;
        this.f43236b0 = new org.telegram.ui.Components.uy0[8];
        this.f43237c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = eVar;
        this.Y = v6Var;
        this.f43241g0 = cVar;
        this.f43240f0 = v6Var.f42108a;
        this.allowNestedScroll = false;
        O();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = c7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f43238d0 = linearLayout;
        linearLayout.setOrientation(1);
        wu wuVar = new wu(getContext(), v6Var.f42108a, eVar);
        this.X = wuVar;
        linearLayout.addView(wuVar, w7.z5.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.a2 a2Var = null;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.h6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.h6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.h6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.h6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.h6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.h6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.h6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.h6.pj;
            }
            String str = string;
            int i13 = i10;
            w6 w6Var = (w6) v6Var.d.get(i11);
            if (w6Var != null) {
                j10 = 0;
                j11 = w6Var.f42362a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.uy0[] uy0VarArr = this.f43236b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.e = paint;
                obj.f31107c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                uy0VarArr[i11] = obj;
                org.telegram.ui.Components.uy0 uy0Var = this.f43236b0[i11];
                uy0Var.f31105a = j11;
                uy0Var.f31106b = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                this.f43238d0.addView(a2Var2, w7.z5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j11), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21092j5, false));
                int i14 = org.telegram.ui.ActionBar.h6.f21114k7;
                org.telegram.ui.Components.xp xpVar = a2Var2.f21958r;
                if (xpVar != null) {
                    xpVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.g51(9, this, cVar));
                this.f43237c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f43236b0[i11] = null;
                this.f43237c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        wu wuVar2 = this.X;
        org.telegram.ui.Components.uy0[] uy0VarArr2 = this.f43236b0;
        wuVar2.f31928b = uy0VarArr2;
        wuVar2.F = cVar;
        wuVar2.invalidate();
        wuVar2.f31929c = new float[uy0VarArr2.length];
        wuVar2.d = new float[uy0VarArr2.length];
        wuVar2.e = new float[uy0VarArr2.length];
        wuVar2.c(false);
        if (wuVar2.f31936y > 1) {
            wuVar2.f31930f = 0.0f;
        } else {
            wuVar2.f31930f = 1.0f;
        }
        z6 z6Var = new z6(this, getContext(), c7Var, 1);
        this.f43239e0 = z6Var;
        z6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        z6Var.setCacheModel(cVar);
        z6Var.setDelegate(new mi.q(this, cVar, false, 11));
        org.telegram.ui.Components.va vaVar = this.f24917s;
        if (vaVar != null) {
            vaVar.setChildLayout(z6Var);
        } else {
            S();
            this.f43238d0.addView(this.f43235a0, w7.z5.q(-1, 72, 80));
        }
        if (this.f43235a0 != null) {
            this.f43235a0.a(this.X.a(), true);
        }
    }

    @Override
    public final CharSequence A() {
        return this.f24915n.getMessagesController().getFullName(this.f43240f0);
    }

    @Override
    public final void H(org.telegram.ui.Components.jw0 jw0Var) {
        this.d.j(new k3(this, 9));
        if (this.f24917s != null) {
            S();
            jw0Var.addView(this.f43235a0, w7.z5.e(-1, 72, 80));
        }
    }

    public final void S() {
        o6 o6Var = new o6(getContext());
        this.f43235a0 = o6Var;
        o6Var.f39681a.setOnClickListener(new a(this, 18));
        wu wuVar = this.X;
        if (wuVar != null) {
            this.f43235a0.a(wuVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.hm0 x(org.telegram.ui.Components.im0 im0Var) {
        return new vu(this);
    }
}
