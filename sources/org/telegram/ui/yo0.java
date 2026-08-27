package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class yo0 extends View {

    public final org.telegram.ui.ActionBar.c6 f44861a;

    public final Paint f44862b;

    public final int f44863c;
    public final int d;

    public boolean f44864e;

    public xo0[] f44865f;
    public final int[] h;

    public final Paint f44866n;

    public boolean f44867r;

    public int f44868s;
    public Utilities.Callback v;

    public xo0 f44869w;

    public yo0(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f44862b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f44866n = new Paint(1);
        this.f44867r = true;
        this.f44868s = 0;
        this.f44863c = i10;
        this.d = i11;
        this.f44861a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        this.f44868s = i10;
        if (this.f44865f == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            xo0[] xo0VarArr = this.f44865f;
            if (i11 >= xo0VarArr.length) {
                return;
            }
            xo0 xo0Var = xo0VarArr[i11];
            boolean z11 = xo0Var.f44586o == i10;
            xo0Var.f44584m = z11;
            if (!z10) {
                xo0Var.f44585n.f(z11, true);
            }
            xo0Var.f44589r.invalidate();
            i11++;
        }
    }

    public final void b() {
        int i10;
        if (this.f44865f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.f44863c;
        MessagesController.PeerColors peerColors = i11 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
        int i12 = 0;
        while (true) {
            xo0[] xo0VarArr = this.f44865f;
            if (i12 >= xo0VarArr.length) {
                invalidate();
                return;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.f44861a;
            int[] iArr = this.h;
            if (i11 == 2) {
                xo0 xo0Var = xo0VarArr[i12];
                int i13 = iArr[i12];
                xo0Var.f44586o = i13;
                xo0Var.h = i13 < 0;
                if (i13 < 0) {
                    i10 = org.telegram.ui.ActionBar.g6.f23038c8;
                } else {
                    int[] iArr2 = org.telegram.ui.ActionBar.g6.f23303r8;
                    i10 = iArr2[i13 % iArr2.length];
                }
                int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                xo0Var.f44579g = false;
                xo0Var.f44578f = false;
                xo0Var.f44574a.setColor(iV0);
            } else if (i12 < 7 && i11 == 1) {
                xo0 xo0Var2 = xo0VarArr[i12];
                int i14 = iArr[i12];
                xo0Var2.f44586o = i14;
                int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23303r8[i14], c6Var);
                xo0Var2.f44579g = false;
                xo0Var2.f44578f = false;
                xo0Var2.f44574a.setColor(iV1);
            } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                this.f44865f[i12].f44586o = peerColors.colors.get(i12).f19624id;
                this.f44865f[i12].a(peerColors.colors.get(i12));
            }
            i12++;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f44865f != null) {
            int i10 = 0;
            while (true) {
                xo0[] xo0VarArr = this.f44865f;
                if (i10 >= xo0VarArr.length) {
                    break;
                }
                xo0 xo0Var = xo0VarArr[i10];
                yo0 yo0Var = xo0Var.f44589r;
                Path path = xo0Var.f44577e;
                canvas.save();
                float fA = xo0Var.f44583l.a(0.05f);
                RectF rectF = xo0Var.f44587p;
                canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = xo0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(xo0Var.f44574a);
                if (xo0Var.f44578f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, xo0Var.f44575b);
                }
                canvas.restore();
                if (xo0Var.f44579g) {
                    canvas.save();
                    float fWidth = rectF.width() * 0.315f;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f10 = fWidth / 2.0f;
                    rectF2.set(rectF.centerX() - f10, rectF.centerY() - f10, rectF.centerX() + f10, rectF.centerY() + f10);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), xo0Var.f44576c);
                    canvas.restore();
                }
                float fE = xo0Var.f44585n.e(xo0Var.f44584m);
                if (fE > 0.0f) {
                    Paint paint = yo0Var.f44862b;
                    Paint paint2 = yo0Var.f44862b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, yo0Var.f44861a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, fE) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (xo0Var.h) {
                    if (yo0Var.f44864e) {
                        if (xo0Var.f44582k == null) {
                            Drawable drawable = yo0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            xo0Var.f44582k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        xo0Var.f44582k.setBounds((int) org.telegram.messenger.rl.c(xo0Var.f44582k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.rl.c(xo0Var.f44582k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) s3.c.c(xo0Var.f44582k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) s3.c.c(xo0Var.f44582k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        xo0Var.f44582k.draw(canvas);
                    } else {
                        if (xo0Var.f44580i == null) {
                            xo0Var.f44580i = new Path();
                        }
                        if (xo0Var.f44581j == null) {
                            Paint paint3 = new Paint(1);
                            xo0Var.f44581j = paint3;
                            paint3.setColor(-1);
                            xo0Var.f44581j.setStyle(Paint.Style.STROKE);
                            xo0Var.f44581j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        xo0Var.f44581j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        xo0Var.f44580i.rewind();
                        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), fE);
                        xo0Var.f44580i.moveTo(rectF.centerX() - fLerp, rectF.centerY() - fLerp);
                        xo0Var.f44580i.lineTo(rectF.centerX() + fLerp, rectF.centerY() + fLerp);
                        xo0Var.f44580i.moveTo(rectF.centerX() + fLerp, rectF.centerY() - fLerp);
                        xo0Var.f44580i.lineTo(rectF.centerX() - fLerp, rectF.centerY() + fLerp);
                        canvas.drawPath(xo0Var.f44580i, xo0Var.f44581j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f44867r) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.f44861a);
            Paint paint4 = this.f44866n;
            paint4.setColor(iV0);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xo0 xo0Var;
        xo0 xo0Var2;
        Utilities.Callback callback;
        Utilities.Callback callback2;
        if (this.f44865f == null) {
            xo0Var = null;
            break;
        }
        int i10 = 0;
        while (true) {
            xo0[] xo0VarArr = this.f44865f;
            if (i10 >= xo0VarArr.length) {
                xo0Var = null;
                break;
            }
            if (xo0VarArr[i10].f44588q.contains(motionEvent.getX(), motionEvent.getY())) {
                xo0Var = this.f44865f[i10];
                break;
            }
            i10++;
        }
        if (motionEvent.getAction() == 0) {
            this.f44869w = xo0Var;
            if (xo0Var != null) {
                xo0Var.f44583l.c(true);
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            xo0 xo0Var3 = this.f44869w;
            if (xo0Var3 != xo0Var) {
                if (xo0Var3 != null) {
                    xo0Var3.f44583l.c(false);
                }
                if (xo0Var != null) {
                    xo0Var.f44583l.c(true);
                }
                if (this.f44869w != null && xo0Var != null && (callback2 = this.v) != null) {
                    callback2.run(Integer.valueOf(xo0Var.f44586o));
                }
                this.f44869w = xo0Var;
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (xo0Var2 = this.f44869w) != null && (callback = this.v) != null) {
                callback.run(Integer.valueOf(xo0Var2.f44586o));
            }
            if (this.f44865f != null) {
                int i11 = 0;
                while (true) {
                    xo0[] xo0VarArr2 = this.f44865f;
                    if (i11 >= xo0VarArr2.length) {
                        break;
                    }
                    xo0VarArr2[i11].f44583l.c(false);
                    i11++;
                }
            }
            this.f44869w = null;
            return true;
        }
        return true;
    }

    public int getColorId() {
        return this.f44868s;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i13 = this.f44863c;
        MessagesController.PeerColors peerColors = i13 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
        int size2 = peerColors == null ? 0 : peerColors.colors.size();
        int i14 = 8;
        int i15 = 2;
        if (i13 == 2) {
            size2 = 8;
        }
        if (i13 != 2 && i13 == 1) {
            i14 = 7;
        }
        float f10 = size;
        float f11 = i14;
        float f12 = i14 + 1;
        float fMin = Math.min(AndroidUtilities.dp(54.0f), f10 / ((f12 * 0.28947f) + f11));
        float fMin2 = Math.min(0.28947f * fMin, AndroidUtilities.dp(8.0f));
        float fMin3 = Math.min(0.31578946f * fMin, AndroidUtilities.dp(11.33f));
        int i16 = size2 / i14;
        setMeasuredDimension(size, (int) (((i16 + 1) * fMin3) + (i16 * fMin)));
        xo0[] xo0VarArr = this.f44865f;
        if (xo0VarArr == null || xo0VarArr.length != size2) {
            this.f44865f = new xo0[size2];
            int i17 = 0;
            while (i17 < size2) {
                this.f44865f[i17] = new xo0(this);
                if (i13 == i15) {
                    xo0 xo0Var = this.f44865f[i17];
                    int i18 = this.h[i17];
                    xo0Var.f44586o = i18;
                    xo0Var.h = i18 < 0;
                    if (i18 < 0) {
                        i12 = org.telegram.ui.ActionBar.g6.f23038c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.g6.f23303r8;
                        i12 = iArr[i18 % iArr.length];
                    }
                    int iV0 = org.telegram.ui.ActionBar.g6.v0(i12, this.f44861a);
                    xo0Var.f44579g = false;
                    xo0Var.f44578f = false;
                    xo0Var.f44574a.setColor(iV0);
                } else if (peerColors != null && i17 >= 0 && i17 < peerColors.colors.size()) {
                    this.f44865f[i17].f44586o = peerColors.colors.get(i17).f19624id;
                    this.f44865f[i17].a(peerColors.colors.get(i17));
                }
                i17++;
                i15 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * fMin2) + (f11 * fMin))) / 2.0f) + fMin2;
        if (this.f44865f != null) {
            float f14 = f13;
            float f15 = fMin3;
            for (int i19 = 0; i19 < this.f44865f.length; i19++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f14, f15, f14 + fMin, f15 + fMin);
                this.f44865f[i19].f44587p.set(rectF);
                rectF.inset((-fMin2) / 2.0f, (-fMin3) / 2.0f);
                this.f44865f[i19].f44588q.set(rectF);
                xo0 xo0Var2 = this.f44865f[i19];
                boolean z10 = xo0Var2.f44586o == this.f44868s;
                xo0Var2.f44584m = z10;
                xo0Var2.f44585n.f(z10, true);
                xo0Var2.f44589r.invalidate();
                if (i19 % i14 == i14 - 1) {
                    f15 += fMin + fMin3;
                    f14 = f13;
                } else {
                    f14 = fMin + fMin2 + f14;
                }
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.f44864e = z10;
    }

    public void setDivider(boolean z10) {
        this.f44867r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
