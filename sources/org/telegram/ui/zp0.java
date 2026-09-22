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
public final class zp0 extends View {
    public final org.telegram.ui.ActionBar.f6 f40600a;
    public final Paint f40601b;
    public final int f40602c;
    public final int d;
    public boolean e;
    public yp0[] f40603f;
    public final int[] h;
    public final Paint f40604n;
    public boolean f40605r;
    public int f40606s;
    public Utilities.Callback v;
    public yp0 f40607w;

    public zp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f40601b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f40604n = new Paint(1);
        this.f40605r = true;
        this.f40606s = 0;
        this.f40602c = i10;
        this.d = i11;
        this.f40600a = f6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f40606s = i10;
        if (this.f40603f != null) {
            int i11 = 0;
            while (true) {
                yp0[] yp0VarArr = this.f40603f;
                if (i11 < yp0VarArr.length) {
                    yp0 yp0Var = yp0VarArr[i11];
                    if (yp0Var.f40008o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yp0Var.f40006m = z11;
                    if (!z10) {
                        yp0Var.f40007n.f(z11, true);
                    }
                    yp0Var.f40011r.invalidate();
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
        if (this.f40603f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f40602c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            yp0[] yp0VarArr = this.f40603f;
            if (i12 < yp0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f40600a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    yp0 yp0Var = yp0VarArr[i12];
                    int i13 = iArr[i12];
                    yp0Var.f40008o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.j6.f19093c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.j6.f19368r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    yp0Var.f40001g = false;
                    yp0Var.f40000f = false;
                    yp0Var.f39997a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    yp0 yp0Var2 = yp0VarArr[i12];
                    int i14 = iArr[i12];
                    yp0Var2.f40008o = i14;
                    int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19368r8[i14], f6Var);
                    yp0Var2.f40001g = false;
                    yp0Var2.f40000f = false;
                    yp0Var2.f39997a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f40603f[i12].f40008o = peerColors.colors.get(i12).f15839id;
                    this.f40603f[i12].a(peerColors.colors.get(i12));
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
        if (this.f40603f != null) {
            int i10 = 0;
            while (true) {
                yp0[] yp0VarArr = this.f40603f;
                if (i10 >= yp0VarArr.length) {
                    break;
                }
                yp0 yp0Var = yp0VarArr[i10];
                zp0 zp0Var = yp0Var.f40011r;
                Path path = yp0Var.e;
                canvas.save();
                float a2 = yp0Var.f40005l.a(0.05f);
                RectF rectF = yp0Var.f40009p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = yp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(yp0Var.f39997a);
                if (yp0Var.f40000f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, yp0Var.f39998b);
                }
                canvas.restore();
                if (yp0Var.f40001g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), yp0Var.f39999c);
                    canvas.restore();
                }
                float e = yp0Var.f40007n.e(yp0Var.f40006m);
                if (e > 0.0f) {
                    Paint paint = zp0Var.f40601b;
                    Paint paint2 = zp0Var.f40601b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19109d6, zp0Var.f40600a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (yp0Var.h) {
                    if (zp0Var.e) {
                        if (yp0Var.f40004k == null) {
                            Drawable drawable = zp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            yp0Var.f40004k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        yp0Var.f40004k.setBounds((int) org.telegram.messenger.rk.b(yp0Var.f40004k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.rk.b(yp0Var.f40004k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a4.a.e(yp0Var.f40004k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a4.a.e(yp0Var.f40004k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        yp0Var.f40004k.draw(canvas);
                    } else {
                        if (yp0Var.f40002i == null) {
                            yp0Var.f40002i = new Path();
                        }
                        if (yp0Var.f40003j == null) {
                            Paint paint3 = new Paint(1);
                            yp0Var.f40003j = paint3;
                            paint3.setColor(-1);
                            yp0Var.f40003j.setStyle(Paint.Style.STROKE);
                            yp0Var.f40003j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        yp0Var.f40003j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        yp0Var.f40002i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        yp0Var.f40002i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        yp0Var.f40002i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        yp0Var.f40002i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        yp0Var.f40002i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(yp0Var.f40002i, yp0Var.f40003j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f40605r) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19110d7, this.f40600a);
            Paint paint4 = this.f40604n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f40606s;
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
        int i14 = this.f40602c;
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
        yp0[] yp0VarArr = this.f40603f;
        if (yp0VarArr == null || yp0VarArr.length != size) {
            this.f40603f = new yp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f40603f[i17] = new yp0(this);
                if (i14 == i16) {
                    yp0 yp0Var = this.f40603f[i17];
                    int i18 = this.h[i17];
                    yp0Var.f40008o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.j6.f19093c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.j6.f19368r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i13, this.f40600a);
                    yp0Var.f40001g = false;
                    yp0Var.f40000f = false;
                    yp0Var.f39997a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f40603f[i17].f40008o = peerColors.colors.get(i17).f15839id;
                    this.f40603f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f40603f != null) {
            float f13 = f12;
            float f14 = min3;
            for (int i19 = 0; i19 < this.f40603f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f40603f[i19].f40009p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f40603f[i19].f40010q.set(rectF);
                yp0 yp0Var2 = this.f40603f[i19];
                if (yp0Var2.f40008o == this.f40606s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yp0Var2.f40006m = z11;
                yp0Var2.f40007n.f(z11, true);
                yp0Var2.f40011r.invalidate();
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
        this.e = z10;
    }

    public void setDivider(boolean z10) {
        this.f40605r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
