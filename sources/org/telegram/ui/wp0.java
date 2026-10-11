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
public final class wp0 extends View {
    public final org.telegram.ui.ActionBar.d6 f43844a;
    public final Paint f43845b;
    public final int f43846c;
    public final int d;
    public boolean f43847e;
    public vp0[] f43848f;
    public final int[] h;
    public final Paint f43849n;
    public boolean f43850r;
    public int f43851s;
    public Utilities.Callback v;
    public vp0 f43852w;

    public wp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f43845b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f43849n = new Paint(1);
        this.f43850r = true;
        this.f43851s = 0;
        this.f43846c = i10;
        this.d = i11;
        this.f43844a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f43851s = i10;
        if (this.f43848f != null) {
            int i11 = 0;
            while (true) {
                vp0[] vp0VarArr = this.f43848f;
                if (i11 < vp0VarArr.length) {
                    vp0 vp0Var = vp0VarArr[i11];
                    if (vp0Var.f43114o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    vp0Var.f43112m = z11;
                    if (!z10) {
                        vp0Var.f43113n.f(z11, true);
                    }
                    vp0Var.f43117r.invalidate();
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
        if (this.f43848f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f43846c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            vp0[] vp0VarArr = this.f43848f;
            if (i12 < vp0VarArr.length) {
                org.telegram.ui.ActionBar.d6 d6Var = this.f43844a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    vp0 vp0Var = vp0VarArr[i12];
                    int i13 = iArr[i12];
                    vp0Var.f43114o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.h6.f20771c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.h6.f21047r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    vp0Var.f43107g = false;
                    vp0Var.f43106f = false;
                    vp0Var.f43102a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    vp0 vp0Var2 = vp0VarArr[i12];
                    int i14 = iArr[i12];
                    vp0Var2.f43114o = i14;
                    int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21047r8[i14], d6Var);
                    vp0Var2.f43107g = false;
                    vp0Var2.f43106f = false;
                    vp0Var2.f43102a.setColor(w03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f43848f[i12].f43114o = peerColors.colors.get(i12).f17253id;
                    this.f43848f[i12].a(peerColors.colors.get(i12));
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
        if (this.f43848f != null) {
            int i10 = 0;
            while (true) {
                vp0[] vp0VarArr = this.f43848f;
                if (i10 >= vp0VarArr.length) {
                    break;
                }
                vp0 vp0Var = vp0VarArr[i10];
                wp0 wp0Var = vp0Var.f43117r;
                Path path = vp0Var.f43105e;
                canvas.save();
                float a2 = vp0Var.f43111l.a(0.05f);
                RectF rectF = vp0Var.f43115p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = vp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(vp0Var.f43102a);
                if (vp0Var.f43106f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, vp0Var.f43103b);
                }
                canvas.restore();
                if (vp0Var.f43107g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), vp0Var.f43104c);
                    canvas.restore();
                }
                float e7 = vp0Var.f43113n.e(vp0Var.f43112m);
                if (e7 > 0.0f) {
                    Paint paint = wp0Var.f43845b;
                    Paint paint2 = wp0Var.f43845b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, wp0Var.f43844a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e7) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (vp0Var.h) {
                    if (wp0Var.f43847e) {
                        if (vp0Var.f43110k == null) {
                            Drawable drawable = wp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            vp0Var.f43110k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        vp0Var.f43110k.setBounds((int) org.telegram.messenger.ai.b(vp0Var.f43110k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.ai.b(vp0Var.f43110k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.e(vp0Var.f43110k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.e(vp0Var.f43110k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        vp0Var.f43110k.draw(canvas);
                    } else {
                        if (vp0Var.f43108i == null) {
                            vp0Var.f43108i = new Path();
                        }
                        if (vp0Var.f43109j == null) {
                            Paint paint3 = new Paint(1);
                            vp0Var.f43109j = paint3;
                            paint3.setColor(-1);
                            vp0Var.f43109j.setStyle(Paint.Style.STROKE);
                            vp0Var.f43109j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        vp0Var.f43109j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        vp0Var.f43108i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e7);
                        vp0Var.f43108i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        vp0Var.f43108i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        vp0Var.f43108i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        vp0Var.f43108i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(vp0Var.f43108i, vp0Var.f43109j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f43850r) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20787d7, this.f43844a);
            Paint paint4 = this.f43849n;
            paint4.setColor(w02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f43851s;
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
        int i14 = this.f43846c;
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
        vp0[] vp0VarArr = this.f43848f;
        if (vp0VarArr == null || vp0VarArr.length != size) {
            this.f43848f = new vp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f43848f[i17] = new vp0(this);
                if (i14 == i16) {
                    vp0 vp0Var = this.f43848f[i17];
                    int i18 = this.h[i17];
                    vp0Var.f43114o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.h6.f20771c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.h6.f21047r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i13, this.f43844a);
                    vp0Var.f43107g = false;
                    vp0Var.f43106f = false;
                    vp0Var.f43102a.setColor(w02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f43848f[i17].f43114o = peerColors.colors.get(i17).f17253id;
                    this.f43848f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f43848f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f43848f.length) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f43848f[i19].f43115p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f43848f[i19].f43116q.set(rectF);
                vp0 vp0Var2 = this.f43848f[i19];
                if (vp0Var2.f43114o == this.f43851s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                vp0Var2.f43112m = z11;
                boolean z13 = z12;
                vp0Var2.f43113n.f(z11, z13);
                vp0Var2.f43117r.invalidate();
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
        this.f43847e = z10;
    }

    public void setDivider(boolean z10) {
        this.f43850r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
