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
public final class xo0 extends View {
    public final org.telegram.ui.ActionBar.b6 f44557a;
    public final Paint f44558b;
    public final int f44559c;
    public final int d;
    public boolean f44560e;
    public wo0[] f44561f;
    public final int[] h;
    public final Paint f44562n;
    public boolean f44563r;
    public int f44564s;
    public Utilities.Callback v;
    public wo0 f44565w;

    public xo0(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f44558b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f44562n = new Paint(1);
        this.f44563r = true;
        this.f44564s = 0;
        this.f44559c = i9;
        this.d = i10;
        this.f44557a = b6Var;
    }

    public final void a(int i9, boolean z10) {
        boolean z11;
        this.f44564s = i9;
        if (this.f44561f != null) {
            int i10 = 0;
            while (true) {
                wo0[] wo0VarArr = this.f44561f;
                if (i10 < wo0VarArr.length) {
                    wo0 wo0Var = wo0VarArr[i10];
                    if (wo0Var.f44231o == i9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    wo0Var.f44229m = z11;
                    if (!z10) {
                        wo0Var.f44230n.f(z11, true);
                    }
                    wo0Var.f44234r.invalidate();
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b() {
        MessagesController.PeerColors peerColors;
        boolean z10;
        int i9;
        if (this.f44561f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i10 = this.f44559c;
        if (i10 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i11 = 0;
        while (true) {
            wo0[] wo0VarArr = this.f44561f;
            if (i11 < wo0VarArr.length) {
                org.telegram.ui.ActionBar.b6 b6Var = this.f44557a;
                int[] iArr = this.h;
                if (i10 == 2) {
                    wo0 wo0Var = wo0VarArr[i11];
                    int i12 = iArr[i11];
                    wo0Var.f44231o = i12;
                    if (i12 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wo0Var.h = z10;
                    if (i12 < 0) {
                        i9 = org.telegram.ui.ActionBar.f6.f22985c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.f6.f23250r8;
                        i9 = iArr2[i12 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                    wo0Var.f44224g = false;
                    wo0Var.f44223f = false;
                    wo0Var.f44219a.setColor(v02);
                } else if (i11 < 7 && i10 == 1) {
                    wo0 wo0Var2 = wo0VarArr[i11];
                    int i13 = iArr[i11];
                    wo0Var2.f44231o = i13;
                    int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23250r8[i13], b6Var);
                    wo0Var2.f44224g = false;
                    wo0Var2.f44223f = false;
                    wo0Var2.f44219a.setColor(v03);
                } else if (peerColors != null && i11 >= 0 && i11 < peerColors.colors.size()) {
                    this.f44561f[i11].f44231o = peerColors.colors.get(i11).f19651id;
                    this.f44561f[i11].a(peerColors.colors.get(i11));
                }
                i11++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f44561f != null) {
            int i9 = 0;
            while (true) {
                wo0[] wo0VarArr = this.f44561f;
                if (i9 >= wo0VarArr.length) {
                    break;
                }
                wo0 wo0Var = wo0VarArr[i9];
                xo0 xo0Var = wo0Var.f44234r;
                Path path = wo0Var.f44222e;
                canvas.save();
                float a2 = wo0Var.f44228l.a(0.05f);
                RectF rectF = wo0Var.f44232p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = wo0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(wo0Var.f44219a);
                if (wo0Var.f44223f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, wo0Var.f44220b);
                }
                canvas.restore();
                if (wo0Var.f44224g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), wo0Var.f44221c);
                    canvas.restore();
                }
                float e10 = wo0Var.f44230n.e(wo0Var.f44229m);
                if (e10 > 0.0f) {
                    Paint paint = xo0Var.f44558b;
                    Paint paint2 = xo0Var.f44558b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, xo0Var.f44557a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e10) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (wo0Var.h) {
                    if (xo0Var.f44560e) {
                        if (wo0Var.f44227k == null) {
                            Drawable drawable = xo0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            wo0Var.f44227k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        wo0Var.f44227k.setBounds((int) org.telegram.messenger.ll.c(wo0Var.f44227k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.ll.c(wo0Var.f44227k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) org.telegram.ui.Cells.j2.b(wo0Var.f44227k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.ui.Cells.j2.b(wo0Var.f44227k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        wo0Var.f44227k.draw(canvas);
                    } else {
                        if (wo0Var.f44225i == null) {
                            wo0Var.f44225i = new Path();
                        }
                        if (wo0Var.f44226j == null) {
                            Paint paint3 = new Paint(1);
                            wo0Var.f44226j = paint3;
                            paint3.setColor(-1);
                            wo0Var.f44226j.setStyle(Paint.Style.STROKE);
                            wo0Var.f44226j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        wo0Var.f44226j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        wo0Var.f44225i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e10);
                        wo0Var.f44225i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        wo0Var.f44225i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        wo0Var.f44225i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        wo0Var.f44225i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(wo0Var.f44225i, wo0Var.f44226j);
                    }
                }
                canvas.restore();
                i9++;
            }
        }
        if (this.f44563r) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, this.f44557a);
            Paint paint4 = this.f44562n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xo0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f44564s;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        MessagesController.PeerColors peerColors;
        int size;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int size2 = View.MeasureSpec.getSize(i9);
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i13 = this.f44559c;
        if (i13 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        if (peerColors == null) {
            size = 0;
        } else {
            size = peerColors.colors.size();
        }
        int i14 = 8;
        int i15 = 2;
        if (i13 == 2) {
            size = 8;
        }
        if (i13 != 2 && i13 == 1) {
            i14 = 7;
        }
        float f10 = size2;
        float f11 = i14;
        float f12 = i14 + 1;
        float min = Math.min(AndroidUtilities.dp(54.0f), f10 / ((f12 * 0.28947f) + f11));
        float min2 = Math.min(0.28947f * min, AndroidUtilities.dp(8.0f));
        float min3 = Math.min(0.31578946f * min, AndroidUtilities.dp(11.33f));
        setMeasuredDimension(size2, (int) (((i11 + 1) * min3) + ((size / i14) * min)));
        wo0[] wo0VarArr = this.f44561f;
        if (wo0VarArr == null || wo0VarArr.length != size) {
            this.f44561f = new wo0[size];
            int i16 = 0;
            while (i16 < size) {
                this.f44561f[i16] = new wo0(this);
                if (i13 == i15) {
                    wo0 wo0Var = this.f44561f[i16];
                    int i17 = this.h[i16];
                    wo0Var.f44231o = i17;
                    if (i17 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wo0Var.h = z10;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.f6.f22985c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.f6.f23250r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.f6.v0(i12, this.f44557a);
                    wo0Var.f44224g = false;
                    wo0Var.f44223f = false;
                    wo0Var.f44219a.setColor(v02);
                } else if (peerColors != null && i16 >= 0 && i16 < peerColors.colors.size()) {
                    this.f44561f[i16].f44231o = peerColors.colors.get(i16).f19651id;
                    this.f44561f[i16].a(peerColors.colors.get(i16));
                }
                i16++;
                i15 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f44561f != null) {
            float f14 = f13;
            float f15 = min3;
            for (int i18 = 0; i18 < this.f44561f.length; i18++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f44561f[i18].f44232p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f44561f[i18].f44233q.set(rectF);
                wo0 wo0Var2 = this.f44561f[i18];
                if (wo0Var2.f44231o == this.f44564s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wo0Var2.f44229m = z11;
                wo0Var2.f44230n.f(z11, true);
                wo0Var2.f44234r.invalidate();
                if (i18 % i14 == i14 - 1) {
                    f15 += min + min3;
                    f14 = f13;
                } else {
                    f14 = min + min2 + f14;
                }
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.f44560e = z10;
    }

    public void setDivider(boolean z10) {
        this.f44563r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
