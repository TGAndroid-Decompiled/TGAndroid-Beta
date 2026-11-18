package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;
public final class r1 extends View implements org.telegram.ui.Cells.h9 {
    public TL_iv.pageBlockEmbedPost E;
    public final p50 f51400a;
    public final e4 f51401b;
    public final ImageReceiver f51402c;
    public final org.telegram.ui.Components.b9 d;
    public z2 f51403e;
    public z2 f51404f;
    public z2 h;
    public z2 f51405n;
    public boolean f51406r;
    public int f51407s;
    public int f51408w;
    public int f51409x;
    public int f51410y;

    public r1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f51400a = p50Var;
        this.f51401b = e4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f51402c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(20.0f));
        imageReceiver.y0(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        this.d = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f51404f;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.f51403e;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
        z2 z2Var3 = this.h;
        if (z2Var3 != null) {
            arrayList.add(z2Var3);
        }
        z2 z2Var4 = this.f51405n;
        if (z2Var4 != null) {
            arrayList.add(z2Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f51404f;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.f51403e;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
        z2 z2Var3 = this.h;
        if (z2Var3 != null) {
            z2Var3.i(this);
        }
        z2 z2Var4 = this.f51405n;
        if (z2Var4 != null) {
            z2Var4.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f51404f;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.f51403e;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
        z2 z2Var3 = this.h;
        if (z2Var3 != null) {
            z2Var3.f(this);
        }
        z2 z2Var4 = this.f51405n;
        if (z2Var4 != null) {
            z2Var4.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        float f10;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof v3;
            p50 p50Var = this.f51400a;
            int i11 = 0;
            if (!z10) {
                if (this.f51406r) {
                    this.f51402c.h(canvas, null);
                }
                int i12 = 54;
                if (this.f51404f != null) {
                    canvas.save();
                    if (this.f51406r) {
                        i10 = 54;
                    } else {
                        i10 = 0;
                    }
                    float L = org.telegram.messenger.g0.L(i10 + 32);
                    if (this.f51403e != null) {
                        f10 = 10.0f;
                    } else {
                        f10 = 19.0f;
                    }
                    canvas.translate(L, org.telegram.messenger.g0.L(f10));
                    g4.t(p50Var, canvas, this, 0);
                    this.f51404f.d(canvas, this);
                    canvas.restore();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if (this.f51403e != null) {
                    canvas.save();
                    if (!this.f51406r) {
                        i12 = 0;
                    }
                    canvas.translate(org.telegram.messenger.g0.L(i12 + 32), org.telegram.messenger.g0.L(29.0f));
                    g4.t(p50Var, canvas, this, i7);
                    this.f51403e.d(canvas, this);
                    canvas.restore();
                    i7++;
                }
                float L2 = org.telegram.messenger.g0.L(18.0f);
                float L3 = org.telegram.messenger.g0.L(6.0f);
                float L4 = org.telegram.messenger.g0.L(20.0f);
                int i13 = this.f51410y;
                if (this.E.level == 0) {
                    i11 = org.telegram.messenger.g0.L(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(L2, L3, L4, i13 - i11, g4.f47904s1);
                i11 = i7;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f51407s, this.f51408w);
                g4.t(p50Var, canvas2, this, i11);
                this.h.d(canvas2, this);
                canvas2.restore();
                i11++;
            }
            if (this.f51405n != null) {
                canvas2.save();
                canvas2.translate(this.f51407s, this.f51408w + this.f51409x);
                g4.t(p50Var, canvas2, this, i11);
                this.f51405n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.gd.M0(2131754867, null));
        if (this.f51404f != null) {
            sb2.append(", ");
            sb2.append(this.f51404f.d.getText());
        }
        if (this.f51403e != null) {
            sb2.append(", ");
            sb2.append(this.f51403e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f51405n != null) {
            sb2.append(", ");
            sb2.append(this.f51405n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f51400a, this.f51401b, motionEvent, this, this.h, this.f51407s, this.f51408w)) {
            if (!g4.j(this.f51400a, this.f51401b, motionEvent, this, this.f51405n, this.f51407s, this.f51408w + this.f51409x) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.E = pageblockembedpost;
        requestLayout();
    }
}
