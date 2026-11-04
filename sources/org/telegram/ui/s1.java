package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;
public final class s1 extends View implements org.telegram.ui.Cells.g9 {
    public TL_iv.pageBlockEmbedPost E;
    public final i50 f49322a;
    public final g4 f49323b;
    public final ImageReceiver f49324c;
    public final org.telegram.ui.Components.u8 d;
    public a3 f49325e;
    public a3 f49326f;
    public a3 h;
    public a3 f49327n;
    public boolean f49328r;
    public int f49329s;
    public int f49330w;
    public int f49331x;
    public int f49332y;

    public s1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f49322a = i50Var;
        this.f49323b = g4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f49324c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(20.0f));
        imageReceiver.y0(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        this.d = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f49326f;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f49325e;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            arrayList.add(a3Var3);
        }
        a3 a3Var4 = this.f49327n;
        if (a3Var4 != null) {
            arrayList.add(a3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f49326f;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.f49325e;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            a3Var3.i(this);
        }
        a3 a3Var4 = this.f49327n;
        if (a3Var4 != null) {
            a3Var4.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f49326f;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.f49325e;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            a3Var3.f(this);
        }
        a3 a3Var4 = this.f49327n;
        if (a3Var4 != null) {
            a3Var4.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i3;
        int i10;
        float f10;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof w3;
            i50 i50Var = this.f49322a;
            int i11 = 0;
            if (!z10) {
                if (this.f49328r) {
                    this.f49324c.h(canvas, null);
                }
                int i12 = 54;
                if (this.f49326f != null) {
                    canvas.save();
                    if (this.f49328r) {
                        i10 = 54;
                    } else {
                        i10 = 0;
                    }
                    float L = org.telegram.messenger.g0.L(i10 + 32);
                    if (this.f49325e != null) {
                        f10 = 10.0f;
                    } else {
                        f10 = 19.0f;
                    }
                    canvas.translate(L, org.telegram.messenger.g0.L(f10));
                    i4.t(i50Var, canvas, this, 0);
                    this.f49326f.d(canvas, this);
                    canvas.restore();
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (this.f49325e != null) {
                    canvas.save();
                    if (!this.f49328r) {
                        i12 = 0;
                    }
                    canvas.translate(org.telegram.messenger.g0.L(i12 + 32), org.telegram.messenger.g0.L(29.0f));
                    i4.t(i50Var, canvas, this, i3);
                    this.f49325e.d(canvas, this);
                    canvas.restore();
                    i3++;
                }
                float L2 = org.telegram.messenger.g0.L(18.0f);
                float L3 = org.telegram.messenger.g0.L(6.0f);
                float L4 = org.telegram.messenger.g0.L(20.0f);
                int i13 = this.f49332y;
                if (this.E.level == 0) {
                    i11 = org.telegram.messenger.g0.L(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(L2, L3, L4, i13 - i11, i4.f46069s1);
                i11 = i3;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f49329s, this.f49330w);
                i4.t(i50Var, canvas2, this, i11);
                this.h.d(canvas2, this);
                canvas2.restore();
                i11++;
            }
            if (this.f49327n != null) {
                canvas2.save();
                canvas2.translate(this.f49329s, this.f49330w + this.f49331x);
                i4.t(i50Var, canvas2, this, i11);
                this.f49327n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754867, null));
        if (this.f49326f != null) {
            sb2.append(", ");
            sb2.append(this.f49326f.d.getText());
        }
        if (this.f49325e != null) {
            sb2.append(", ");
            sb2.append(this.f49325e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f49327n != null) {
            sb2.append(", ");
            sb2.append(this.f49327n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f49322a, this.f49323b, motionEvent, this, this.h, this.f49329s, this.f49330w)) {
            if (!i4.j(this.f49322a, this.f49323b, motionEvent, this, this.f49327n, this.f49329s, this.f49330w + this.f49331x) && !super.onTouchEvent(motionEvent)) {
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
