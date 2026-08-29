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
public final class wo0 extends View {
    public final org.telegram.ui.ActionBar.c6 f44341a;
    public final Paint f44342b;
    public final int f44343c;
    public final int d;
    public boolean f44344e;
    public vo0[] f44345f;
    public final int[] h;
    public final Paint f44346n;
    public boolean f44347r;
    public int f44348s;
    public Utilities.Callback v;
    public vo0 f44349w;

    public wo0(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f44342b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f44346n = new Paint(1);
        this.f44347r = true;
        this.f44348s = 0;
        this.f44343c = i10;
        this.d = i11;
        this.f44341a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f44348s = i10;
        if (this.f44345f != null) {
            int i11 = 0;
            while (true) {
                vo0[] vo0VarArr = this.f44345f;
                if (i11 < vo0VarArr.length) {
                    vo0 vo0Var = vo0VarArr[i11];
                    if (vo0Var.f43705o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    vo0Var.f43703m = z11;
                    if (!z10) {
                        vo0Var.f43704n.f(z11, true);
                    }
                    vo0Var.f43708r.invalidate();
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
        if (this.f44345f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f44343c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            vo0[] vo0VarArr = this.f44345f;
            if (i12 < vo0VarArr.length) {
                org.telegram.ui.ActionBar.c6 c6Var = this.f44341a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    vo0 vo0Var = vo0VarArr[i12];
                    int i13 = iArr[i12];
                    vo0Var.f43705o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vo0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.g6.f23046c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.g6.f23312r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    vo0Var.f43698g = false;
                    vo0Var.f43697f = false;
                    vo0Var.f43693a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    vo0 vo0Var2 = vo0VarArr[i12];
                    int i14 = iArr[i12];
                    vo0Var2.f43705o = i14;
                    int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23312r8[i14], c6Var);
                    vo0Var2.f43698g = false;
                    vo0Var2.f43697f = false;
                    vo0Var2.f43693a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f44345f[i12].f43705o = peerColors.colors.get(i12).f19622id;
                    this.f44345f[i12].a(peerColors.colors.get(i12));
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
        if (this.f44345f != null) {
            int i10 = 0;
            while (true) {
                vo0[] vo0VarArr = this.f44345f;
                if (i10 >= vo0VarArr.length) {
                    break;
                }
                vo0 vo0Var = vo0VarArr[i10];
                wo0 wo0Var = vo0Var.f43708r;
                Path path = vo0Var.f43696e;
                canvas.save();
                float a2 = vo0Var.f43702l.a(0.05f);
                RectF rectF = vo0Var.f43706p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = vo0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(vo0Var.f43693a);
                if (vo0Var.f43697f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, vo0Var.f43694b);
                }
                canvas.restore();
                if (vo0Var.f43698g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), vo0Var.f43695c);
                    canvas.restore();
                }
                float e10 = vo0Var.f43704n.e(vo0Var.f43703m);
                if (e10 > 0.0f) {
                    Paint paint = wo0Var.f44342b;
                    Paint paint2 = wo0Var.f44342b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, wo0Var.f44341a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e10) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (vo0Var.h) {
                    if (wo0Var.f44344e) {
                        if (vo0Var.f43701k == null) {
                            Drawable drawable = wo0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            vo0Var.f43701k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        vo0Var.f43701k.setBounds((int) org.telegram.messenger.x3.A(vo0Var.f43701k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.x3.A(vo0Var.f43701k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) u3.c.c(vo0Var.f43701k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) u3.c.c(vo0Var.f43701k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        vo0Var.f43701k.draw(canvas);
                    } else {
                        if (vo0Var.f43699i == null) {
                            vo0Var.f43699i = new Path();
                        }
                        if (vo0Var.f43700j == null) {
                            Paint paint3 = new Paint(1);
                            vo0Var.f43700j = paint3;
                            paint3.setColor(-1);
                            vo0Var.f43700j.setStyle(Paint.Style.STROKE);
                            vo0Var.f43700j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        vo0Var.f43700j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        vo0Var.f43699i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e10);
                        vo0Var.f43699i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        vo0Var.f43699i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        vo0Var.f43699i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        vo0Var.f43699i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(vo0Var.f43699i, vo0Var.f43700j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f44347r) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, this.f44341a);
            Paint paint4 = this.f44346n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wo0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f44348s;
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
        int i14 = this.f44343c;
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
        float f9 = size2;
        float f10 = i15;
        float f11 = i15 + 1;
        float min = Math.min(AndroidUtilities.dp(54.0f), f9 / ((f11 * 0.28947f) + f10));
        float min2 = Math.min(0.28947f * min, AndroidUtilities.dp(8.0f));
        float min3 = Math.min(0.31578946f * min, AndroidUtilities.dp(11.33f));
        setMeasuredDimension(size2, (int) (((i12 + 1) * min3) + ((size / i15) * min)));
        vo0[] vo0VarArr = this.f44345f;
        if (vo0VarArr == null || vo0VarArr.length != size) {
            this.f44345f = new vo0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f44345f[i17] = new vo0(this);
                if (i14 == i16) {
                    vo0 vo0Var = this.f44345f[i17];
                    int i18 = this.h[i17];
                    vo0Var.f43705o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vo0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.g6.f23046c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.g6.f23312r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.g6.v0(i13, this.f44341a);
                    vo0Var.f43698g = false;
                    vo0Var.f43697f = false;
                    vo0Var.f43693a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f44345f[i17].f43705o = peerColors.colors.get(i17).f19622id;
                    this.f44345f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f9 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f44345f != null) {
            float f13 = f12;
            float f14 = min3;
            for (int i19 = 0; i19 < this.f44345f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f44345f[i19].f43706p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f44345f[i19].f43707q.set(rectF);
                vo0 vo0Var2 = this.f44345f[i19];
                if (vo0Var2.f43705o == this.f44348s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vo0Var2.f43703m = z11;
                vo0Var2.f43704n.f(z11, true);
                vo0Var2.f43708r.invalidate();
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
        this.f44344e = z10;
    }

    public void setDivider(boolean z10) {
        this.f44347r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
