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
public final class qp0 extends View {
    public final org.telegram.ui.ActionBar.d6 f36944a;
    public final Paint f36945b;
    public final int f36946c;
    public final int d;
    public boolean e;
    public pp0[] f36947f;
    public final int[] h;
    public final Paint f36948n;
    public boolean f36949r;
    public int f36950s;
    public Utilities.Callback v;
    public pp0 f36951w;

    public qp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f36945b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f36948n = new Paint(1);
        this.f36949r = true;
        this.f36950s = 0;
        this.f36946c = i10;
        this.d = i11;
        this.f36944a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f36950s = i10;
        if (this.f36947f != null) {
            int i11 = 0;
            while (true) {
                pp0[] pp0VarArr = this.f36947f;
                if (i11 < pp0VarArr.length) {
                    pp0 pp0Var = pp0VarArr[i11];
                    if (pp0Var.f36591o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    pp0Var.f36589m = z11;
                    if (!z10) {
                        pp0Var.f36590n.f(z11, true);
                    }
                    pp0Var.f36594r.invalidate();
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
        if (this.f36947f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f36946c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            pp0[] pp0VarArr = this.f36947f;
            if (i12 < pp0VarArr.length) {
                org.telegram.ui.ActionBar.d6 d6Var = this.f36944a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    pp0 pp0Var = pp0VarArr[i12];
                    int i13 = iArr[i12];
                    pp0Var.f36591o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.h6.f19029c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.h6.f19304r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    pp0Var.f36584g = false;
                    pp0Var.f36583f = false;
                    pp0Var.f36580a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    pp0 pp0Var2 = pp0VarArr[i12];
                    int i14 = iArr[i12];
                    pp0Var2.f36591o = i14;
                    int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19304r8[i14], d6Var);
                    pp0Var2.f36584g = false;
                    pp0Var2.f36583f = false;
                    pp0Var2.f36580a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f36947f[i12].f36591o = peerColors.colors.get(i12).f15819id;
                    this.f36947f[i12].a(peerColors.colors.get(i12));
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
        if (this.f36947f != null) {
            int i10 = 0;
            while (true) {
                pp0[] pp0VarArr = this.f36947f;
                if (i10 >= pp0VarArr.length) {
                    break;
                }
                pp0 pp0Var = pp0VarArr[i10];
                qp0 qp0Var = pp0Var.f36594r;
                Path path = pp0Var.e;
                canvas.save();
                float a2 = pp0Var.f36588l.a(0.05f);
                RectF rectF = pp0Var.f36592p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = pp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(pp0Var.f36580a);
                if (pp0Var.f36583f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, pp0Var.f36581b);
                }
                canvas.restore();
                if (pp0Var.f36584g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), pp0Var.f36582c);
                    canvas.restore();
                }
                float e = pp0Var.f36590n.e(pp0Var.f36589m);
                if (e > 0.0f) {
                    Paint paint = qp0Var.f36945b;
                    Paint paint2 = qp0Var.f36945b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, qp0Var.f36944a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (pp0Var.h) {
                    if (qp0Var.e) {
                        if (pp0Var.f36587k == null) {
                            Drawable drawable = qp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            pp0Var.f36587k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        pp0Var.f36587k.setBounds((int) org.telegram.messenger.ok.b(pp0Var.f36587k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.ok.b(pp0Var.f36587k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a4.a.e(pp0Var.f36587k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a4.a.e(pp0Var.f36587k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        pp0Var.f36587k.draw(canvas);
                    } else {
                        if (pp0Var.f36585i == null) {
                            pp0Var.f36585i = new Path();
                        }
                        if (pp0Var.f36586j == null) {
                            Paint paint3 = new Paint(1);
                            pp0Var.f36586j = paint3;
                            paint3.setColor(-1);
                            pp0Var.f36586j.setStyle(Paint.Style.STROKE);
                            pp0Var.f36586j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        pp0Var.f36586j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        pp0Var.f36585i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        pp0Var.f36585i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        pp0Var.f36585i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        pp0Var.f36585i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        pp0Var.f36585i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(pp0Var.f36585i, pp0Var.f36586j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f36949r) {
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19046d7, this.f36944a);
            Paint paint4 = this.f36948n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f36950s;
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
        int i14 = this.f36946c;
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
        pp0[] pp0VarArr = this.f36947f;
        if (pp0VarArr == null || pp0VarArr.length != size) {
            this.f36947f = new pp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f36947f[i17] = new pp0(this);
                if (i14 == i16) {
                    pp0 pp0Var = this.f36947f[i17];
                    int i18 = this.h[i17];
                    pp0Var.f36591o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.h6.f19029c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.h6.f19304r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i13, this.f36944a);
                    pp0Var.f36584g = false;
                    pp0Var.f36583f = false;
                    pp0Var.f36580a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f36947f[i17].f36591o = peerColors.colors.get(i17).f15819id;
                    this.f36947f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f36947f != null) {
            float f13 = f12;
            float f14 = min3;
            for (int i19 = 0; i19 < this.f36947f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f36947f[i19].f36592p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f36947f[i19].f36593q.set(rectF);
                pp0 pp0Var2 = this.f36947f[i19];
                if (pp0Var2.f36591o == this.f36950s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pp0Var2.f36589m = z11;
                pp0Var2.f36590n.f(z11, true);
                pp0Var2.f36594r.invalidate();
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
        this.f36949r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
