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
public final class rp0 extends View {
    public final org.telegram.ui.ActionBar.d6 f36906a;
    public final Paint f36907b;
    public final int f36908c;
    public final int d;
    public boolean e;
    public qp0[] f36909f;
    public final int[] h;
    public final Paint f36910n;
    public boolean f36911r;
    public int f36912s;
    public Utilities.Callback v;
    public qp0 f36913w;

    public rp0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f36907b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f36910n = new Paint(1);
        this.f36911r = true;
        this.f36912s = 0;
        this.f36908c = i10;
        this.d = i11;
        this.f36906a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f36912s = i10;
        if (this.f36909f != null) {
            int i11 = 0;
            while (true) {
                qp0[] qp0VarArr = this.f36909f;
                if (i11 < qp0VarArr.length) {
                    qp0 qp0Var = qp0VarArr[i11];
                    if (qp0Var.f36538o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    qp0Var.f36536m = z11;
                    if (!z10) {
                        qp0Var.f36537n.f(z11, true);
                    }
                    qp0Var.f36541r.invalidate();
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
        if (this.f36909f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f36908c;
        if (i11 == 1) {
            peerColors = messagesController.peerColors;
        } else {
            peerColors = messagesController.profilePeerColors;
        }
        int i12 = 0;
        while (true) {
            qp0[] qp0VarArr = this.f36909f;
            if (i12 < qp0VarArr.length) {
                org.telegram.ui.ActionBar.d6 d6Var = this.f36906a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    qp0 qp0Var = qp0VarArr[i12];
                    int i13 = iArr[i12];
                    qp0Var.f36538o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qp0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.h6.f18773c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.h6.f19046r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    qp0Var.f36531g = false;
                    qp0Var.f36530f = false;
                    qp0Var.f36527a.setColor(v02);
                } else if (i12 < 7 && i11 == 1) {
                    qp0 qp0Var2 = qp0VarArr[i12];
                    int i14 = iArr[i12];
                    qp0Var2.f36538o = i14;
                    int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19046r8[i14], d6Var);
                    qp0Var2.f36531g = false;
                    qp0Var2.f36530f = false;
                    qp0Var2.f36527a.setColor(v03);
                } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                    this.f36909f[i12].f36538o = peerColors.colors.get(i12).f15579id;
                    this.f36909f[i12].a(peerColors.colors.get(i12));
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
        if (this.f36909f != null) {
            int i10 = 0;
            while (true) {
                qp0[] qp0VarArr = this.f36909f;
                if (i10 >= qp0VarArr.length) {
                    break;
                }
                qp0 qp0Var = qp0VarArr[i10];
                rp0 rp0Var = qp0Var.f36541r;
                Path path = qp0Var.e;
                canvas.save();
                float a2 = qp0Var.f36535l.a(0.05f);
                RectF rectF = qp0Var.f36539p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = qp0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(qp0Var.f36527a);
                if (qp0Var.f36530f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, qp0Var.f36528b);
                }
                canvas.restore();
                if (qp0Var.f36531g) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), qp0Var.f36529c);
                    canvas.restore();
                }
                float e = qp0Var.f36537n.e(qp0Var.f36536m);
                if (e > 0.0f) {
                    Paint paint = rp0Var.f36907b;
                    Paint paint2 = rp0Var.f36907b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, rp0Var.f36906a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (qp0Var.h) {
                    if (rp0Var.e) {
                        if (qp0Var.f36534k == null) {
                            Drawable drawable = rp0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            qp0Var.f36534k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        qp0Var.f36534k.setBounds((int) org.telegram.messenger.ul.c(qp0Var.f36534k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.ul.c(qp0Var.f36534k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a4.a.e(qp0Var.f36534k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a4.a.e(qp0Var.f36534k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        qp0Var.f36534k.draw(canvas);
                    } else {
                        if (qp0Var.f36532i == null) {
                            qp0Var.f36532i = new Path();
                        }
                        if (qp0Var.f36533j == null) {
                            Paint paint3 = new Paint(1);
                            qp0Var.f36533j = paint3;
                            paint3.setColor(-1);
                            qp0Var.f36533j.setStyle(Paint.Style.STROKE);
                            qp0Var.f36533j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        qp0Var.f36533j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        qp0Var.f36532i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e);
                        qp0Var.f36532i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        qp0Var.f36532i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        qp0Var.f36532i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        qp0Var.f36532i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(qp0Var.f36532i, qp0Var.f36533j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f36911r) {
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18790d7, this.f36906a);
            Paint paint4 = this.f36910n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rp0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f36912s;
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
        int i14 = this.f36908c;
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
        qp0[] qp0VarArr = this.f36909f;
        if (qp0VarArr == null || qp0VarArr.length != size) {
            this.f36909f = new qp0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f36909f[i17] = new qp0(this);
                if (i14 == i16) {
                    qp0 qp0Var = this.f36909f[i17];
                    int i18 = this.h[i17];
                    qp0Var.f36538o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qp0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.h6.f18773c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.h6.f19046r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i13, this.f36906a);
                    qp0Var.f36531g = false;
                    qp0Var.f36530f = false;
                    qp0Var.f36527a.setColor(v02);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f36909f[i17].f36538o = peerColors.colors.get(i17).f15579id;
                    this.f36909f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f36909f != null) {
            float f13 = f12;
            float f14 = min3;
            for (int i19 = 0; i19 < this.f36909f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f36909f[i19].f36539p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f36909f[i19].f36540q.set(rectF);
                qp0 qp0Var2 = this.f36909f[i19];
                if (qp0Var2.f36538o == this.f36912s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qp0Var2.f36536m = z11;
                qp0Var2.f36537n.f(z11, true);
                qp0Var2.f36541r.invalidate();
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
        this.f36911r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
