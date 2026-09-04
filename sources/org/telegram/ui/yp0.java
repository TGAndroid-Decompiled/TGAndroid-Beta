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
    public final org.telegram.ui.ActionBar.f6 f43179a;
    public final Paint f43180b;
    public final int f43181c;
    public final int d;
    public boolean f43182e;
    public xp0[] f43183f;
    public final int[] h;
    public final Paint f43184n;
    public boolean f43185r;
    public int f43186s;
    public Utilities.Callback v;
    public xp0 f43187w;

    public yp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f43180b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f43184n = new Paint(1);
        this.f43185r = true;
        this.f43186s = 0;
        this.f43181c = i10;
        this.d = i11;
        this.f43179a = f6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f43186s = i10;
        if (this.f43183f != null) {
            int i11 = 0;
            while (true) {
                xp0[] xp0VarArr = this.f43183f;
                if (i11 < xp0VarArr.length) {
                    xp0 xp0Var = xp0VarArr[i11];
                    if (xp0Var.f42870o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    xp0Var.f42868m = z11;
                    if (!z10) {
                        xp0Var.f42869n.f(z11, true);
                    }
                    xp0Var.f42873r.invalidate();
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
        if (this.f43183f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f43181c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            xp0[] xp0VarArr = this.f43183f;
            if (i12 < xp0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f43179a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    xp0 xp0Var = xp0VarArr[i12];
                    int i13 = iArr[i12];
                    xp0Var.f42870o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.j6.f20647c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.j6.f20918r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    xp0Var.f42863g = false;
                    xp0Var.f42862f = false;
                    xp0Var.f42858a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    xp0 xp0Var2 = xp0VarArr[i12];
                    int i14 = iArr[i12];
                    xp0Var2.f42870o = i14;
                    int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20918r8[i14], f6Var);
                    xp0Var2.f42863g = false;
                    xp0Var2.f42862f = false;
                    xp0Var2.f42858a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f43183f[i12].f42870o = peerColors.colors.get(i12).f17082id;
                    this.f43183f[i12].a(peerColors.colors.get(i12));
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
        if (this.f43183f != null) {
            int i10 = 0;
            while (true) {
                xp0[] xp0VarArr = this.f43183f;
                if (i10 >= xp0VarArr.length) {
                    break;
                }
                xp0 xp0Var = xp0VarArr[i10];
                yp0 yp0Var = xp0Var.f42873r;
                Path path = xp0Var.f42861e;
                canvas.save();
                float a2 = xp0Var.f42867l.a(0.05f);
                RectF rectF = xp0Var.f42871p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = xp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(xp0Var.f42858a);
                if (xp0Var.f42862f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, xp0Var.f42859b);
                }
                canvas.restore();
                if (xp0Var.f42863g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), xp0Var.f42860c);
                    canvas.restore();
                }
                float e7 = xp0Var.f42869n.e(xp0Var.f42868m);
                if (e7 > 0.0f) {
                    Paint paint = yp0Var.f43180b;
                    Paint paint2 = yp0Var.f43180b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, yp0Var.f43179a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e7) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (xp0Var.h) {
                    if (yp0Var.f43182e) {
                        if (xp0Var.f42866k == null) {
                            Drawable drawable = yp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            xp0Var.f42866k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        xp0Var.f42866k.setBounds((int) org.telegram.messenger.wl.c(xp0Var.f42866k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.wl.c(xp0Var.f42866k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a4.a.e(xp0Var.f42866k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a4.a.e(xp0Var.f42866k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        xp0Var.f42866k.draw(canvas);
                    } else {
                        if (xp0Var.f42864i == null) {
                            xp0Var.f42864i = new Path();
                        }
                        if (xp0Var.f42865j == null) {
                            Paint paint3 = new Paint(1);
                            xp0Var.f42865j = paint3;
                            paint3.setColor(-1);
                            xp0Var.f42865j.setStyle(Paint.Style.STROKE);
                            xp0Var.f42865j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        xp0Var.f42865j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        xp0Var.f42864i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e7);
                        xp0Var.f42864i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        xp0Var.f42864i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        xp0Var.f42864i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        xp0Var.f42864i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(xp0Var.f42864i, xp0Var.f42865j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f43185r) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d7, this.f43179a);
            Paint paint4 = this.f43184n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f43186s;
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
        int i14 = this.f43181c;
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
        xp0[] xp0VarArr = this.f43183f;
        if (xp0VarArr == null || xp0VarArr.length != size) {
            this.f43183f = new xp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f43183f[i17] = new xp0(this);
                if (i14 == i16) {
                    xp0 xp0Var = this.f43183f[i17];
                    int i18 = this.h[i17];
                    xp0Var.f42870o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.j6.f20647c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.j6.f20918r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i13, this.f43179a);
                    xp0Var.f42863g = false;
                    xp0Var.f42862f = false;
                    xp0Var.f42858a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f43183f[i17].f42870o = peerColors.colors.get(i17).f17082id;
                    this.f43183f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f43183f != null) {
            float f13 = f12;
            float f14 = min3;
            for (int i19 = 0; i19 < this.f43183f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f43183f[i19].f42871p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f43183f[i19].f42872q.set(rectF);
                xp0 xp0Var2 = this.f43183f[i19];
                if (xp0Var2.f42870o == this.f43186s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xp0Var2.f42868m = z11;
                xp0Var2.f42869n.f(z11, true);
                xp0Var2.f42873r.invalidate();
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
        this.f43182e = z10;
    }

    public void setDivider(boolean z10) {
        this.f43185r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
