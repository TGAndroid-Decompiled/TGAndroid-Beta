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
public final class xp0 extends View {
    public final org.telegram.ui.ActionBar.e6 f39654a;
    public final Paint f39655b;
    public final int f39656c;
    public final int d;
    public boolean e;
    public wp0[] f39657f;
    public final int[] h;
    public final Paint f39658n;
    public boolean f39659r;
    public int f39660s;
    public Utilities.Callback v;
    public wp0 f39661w;

    public xp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f39655b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f39658n = new Paint(1);
        this.f39659r = true;
        this.f39660s = 0;
        this.f39656c = i10;
        this.d = i11;
        this.f39654a = e6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f39660s = i10;
        if (this.f39657f != null) {
            int i11 = 0;
            while (true) {
                wp0[] wp0VarArr = this.f39657f;
                if (i11 < wp0VarArr.length) {
                    wp0 wp0Var = wp0VarArr[i11];
                    if (wp0Var.f39368o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    wp0Var.f39366m = z11;
                    if (!z10) {
                        wp0Var.f39367n.f(z11, true);
                    }
                    wp0Var.f39371r.invalidate();
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
        if (this.f39657f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f39656c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            wp0[] wp0VarArr = this.f39657f;
            if (i12 < wp0VarArr.length) {
                org.telegram.ui.ActionBar.e6 e6Var = this.f39654a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    wp0 wp0Var = wp0VarArr[i12];
                    int i13 = iArr[i12];
                    wp0Var.f39368o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.i6.f18820c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.i6.f19094r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
                    wp0Var.f39361g = false;
                    wp0Var.f39360f = false;
                    wp0Var.f39357a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    wp0 wp0Var2 = wp0VarArr[i12];
                    int i14 = iArr[i12];
                    wp0Var2.f39368o = i14;
                    int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19094r8[i14], e6Var);
                    wp0Var2.f39361g = false;
                    wp0Var2.f39360f = false;
                    wp0Var2.f39357a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f39657f[i12].f39368o = peerColors.colors.get(i12).f15605id;
                    this.f39657f[i12].a(peerColors.colors.get(i12));
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
        if (this.f39657f != null) {
            int i10 = 0;
            while (true) {
                wp0[] wp0VarArr = this.f39657f;
                if (i10 >= wp0VarArr.length) {
                    break;
                }
                wp0 wp0Var = wp0VarArr[i10];
                xp0 xp0Var = wp0Var.f39371r;
                Path path = wp0Var.e;
                canvas.save();
                float a2 = wp0Var.f39365l.a(0.05f);
                RectF rectF = wp0Var.f39369p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = wp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(wp0Var.f39357a);
                if (wp0Var.f39360f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, wp0Var.f39358b);
                }
                canvas.restore();
                if (wp0Var.f39361g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), wp0Var.f39359c);
                    canvas.restore();
                }
                float e = wp0Var.f39367n.e(wp0Var.f39366m);
                if (e > 0.0f) {
                    Paint paint = xp0Var.f39655b;
                    Paint paint2 = xp0Var.f39655b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18836d6, xp0Var.f39654a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (wp0Var.h) {
                    if (xp0Var.e) {
                        if (wp0Var.f39364k == null) {
                            Drawable drawable = xp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            wp0Var.f39364k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        wp0Var.f39364k.setBounds((int) org.telegram.messenger.wl.c(wp0Var.f39364k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.wl.c(wp0Var.f39364k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a4.a.e(wp0Var.f39364k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a4.a.e(wp0Var.f39364k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        wp0Var.f39364k.draw(canvas);
                    } else {
                        if (wp0Var.f39362i == null) {
                            wp0Var.f39362i = new Path();
                        }
                        if (wp0Var.f39363j == null) {
                            Paint paint3 = new Paint(1);
                            wp0Var.f39363j = paint3;
                            paint3.setColor(-1);
                            wp0Var.f39363j.setStyle(Paint.Style.STROKE);
                            wp0Var.f39363j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        wp0Var.f39363j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        wp0Var.f39362i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        wp0Var.f39362i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        wp0Var.f39362i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        wp0Var.f39362i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        wp0Var.f39362i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(wp0Var.f39362i, wp0Var.f39363j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f39659r) {
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18837d7, this.f39654a);
            Paint paint4 = this.f39658n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f39660s;
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
        int i14 = this.f39656c;
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
        wp0[] wp0VarArr = this.f39657f;
        if (wp0VarArr == null || wp0VarArr.length != size) {
            this.f39657f = new wp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f39657f[i17] = new wp0(this);
                if (i14 == i16) {
                    wp0 wp0Var = this.f39657f[i17];
                    int i18 = this.h[i17];
                    wp0Var.f39368o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.i6.f18820c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.i6.f19094r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i13, this.f39654a);
                    wp0Var.f39361g = false;
                    wp0Var.f39360f = false;
                    wp0Var.f39357a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f39657f[i17].f39368o = peerColors.colors.get(i17).f15605id;
                    this.f39657f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f39657f != null) {
            float f13 = f12;
            float f14 = min3;
            for (int i19 = 0; i19 < this.f39657f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f39657f[i19].f39369p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f39657f[i19].f39370q.set(rectF);
                wp0 wp0Var2 = this.f39657f[i19];
                if (wp0Var2.f39368o == this.f39660s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wp0Var2.f39366m = z11;
                wp0Var2.f39367n.f(z11, true);
                wp0Var2.f39371r.invalidate();
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
        this.f39659r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
