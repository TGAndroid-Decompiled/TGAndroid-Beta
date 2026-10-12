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
    public final org.telegram.ui.ActionBar.c6 f44899a;
    public final Paint f44900b;
    public final int f44901c;
    public final int d;
    public boolean f44902e;
    public yp0[] f44903f;
    public final int[] h;
    public final Paint f44904n;
    public boolean f44905r;
    public int f44906s;
    public Utilities.Callback v;
    public yp0 f44907w;

    public zp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f44900b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f44904n = new Paint(1);
        this.f44905r = true;
        this.f44906s = 0;
        this.f44901c = i10;
        this.d = i11;
        this.f44899a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f44906s = i10;
        if (this.f44903f != null) {
            int i11 = 0;
            while (true) {
                yp0[] yp0VarArr = this.f44903f;
                if (i11 < yp0VarArr.length) {
                    yp0 yp0Var = yp0VarArr[i11];
                    if (yp0Var.f44538o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yp0Var.f44536m = z11;
                    if (!z10) {
                        yp0Var.f44537n.f(z11, true);
                    }
                    yp0Var.f44541r.invalidate();
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
        if (this.f44903f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f44901c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            yp0[] yp0VarArr = this.f44903f;
            if (i12 < yp0VarArr.length) {
                org.telegram.ui.ActionBar.c6 c6Var = this.f44899a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    yp0 yp0Var = yp0VarArr[i12];
                    int i13 = iArr[i12];
                    yp0Var.f44538o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.h6.f20545c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.h6.f20821r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
                    yp0Var.f44531g = false;
                    yp0Var.f44530f = false;
                    yp0Var.f44526a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    yp0 yp0Var2 = yp0VarArr[i12];
                    int i14 = iArr[i12];
                    yp0Var2.f44538o = i14;
                    int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20821r8[i14], c6Var);
                    yp0Var2.f44531g = false;
                    yp0Var2.f44530f = false;
                    yp0Var2.f44526a.setColor(w03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f44903f[i12].f44538o = peerColors.colors.get(i12).f17006id;
                    this.f44903f[i12].a(peerColors.colors.get(i12));
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
        if (this.f44903f != null) {
            int i10 = 0;
            while (true) {
                yp0[] yp0VarArr = this.f44903f;
                if (i10 >= yp0VarArr.length) {
                    break;
                }
                yp0 yp0Var = yp0VarArr[i10];
                zp0 zp0Var = yp0Var.f44541r;
                Path path = yp0Var.f44529e;
                canvas.save();
                float a2 = yp0Var.f44535l.a(0.05f);
                RectF rectF = yp0Var.f44539p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = yp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(yp0Var.f44526a);
                if (yp0Var.f44530f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, yp0Var.f44527b);
                }
                canvas.restore();
                if (yp0Var.f44531g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), yp0Var.f44528c);
                    canvas.restore();
                }
                float e7 = yp0Var.f44537n.e(yp0Var.f44536m);
                if (e7 > 0.0f) {
                    Paint paint = zp0Var.f44900b;
                    Paint paint2 = zp0Var.f44900b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, zp0Var.f44899a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e7) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (yp0Var.h) {
                    if (zp0Var.f44902e) {
                        if (yp0Var.f44534k == null) {
                            Drawable drawable = zp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            yp0Var.f44534k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        yp0Var.f44534k.setBounds((int) org.telegram.messenger.am.b(yp0Var.f44534k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.am.b(yp0Var.f44534k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.e(yp0Var.f44534k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.e(yp0Var.f44534k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        yp0Var.f44534k.draw(canvas);
                    } else {
                        if (yp0Var.f44532i == null) {
                            yp0Var.f44532i = new Path();
                        }
                        if (yp0Var.f44533j == null) {
                            Paint paint3 = new Paint(1);
                            yp0Var.f44533j = paint3;
                            paint3.setColor(-1);
                            yp0Var.f44533j.setStyle(Paint.Style.STROKE);
                            yp0Var.f44533j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        yp0Var.f44533j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        yp0Var.f44532i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e7);
                        yp0Var.f44532i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        yp0Var.f44532i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        yp0Var.f44532i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        yp0Var.f44532i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(yp0Var.f44532i, yp0Var.f44533j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f44905r) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20561d7, this.f44899a);
            Paint paint4 = this.f44904n;
            paint4.setColor(w02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f44906s;
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
        int i14 = this.f44901c;
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
        boolean z12 = true;
        setMeasuredDimension(size2, (int) (((i12 + 1) * min3) + ((size / i15) * min)));
        yp0[] yp0VarArr = this.f44903f;
        if (yp0VarArr == null || yp0VarArr.length != size) {
            this.f44903f = new yp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f44903f[i17] = new yp0(this);
                if (i14 == i16) {
                    yp0 yp0Var = this.f44903f[i17];
                    int i18 = this.h[i17];
                    yp0Var.f44538o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.h6.f20545c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.h6.f20821r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i13, this.f44899a);
                    yp0Var.f44531g = false;
                    yp0Var.f44530f = false;
                    yp0Var.f44526a.setColor(w02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f44903f[i17].f44538o = peerColors.colors.get(i17).f17006id;
                    this.f44903f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f44903f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f44903f.length) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f44903f[i19].f44539p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f44903f[i19].f44540q.set(rectF);
                yp0 yp0Var2 = this.f44903f[i19];
                if (yp0Var2.f44538o == this.f44906s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                yp0Var2.f44536m = z11;
                boolean z13 = z12;
                yp0Var2.f44537n.f(z11, z13);
                yp0Var2.f44541r.invalidate();
                if (i19 % i15 == i15 - 1) {
                    f14 += min + min3;
                    f13 = f12;
                } else {
                    f13 = min + min2 + f13;
                }
                i19++;
                z12 = z13;
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.f44902e = z10;
    }

    public void setDivider(boolean z10) {
        this.f44905r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
