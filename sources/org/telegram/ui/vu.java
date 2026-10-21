package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vu extends org.telegram.ui.Components.bb {
    public final uu X;
    public final v6 Y;
    public final n2.e Z;
    public o6 f42371a0;
    public final org.telegram.ui.Components.wy0[] f42372b0;
    public final org.telegram.ui.Cells.a2[] f42373c0;
    public final LinearLayout f42374d0;
    public final z6 f42375e0;
    public final long f42376f0;
    public final bi.c f42377g0;

    public vu(c7 c7Var, v6 v6Var, bi.c cVar, n2.e eVar) {
        super((org.telegram.ui.ActionBar.n2) c7Var, false, !cVar.h(), (org.telegram.ui.ActionBar.d6) null);
        String string;
        int i10;
        long j10;
        long j11;
        this.f42372b0 = new org.telegram.ui.Components.wy0[8];
        this.f42373c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = eVar;
        this.Y = v6Var;
        this.f42377g0 = cVar;
        this.f42376f0 = v6Var.f42114a;
        this.allowNestedScroll = false;
        O();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = c7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f42374d0 = linearLayout;
        linearLayout.setOrientation(1);
        uu uuVar = new uu(getContext(), v6Var.f42114a, eVar);
        this.X = uuVar;
        linearLayout.addView(uuVar, w7.z5.t(-2, -2, 1, 0, 16, 0, 16));
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
                j11 = w6Var.f42477a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.wy0[] wy0VarArr = this.f42372b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.e = paint;
                obj.f32281c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                wy0VarArr[i11] = obj;
                org.telegram.ui.Components.wy0 wy0Var = this.f42372b0[i11];
                wy0Var.f32279a = j11;
                wy0Var.f32280b = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                this.f42374d0.addView(a2Var2, w7.z5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j11), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21096j5, false));
                int i14 = org.telegram.ui.ActionBar.h6.f21118k7;
                org.telegram.ui.Components.xp xpVar = a2Var2.f21962r;
                if (xpVar != null) {
                    xpVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.i51(9, this, cVar));
                this.f42373c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f42372b0[i11] = null;
                this.f42373c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        uu uuVar2 = this.X;
        org.telegram.ui.Components.wy0[] wy0VarArr2 = this.f42372b0;
        uuVar2.f32501b = wy0VarArr2;
        uuVar2.F = cVar;
        uuVar2.invalidate();
        uuVar2.f32502c = new float[wy0VarArr2.length];
        uuVar2.d = new float[wy0VarArr2.length];
        uuVar2.e = new float[wy0VarArr2.length];
        uuVar2.c(false);
        if (uuVar2.f32509y > 1) {
            uuVar2.f32503f = 0.0f;
        } else {
            uuVar2.f32503f = 1.0f;
        }
        z6 z6Var = new z6(this, getContext(), c7Var, 1);
        this.f42375e0 = z6Var;
        z6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        z6Var.setCacheModel(cVar);
        z6Var.setDelegate(new mi.q(this, cVar, false, 11));
        org.telegram.ui.Components.va vaVar = this.f24884s;
        if (vaVar != null) {
            vaVar.setChildLayout(z6Var);
        } else {
            S();
            this.f42374d0.addView(this.f42371a0, w7.z5.q(-1, 72, 80));
        }
        if (this.f42371a0 != null) {
            this.f42371a0.a(this.X.a(), true);
        }
    }

    @Override
    public final CharSequence A() {
        return this.f24882n.getMessagesController().getFullName(this.f42376f0);
    }

    @Override
    public final void G(org.telegram.ui.Components.lw0 lw0Var) {
        this.d.j(new k3(this, 9));
        if (this.f24884s != null) {
            S();
            lw0Var.addView(this.f42371a0, w7.z5.e(-1, 72, 80));
        }
    }

    public final void S() {
        o6 o6Var = new o6(getContext());
        this.f42371a0 = o6Var;
        o6Var.f39781a.setOnClickListener(new a(this, 19));
        uu uuVar = this.X;
        if (uuVar != null) {
            this.f42371a0.a(uuVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.im0 x(org.telegram.ui.Components.jm0 jm0Var) {
        return new tu(this);
    }
}
