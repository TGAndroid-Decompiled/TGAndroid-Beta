package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class t2 extends FrameLayout implements org.telegram.ui.Components.q01, org.telegram.ui.Cells.r9 {
    public final j70 f43465a;
    public final h4 f43466b;
    public final s2 f43467c;
    public a3 d;
    public final org.telegram.ui.Components.r01 e;
    public int f43468f;
    public int h;
    public int f43469n;
    public boolean f43470r;
    public TL_iv.pageBlockTable f43471s;
    public final androidx.emoji2.text.n v;

    public t2(Context context, j70 j70Var, h4 h4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.f43465a = j70Var;
        this.f43466b = h4Var;
        s2 s2Var = new s2(this, context, j70Var);
        this.f43467c = s2Var;
        float f7 = 18;
        s2Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        s2Var.setClipToPadding(false);
        addView(s2Var, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        org.telegram.ui.Components.r01 r01Var = new org.telegram.ui.Components.r01(context, this, ((j4) j70Var).P0);
        this.e = r01Var;
        r01Var.setOrientation(0);
        r01Var.setRowOrderPreserved(true);
        s2Var.addView(r01Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.r01 r01Var = this.e;
        int childCount = r01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.k01 d = r01Var.d(i11);
            org.telegram.ui.Components.j01 j01Var = d.f29800b;
            if (j01Var != null) {
                j01Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f43468f)) - this.f43467c.getScrollX());
                d.f29800b.setY(d.c() + this.h);
                d.f29800b.setRow(d.f29805j + 10);
                d.f29813r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.j01 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        Layout.Alignment alignment2 = alignment;
        return j4.p(this.f43465a, this, null, pagetablecell.text, i10, -1, this.f43471s, alignment2, 0, this.f43466b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f43465a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.v);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.d;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        org.telegram.ui.Components.r01 r01Var = this.e;
        int childCount = r01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.j01 j01Var = r01Var.d(i10).f29800b;
            if (j01Var != null) {
                arrayList.add(j01Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return j4.f40387u1;
    }

    @Override
    public Paint getHeaderPaint() {
        return j4.f40388v1;
    }

    @Override
    public Paint getLinePaint() {
        return j4.f40386t1;
    }

    @Override
    public Paint getStripPaint() {
        return j4.f40389w1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        org.telegram.ui.Components.r01 r01Var = this.e;
        int childCount = r01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.j01 j01Var = r01Var.d(i10).f29800b;
            if (j01Var != null) {
                j01Var.attach(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        org.telegram.ui.Components.r01 r01Var = this.e;
        int childCount = r01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.j01 j01Var = r01Var.d(i10).f29800b;
            if (j01Var != null) {
                j01Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43471s == null) {
            return;
        }
        a3 a3Var = this.d;
        j70 j70Var = this.f43465a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f43469n, 0);
            j4.v(j70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, j70Var, this.f43471s, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVTable));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f43468f;
        int i15 = this.h;
        s2 s2Var = this.f43467c;
        s2Var.layout(i14, i15, s2Var.getMeasuredWidth() + i14, s2Var.getMeasuredHeight() + this.h);
        if (this.f43470r) {
            h4 h4Var = this.f43466b;
            if (h4Var != null && h4Var.G) {
                s2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - s2Var.getMeasuredWidth()));
            } else {
                s2Var.setScrollX(0);
            }
            this.f43470r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.j01 j01Var, int i10, int i11) {
        if (j01Var instanceof a3) {
            j70 j70Var = this.f43465a;
            if (!j70Var.E.isEmpty() && j70Var.F != null) {
                a3 a3Var = (a3) j01Var;
                String lowerCase = a3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(j70Var.F, i12);
                    if (indexOf >= 0) {
                        int length = j70Var.F.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = a3Var.d;
                            this.f43466b.f39771y.put(j70Var.F + this.f43471s + a3Var.f37665r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
                        }
                        i12 = length;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockTable pageblocktable = this.f43471s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            j70 j70Var = this.f43465a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f43468f = dp2;
                j70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f43469n = dp3;
                dp = size - dp3;
            } else {
                this.f43468f = 0;
                j70Var.getClass();
                this.f43469n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f43471s;
            a3 p10 = j4.p(this.f43465a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f43466b);
            this.d = p10;
            if (p10 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p10.d.getHeight();
                this.h = i13;
                a3 a3Var = this.d;
                a3Var.f37666s = this.f43469n;
                a3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f43468f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            s2 s2Var = this.f43467c;
            s2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.t.D(8.0f, s2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f43471s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i12 += AndroidUtilities.dp(8.0f);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        a();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.Components.r01 r01Var = this.e;
        int childCount = r01Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.k01 d = r01Var.d(i10);
            org.telegram.ui.Components.j01 j01Var = d.f29800b;
            if (j01Var instanceof a3) {
                a3 a3Var = (a3) j01Var;
                s2 s2Var = this.f43467c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (j4.l(this.f43465a, this.f43466b, motionEvent3, this, a3Var, d.b() + (s2Var.getPaddingLeft() - s2Var.getScrollX()) + this.f43468f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!j4.l(this.f43465a, this.f43466b, motionEvent4, this, this.d, this.f43469n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i10;
        this.f43471s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.y6.f23357d6;
        ((j4) this.f43465a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f43467c, org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        org.telegram.ui.Components.r01 r01Var = this.e;
        r01Var.P.clear();
        r01Var.K.clear();
        r01Var.h();
        r01Var.setDrawLines(this.f43471s.bordered);
        r01Var.setStriped(this.f43471s.striped);
        h4 h4Var = this.f43466b;
        if (h4Var != null && h4Var.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        r01Var.setRtl(z10);
        if (!this.f43471s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f43471s.rows.get(0);
            int size = pagetablerow.cells.size();
            i10 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = pagetablerow.cells.get(i12).colspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                i10 += i13;
            }
        } else {
            i10 = 0;
        }
        int size2 = this.f43471s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f43471s.rows.get(i14);
            int size3 = pagetablerow2.cells.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size3; i16++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i16);
                int i17 = pagetablecell.colspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                int i18 = pagetablecell.rowspan;
                if (i18 == 0) {
                    i18 = 1;
                }
                if (pagetablecell.text != null) {
                    r01Var.b(pagetablecell, i15, i14, i17);
                } else {
                    r01Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        r01Var.setColumnCount(i10);
        this.f43470r = true;
        requestLayout();
    }
}
