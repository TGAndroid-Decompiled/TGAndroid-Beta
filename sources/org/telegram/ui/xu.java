package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xu extends org.telegram.ui.Components.bb {
    public final wu X;
    public final w6 Y;
    public final m4.c Z;
    public p6 f45778a0;
    public final org.telegram.ui.Components.jz0[] f45779b0;
    public final org.telegram.ui.Cells.y1[] f45780c0;
    public final LinearLayout f45781d0;
    public final m6 f45782e0;
    public final long f45783f0;
    public final ci.b f45784g0;

    public xu(c7 c7Var, w6 w6Var, ci.b bVar, m4.c cVar) {
        super((org.telegram.ui.ActionBar.r2) c7Var, false, !bVar.h(), (org.telegram.ui.ActionBar.u6) null);
        String string;
        int i10;
        long j10;
        long j11;
        this.f45779b0 = new org.telegram.ui.Components.jz0[8];
        this.f45780c0 = new org.telegram.ui.Cells.y1[8];
        this.Z = cVar;
        this.Y = w6Var;
        this.f45784g0 = bVar;
        this.f45783f0 = w6Var.f44525a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = c7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f45781d0 = linearLayout;
        linearLayout.setOrientation(1);
        wu wuVar = new wu(getContext(), w6Var.f44525a, cVar);
        this.X = wuVar;
        linearLayout.addView(wuVar, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 16, 0, 16));
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
                j11 = x6Var.f45602a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.jz0[] jz0VarArr = this.f45779b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.e = paint;
                obj.f29792c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                jz0VarArr[i11] = obj;
                org.telegram.ui.Components.jz0 jz0Var = this.f45779b0[i11];
                jz0Var.f29790a = j11;
                jz0Var.f29791b = i13;
                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, parentActivity, null, false);
                y1Var2.setTag(Integer.valueOf(i11));
                y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                this.f45781d0.addView(y1Var2, org.telegram.ui.Components.kb1.r(-1, 50));
                y1Var2.e(str, AndroidUtilities.formatFileSize(j11), true, true, false);
                if (y1Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.f7.V(y1Var2.getTextView(), org.telegram.ui.ActionBar.y6.f23465j5, null);
                } else {
                    y1Var2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23465j5, false));
                }
                int i14 = org.telegram.ui.ActionBar.y6.f23486k7;
                org.telegram.ui.Components.aq aqVar = y1Var2.f25743r;
                if (aqVar != null) {
                    aqVar.b(i13, i13, i14);
                }
                y1Var2.setOnClickListener(new org.telegram.ui.Components.l51(10, this, bVar));
                this.f45780c0[i11] = y1Var2;
                y1Var = y1Var2;
            } else {
                this.f45779b0[i11] = null;
                this.f45780c0[i11] = null;
            }
            i11++;
        }
        if (y1Var != null) {
            y1Var.setNeedDivider(false);
        }
        wu wuVar2 = this.X;
        org.telegram.ui.Components.jz0[] jz0VarArr2 = this.f45779b0;
        wuVar2.f30064b = jz0VarArr2;
        wuVar2.F = bVar;
        wuVar2.invalidate();
        wuVar2.f30065c = new float[jz0VarArr2.length];
        wuVar2.d = new float[jz0VarArr2.length];
        wuVar2.e = new float[jz0VarArr2.length];
        wuVar2.c(false);
        if (wuVar2.f30072y > 1) {
            wuVar2.f30066f = 0.0f;
        } else {
            wuVar2.f30066f = 1.0f;
        }
        m6 m6Var = new m6(this, getContext(), c7Var);
        this.f45782e0 = m6Var;
        int dp = AndroidUtilities.dp(80.0f);
        if (m6Var.f45615w == null) {
            m6Var.v = dp;
            int i15 = 0;
            while (true) {
                org.telegram.ui.Components.v91 v91Var = m6Var.f45612n;
                if (i15 >= v91Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.nm0 c10 = m6Var.c(v91Var.getViewPages()[i15]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), dp);
                }
                i15++;
            }
        }
        this.f45782e0.setCacheModel(bVar);
        this.f45782e0.setDelegate(new m4.w1(this, bVar, false, 12));
        org.telegram.ui.Components.va vaVar = this.f26795s;
        if (vaVar != null) {
            vaVar.setChildLayout(this.f45782e0);
        } else {
            R();
            this.f45781d0.addView(this.f45778a0, org.telegram.ui.Components.kb1.u(-1, 72, 80));
        }
        if (this.f45778a0 != null) {
            this.f45778a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.ww0 ww0Var) {
        this.d.j(new i3(this, 10));
        if (this.f26795s != null) {
            R();
            ww0Var.addView(this.f45778a0, org.telegram.ui.Components.kb1.i(-1, 72, 80));
        }
    }

    public final void R() {
        p6 p6Var = new p6(getContext());
        this.f45778a0 = p6Var;
        p6Var.f42313a.setOnClickListener(new a(this, 19));
        wu wuVar = this.X;
        if (wuVar != null) {
            this.f45778a0.a(wuVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 v(org.telegram.ui.Components.nm0 nm0Var) {
        return new vu(this);
    }

    @Override
    public final CharSequence y() {
        return this.f26793n.getMessagesController().getFullName(this.f45783f0);
    }
}
