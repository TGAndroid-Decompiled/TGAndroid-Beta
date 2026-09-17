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
public final class yp0 extends View {
    public final org.telegram.ui.ActionBar.f6 f43180a;
    public final Paint f43181b;
    public final int f43182c;
    public final int d;
    public boolean f43183e;
    public xp0[] f43184f;
    public final int[] h;
    public final Paint f43185n;
    public boolean f43186r;
    public int f43187s;
    public Utilities.Callback v;
    public xp0 f43188w;

    public yp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f43181b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f43185n = new Paint(1);
        this.f43186r = true;
        this.f43187s = 0;
        this.f43182c = i10;
        this.d = i11;
        this.f43180a = f6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f43187s = i10;
        if (this.f43184f != null) {
            int i11 = 0;
            while (true) {
                xp0[] xp0VarArr = this.f43184f;
                if (i11 < xp0VarArr.length) {
                    xp0 xp0Var = xp0VarArr[i11];
                    if (xp0Var.f42871o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    xp0Var.f42869m = z11;
                    if (!z10) {
                        xp0Var.f42870n.f(z11, true);
                    }
                    xp0Var.f42874r.invalidate();
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
        if (this.f43184f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f43182c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            xp0[] xp0VarArr = this.f43184f;
            if (i12 < xp0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f43180a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    xp0 xp0Var = xp0VarArr[i12];
                    int i13 = iArr[i12];
                    xp0Var.f42871o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.j6.f20648c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.j6.f20919r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    xp0Var.f42864g = false;
                    xp0Var.f42863f = false;
                    xp0Var.f42859a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    xp0 xp0Var2 = xp0VarArr[i12];
                    int i14 = iArr[i12];
                    xp0Var2.f42871o = i14;
                    int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20919r8[i14], f6Var);
                    xp0Var2.f42864g = false;
                    xp0Var2.f42863f = false;
                    xp0Var2.f42859a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f43184f[i12].f42871o = peerColors.colors.get(i12).f17082id;
                    this.f43184f[i12].a(peerColors.colors.get(i12));
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
        if (this.f43184f != null) {
            int i10 = 0;
            while (true) {
                xp0[] xp0VarArr = this.f43184f;
                if (i10 >= xp0VarArr.length) {
                    break;
                }
                xp0 xp0Var = xp0VarArr[i10];
                yp0 yp0Var = xp0Var.f42874r;
                Path path = xp0Var.f42862e;
                canvas.save();
                float a2 = xp0Var.f42868l.a(0.05f);
                RectF rectF = xp0Var.f42872p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = xp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(xp0Var.f42859a);
                if (xp0Var.f42863f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, xp0Var.f42860b);
                }
                canvas.restore();
                if (xp0Var.f42864g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), xp0Var.f42861c);
                    canvas.restore();
                }
                float e7 = xp0Var.f42870n.e(xp0Var.f42869m);
                if (e7 > 0.0f) {
                    Paint paint = yp0Var.f43181b;
                    Paint paint2 = yp0Var.f43181b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d6, yp0Var.f43180a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e7) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (xp0Var.h) {
                    if (yp0Var.f43183e) {
                        if (xp0Var.f42867k == null) {
                            Drawable drawable = yp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            xp0Var.f42867k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        xp0Var.f42867k.setBounds((int) org.telegram.messenger.vl.c(xp0Var.f42867k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.vl.c(xp0Var.f42867k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a4.a.e(xp0Var.f42867k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a4.a.e(xp0Var.f42867k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        xp0Var.f42867k.draw(canvas);
                    } else {
                        if (xp0Var.f42865i == null) {
                            xp0Var.f42865i = new Path();
                        }
                        if (xp0Var.f42866j == null) {
                            Paint paint3 = new Paint(1);
                            xp0Var.f42866j = paint3;
                            paint3.setColor(-1);
                            xp0Var.f42866j.setStyle(Paint.Style.STROKE);
                            xp0Var.f42866j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        xp0Var.f42866j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        xp0Var.f42865i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e7);
                        xp0Var.f42865i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        xp0Var.f42865i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        xp0Var.f42865i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        xp0Var.f42865i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(xp0Var.f42865i, xp0Var.f42866j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f43186r) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20665d7, this.f43180a);
            Paint paint4 = this.f43185n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f43187s;
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
        int i14 = this.f43182c;
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
        xp0[] xp0VarArr = this.f43184f;
        if (xp0VarArr == null || xp0VarArr.length != size) {
            this.f43184f = new xp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f43184f[i17] = new xp0(this);
                if (i14 == i16) {
                    xp0 xp0Var = this.f43184f[i17];
                    int i18 = this.h[i17];
                    xp0Var.f42871o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.j6.f20648c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.j6.f20919r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i13, this.f43180a);
                    xp0Var.f42864g = false;
                    xp0Var.f42863f = false;
                    xp0Var.f42859a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f43184f[i17].f42871o = peerColors.colors.get(i17).f17082id;
                    this.f43184f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f43184f != null) {
            float f13 = f12;
            float f14 = min3;
            for (int i19 = 0; i19 < this.f43184f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f43184f[i19].f42872p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f43184f[i19].f42873q.set(rectF);
                xp0 xp0Var2 = this.f43184f[i19];
                if (xp0Var2.f42871o == this.f43187s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xp0Var2.f42869m = z11;
                xp0Var2.f42870n.f(z11, true);
                xp0Var2.f42874r.invalidate();
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
        this.f43183e = z10;
    }

    public void setDivider(boolean z10) {
        this.f43186r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
