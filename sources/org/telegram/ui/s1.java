package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;
public final class s1 extends View implements org.telegram.ui.Cells.j9 {
    public TL_iv.pageBlockEmbedPost D;
    public final m60 f41326a;
    public final f4 f41327b;
    public final ImageReceiver f41328c;
    public final org.telegram.ui.Components.r8 d;
    public z2 e;
    public z2 f41329f;
    public z2 h;
    public z2 f41330n;
    public boolean f41331r;
    public int f41332s;
    public int f41333w;
    public int f41334x;
    public int f41335y;

    public s1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.f41326a = m60Var;
        this.f41327b = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f41328c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(20.0f));
        imageReceiver.y0(org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
        this.d = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f41329f;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
        z2 z2Var3 = this.h;
        if (z2Var3 != null) {
            arrayList.add(z2Var3);
        }
        z2 z2Var4 = this.f41330n;
        if (z2Var4 != null) {
            arrayList.add(z2Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f41329f;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
        z2 z2Var3 = this.h;
        if (z2Var3 != null) {
            z2Var3.i(this);
        }
        z2 z2Var4 = this.f41330n;
        if (z2Var4 != null) {
            z2Var4.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f41329f;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
        z2 z2Var3 = this.h;
        if (z2Var3 != null) {
            z2Var3.f(this);
        }
        z2 z2Var4 = this.f41330n;
        if (z2Var4 != null) {
            z2Var4.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        float f7;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.D;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof w3;
            m60 m60Var = this.f41326a;
            int i12 = 0;
            if (!z10) {
                if (this.f41331r) {
                    this.f41328c.h(canvas, null);
                }
                int i13 = 54;
                if (this.f41329f != null) {
                    canvas.save();
                    if (this.f41331r) {
                        i11 = 54;
                    } else {
                        i11 = 0;
                    }
                    float L = org.telegram.messenger.i0.L(i11 + 32);
                    if (this.e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    canvas.translate(L, org.telegram.messenger.i0.L(f7));
                    h4.t(m60Var, canvas, this, 0);
                    this.f41329f.d(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    if (!this.f41331r) {
                        i13 = 0;
                    }
                    canvas.translate(org.telegram.messenger.i0.L(i13 + 32), org.telegram.messenger.i0.L(29.0f));
                    h4.t(m60Var, canvas, this, i10);
                    this.e.d(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float L2 = org.telegram.messenger.i0.L(18.0f);
                float L3 = org.telegram.messenger.i0.L(6.0f);
                float L4 = org.telegram.messenger.i0.L(20.0f);
                int i14 = this.f41335y;
                if (this.D.level == 0) {
                    i12 = org.telegram.messenger.i0.L(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(L2, L3, L4, i14 - i12, h4.f37716r1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f41332s, this.f41333w);
                h4.t(m60Var, canvas2, this, i12);
                this.h.d(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f41330n != null) {
                canvas2.save();
                canvas2.translate(this.f41332s, this.f41333w + this.f41334x);
                h4.t(m60Var, canvas2, this, i12);
                this.f41330n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754867, null));
        if (this.f41329f != null) {
            sb2.append(", ");
            sb2.append(this.f41329f.d.getText());
        }
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f41330n != null) {
            sb2.append(", ");
            sb2.append(this.f41330n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f41326a, this.f41327b, motionEvent, this, this.h, this.f41332s, this.f41333w)) {
            if (!h4.j(this.f41326a, this.f41327b, motionEvent, this, this.f41330n, this.f41332s, this.f41333w + this.f41334x) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.D = pageblockembedpost;
        requestLayout();
    }
}
