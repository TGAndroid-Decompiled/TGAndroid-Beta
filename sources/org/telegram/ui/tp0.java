package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class tp0 extends View {
    public final org.telegram.ui.ActionBar.d6 f40937a;
    public final Paint f40938b;
    public final int f40939c;
    public final int d;
    public boolean f40940e;
    public sp0[] f40941f;
    public final int[] h;
    public final Paint f40942n;
    public boolean f40943r;
    public int f40944s;
    public Utilities.Callback v;
    public sp0 f40945w;

    public tp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f40938b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f40942n = new Paint(1);
        this.f40943r = true;
        this.f40944s = 0;
        this.f40939c = i10;
        this.d = i11;
        this.f40937a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f40944s = i10;
        if (this.f40941f != null) {
            int i11 = 0;
            while (true) {
                sp0[] sp0VarArr = this.f40941f;
                if (i11 < sp0VarArr.length) {
                    sp0 sp0Var = sp0VarArr[i11];
                    if (sp0Var.f40603o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    sp0Var.f40601m = z11;
                    if (!z10) {
                        sp0Var.f40602n.f(z11, true);
                    }
                    sp0Var.f40606r.invalidate();
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b() {
        MessagesController.PeerColors peerColors;
        boolean z10;
        int i10;
        if (this.f40941f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f40939c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            sp0[] sp0VarArr = this.f40941f;
            if (i12 < sp0VarArr.length) {
                org.telegram.ui.ActionBar.d6 d6Var = this.f40937a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    sp0 sp0Var = sp0VarArr[i12];
                    int i13 = iArr[i12];
                    sp0Var.f40603o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.i6.f20806c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.i6.f21084r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
                    sp0Var.f40596g = false;
                    sp0Var.f40595f = false;
                    sp0Var.f40591a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    sp0 sp0Var2 = sp0VarArr[i12];
                    int i14 = iArr[i12];
                    sp0Var2.f40603o = i14;
                    int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21084r8[i14], d6Var);
                    sp0Var2.f40596g = false;
                    sp0Var2.f40595f = false;
                    sp0Var2.f40591a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f40941f[i12].f40603o = peerColors.colors.get(i12).f17263id;
                    this.f40941f[i12].a(peerColors.colors.get(i12));
                }
                i12++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f40941f != null) {
            int i10 = 0;
            while (true) {
                sp0[] sp0VarArr = this.f40941f;
                if (i10 >= sp0VarArr.length) {
                    break;
                }
                sp0 sp0Var = sp0VarArr[i10];
                tp0 tp0Var = sp0Var.f40606r;
                Path path = sp0Var.f40594e;
                canvas.save();
                float a2 = sp0Var.f40600l.a(0.05f);
                RectF rectF = sp0Var.f40604p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = sp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(sp0Var.f40591a);
                if (sp0Var.f40595f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, sp0Var.f40592b);
                }
                canvas.restore();
                if (sp0Var.f40596g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), sp0Var.f40593c);
                    canvas.restore();
                }
                float e7 = sp0Var.f40602n.e(sp0Var.f40601m);
                if (e7 > 0.0f) {
                    Paint paint = tp0Var.f40938b;
                    Paint paint2 = tp0Var.f40938b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20822d6, tp0Var.f40937a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e7) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (sp0Var.h) {
                    if (tp0Var.f40940e) {
                        if (sp0Var.f40599k == null) {
                            Drawable drawable = tp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            sp0Var.f40599k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        sp0Var.f40599k.setBounds((int) org.telegram.messenger.bi.b(sp0Var.f40599k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.bi.b(sp0Var.f40599k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a4.a.e(sp0Var.f40599k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a4.a.e(sp0Var.f40599k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        sp0Var.f40599k.draw(canvas);
                    } else {
                        if (sp0Var.f40597i == null) {
                            sp0Var.f40597i = new Path();
                        }
                        if (sp0Var.f40598j == null) {
                            Paint paint3 = new Paint(1);
                            sp0Var.f40598j = paint3;
                            paint3.setColor(-1);
                            sp0Var.f40598j.setStyle(Paint.Style.STROKE);
                            sp0Var.f40598j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        sp0Var.f40598j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        sp0Var.f40597i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e7);
                        sp0Var.f40597i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        sp0Var.f40597i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        sp0Var.f40597i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        sp0Var.f40597i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(sp0Var.f40597i, sp0Var.f40598j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f40943r) {
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20823d7, this.f40937a);
            Paint paint4 = this.f40942n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f40944s;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        MessagesController.PeerColors peerColors;
        int size;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int size2 = View.MeasureSpec.getSize(i10);
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i14 = this.f40939c;
        if (i14 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        if (peerColors == null) {
            size = 0;
        } else {
            size = peerColors.colors.size();
        }
        int i15 = 8;
        int i16 = 2;
        if (i14 == 2) {
            size = 8;
        }
        if (i14 != 2 && i14 == 1) {
            i15 = 7;
        }
        float f7 = size2;
        float f10 = i15;
        float f11 = i15 + 1;
        float min = Math.min(AndroidUtilities.dp(54.0f), f7 / ((f11 * 0.28947f) + f10));
        float min2 = Math.min(0.28947f * min, AndroidUtilities.dp(8.0f));
        float min3 = Math.min(0.31578946f * min, AndroidUtilities.dp(11.33f));
        setMeasuredDimension(size2, (int) (((i12 + 1) * min3) + ((size / i15) * min)));
        sp0[] sp0VarArr = this.f40941f;
        if (sp0VarArr == null || sp0VarArr.length != size) {
            this.f40941f = new sp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f40941f[i17] = new sp0(this);
                if (i14 == i16) {
                    sp0 sp0Var = this.f40941f[i17];
                    int i18 = this.h[i17];
                    sp0Var.f40603o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.i6.f20806c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.i6.f21084r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i13, this.f40937a);
                    sp0Var.f40596g = false;
                    sp0Var.f40595f = false;
                    sp0Var.f40591a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f40941f[i17].f40603o = peerColors.colors.get(i17).f17263id;
                    this.f40941f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f40941f != null) {
            float f13 = f12;
            float f14 = min3;
            for (int i19 = 0; i19 < this.f40941f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f40941f[i19].f40604p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f40941f[i19].f40605q.set(rectF);
                sp0 sp0Var2 = this.f40941f[i19];
                if (sp0Var2.f40603o == this.f40944s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sp0Var2.f40601m = z11;
                sp0Var2.f40602n.f(z11, true);
                sp0Var2.f40606r.invalidate();
                if (i19 % i15 == i15 - 1) {
                    f14 += min + min3;
                    f13 = f12;
                } else {
                    f13 = min + min2 + f13;
                }
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.f40940e = z10;
    }

    public void setDivider(boolean z10) {
        this.f40943r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
