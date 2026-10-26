package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vu extends org.telegram.ui.Components.bb {
    public final uu X;
    public final w6 Y;
    public final m4.c Z;
    public p6 f44903a0;
    public final org.telegram.ui.Components.iz0[] f44904b0;
    public final org.telegram.ui.Cells.y1[] f44905c0;
    public final LinearLayout f44906d0;
    public final m6 f44907e0;
    public final long f44908f0;
    public final ci.b f44909g0;

    public vu(c7 c7Var, w6 w6Var, ci.b bVar, m4.c cVar) {
        super((org.telegram.ui.ActionBar.r2) c7Var, false, !bVar.h(), (org.telegram.ui.ActionBar.u6) null);
        String string;
        int i10;
        long j10;
        long j11;
        this.f44904b0 = new org.telegram.ui.Components.iz0[8];
        this.f44905c0 = new org.telegram.ui.Cells.y1[8];
        this.Z = cVar;
        this.Y = w6Var;
        this.f44909g0 = bVar;
        this.f44908f0 = w6Var.f44986a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = c7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f44906d0 = linearLayout;
        linearLayout.setOrientation(1);
        uu uuVar = new uu(getContext(), w6Var.f44986a, cVar);
        this.X = uuVar;
        linearLayout.addView(uuVar, org.telegram.ui.Components.gb1.x(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.y1 y1Var = null;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.y6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.y6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.y6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.y6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.y6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.y6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.y6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.y6.pj;
            }
            String str = string;
            int i13 = i10;
            x6 x6Var = (x6) w6Var.d.get(i11);
            if (x6Var != null) {
                j10 = 0;
                j11 = x6Var.f45663a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.iz0[] iz0VarArr = this.f44904b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.e = paint;
                obj.f29412c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                iz0VarArr[i11] = obj;
                org.telegram.ui.Components.iz0 iz0Var = this.f44904b0[i11];
                iz0Var.f29410a = j11;
                iz0Var.f29411b = i13;
                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, parentActivity, null, false);
                y1Var2.setTag(Integer.valueOf(i11));
                y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                this.f44906d0.addView(y1Var2, org.telegram.ui.Components.gb1.r(-1, 50));
                y1Var2.e(str, AndroidUtilities.formatFileSize(j11), true, true, false);
                if (y1Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.f7.V(y1Var2.getTextView(), org.telegram.ui.ActionBar.y6.f23464j5, null);
                } else {
                    y1Var2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23464j5, false));
                }
                int i14 = org.telegram.ui.ActionBar.y6.f23485k7;
                org.telegram.ui.Components.zp zpVar = y1Var2.f25741r;
                if (zpVar != null) {
                    zpVar.b(i13, i13, i14);
                }
                y1Var2.setOnClickListener(new org.telegram.ui.Components.k51(10, this, bVar));
                this.f44905c0[i11] = y1Var2;
                y1Var = y1Var2;
            } else {
                this.f44904b0[i11] = null;
                this.f44905c0[i11] = null;
            }
            i11++;
        }
        if (y1Var != null) {
            y1Var.setNeedDivider(false);
        }
        uu uuVar2 = this.X;
        org.telegram.ui.Components.iz0[] iz0VarArr2 = this.f44904b0;
        uuVar2.f29752b = iz0VarArr2;
        uuVar2.F = bVar;
        uuVar2.invalidate();
        uuVar2.f29753c = new float[iz0VarArr2.length];
        uuVar2.d = new float[iz0VarArr2.length];
        uuVar2.e = new float[iz0VarArr2.length];
        uuVar2.c(false);
        if (uuVar2.f29760y > 1) {
            uuVar2.f29754f = 0.0f;
        } else {
            uuVar2.f29754f = 1.0f;
        }
        m6 m6Var = new m6(this, getContext(), c7Var);
        this.f44907e0 = m6Var;
        int dp = AndroidUtilities.dp(80.0f);
        if (m6Var.f45685w == null) {
            m6Var.v = dp;
            int i15 = 0;
            while (true) {
                org.telegram.ui.Components.u91 u91Var = m6Var.f45682n;
                if (i15 >= u91Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.mm0 c10 = m6Var.c(u91Var.getViewPages()[i15]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), dp);
                }
                i15++;
            }
        }
        this.f44907e0.setCacheModel(bVar);
        this.f44907e0.setDelegate(new m4.w1(this, bVar, false, 12));
        org.telegram.ui.Components.va vaVar = this.f26813s;
        if (vaVar != null) {
            vaVar.setChildLayout(this.f44907e0);
        } else {
            R();
            this.f44906d0.addView(this.f44903a0, org.telegram.ui.Components.gb1.u(-1, 72, 80));
        }
        if (this.f44903a0 != null) {
            this.f44903a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.vw0 vw0Var) {
        this.d.j(new i3(this, 10));
        if (this.f26813s != null) {
            R();
            vw0Var.addView(this.f44903a0, org.telegram.ui.Components.gb1.i(-1, 72, 80));
        }
    }

    public final void R() {
        p6 p6Var = new p6(getContext());
        this.f44903a0 = p6Var;
        p6Var.f42365a.setOnClickListener(new a(this, 19));
        uu uuVar = this.X;
        if (uuVar != null) {
            this.f44903a0.a(uuVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.lm0 v(org.telegram.ui.Components.mm0 mm0Var) {
        return new tu(this);
    }

    @Override
    public final CharSequence y() {
        return this.f26811n.getMessagesController().getFullName(this.f44908f0);
    }
}
