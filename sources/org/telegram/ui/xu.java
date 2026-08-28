package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xu extends org.telegram.ui.Components.sa {
    public final wu T;
    public final r6 U;
    public final g5.b V;
    public j6 W;
    public final org.telegram.ui.Components.jx0[] X;
    public final org.telegram.ui.Cells.z1[] Y;
    public final LinearLayout Z;
    public final v6 f44604a0;
    public final long f44605b0;
    public final hh.b f44606c0;

    public xu(y6 y6Var, r6 r6Var, hh.b bVar, g5.b bVar2) {
        super(y6Var.getParentActivity(), y6Var, false, false, !bVar.h(), 1, null);
        String string;
        int i9;
        long j10;
        long j11;
        ?? r11 = 1;
        int i10 = 8;
        this.X = new org.telegram.ui.Components.jx0[8];
        this.Y = new org.telegram.ui.Cells.z1[8];
        this.V = bVar2;
        this.U = r6Var;
        this.f44606c0 = bVar;
        this.f44605b0 = r6Var.f42274a;
        this.allowNestedScroll = false;
        M();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        wu wuVar = new wu(getContext(), r6Var.f42274a, bVar2);
        this.T = wuVar;
        linearLayout.addView(wuVar, g7.e6.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.z1 z1Var = null;
        int i11 = 0;
        while (i11 < i10) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i9 = org.telegram.ui.ActionBar.f6.lj;
            } else if (i11 == r11) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i9 = org.telegram.ui.ActionBar.f6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i9 = org.telegram.ui.ActionBar.f6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i9 = org.telegram.ui.ActionBar.f6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i9 = org.telegram.ui.ActionBar.f6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i9 = org.telegram.ui.ActionBar.f6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i9 = org.telegram.ui.ActionBar.f6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i9 = org.telegram.ui.ActionBar.f6.pj;
            }
            s6 s6Var = (s6) r6Var.d.get(i11);
            if (s6Var != null) {
                j10 = 0;
                j11 = s6Var.f42566a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.jx0[] jx0VarArr = this.X;
                ?? obj = new Object();
                Paint paint = new Paint((int) r11);
                obj.f29873b = paint;
                obj.f29874c = r11;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                jx0VarArr[i11] = obj;
                org.telegram.ui.Components.jx0 jx0Var = this.X[i11];
                jx0Var.f29875e = j11;
                jx0Var.f29872a = i9;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                this.Z.addView(z1Var2, g7.e6.n(-1, 50));
                z1Var2.e(string, AndroidUtilities.formatFileSize(j11), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
                int i12 = org.telegram.ui.ActionBar.f6.f23128k7;
                org.telegram.ui.Components.dp dpVar = z1Var2.f26015r;
                if (dpVar != null) {
                    dpVar.b(i9, i9, i12);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.vh0(16, this, bVar));
                this.Y[i11] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.X[i11] = null;
                this.Y[i11] = null;
            }
            i11++;
            i10 = 8;
            r11 = 1;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        wu wuVar2 = this.T;
        org.telegram.ui.Components.jx0[] jx0VarArr2 = this.X;
        wuVar2.f30254b = jx0VarArr2;
        wuVar2.B = bVar;
        wuVar2.invalidate();
        wuVar2.f30255c = new float[jx0VarArr2.length];
        wuVar2.d = new float[jx0VarArr2.length];
        wuVar2.f30256e = new float[jx0VarArr2.length];
        wuVar2.c(false);
        if (wuVar2.f30263y > 1) {
            wuVar2.f30257f = 0.0f;
        } else {
            wuVar2.f30257f = 1.0f;
        }
        v6 v6Var = new v6(this, getContext(), y6Var, 1);
        this.f44604a0 = v6Var;
        v6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        v6Var.setCacheModel(bVar);
        v6Var.setDelegate(new org.telegram.ui.Cells.e3(5, this, bVar));
        org.telegram.ui.Components.na naVar = this.f32412s;
        if (naVar != null) {
            naVar.setChildLayout(v6Var);
        } else {
            Q();
            this.Z.addView(this.W, g7.e6.q(-1, 72, 80));
        }
        if (this.W != null) {
            this.W.a(this.T.a(), true);
        }
    }

    @Override
    public final void F(org.telegram.ui.Components.xu0 xu0Var) {
        this.d.j(new l3(this, 9));
        if (this.f32412s != null) {
            Q();
            xu0Var.addView(this.W, g7.e6.e(-1, 72, 80));
        }
    }

    public final void Q() {
        j6 j6Var = new j6(getContext());
        this.W = j6Var;
        j6Var.f39380a.setOnClickListener(new a(this, 19));
        wu wuVar = this.T;
        if (wuVar != null) {
            this.W.a(wuVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.vk0 v(org.telegram.ui.Components.wk0 wk0Var) {
        return new vu(this);
    }

    @Override
    public final CharSequence y() {
        return this.f32410n.getMessagesController().getFullName(this.f44605b0);
    }
}
