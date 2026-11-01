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
    public final l60 f41185a;
    public final f4 f41186b;
    public final ImageReceiver f41187c;
    public final org.telegram.ui.Components.r8 d;
    public z2 e;
    public z2 f41188f;
    public z2 h;
    public z2 f41189n;
    public boolean f41190r;
    public int f41191s;
    public int f41192w;
    public int f41193x;
    public int f41194y;

    public s1(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f41185a = l60Var;
        this.f41186b = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f41187c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(20.0f));
        imageReceiver.y0(org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
        this.d = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f41188f;
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
        z2 z2Var4 = this.f41189n;
        if (z2Var4 != null) {
            arrayList.add(z2Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f41188f;
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
        z2 z2Var4 = this.f41189n;
        if (z2Var4 != null) {
            z2Var4.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f41188f;
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
        z2 z2Var4 = this.f41189n;
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
            l60 l60Var = this.f41185a;
            int i12 = 0;
            if (!z10) {
                if (this.f41190r) {
                    this.f41187c.h(canvas, null);
                }
                int i13 = 54;
                if (this.f41188f != null) {
                    canvas.save();
                    if (this.f41190r) {
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
                    h4.t(l60Var, canvas, this, 0);
                    this.f41188f.d(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    if (!this.f41190r) {
                        i13 = 0;
                    }
                    canvas.translate(org.telegram.messenger.i0.L(i13 + 32), org.telegram.messenger.i0.L(29.0f));
                    h4.t(l60Var, canvas, this, i10);
                    this.e.d(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float L2 = org.telegram.messenger.i0.L(18.0f);
                float L3 = org.telegram.messenger.i0.L(6.0f);
                float L4 = org.telegram.messenger.i0.L(20.0f);
                int i14 = this.f41194y;
                if (this.D.level == 0) {
                    i12 = org.telegram.messenger.i0.L(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(L2, L3, L4, i14 - i12, h4.f37661r1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f41191s, this.f41192w);
                h4.t(l60Var, canvas2, this, i12);
                this.h.d(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f41189n != null) {
                canvas2.save();
                canvas2.translate(this.f41191s, this.f41192w + this.f41193x);
                h4.t(l60Var, canvas2, this, i12);
                this.f41189n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.dd.L0(2131754867, null));
        if (this.f41188f != null) {
            sb2.append(", ");
            sb2.append(this.f41188f.d.getText());
        }
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f41189n != null) {
            sb2.append(", ");
            sb2.append(this.f41189n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f41185a, this.f41186b, motionEvent, this, this.h, this.f41191s, this.f41192w)) {
            if (!h4.j(this.f41185a, this.f41186b, motionEvent, this, this.f41189n, this.f41191s, this.f41192w + this.f41193x) && !super.onTouchEvent(motionEvent)) {
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
